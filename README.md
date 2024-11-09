# Natural query parser for evitaQL (prototype)

Prototype of a natural version of evitaQL language used by [evitaDB](https://evitadb.io). 
This project was created as a way to explore [ANTLR4](https://www.antlr.org) capabilities.

It converts following grammar

```
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
```

into the original evitaDB's evitaQL language

```
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
)
```

It can be seen in action in `io.evitadb.api.query.natural.parser.ParserTest`.