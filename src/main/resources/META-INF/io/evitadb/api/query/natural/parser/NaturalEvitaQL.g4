grammar NaturalEvitaQL;

@header {
package io.evitadb.api.query.natural.parser.grammar;
}

query
    : require collection filter? order? EOF
    ;

require
    : 'gimme' requireContraintList
    ;

requireContraintList
    : requireConstraint ('and also' requireConstraint)*
    ;

requireConstraint
    : 'page of' valueList # pageRequireConstraint
    | 'facet summary with' value # facetSummaryRequireConstraint
    // TODO nested constraint only work for last constraint because the parser doesn't know where to stop
    | 'entities with' requireContraintList # entityFetchRequireConstraint
    | 'attribute of' valueList # attributeContentRequireConstraint
    ;

collection
    : 'from' 'collection' 'of' value # collectionHeadConstraint
    ;

filter
    : 'such that' filterConstraint
    ;

filterConstraint
    : filterConstraint 'otherwise' filterConstraint # orFilterConstraint
    | filterConstraint 'and also' filterConstraint # andFilterConstraint
    | 'attribute' n = value 'equals to' v = value # attributeEqualsFilterConstraint
    | 'attribute' n = value 'starts with' v = value # attributeStartsWithFilterConstraint
    | 'price is in price list' valueList # priceInPriceListsFilterConstraint
    ;

order
    : 'in order of' orderConstraint ('and also' orderConstraint)*
    ;

orderConstraint
    : 'attribute' value (ascending = 'in ascending natural order' | descending = 'in descending natural order') # attributeNaturalOrderConstraint
    | (ascending = 'price in ascending natural order' | descending = 'price in descending natural order') # priceNaturalOrderConstraint
    ;

valueList
    : value ('and' value)*
    ;

value
    : STRING # stringValue
    | NUMBER # numberValue
    ;

STRING
    :  '\'' (ESC | ~['\\])* '\''
    ;

fragment ESC
    :   '\\' (["\\/bfnrt] | UNICODE)
    ;
fragment UNICODE
    : 'u' HEX HEX HEX HEX
    ;
fragment HEX
    : [0-9a-fA-F]
    ;

NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
fragment INT
    :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP
    :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\r\n]+ -> skip ;