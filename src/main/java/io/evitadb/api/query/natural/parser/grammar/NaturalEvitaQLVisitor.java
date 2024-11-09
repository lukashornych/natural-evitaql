// Generated from NaturalEvitaQL.g4 by ANTLR 4.9.2

package io.evitadb.api.query.natural.parser.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NaturalEvitaQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NaturalEvitaQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(NaturalEvitaQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#require}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequire(NaturalEvitaQLParser.RequireContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#requireContraintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequireContraintList(NaturalEvitaQLParser.RequireContraintListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pageRequireConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#requireConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageRequireConstraint(NaturalEvitaQLParser.PageRequireConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code facetSummaryRequireConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#requireConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacetSummaryRequireConstraint(NaturalEvitaQLParser.FacetSummaryRequireConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entityFetchRequireConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#requireConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityFetchRequireConstraint(NaturalEvitaQLParser.EntityFetchRequireConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeContentRequireConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#requireConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeContentRequireConstraint(NaturalEvitaQLParser.AttributeContentRequireConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionHeadConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionHeadConstraint(NaturalEvitaQLParser.CollectionHeadConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(NaturalEvitaQLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeStartsWithFilterConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#filterConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeStartsWithFilterConstraint(NaturalEvitaQLParser.AttributeStartsWithFilterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priceInPriceListsFilterConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#filterConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriceInPriceListsFilterConstraint(NaturalEvitaQLParser.PriceInPriceListsFilterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orFilterConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#filterConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrFilterConstraint(NaturalEvitaQLParser.OrFilterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andFilterConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#filterConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFilterConstraint(NaturalEvitaQLParser.AndFilterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeEqualsFilterConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#filterConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeEqualsFilterConstraint(NaturalEvitaQLParser.AttributeEqualsFilterConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(NaturalEvitaQLParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeNaturalOrderConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#orderConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNaturalOrderConstraint(NaturalEvitaQLParser.AttributeNaturalOrderConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priceNaturalOrderConstraint}
	 * labeled alternative in {@link NaturalEvitaQLParser#orderConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriceNaturalOrderConstraint(NaturalEvitaQLParser.PriceNaturalOrderConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NaturalEvitaQLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(NaturalEvitaQLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link NaturalEvitaQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(NaturalEvitaQLParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link NaturalEvitaQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(NaturalEvitaQLParser.NumberValueContext ctx);
}