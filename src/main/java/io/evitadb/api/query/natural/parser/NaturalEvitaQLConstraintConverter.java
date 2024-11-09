package io.evitadb.api.query.natural.parser;

import io.evitadb.api.query.Constraint;
import io.evitadb.api.query.FilterConstraint;
import io.evitadb.api.query.OrderConstraint;
import io.evitadb.api.query.RequireConstraint;
import io.evitadb.api.query.filter.*;
import io.evitadb.api.query.head.Collection;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLBaseVisitor;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLParser;
import io.evitadb.api.query.order.AttributeNatural;
import io.evitadb.api.query.order.OrderBy;
import io.evitadb.api.query.order.OrderDirection;
import io.evitadb.api.query.order.PriceNatural;
import io.evitadb.api.query.require.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2024
 */
public class NaturalEvitaQLConstraintConverter extends NaturalEvitaQLBaseVisitor<Constraint<?>> {

    private static final NaturalEvitaQLValueConverter valueParser = new NaturalEvitaQLValueConverter();

    @Override
    public Constraint<?> visitRequire(NaturalEvitaQLParser.RequireContext ctx) {
        return visit(ctx.requireContraintList());
    }

    @Override
    public Constraint<?> visitRequireContraintList(NaturalEvitaQLParser.RequireContraintListContext ctx) {
        final RequireConstraint[] constraints = ctx.requireConstraint()
            .stream()
            .map(it -> (RequireConstraint) visit(it))
            .toArray(RequireConstraint[]::new);
        return new Require(constraints);
    }

    @Override
    public Constraint<?> visitPageRequireConstraint(NaturalEvitaQLParser.PageRequireConstraintContext ctx) {
        //noinspection unchecked
        final List<Serializable> args = (ArrayList<Serializable>) valueParser.visit(ctx.valueList());
        final BigDecimal pageNumber = (BigDecimal) args.get(0);
        final BigDecimal pageSize = (BigDecimal) args.get(1);
        return new Page(pageNumber.intValue(), pageSize.intValue());
    }

    @Override
    public Constraint<?> visitFacetSummaryRequireConstraint(NaturalEvitaQLParser.FacetSummaryRequireConstraintContext ctx) {
        final FacetStatisticsDepth depth = FacetStatisticsDepth.valueOf((String) valueParser.visit(ctx.value()));
        return new FacetSummary(depth);
    }

    @Override
    public Constraint<?> visitEntityFetchRequireConstraint(NaturalEvitaQLParser.EntityFetchRequireConstraintContext ctx) {
        final Require require = (Require) visit(ctx.requireContraintList());
        return new EntityFetch(Arrays.stream(require.getChildren()).map(it -> (EntityContentRequire) it).toArray(EntityContentRequire[]::new));
    }

    @Override
    public Constraint<?> visitAttributeContentRequireConstraint(NaturalEvitaQLParser.AttributeContentRequireConstraintContext ctx) {
        //noinspection unchecked
        final List<Serializable> attributeNames = (ArrayList<Serializable>) valueParser.visit(ctx.valueList());
        return new AttributeContent(attributeNames.stream().map(it -> (String) it).toArray(String[]::new));
    }

    @Override
    public Constraint<?> visitCollectionHeadConstraint(NaturalEvitaQLParser.CollectionHeadConstraintContext ctx) {
        final String collectionName = (String) valueParser.visit(ctx.value());
        return new Collection(collectionName);
    }

    @Override
    public Constraint<?> visitFilter(NaturalEvitaQLParser.FilterContext ctx) {
        final FilterConstraint constraint = (FilterConstraint) visit(ctx.filterConstraint());
        return new FilterBy(constraint);
    }

    @Override
    public Constraint<?> visitAttributeStartsWithFilterConstraint(NaturalEvitaQLParser.AttributeStartsWithFilterConstraintContext ctx) {
        final String attributeName = (String) valueParser.visit(ctx.n);
        final String attributeValue = (String) valueParser.visit(ctx.v);
        return new AttributeStartsWith(attributeName, attributeValue);
    }

    @Override
    public Constraint<?> visitPriceInPriceListsFilterConstraint(NaturalEvitaQLParser.PriceInPriceListsFilterConstraintContext ctx) {
        //noinspection unchecked
        final List<Serializable> values = (ArrayList<Serializable>) valueParser.visit(ctx.valueList());
        return new PriceInPriceLists(values.stream().map(it -> (String) it).toArray(String[]::new));
    }

    @Override
    public Constraint<?> visitOrFilterConstraint(NaturalEvitaQLParser.OrFilterConstraintContext ctx) {
        final FilterConstraint[] constraints = ctx.filterConstraint()
            .stream()
            .map(it -> (FilterConstraint) visit(it))
            .toArray(FilterConstraint[]::new);
        return new Or(constraints);
    }

    @Override
    public Constraint<?> visitAndFilterConstraint(NaturalEvitaQLParser.AndFilterConstraintContext ctx) {
        final FilterConstraint[] constraints = ctx.filterConstraint()
            .stream()
            .map(it -> (FilterConstraint) visit(it))
            .toArray(FilterConstraint[]::new);
        return new And(constraints);
    }

    @Override
    public Constraint<?> visitAttributeEqualsFilterConstraint(NaturalEvitaQLParser.AttributeEqualsFilterConstraintContext ctx) {
        final String attributeName = (String) valueParser.visit(ctx.n);
        final Serializable attributeValue = valueParser.visit(ctx.v);
        return new AttributeEquals(attributeName, attributeValue);
    }

    @Override
    public Constraint<?> visitOrder(NaturalEvitaQLParser.OrderContext ctx) {
        final OrderConstraint[] orderConstraints = ctx.orderConstraint()
            .stream()
            .map(it -> (OrderConstraint) visit(it))
            .toArray(OrderConstraint[]::new);
        return new OrderBy(orderConstraints);
    }

    @Override
    public Constraint<?> visitAttributeNaturalOrderConstraint(NaturalEvitaQLParser.AttributeNaturalOrderConstraintContext ctx) {
        final String attributeName = (String) valueParser.visit(ctx.value());
        if (ctx.ascending != null) {
            return new AttributeNatural(attributeName, OrderDirection.ASC);
        } else if (ctx.descending != null) {
            return new AttributeNatural(attributeName, OrderDirection.DESC);
        } else {
            throw new IllegalArgumentException("Invalid attribute natural arguments.");
        }
    }

    @Override
    public Constraint<?> visitPriceNaturalOrderConstraint(NaturalEvitaQLParser.PriceNaturalOrderConstraintContext ctx) {
        if (ctx.ascending != null) {
            return new PriceNatural(OrderDirection.ASC);
        } else if (ctx.descending != null) {
            return new PriceNatural(OrderDirection.DESC);
        } else {
            throw new IllegalArgumentException("Invalid price natural arguments.");
        }
    }
}
