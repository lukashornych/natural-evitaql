package io.evitadb.api.query.natural.parser;

import io.evitadb.api.query.Query;
import io.evitadb.api.query.filter.FilterBy;
import io.evitadb.api.query.head.Collection;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLBaseVisitor;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLParser;
import io.evitadb.api.query.order.OrderBy;
import io.evitadb.api.query.require.Require;

/**
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2024
 */
public class NaturalEvitaQLQueryConverter extends NaturalEvitaQLBaseVisitor<Query> {

    private static final NaturalEvitaQLConstraintConverter constraintParser = new NaturalEvitaQLConstraintConverter();

    @Override
    public Query visitQuery(NaturalEvitaQLParser.QueryContext ctx) {
        final Require require = (Require) constraintParser.visit(ctx.require());
        final Collection collection = (Collection) constraintParser.visit(ctx.collection());
        final FilterBy filter;
        if (ctx.filter() != null) {
            filter = (FilterBy) constraintParser.visit(ctx.filter());
        } else {
            filter = null;
        }
        final OrderBy order;
        if (ctx.order() != null) {
            order = (OrderBy) constraintParser.visit(ctx.order());
        } else {
            order = null;
        }

        return Query.query(collection, filter, order, require);
    }
}
