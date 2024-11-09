package io.evitadb.api.query.natural.parser;

import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLBaseVisitor;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLParser;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2024
 */
public class NaturalEvitaQLValueConverter extends NaturalEvitaQLBaseVisitor<Serializable> {

    @Override
    public Serializable visitValueList(NaturalEvitaQLParser.ValueListContext ctx) {
        return ctx.value()
            .stream()
            .map(this::visit)
            .collect(Collectors.toCollection(() -> new ArrayList<>(ctx.value().size())));
    }

    @Override
    public Serializable visitStringValue(NaturalEvitaQLParser.StringValueContext ctx) {
        return ctx.getText().substring(1, ctx.getText().length() - 1);
    }

    @Override
    public Serializable visitNumberValue(NaturalEvitaQLParser.NumberValueContext ctx) {
        return new BigDecimal(ctx.getText());
    }
}
