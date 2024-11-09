// Generated from NaturalEvitaQL.g4 by ANTLR 4.9.2

package io.evitadb.api.query.natural.parser.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NaturalEvitaQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, NUMBER=23, WS=24;
	public static final int
		RULE_query = 0, RULE_require = 1, RULE_requireContraintList = 2, RULE_requireConstraint = 3, 
		RULE_collection = 4, RULE_filter = 5, RULE_filterConstraint = 6, RULE_order = 7, 
		RULE_orderConstraint = 8, RULE_valueList = 9, RULE_value = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "require", "requireContraintList", "requireConstraint", "collection", 
			"filter", "filterConstraint", "order", "orderConstraint", "valueList", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'gimme'", "'and also'", "'page of'", "'facet summary with'", "'entities with'", 
			"'attribute of'", "'from'", "'collection'", "'of'", "'such that'", "'otherwise'", 
			"'attribute'", "'equals to'", "'starts with'", "'price is in price list'", 
			"'in order of'", "'in ascending natural order'", "'in descending natural order'", 
			"'price in ascending natural order'", "'price in descending natural order'", 
			"'and'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NaturalEvitaQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NaturalEvitaQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public RequireContext require() {
			return getRuleContext(RequireContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NaturalEvitaQLParser.EOF, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			require();
			setState(23);
			collection();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(24);
				filter();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(27);
				order();
				}
			}

			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireContext extends ParserRuleContext {
		public RequireContraintListContext requireContraintList() {
			return getRuleContext(RequireContraintListContext.class,0);
		}
		public RequireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitRequire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireContext require() throws RecognitionException {
		RequireContext _localctx = new RequireContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_require);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			requireContraintList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireContraintListContext extends ParserRuleContext {
		public List<RequireConstraintContext> requireConstraint() {
			return getRuleContexts(RequireConstraintContext.class);
		}
		public RequireConstraintContext requireConstraint(int i) {
			return getRuleContext(RequireConstraintContext.class,i);
		}
		public RequireContraintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireContraintList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitRequireContraintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireContraintListContext requireContraintList() throws RecognitionException {
		RequireContraintListContext _localctx = new RequireContraintListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requireContraintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			requireConstraint();
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					match(T__1);
					setState(37);
					requireConstraint();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequireConstraintContext extends ParserRuleContext {
		public RequireConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireConstraint; }
	 
		public RequireConstraintContext() { }
		public void copyFrom(RequireConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PageRequireConstraintContext extends RequireConstraintContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public PageRequireConstraintContext(RequireConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitPageRequireConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EntityFetchRequireConstraintContext extends RequireConstraintContext {
		public RequireContraintListContext requireContraintList() {
			return getRuleContext(RequireContraintListContext.class,0);
		}
		public EntityFetchRequireConstraintContext(RequireConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitEntityFetchRequireConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FacetSummaryRequireConstraintContext extends RequireConstraintContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FacetSummaryRequireConstraintContext(RequireConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitFacetSummaryRequireConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContentRequireConstraintContext extends RequireConstraintContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public AttributeContentRequireConstraintContext(RequireConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitAttributeContentRequireConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireConstraintContext requireConstraint() throws RecognitionException {
		RequireConstraintContext _localctx = new RequireConstraintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_requireConstraint);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PageRequireConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__2);
				setState(44);
				valueList();
				}
				break;
			case T__3:
				_localctx = new FacetSummaryRequireConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__3);
				setState(46);
				value();
				}
				break;
			case T__4:
				_localctx = new EntityFetchRequireConstraintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(T__4);
				setState(48);
				requireContraintList();
				}
				break;
			case T__5:
				_localctx = new AttributeContentRequireConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(T__5);
				setState(50);
				valueList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
	 
		public CollectionContext() { }
		public void copyFrom(CollectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollectionHeadConstraintContext extends CollectionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CollectionHeadConstraintContext(CollectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitCollectionHeadConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_collection);
		try {
			_localctx = new CollectionHeadConstraintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__6);
			setState(54);
			match(T__7);
			setState(55);
			match(T__8);
			setState(56);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterConstraintContext filterConstraint() {
			return getRuleContext(FilterConstraintContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__9);
			setState(59);
			filterConstraint(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterConstraintContext extends ParserRuleContext {
		public FilterConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterConstraint; }
	 
		public FilterConstraintContext() { }
		public void copyFrom(FilterConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeStartsWithFilterConstraintContext extends FilterConstraintContext {
		public ValueContext n;
		public ValueContext v;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AttributeStartsWithFilterConstraintContext(FilterConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitAttributeStartsWithFilterConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriceInPriceListsFilterConstraintContext extends FilterConstraintContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public PriceInPriceListsFilterConstraintContext(FilterConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitPriceInPriceListsFilterConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrFilterConstraintContext extends FilterConstraintContext {
		public List<FilterConstraintContext> filterConstraint() {
			return getRuleContexts(FilterConstraintContext.class);
		}
		public FilterConstraintContext filterConstraint(int i) {
			return getRuleContext(FilterConstraintContext.class,i);
		}
		public OrFilterConstraintContext(FilterConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitOrFilterConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndFilterConstraintContext extends FilterConstraintContext {
		public List<FilterConstraintContext> filterConstraint() {
			return getRuleContexts(FilterConstraintContext.class);
		}
		public FilterConstraintContext filterConstraint(int i) {
			return getRuleContext(FilterConstraintContext.class,i);
		}
		public AndFilterConstraintContext(FilterConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitAndFilterConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeEqualsFilterConstraintContext extends FilterConstraintContext {
		public ValueContext n;
		public ValueContext v;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public AttributeEqualsFilterConstraintContext(FilterConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitAttributeEqualsFilterConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterConstraintContext filterConstraint() throws RecognitionException {
		return filterConstraint(0);
	}

	private FilterConstraintContext filterConstraint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterConstraintContext _localctx = new FilterConstraintContext(_ctx, _parentState);
		FilterConstraintContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_filterConstraint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new AttributeEqualsFilterConstraintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(T__11);
				setState(63);
				((AttributeEqualsFilterConstraintContext)_localctx).n = value();
				setState(64);
				match(T__12);
				setState(65);
				((AttributeEqualsFilterConstraintContext)_localctx).v = value();
				}
				break;
			case 2:
				{
				_localctx = new AttributeStartsWithFilterConstraintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__11);
				setState(68);
				((AttributeStartsWithFilterConstraintContext)_localctx).n = value();
				setState(69);
				match(T__13);
				setState(70);
				((AttributeStartsWithFilterConstraintContext)_localctx).v = value();
				}
				break;
			case 3:
				{
				_localctx = new PriceInPriceListsFilterConstraintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__14);
				setState(73);
				valueList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new OrFilterConstraintContext(new FilterConstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filterConstraint);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						match(T__10);
						setState(78);
						filterConstraint(6);
						}
						break;
					case 2:
						{
						_localctx = new AndFilterConstraintContext(new FilterConstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filterConstraint);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						match(T__1);
						setState(81);
						filterConstraint(5);
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public List<OrderConstraintContext> orderConstraint() {
			return getRuleContexts(OrderConstraintContext.class);
		}
		public OrderConstraintContext orderConstraint(int i) {
			return getRuleContext(OrderConstraintContext.class,i);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__15);
			setState(88);
			orderConstraint();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(89);
				match(T__1);
				setState(90);
				orderConstraint();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderConstraintContext extends ParserRuleContext {
		public OrderConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderConstraint; }
	 
		public OrderConstraintContext() { }
		public void copyFrom(OrderConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriceNaturalOrderConstraintContext extends OrderConstraintContext {
		public Token ascending;
		public Token descending;
		public PriceNaturalOrderConstraintContext(OrderConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitPriceNaturalOrderConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeNaturalOrderConstraintContext extends OrderConstraintContext {
		public Token ascending;
		public Token descending;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeNaturalOrderConstraintContext(OrderConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitAttributeNaturalOrderConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderConstraintContext orderConstraint() throws RecognitionException {
		OrderConstraintContext _localctx = new OrderConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_orderConstraint);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new AttributeNaturalOrderConstraintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__11);
				setState(97);
				value();
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(98);
					((AttributeNaturalOrderConstraintContext)_localctx).ascending = match(T__16);
					}
					break;
				case T__17:
					{
					setState(99);
					((AttributeNaturalOrderConstraintContext)_localctx).descending = match(T__17);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__18:
			case T__19:
				_localctx = new PriceNaturalOrderConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(102);
					((PriceNaturalOrderConstraintContext)_localctx).ascending = match(T__18);
					}
					break;
				case T__19:
					{
					setState(103);
					((PriceNaturalOrderConstraintContext)_localctx).descending = match(T__19);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			value();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(T__20);
					setState(110);
					value();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(NaturalEvitaQLParser.STRING, 0); }
		public StringValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValueContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(NaturalEvitaQLParser.NUMBER, 0); }
		public NumberValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NaturalEvitaQLVisitor ) return ((NaturalEvitaQLVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return filterConstraint_sempred((FilterConstraintContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filterConstraint_sempred(FilterConstraintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\2\5\2\37\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bU\n\b\f\b\16\b"+
		"X\13\b\3\t\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\n\3\n\3\n\3\n\5\ng\n"+
		"\n\3\n\3\n\5\nk\n\n\5\nm\n\n\3\13\3\13\3\13\7\13r\n\13\f\13\16\13u\13"+
		"\13\3\f\3\f\5\fy\n\f\3\f\2\3\16\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\177"+
		"\2\30\3\2\2\2\4\"\3\2\2\2\6%\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f<\3\2"+
		"\2\2\16L\3\2\2\2\20Y\3\2\2\2\22l\3\2\2\2\24n\3\2\2\2\26x\3\2\2\2\30\31"+
		"\5\4\3\2\31\33\5\n\6\2\32\34\5\f\7\2\33\32\3\2\2\2\33\34\3\2\2\2\34\36"+
		"\3\2\2\2\35\37\5\20\t\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\2"+
		"\2\3!\3\3\2\2\2\"#\7\3\2\2#$\5\6\4\2$\5\3\2\2\2%*\5\b\5\2&\'\7\4\2\2\'"+
		")\5\b\5\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2"+
		"-.\7\5\2\2.\66\5\24\13\2/\60\7\6\2\2\60\66\5\26\f\2\61\62\7\7\2\2\62\66"+
		"\5\6\4\2\63\64\7\b\2\2\64\66\5\24\13\2\65-\3\2\2\2\65/\3\2\2\2\65\61\3"+
		"\2\2\2\65\63\3\2\2\2\66\t\3\2\2\2\678\7\t\2\289\7\n\2\29:\7\13\2\2:;\5"+
		"\26\f\2;\13\3\2\2\2<=\7\f\2\2=>\5\16\b\2>\r\3\2\2\2?@\b\b\1\2@A\7\16\2"+
		"\2AB\5\26\f\2BC\7\17\2\2CD\5\26\f\2DM\3\2\2\2EF\7\16\2\2FG\5\26\f\2GH"+
		"\7\20\2\2HI\5\26\f\2IM\3\2\2\2JK\7\21\2\2KM\5\24\13\2L?\3\2\2\2LE\3\2"+
		"\2\2LJ\3\2\2\2MV\3\2\2\2NO\f\7\2\2OP\7\r\2\2PU\5\16\b\bQR\f\6\2\2RS\7"+
		"\4\2\2SU\5\16\b\7TN\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17"+
		"\3\2\2\2XV\3\2\2\2YZ\7\22\2\2Z_\5\22\n\2[\\\7\4\2\2\\^\5\22\n\2][\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2a_\3\2\2\2bc\7\16\2\2cf"+
		"\5\26\f\2dg\7\23\2\2eg\7\24\2\2fd\3\2\2\2fe\3\2\2\2gm\3\2\2\2hk\7\25\2"+
		"\2ik\7\26\2\2jh\3\2\2\2ji\3\2\2\2km\3\2\2\2lb\3\2\2\2lj\3\2\2\2m\23\3"+
		"\2\2\2ns\5\26\f\2op\7\27\2\2pr\5\26\f\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\25\3\2\2\2us\3\2\2\2vy\7\30\2\2wy\7\31\2\2xv\3\2\2\2xw\3\2"+
		"\2\2y\27\3\2\2\2\17\33\36*\65LTV_fjlsx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}