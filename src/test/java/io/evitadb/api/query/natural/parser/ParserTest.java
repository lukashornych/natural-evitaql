package io.evitadb.api.query.natural.parser;

import io.evitadb.api.query.Query;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLLexer;
import io.evitadb.api.query.natural.parser.grammar.NaturalEvitaQLParser;
import io.evitadb.api.query.order.OrderDirection;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;

import static io.evitadb.api.query.Query.query;
import static io.evitadb.api.query.QueryConstraints.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2024
 */
public class ParserTest {

    @Test
    void shouldParseNaturalEvitaQL() {
        assertEquals(
            query(
                collection("product"),
                require(page(1, 20))
            ),
            convert("""
                gimme page of 1 and 20
                from collection of 'product'
                """)
        );

        assertEquals(
            query(
                collection("category"),
                filterBy(attributeEquals("code", "gifts")),
                require(entityFetch(attributeContent("code")))
            ),
            convert("""
                gimme entities with attribute of 'code'
                from collection of 'category'
                such that attribute 'code' equals to 'gifts'
                """)
        );

        assertEquals(
            query(
                collection("product"),
                filterBy(
                    and(
                        or(
                            attributeEquals("code", "macbook"),
                            attributeStartsWith("name", "Mac")
                        ),
                        priceInPriceLists("vip", "basic")
                    )
                ),
                orderBy(
                    priceNatural(),
                    attributeNatural("code", OrderDirection.DESC)
                ),
                require(
                    page(1, 20),
                    facetSummary(),
                    entityFetch(
                        attributeContent("code", "name")
                    )
                )
            ),
            convert("""
                gimme
                	page of 1 and 20
                	and also
                	facet summary with 'COUNTS'
                	and also
                	entities with
                		attribute of 'code' and 'name'
                from collection of 'product'
                such that
                	attribute 'code' equals to 'macbook'
                	otherwise
                	attribute 'name' starts with 'Mac'
                	and also
                	price is in price list 'vip' and 'basic'
                in order of
                	price in ascending natural order
                	and also
                	attribute 'code' in descending natural order
                """)
        );
    }

    private Query convert(@Nonnull String naturalQuery) {
        final NaturalEvitaQLLexer lexer = new NaturalEvitaQLLexer(CharStreams.fromString(naturalQuery));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final NaturalEvitaQLParser parser = new NaturalEvitaQLParser(tokens);

        final NaturalEvitaQLParser.QueryContext queryTree = parser.query();
        final NaturalEvitaQLQueryConverter converter = new NaturalEvitaQLQueryConverter();
        return converter.visit(queryTree);
    }
}
