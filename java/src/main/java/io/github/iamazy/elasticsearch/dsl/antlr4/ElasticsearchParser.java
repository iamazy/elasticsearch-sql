// Generated from C:/Users/iamazy/Documents/GitHub/elasticsearch-sql/java/src/main/resources/antlr4\ElasticsearchParser.g4 by ANTLR 4.7.2
package io.github.iamazy.elasticsearch.dsl.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElasticsearchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_ESSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, EXPLAIN=5, 
		ADD=6, DESCRIBE=7, SELECT=8, DELETE=9, INSERT=10, INTO=11, VALUES=12, 
		TOP=13, UPDATE=14, CREATE=15, TABLE=16, IF=17, ALTER=18, DROP=19, SET=20, 
		NULL=21, DISTINCT=22, AND=23, OR=24, NOT=25, IS=26, AS=27, LIKE=28, RLIKE=29, 
		EXISTS=30, TRUE=31, FALSE=32, LIMIT=33, ORDER=34, ASC=35, DESC=36, BEFORE=37, 
		BETWEEN=38, GROUP=39, AGGREGATE=40, ROUTING=41, PARENT_ID=42, HAS_PARENT=43, 
		HAS_CHILD=44, QUERY=45, NESTED=46, HIGHLIGHTER=47, BY=48, IN=49, WHERE=50, 
		FROM=51, HAVING=52, REMOTE=53, DIS_MAX=54, TIE_BREAKER=55, DISTANCE=56, 
		GEOPOINT=57, GEOHASH=58, FUNCTION_SCORE=59, CONSTANT_SCORE=60, COUNT=61, 
		VAR_ASSIGN=62, PLUS_ASSIGN=63, MINUS_ASSIGN=64, MULT_ASSIGN=65, DIV_ASSIGN=66, 
		MOD_ASSIGN=67, AND_ASSIGN=68, XOR_ASSIGN=69, OR_ASSIGN=70, ALSH=71, ARSH=72, 
		AUSH=73, STAR=74, MUL=75, DIVIDE=76, MODULE=77, PLUS=78, INCR=79, DECR=80, 
		MINUS=81, DIV=82, MOD=83, POUND=84, COND=85, EQ=86, AEQ=87, TEQ=88, EQEQ=89, 
		NE=90, GT=91, GTE=92, LT=93, LTE=94, BOOLNOT=95, BWNOT=96, BWOR=97, BOOLOR=98, 
		BWAND=99, BOOLAND=100, XOR=101, ARROW=102, LSH=103, RSH=104, USH=105, 
		DOT=106, NSDOT=107, LPAREN=108, RPAREN=109, LBRACE=110, RBRACE=111, LBRACKET=112, 
		RBRACKET=113, COMMA=114, SEMI=115, AT_SIGN=116, SINGLE_QUOTE=117, DOUBLE_QUOTE=118, 
		REVERSE_QUOTE=119, COLON=120, UNDERLINE=121, INT=122, FLOAT=123, DOT_ID=124, 
		ID=125, OCTAL=126, HEX=127, INTEGER=128, DECIMAL=129, STRING=130, REGEX=131, 
		DOTINTEGER=132, DOTID=133;
	public static final int
		RULE_sql = 0, RULE_selectOperation = 1, RULE_descOperation = 2, RULE_deleteOperation = 3, 
		RULE_updateOperation = 4, RULE_insertOperation = 5, RULE_reindexOperation = 6, 
		RULE_fieldList = 7, RULE_nameOperand = 8, RULE_name = 9, RULE_identity = 10, 
		RULE_expression = 11, RULE_collection = 12, RULE_likeClause = 13, RULE_isClause = 14, 
		RULE_inClause = 15, RULE_inRightOperandList = 16, RULE_inRightOperand = 17, 
		RULE_tableRef = 18, RULE_fullTextClause = 19, RULE_queryStringClause = 20, 
		RULE_multiMatchClause = 21, RULE_disMaxClause = 22, RULE_hasParentClause = 23, 
		RULE_hasChildClause = 24, RULE_nestedClause = 25, RULE_whereClause = 26, 
		RULE_groupByClause = 27, RULE_havingClause = 28, RULE_havingExpression = 29, 
		RULE_aggregateByClause = 30, RULE_aggregationClause = 31, RULE_nestedAggregationClause = 32, 
		RULE_subAggregationClause = 33, RULE_aggregateItemClause = 34, RULE_routingClause = 35, 
		RULE_orderClause = 36, RULE_order = 37, RULE_limitClause = 38, RULE_geoClause = 39, 
		RULE_geoDistanceClause = 40, RULE_geoBoundingBoxClause = 41, RULE_geoPolygonClause = 42, 
		RULE_geoPointClause = 43, RULE_functionScoreClause = 44, RULE_groupByFunctionClause = 45, 
		RULE_count = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "selectOperation", "descOperation", "deleteOperation", "updateOperation", 
			"insertOperation", "reindexOperation", "fieldList", "nameOperand", "name", 
			"identity", "expression", "collection", "likeClause", "isClause", "inClause", 
			"inRightOperandList", "inRightOperand", "tableRef", "fullTextClause", 
			"queryStringClause", "multiMatchClause", "disMaxClause", "hasParentClause", 
			"hasChildClause", "nestedClause", "whereClause", "groupByClause", "havingClause", 
			"havingExpression", "aggregateByClause", "aggregationClause", "nestedAggregationClause", 
			"subAggregationClause", "aggregateItemClause", "routingClause", "orderClause", 
			"order", "limitClause", "geoClause", "geoDistanceClause", "geoBoundingBoxClause", 
			"geoPolygonClause", "geoPointClause", "functionScoreClause", "groupByFunctionClause", 
			"count"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", 
			"'|='", "'<<='", "'>>='", "'>>>='", "'*'", null, "'/'", "'%'", "'+'", 
			"'++'", "'--'", "'-'", null, null, "'#'", "'?'", "'='", "'~='", "'~=='", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'!'", "'~'", "'|'", "'||'", 
			"'&'", "'&&'", "'^'", "'->'", "'<<'", "'>>'", "'>>>'", "'.'", "'?.'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", "'@'", "'''", 
			"'\"'", "'`'", "':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"EXPLAIN", "ADD", "DESCRIBE", "SELECT", "DELETE", "INSERT", "INTO", "VALUES", 
			"TOP", "UPDATE", "CREATE", "TABLE", "IF", "ALTER", "DROP", "SET", "NULL", 
			"DISTINCT", "AND", "OR", "NOT", "IS", "AS", "LIKE", "RLIKE", "EXISTS", 
			"TRUE", "FALSE", "LIMIT", "ORDER", "ASC", "DESC", "BEFORE", "BETWEEN", 
			"GROUP", "AGGREGATE", "ROUTING", "PARENT_ID", "HAS_PARENT", "HAS_CHILD", 
			"QUERY", "NESTED", "HIGHLIGHTER", "BY", "IN", "WHERE", "FROM", "HAVING", 
			"REMOTE", "DIS_MAX", "TIE_BREAKER", "DISTANCE", "GEOPOINT", "GEOHASH", 
			"FUNCTION_SCORE", "CONSTANT_SCORE", "COUNT", "VAR_ASSIGN", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
			"XOR_ASSIGN", "OR_ASSIGN", "ALSH", "ARSH", "AUSH", "STAR", "MUL", "DIVIDE", 
			"MODULE", "PLUS", "INCR", "DECR", "MINUS", "DIV", "MOD", "POUND", "COND", 
			"EQ", "AEQ", "TEQ", "EQEQ", "NE", "GT", "GTE", "LT", "LTE", "BOOLNOT", 
			"BWNOT", "BWOR", "BOOLOR", "BWAND", "BOOLAND", "XOR", "ARROW", "LSH", 
			"RSH", "USH", "DOT", "NSDOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"REVERSE_QUOTE", "COLON", "UNDERLINE", "INT", "FLOAT", "DOT_ID", "ID", 
			"OCTAL", "HEX", "INTEGER", "DECIMAL", "STRING", "REGEX", "DOTINTEGER", 
			"DOTID"
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
	public String getGrammarFileName() { return "ElasticsearchParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ElasticsearchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ElasticsearchParser.EOF, 0); }
		public SelectOperationContext selectOperation() {
			return getRuleContext(SelectOperationContext.class,0);
		}
		public DeleteOperationContext deleteOperation() {
			return getRuleContext(DeleteOperationContext.class,0);
		}
		public DescOperationContext descOperation() {
			return getRuleContext(DescOperationContext.class,0);
		}
		public UpdateOperationContext updateOperation() {
			return getRuleContext(UpdateOperationContext.class,0);
		}
		public InsertOperationContext insertOperation() {
			return getRuleContext(InsertOperationContext.class,0);
		}
		public ReindexOperationContext reindexOperation() {
			return getRuleContext(ReindexOperationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ElasticsearchParser.SEMI, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(94);
				selectOperation();
				}
				break;
			case 2:
				{
				setState(95);
				deleteOperation();
				}
				break;
			case 3:
				{
				setState(96);
				descOperation();
				}
				break;
			case 4:
				{
				setState(97);
				updateOperation();
				}
				break;
			case 5:
				{
				setState(98);
				insertOperation();
				}
				break;
			case 6:
				{
				setState(99);
				reindexOperation();
				}
				break;
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(102);
				match(SEMI);
				}
			}

			setState(105);
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

	public static class SelectOperationContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ElasticsearchParser.SELECT, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ElasticsearchParser.FROM, 0); }
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public AggregateByClauseContext aggregateByClause() {
			return getRuleContext(AggregateByClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterSelectOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitSelectOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitSelectOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectOperationContext selectOperation() throws RecognitionException {
		SelectOperationContext _localctx = new SelectOperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(SELECT);
			setState(108);
			fieldList();
			setState(109);
			match(FROM);
			setState(110);
			tableRef();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				tableRef();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(118);
				whereClause();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(121);
				routingClause();
				}
			}

			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				{
				setState(124);
				groupByClause();
				}
				break;
			case AGGREGATE:
				{
				setState(125);
				aggregateByClause();
				}
				break;
			case EOF:
			case LIMIT:
			case ORDER:
			case SEMI:
				break;
			default:
				break;
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(128);
				orderClause();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(131);
				limitClause();
				}
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

	public static class DescOperationContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(ElasticsearchParser.DESCRIBE, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(ElasticsearchParser.DIVIDE, 0); }
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
		public DescOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterDescOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitDescOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitDescOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescOperationContext descOperation() throws RecognitionException {
		DescOperationContext _localctx = new DescOperationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DESCRIBE);
			setState(135);
			tableRef();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVIDE) {
				{
				setState(136);
				match(DIVIDE);
				setState(137);
				identity();
				}
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

	public static class DeleteOperationContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ElasticsearchParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ElasticsearchParser.FROM, 0); }
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public DeleteOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterDeleteOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitDeleteOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitDeleteOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteOperationContext deleteOperation() throws RecognitionException {
		DeleteOperationContext _localctx = new DeleteOperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(DELETE);
			setState(141);
			match(FROM);
			setState(142);
			tableRef();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				tableRef();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(150);
				whereClause();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(153);
				routingClause();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(156);
				limitClause();
				}
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

	public static class UpdateOperationContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ElasticsearchParser.UPDATE, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode SET() { return getToken(ElasticsearchParser.SET, 0); }
		public List<TerminalNode> ID() { return getTokens(ElasticsearchParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ElasticsearchParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(ElasticsearchParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ElasticsearchParser.EQ, i);
		}
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public UpdateOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterUpdateOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitUpdateOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitUpdateOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateOperationContext updateOperation() throws RecognitionException {
		UpdateOperationContext _localctx = new UpdateOperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_updateOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(UPDATE);
			setState(160);
			tableRef();
			setState(161);
			match(SET);
			setState(162);
			match(ID);
			setState(163);
			match(EQ);
			setState(164);
			identity();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				match(ID);
				setState(167);
				match(EQ);
				setState(168);
				identity();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(174);
				whereClause();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(177);
				routingClause();
				}
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

	public static class InsertOperationContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ElasticsearchParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ElasticsearchParser.INTO, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(ElasticsearchParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ElasticsearchParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ElasticsearchParser.LPAREN, i);
		}
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ElasticsearchParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ElasticsearchParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public InsertOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterInsertOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitInsertOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitInsertOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertOperationContext insertOperation() throws RecognitionException {
		InsertOperationContext _localctx = new InsertOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insertOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(INSERT);
			setState(181);
			match(INTO);
			setState(182);
			tableRef();
			{
			setState(183);
			match(LPAREN);
			setState(184);
			identity();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				identity();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(RPAREN);
			}
			setState(194);
			match(VALUES);
			setState(195);
			match(LPAREN);
			setState(196);
			identity();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				identity();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(205);
				routingClause();
				}
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

	public static class ReindexOperationContext extends ParserRuleContext {
		public Token host;
		public Token user;
		public Token password;
		public TerminalNode INSERT() { return getToken(ElasticsearchParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ElasticsearchParser.INTO, 0); }
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(ElasticsearchParser.SELECT, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ElasticsearchParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode REMOTE() { return getToken(ElasticsearchParser.REMOTE, 0); }
		public TerminalNode EQ() { return getToken(ElasticsearchParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(ElasticsearchParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ElasticsearchParser.STRING, i);
		}
		public ReindexOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindexOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterReindexOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitReindexOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitReindexOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReindexOperationContext reindexOperation() throws RecognitionException {
		ReindexOperationContext _localctx = new ReindexOperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reindexOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(INSERT);
			setState(209);
			match(INTO);
			setState(210);
			tableRef();
			setState(211);
			match(SELECT);
			setState(212);
			fieldList();
			setState(213);
			match(FROM);
			setState(214);
			tableRef();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				tableRef();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(222);
				whereClause();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(225);
				limitClause();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REMOTE) {
				{
				setState(228);
				match(REMOTE);
				setState(229);
				match(EQ);
				setState(230);
				match(LPAREN);
				setState(231);
				((ReindexOperationContext)_localctx).host = match(STRING);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(232);
					match(COMMA);
					setState(233);
					((ReindexOperationContext)_localctx).user = match(STRING);
					setState(234);
					match(COMMA);
					setState(235);
					((ReindexOperationContext)_localctx).password = match(STRING);
					}
				}

				setState(238);
				match(RPAREN);
				}
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

	public static class FieldListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ElasticsearchParser.STAR, 0); }
		public List<NameOperandContext> nameOperand() {
			return getRuleContexts(NameOperandContext.class);
		}
		public NameOperandContext nameOperand(int i) {
			return getRuleContext(NameOperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldList);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(STAR);
				}
				break;
			case DISTINCT:
			case HIGHLIGHTER:
			case COUNT:
			case XOR:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(242);
				nameOperand();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(243);
					match(COMMA);
					setState(244);
					nameOperand();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NameOperandContext extends ParserRuleContext {
		public Token exclude;
		public NameContext fieldName;
		public Token alias;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode AS() { return getToken(ElasticsearchParser.AS, 0); }
		public TerminalNode XOR() { return getToken(ElasticsearchParser.XOR, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public NameOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNameOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNameOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNameOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameOperandContext nameOperand() throws RecognitionException {
		NameOperandContext _localctx = new NameOperandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nameOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(252);
				((NameOperandContext)_localctx).exclude = match(XOR);
				}
			}

			setState(255);
			((NameOperandContext)_localctx).fieldName = name(0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(256);
				match(AS);
				setState(257);
				((NameOperandContext)_localctx).alias = match(ID);
				}
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

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldNameContext extends NameContext {
		public Token highlighter;
		public Token field;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode HIGHLIGHTER() { return getToken(ElasticsearchParser.HIGHLIGHTER, 0); }
		public FieldNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctNameContext extends NameContext {
		public NameContext fieldName;
		public TerminalNode DISTINCT() { return getToken(ElasticsearchParser.DISTINCT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DistinctNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterDistinctName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitDistinctName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitDistinctName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionNameContext extends NameContext {
		public Token functionName;
		public CollectionContext params;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public FunctionNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LrNameContext extends NameContext {
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public LrNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterLrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitLrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitLrName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupByFunctionNameContext extends NameContext {
		public GroupByFunctionClauseContext groupByFunctionClause() {
			return getRuleContext(GroupByFunctionClauseContext.class,0);
		}
		public GroupByFunctionNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGroupByFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGroupByFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGroupByFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryNameContext extends NameContext {
		public NameContext left;
		public Token op;
		public NameContext right;
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode STAR() { return getToken(ElasticsearchParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(ElasticsearchParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(ElasticsearchParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ElasticsearchParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ElasticsearchParser.MINUS, 0); }
		public BinaryNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterBinaryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitBinaryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitBinaryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		return name(0);
	}

	private NameContext name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NameContext _localctx = new NameContext(_ctx, _parentState);
		NameContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_name, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new LrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				match(LPAREN);
				setState(262);
				name(0);
				setState(263);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new DistinctNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(DISTINCT);
				setState(266);
				((DistinctNameContext)_localctx).fieldName = name(5);
				}
				break;
			case 3:
				{
				_localctx = new FunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				((FunctionNameContext)_localctx).functionName = match(ID);
				setState(268);
				((FunctionNameContext)_localctx).params = collection();
				}
				break;
			case 4:
				{
				_localctx = new FieldNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGHLIGHTER) {
					{
					setState(269);
					((FieldNameContext)_localctx).highlighter = match(HIGHLIGHTER);
					}
				}

				setState(272);
				((FieldNameContext)_localctx).field = match(ID);
				}
				break;
			case 5:
				{
				_localctx = new GroupByFunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				groupByFunctionClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryNameContext(new NameContext(_parentctx, _parentState));
					((BinaryNameContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(276);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(277);
					((BinaryNameContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STAR - 74)) | (1L << (DIVIDE - 74)) | (1L << (PLUS - 74)) | (1L << (MINUS - 74)) | (1L << (MOD - 74)))) != 0)) ) {
						((BinaryNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(278);
					((BinaryNameContext)_localctx).right = name(5);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class IdentityContext extends ParserRuleContext {
		public Token number;
		public Token str;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ElasticsearchParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public IdentityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitIdentity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitIdentity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityContext identity() throws RecognitionException {
		IdentityContext _localctx = new IdentityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identity);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((IdentityContext)_localctx).number = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
					((IdentityContext)_localctx).number = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				((IdentityContext)_localctx).str = match(STRING);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GeoContext extends ExpressionContext {
		public GeoClauseContext geoClause() {
			return getRuleContext(GeoClauseContext.class,0);
		}
		public GeoContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScoreContext extends ExpressionContext {
		public FunctionScoreClauseContext functionScoreClause() {
			return getRuleContext(FunctionScoreClauseContext.class,0);
		}
		public ScoreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitScore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveContext extends ExpressionContext {
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
		public PrimitiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalContext extends ExpressionContext {
		public ExpressionContext expr;
		public ExpressionContext leftExpr;
		public ExpressionContext rightExpr;
		public TerminalNode COND() { return getToken(ElasticsearchParser.COND, 0); }
		public TerminalNode COLON() { return getToken(ElasticsearchParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends ExpressionContext {
		public InClauseContext inClause() {
			return getRuleContext(InClauseContext.class,0);
		}
		public InContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends ExpressionContext {
		public ExpressionContext leftExpr;
		public Token not;
		public Token operator;
		public ExpressionContext rightExpr;
		public IsClauseContext isClause() {
			return getRuleContext(IsClauseContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public TerminalNode MUL() { return getToken(ElasticsearchParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ElasticsearchParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ElasticsearchParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ElasticsearchParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ElasticsearchParser.MINUS, 0); }
		public TerminalNode LSH() { return getToken(ElasticsearchParser.LSH, 0); }
		public TerminalNode RSH() { return getToken(ElasticsearchParser.RSH, 0); }
		public TerminalNode USH() { return getToken(ElasticsearchParser.USH, 0); }
		public TerminalNode LT() { return getToken(ElasticsearchParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ElasticsearchParser.LTE, 0); }
		public TerminalNode GT() { return getToken(ElasticsearchParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ElasticsearchParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(ElasticsearchParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ElasticsearchParser.NE, 0); }
		public TerminalNode AEQ() { return getToken(ElasticsearchParser.AEQ, 0); }
		public TerminalNode TEQ() { return getToken(ElasticsearchParser.TEQ, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode OR() { return getToken(ElasticsearchParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ElasticsearchParser.XOR, 0); }
		public TerminalNode BWOR() { return getToken(ElasticsearchParser.BWOR, 0); }
		public BinaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LrExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public LrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterLrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitLrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitLrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenAndContext extends ExpressionContext {
		public NameContext expr;
		public IdentityContext left;
		public IdentityContext right;
		public TerminalNode BETWEEN() { return getToken(ElasticsearchParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public BetweenAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterBetweenAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitBetweenAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitBetweenAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullTextContext extends ExpressionContext {
		public FullTextClauseContext fullTextClause() {
			return getRuleContext(FullTextClauseContext.class,0);
		}
		public FullTextContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFullText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFullText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFullText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends ExpressionContext {
		public HasChildClauseContext hasChildClause() {
			return getRuleContext(HasChildClauseContext.class,0);
		}
		public HasParentClauseContext hasParentClause() {
			return getRuleContext(HasParentClauseContext.class,0);
		}
		public JoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedContext extends ExpressionContext {
		public NestedClauseContext nestedClause() {
			return getRuleContext(NestedClauseContext.class,0);
		}
		public NestedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameExprContext extends ExpressionContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				match(LPAREN);
				setState(291);
				expression(0);
				setState(292);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				((BetweenAndContext)_localctx).expr = name(0);
				setState(295);
				match(BETWEEN);
				setState(296);
				((BetweenAndContext)_localctx).left = identity();
				setState(297);
				match(AND);
				setState(298);
				((BetweenAndContext)_localctx).right = identity();
				}
				break;
			case 3:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				inClause();
				}
				break;
			case 4:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				name(0);
				}
				break;
			case 5:
				{
				_localctx = new PrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				identity();
				}
				break;
			case 6:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				hasChildClause();
				}
				break;
			case 7:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				hasParentClause();
				}
				break;
			case 8:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				isClause();
				}
				break;
			case 9:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				nestedClause();
				}
				break;
			case 10:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				likeClause();
				}
				break;
			case 11:
				{
				_localctx = new GeoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				geoClause();
				}
				break;
			case 12:
				{
				_localctx = new FullTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				fullTextClause();
				}
				break;
			case 13:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				((BinaryContext)_localctx).not = match(NOT);
				setState(311);
				expression(2);
				}
				break;
			case 14:
				{
				_localctx = new ScoreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				functionScoreClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(316);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (MUL - 75)) | (1L << (DIV - 75)) | (1L << (MOD - 75)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						((BinaryContext)_localctx).rightExpr = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(319);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						((BinaryContext)_localctx).rightExpr = expression(23);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(322);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (LSH - 103)) | (1L << (RSH - 103)) | (1L << (USH - 103)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						((BinaryContext)_localctx).rightExpr = expression(22);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(325);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (GT - 91)) | (1L << (GTE - 91)) | (1L << (LT - 91)) | (1L << (LTE - 91)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						((BinaryContext)_localctx).rightExpr = expression(21);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(328);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EQ - 86)) | (1L << (AEQ - 86)) | (1L << (TEQ - 86)) | (1L << (NE - 86)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						((BinaryContext)_localctx).rightExpr = expression(20);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(331);
						((BinaryContext)_localctx).operator = match(AND);
						setState(332);
						((BinaryContext)_localctx).rightExpr = expression(19);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(334);
						((BinaryContext)_localctx).operator = match(OR);
						setState(335);
						((BinaryContext)_localctx).rightExpr = expression(18);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(337);
						((BinaryContext)_localctx).operator = match(XOR);
						setState(338);
						((BinaryContext)_localctx).rightExpr = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(340);
						((BinaryContext)_localctx).operator = match(BWOR);
						setState(341);
						((BinaryContext)_localctx).rightExpr = expression(15);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(343);
						match(COND);
						setState(344);
						((ConditionalContext)_localctx).leftExpr = expression(0);
						setState(345);
						match(COLON);
						setState(346);
						((ConditionalContext)_localctx).rightExpr = expression(13);
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(LPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (INT - 122)) | (1L << (FLOAT - 122)) | (1L << (ID - 122)) | (1L << (STRING - 122)))) != 0)) {
				{
				setState(354);
				identity();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357);
				match(COMMA);
				setState(358);
				identity();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(RPAREN);
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

	public static class LikeClauseContext extends ParserRuleContext {
		public NameContext field;
		public Token not;
		public Token pattern;
		public TerminalNode LIKE() { return getToken(ElasticsearchParser.LIKE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((LikeClauseContext)_localctx).field = name(0);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(367);
				((LikeClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(370);
			match(LIKE);
			setState(371);
			((LikeClauseContext)_localctx).pattern = match(STRING);
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

	public static class IsClauseContext extends ParserRuleContext {
		public NameContext field;
		public Token not;
		public TerminalNode IS() { return getToken(ElasticsearchParser.IS, 0); }
		public TerminalNode NULL() { return getToken(ElasticsearchParser.NULL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public IsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterIsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitIsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitIsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsClauseContext isClause() throws RecognitionException {
		IsClauseContext _localctx = new IsClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_isClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((IsClauseContext)_localctx).field = name(0);
			setState(374);
			match(IS);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(375);
				((IsClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(378);
			match(NULL);
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

	public static class InClauseContext extends ParserRuleContext {
		public NameContext left;
		public InRightOperandListContext right;
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InRightOperandListContext inRightOperandList() {
			return getRuleContext(InRightOperandListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public InClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterInClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitInClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitInClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClauseContext inClause() throws RecognitionException {
		InClauseContext _localctx = new InClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((InClauseContext)_localctx).left = name(0);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(381);
				match(NOT);
				}
			}

			setState(384);
			match(IN);
			setState(385);
			((InClauseContext)_localctx).right = inRightOperandList();
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

	public static class InRightOperandListContext extends ParserRuleContext {
		public List<InRightOperandContext> inRightOperand() {
			return getRuleContexts(InRightOperandContext.class);
		}
		public InRightOperandContext inRightOperand(int i) {
			return getRuleContext(InRightOperandContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public InRightOperandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inRightOperandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterInRightOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitInRightOperandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitInRightOperandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InRightOperandListContext inRightOperandList() throws RecognitionException {
		InRightOperandListContext _localctx = new InRightOperandListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inRightOperandList);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				inRightOperand(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(LPAREN);
				setState(389);
				inRightOperand(0);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(390);
					match(COMMA);
					setState(391);
					inRightOperand(0);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(RPAREN);
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

	public static class InRightOperandContext extends ParserRuleContext {
		public InRightOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inRightOperand; }
	 
		public InRightOperandContext() { }
		public void copyFrom(InRightOperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstLiteralContext extends InRightOperandContext {
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
		public ConstLiteralContext(InRightOperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterConstLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitConstLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitConstLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticLiteralContext extends InRightOperandContext {
		public InRightOperandContext left;
		public Token op;
		public InRightOperandContext right;
		public List<InRightOperandContext> inRightOperand() {
			return getRuleContexts(InRightOperandContext.class);
		}
		public InRightOperandContext inRightOperand(int i) {
			return getRuleContext(InRightOperandContext.class,i);
		}
		public TerminalNode STAR() { return getToken(ElasticsearchParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(ElasticsearchParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ElasticsearchParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ElasticsearchParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ElasticsearchParser.MINUS, 0); }
		public ArithmeticLiteralContext(InRightOperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterArithmeticLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitArithmeticLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitArithmeticLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InRightOperandContext inRightOperand() throws RecognitionException {
		return inRightOperand(0);
	}

	private InRightOperandContext inRightOperand(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InRightOperandContext _localctx = new InRightOperandContext(_ctx, _parentState);
		InRightOperandContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_inRightOperand, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConstLiteralContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(402);
			identity();
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticLiteralContext(new InRightOperandContext(_parentctx, _parentState));
					((ArithmeticLiteralContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inRightOperand);
					setState(404);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(405);
					((ArithmeticLiteralContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (STAR - 74)) | (1L << (PLUS - 74)) | (1L << (MINUS - 74)) | (1L << (DIV - 74)) | (1L << (MOD - 74)))) != 0)) ) {
						((ArithmeticLiteralContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(406);
					((ArithmeticLiteralContext)_localctx).right = inRightOperand(2);
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class TableRefContext extends ParserRuleContext {
		public Token indexName;
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(ElasticsearchParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ElasticsearchParser.ID, i);
		}
		public TerminalNode AS() { return getToken(ElasticsearchParser.AS, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterTableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitTableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitTableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			((TableRefContext)_localctx).indexName = match(ID);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(413);
				match(AS);
				setState(414);
				((TableRefContext)_localctx).alias = match(ID);
				}
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

	public static class FullTextClauseContext extends ParserRuleContext {
		public QueryStringClauseContext queryStringClause() {
			return getRuleContext(QueryStringClauseContext.class,0);
		}
		public MultiMatchClauseContext multiMatchClause() {
			return getRuleContext(MultiMatchClauseContext.class,0);
		}
		public DisMaxClauseContext disMaxClause() {
			return getRuleContext(DisMaxClauseContext.class,0);
		}
		public FullTextClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFullTextClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFullTextClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFullTextClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullTextClauseContext fullTextClause() throws RecognitionException {
		FullTextClauseContext _localctx = new FullTextClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fullTextClause);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				queryStringClause();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				multiMatchClause();
				}
				break;
			case DIS_MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				disMaxClause();
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

	public static class QueryStringClauseContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(ElasticsearchParser.QUERY, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public QueryStringClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStringClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterQueryStringClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitQueryStringClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitQueryStringClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryStringClauseContext queryStringClause() throws RecognitionException {
		QueryStringClauseContext _localctx = new QueryStringClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_queryStringClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(QUERY);
			setState(423);
			match(BY);
			setState(424);
			match(STRING);
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

	public static class MultiMatchClauseContext extends ParserRuleContext {
		public Token value;
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public TerminalNode AEQ() { return getToken(ElasticsearchParser.AEQ, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public MultiMatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiMatchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterMultiMatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitMultiMatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitMultiMatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiMatchClauseContext multiMatchClause() throws RecognitionException {
		MultiMatchClauseContext _localctx = new MultiMatchClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiMatchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LPAREN);
			setState(427);
			name(0);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				name(0);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			match(RPAREN);
			setState(436);
			match(AEQ);
			setState(437);
			((MultiMatchClauseContext)_localctx).value = match(STRING);
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

	public static class DisMaxClauseContext extends ParserRuleContext {
		public TerminalNode DIS_MAX() { return getToken(ElasticsearchParser.DIS_MAX, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> BOOLAND() { return getTokens(ElasticsearchParser.BOOLAND); }
		public TerminalNode BOOLAND(int i) {
			return getToken(ElasticsearchParser.BOOLAND, i);
		}
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode TIE_BREAKER() { return getToken(ElasticsearchParser.TIE_BREAKER, 0); }
		public TerminalNode EQ() { return getToken(ElasticsearchParser.EQ, 0); }
		public TerminalNode FLOAT() { return getToken(ElasticsearchParser.FLOAT, 0); }
		public DisMaxClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disMaxClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterDisMaxClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitDisMaxClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitDisMaxClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisMaxClauseContext disMaxClause() throws RecognitionException {
		DisMaxClauseContext _localctx = new DisMaxClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_disMaxClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(DIS_MAX);
			setState(440);
			expression(0);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(BOOLAND);
					setState(442);
					expression(0);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(448);
				match(AND);
				setState(449);
				match(TIE_BREAKER);
				setState(450);
				match(EQ);
				setState(451);
				match(FLOAT);
				}
				break;
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

	public static class HasParentClauseContext extends ParserRuleContext {
		public NameContext type;
		public ExpressionContext query;
		public TerminalNode HAS_PARENT() { return getToken(ElasticsearchParser.HAS_PARENT, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HasParentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasParentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterHasParentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitHasParentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitHasParentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasParentClauseContext hasParentClause() throws RecognitionException {
		HasParentClauseContext _localctx = new HasParentClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hasParentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(HAS_PARENT);
			setState(455);
			match(LPAREN);
			setState(456);
			((HasParentClauseContext)_localctx).type = name(0);
			setState(457);
			match(COMMA);
			setState(458);
			((HasParentClauseContext)_localctx).query = expression(0);
			setState(459);
			match(RPAREN);
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

	public static class HasChildClauseContext extends ParserRuleContext {
		public NameContext type;
		public ExpressionContext query;
		public TerminalNode HAS_CHILD() { return getToken(ElasticsearchParser.HAS_CHILD, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HasChildClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasChildClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterHasChildClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitHasChildClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitHasChildClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasChildClauseContext hasChildClause() throws RecognitionException {
		HasChildClauseContext _localctx = new HasChildClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hasChildClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(HAS_CHILD);
			setState(462);
			match(LPAREN);
			setState(463);
			((HasChildClauseContext)_localctx).type = name(0);
			setState(464);
			match(COMMA);
			setState(465);
			((HasChildClauseContext)_localctx).query = expression(0);
			setState(466);
			match(RPAREN);
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

	public static class NestedClauseContext extends ParserRuleContext {
		public Token nestedPath;
		public ExpressionContext query;
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NestedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNestedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNestedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNestedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedClauseContext nestedClause() throws RecognitionException {
		NestedClauseContext _localctx = new NestedClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nestedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LBRACKET);
			setState(469);
			((NestedClauseContext)_localctx).nestedPath = match(ID);
			setState(470);
			match(COMMA);
			setState(471);
			((NestedClauseContext)_localctx).query = expression(0);
			setState(472);
			match(RBRACKET);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ElasticsearchParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(WHERE);
			setState(475);
			expression(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ElasticsearchParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public List<TerminalNode> ID() { return getTokens(ElasticsearchParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ElasticsearchParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(GROUP);
			setState(478);
			match(BY);
			setState(479);
			match(ID);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(480);
				match(COMMA);
				setState(481);
				match(ID);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(487);
				havingClause();
				}
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(ElasticsearchParser.HAVING, 0); }
		public HavingExpressionContext havingExpression() {
			return getRuleContext(HavingExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(HAVING);
			setState(491);
			havingExpression(0);
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

	public static class HavingExpressionContext extends ParserRuleContext {
		public HavingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingExpression; }
	 
		public HavingExpressionContext() { }
		public void copyFrom(HavingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingPrimitiveContext extends HavingExpressionContext {
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
		public HavingPrimitiveContext(HavingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterHavingPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitHavingPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitHavingPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LrHavingExprContext extends HavingExpressionContext {
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public HavingExpressionContext havingExpression() {
			return getRuleContext(HavingExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public LrHavingExprContext(HavingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterLrHavingExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitLrHavingExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitLrHavingExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HavingBinaryContext extends HavingExpressionContext {
		public HavingExpressionContext leftExpr;
		public Token operator;
		public HavingExpressionContext rightExpr;
		public List<HavingExpressionContext> havingExpression() {
			return getRuleContexts(HavingExpressionContext.class);
		}
		public HavingExpressionContext havingExpression(int i) {
			return getRuleContext(HavingExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode OR() { return getToken(ElasticsearchParser.OR, 0); }
		public TerminalNode LT() { return getToken(ElasticsearchParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ElasticsearchParser.LTE, 0); }
		public TerminalNode GT() { return getToken(ElasticsearchParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ElasticsearchParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(ElasticsearchParser.EQ, 0); }
		public HavingBinaryContext(HavingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterHavingBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitHavingBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitHavingBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends HavingExpressionContext {
		public Token funcName;
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public FunctionExprContext(HavingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingExpressionContext havingExpression() throws RecognitionException {
		return havingExpression(0);
	}

	private HavingExpressionContext havingExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HavingExpressionContext _localctx = new HavingExpressionContext(_ctx, _parentState);
		HavingExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_havingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new LrHavingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(494);
				match(LPAREN);
				setState(495);
				havingExpression(0);
				setState(496);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new HavingPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				identity();
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				((FunctionExprContext)_localctx).funcName = match(ID);
				setState(500);
				collection();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(503);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(504);
						((HavingBinaryContext)_localctx).operator = match(AND);
						setState(505);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(506);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(507);
						((HavingBinaryContext)_localctx).operator = match(OR);
						setState(508);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(509);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(510);
						((HavingBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EQ - 86)) | (1L << (GT - 86)) | (1L << (GTE - 86)) | (1L << (LT - 86)) | (1L << (LTE - 86)))) != 0)) ) {
							((HavingBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(511);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(4);
						}
						break;
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class AggregateByClauseContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(ElasticsearchParser.AGGREGATE, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public AggregateByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterAggregateByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitAggregateByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitAggregateByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateByClauseContext aggregateByClause() throws RecognitionException {
		AggregateByClauseContext _localctx = new AggregateByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aggregateByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(AGGREGATE);
			setState(518);
			match(BY);
			setState(519);
			aggregationClause();
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public AggregateItemClauseContext aggregateItemClause() {
			return getRuleContext(AggregateItemClauseContext.class,0);
		}
		public NestedAggregationClauseContext nestedAggregationClause() {
			return getRuleContext(NestedAggregationClauseContext.class,0);
		}
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aggregationClause);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				aggregateItemClause();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				nestedAggregationClause();
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

	public static class NestedAggregationClauseContext extends ParserRuleContext {
		public Token nestedPath;
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public List<AggregationClauseContext> aggregationClause() {
			return getRuleContexts(AggregationClauseContext.class);
		}
		public AggregationClauseContext aggregationClause(int i) {
			return getRuleContext(AggregationClauseContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public List<SubAggregationClauseContext> subAggregationClause() {
			return getRuleContexts(SubAggregationClauseContext.class);
		}
		public SubAggregationClauseContext subAggregationClause(int i) {
			return getRuleContext(SubAggregationClauseContext.class,i);
		}
		public NestedAggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedAggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNestedAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNestedAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNestedAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedAggregationClauseContext nestedAggregationClause() throws RecognitionException {
		NestedAggregationClauseContext _localctx = new NestedAggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nestedAggregationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(LBRACKET);
			setState(526);
			((NestedAggregationClauseContext)_localctx).nestedPath = match(ID);
			setState(527);
			match(COMMA);
			setState(528);
			aggregationClause();
			setState(529);
			match(RBRACKET);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(533);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(530);
						match(COMMA);
						setState(531);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(532);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class SubAggregationClauseContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ElasticsearchParser.GT, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public SubAggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterSubAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitSubAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitSubAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAggregationClauseContext subAggregationClause() throws RecognitionException {
		SubAggregationClauseContext _localctx = new SubAggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_subAggregationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(GT);
			setState(539);
			match(LPAREN);
			setState(540);
			aggregationClause();
			setState(541);
			match(RPAREN);
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

	public static class AggregateItemClauseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public List<SubAggregationClauseContext> subAggregationClause() {
			return getRuleContexts(SubAggregationClauseContext.class);
		}
		public SubAggregationClauseContext subAggregationClause(int i) {
			return getRuleContext(SubAggregationClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public List<AggregationClauseContext> aggregationClause() {
			return getRuleContexts(AggregationClauseContext.class);
		}
		public AggregationClauseContext aggregationClause(int i) {
			return getRuleContext(AggregationClauseContext.class,i);
		}
		public AggregateItemClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateItemClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterAggregateItemClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitAggregateItemClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitAggregateItemClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateItemClauseContext aggregateItemClause() throws RecognitionException {
		AggregateItemClauseContext _localctx = new AggregateItemClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_aggregateItemClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(ID);
			setState(544);
			collection();
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(548);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(545);
						match(COMMA);
						setState(546);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(547);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class RoutingClauseContext extends ParserRuleContext {
		public TerminalNode ROUTING() { return getToken(ElasticsearchParser.ROUTING, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public List<TerminalNode> STRING() { return getTokens(ElasticsearchParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ElasticsearchParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public RoutingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterRoutingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitRoutingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitRoutingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutingClauseContext routingClause() throws RecognitionException {
		RoutingClauseContext _localctx = new RoutingClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_routingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(ROUTING);
			setState(554);
			match(BY);
			setState(555);
			match(STRING);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(556);
				match(COMMA);
				setState(557);
				match(STRING);
				}
				}
				setState(562);
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

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ElasticsearchParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(ORDER);
			setState(564);
			match(BY);
			setState(565);
			order();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(566);
				match(COMMA);
				setState(567);
				order();
				}
				}
				setState(572);
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

	public static class OrderContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ElasticsearchParser.ASC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			name(0);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC) {
				{
				setState(574);
				match(ASC);
				}
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

	public static class LimitClauseContext extends ParserRuleContext {
		public Token offset;
		public Token size;
		public TerminalNode LIMIT() { return getToken(ElasticsearchParser.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(ElasticsearchParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ElasticsearchParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(LIMIT);
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(578);
				((LimitClauseContext)_localctx).offset = match(INT);
				setState(579);
				match(COMMA);
				}
				break;
			}
			setState(582);
			((LimitClauseContext)_localctx).size = match(INT);
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

	public static class GeoClauseContext extends ParserRuleContext {
		public GeoDistanceClauseContext geoDistanceClause() {
			return getRuleContext(GeoDistanceClauseContext.class,0);
		}
		public GeoBoundingBoxClauseContext geoBoundingBoxClause() {
			return getRuleContext(GeoBoundingBoxClauseContext.class,0);
		}
		public GeoPolygonClauseContext geoPolygonClause() {
			return getRuleContext(GeoPolygonClauseContext.class,0);
		}
		public GeoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoClauseContext geoClause() throws RecognitionException {
		GeoClauseContext _localctx = new GeoClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_geoClause);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				geoDistanceClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				geoBoundingBoxClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				geoPolygonClause();
				}
				break;
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

	public static class GeoDistanceClauseContext extends ParserRuleContext {
		public GeoPointClauseContext coordinate;
		public Token distance;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public List<TerminalNode> EQ() { return getTokens(ElasticsearchParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ElasticsearchParser.EQ, i);
		}
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode DISTANCE() { return getToken(ElasticsearchParser.DISTANCE, 0); }
		public GeoPointClauseContext geoPointClause() {
			return getRuleContext(GeoPointClauseContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public GeoDistanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoDistanceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoDistanceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoDistanceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoDistanceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoDistanceClauseContext geoDistanceClause() throws RecognitionException {
		GeoDistanceClauseContext _localctx = new GeoDistanceClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_geoDistanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(ID);
			setState(590);
			match(EQ);
			setState(591);
			((GeoDistanceClauseContext)_localctx).coordinate = geoPointClause();
			setState(592);
			match(AND);
			setState(593);
			match(DISTANCE);
			setState(594);
			match(EQ);
			setState(595);
			((GeoDistanceClauseContext)_localctx).distance = match(STRING);
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

	public static class GeoBoundingBoxClauseContext extends ParserRuleContext {
		public Token field;
		public GeoPointClauseContext leftTop;
		public GeoPointClauseContext rightBottom;
		public TerminalNode BETWEEN() { return getToken(ElasticsearchParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public List<GeoPointClauseContext> geoPointClause() {
			return getRuleContexts(GeoPointClauseContext.class);
		}
		public GeoPointClauseContext geoPointClause(int i) {
			return getRuleContext(GeoPointClauseContext.class,i);
		}
		public GeoBoundingBoxClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoBoundingBoxClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoBoundingBoxClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoBoundingBoxClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoBoundingBoxClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoBoundingBoxClauseContext geoBoundingBoxClause() throws RecognitionException {
		GeoBoundingBoxClauseContext _localctx = new GeoBoundingBoxClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_geoBoundingBoxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((GeoBoundingBoxClauseContext)_localctx).field = match(ID);
			setState(598);
			match(BETWEEN);
			setState(599);
			((GeoBoundingBoxClauseContext)_localctx).leftTop = geoPointClause();
			setState(600);
			match(AND);
			setState(601);
			((GeoBoundingBoxClauseContext)_localctx).rightBottom = geoPointClause();
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

	public static class GeoPolygonClauseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<GeoPointClauseContext> geoPointClause() {
			return getRuleContexts(GeoPointClauseContext.class);
		}
		public GeoPointClauseContext geoPointClause(int i) {
			return getRuleContext(GeoPointClauseContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public GeoPolygonClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoPolygonClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoPolygonClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoPolygonClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoPolygonClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoPolygonClauseContext geoPolygonClause() throws RecognitionException {
		GeoPolygonClauseContext _localctx = new GeoPolygonClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_geoPolygonClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(ID);
			setState(604);
			match(IN);
			setState(605);
			match(LBRACKET);
			setState(606);
			geoPointClause();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(607);
				match(COMMA);
				setState(608);
				geoPointClause();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(RBRACKET);
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

	public static class GeoPointClauseContext extends ParserRuleContext {
		public Token lon;
		public Token lat;
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public List<TerminalNode> INT() { return getTokens(ElasticsearchParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ElasticsearchParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ElasticsearchParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ElasticsearchParser.FLOAT, i);
		}
		public GeoPointClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoPointClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoPointClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoPointClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoPointClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoPointClauseContext geoPointClause() throws RecognitionException {
		GeoPointClauseContext _localctx = new GeoPointClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_geoPointClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LBRACKET);
			{
			setState(617);
			((GeoPointClauseContext)_localctx).lon = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((GeoPointClauseContext)_localctx).lon = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(618);
			match(COMMA);
			setState(619);
			((GeoPointClauseContext)_localctx).lat = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((GeoPointClauseContext)_localctx).lat = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(621);
			match(RBRACKET);
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

	public static class FunctionScoreClauseContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(ElasticsearchParser.QUERY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FUNCTION_SCORE() { return getToken(ElasticsearchParser.FUNCTION_SCORE, 0); }
		public List<TerminalNode> BOOLAND() { return getTokens(ElasticsearchParser.BOOLAND); }
		public TerminalNode BOOLAND(int i) {
			return getToken(ElasticsearchParser.BOOLAND, i);
		}
		public FunctionScoreClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionScoreClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterFunctionScoreClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitFunctionScoreClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitFunctionScoreClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionScoreClauseContext functionScoreClause() throws RecognitionException {
		FunctionScoreClauseContext _localctx = new FunctionScoreClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionScoreClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(QUERY);
			setState(624);
			expression(0);
			setState(625);
			match(FUNCTION_SCORE);
			setState(626);
			expression(0);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627);
					match(BOOLAND);
					setState(628);
					expression(0);
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class GroupByFunctionClauseContext extends ParserRuleContext {
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public GroupByFunctionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByFunctionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGroupByFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGroupByFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGroupByFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByFunctionClauseContext groupByFunctionClause() throws RecognitionException {
		GroupByFunctionClauseContext _localctx = new GroupByFunctionClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_groupByFunctionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			count();
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

	public static class CountContext extends ParserRuleContext {
		public Token field;
		public Token size;
		public TerminalNode COUNT() { return getToken(ElasticsearchParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode DISTINCT() { return getToken(ElasticsearchParser.DISTINCT, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(COUNT);
			setState(637);
			match(LPAREN);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(638);
				match(DISTINCT);
				}
			}

			setState(641);
			((CountContext)_localctx).field = match(ID);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(642);
				match(COMMA);
				setState(643);
				((CountContext)_localctx).size = match(INT);
				}
			}

			setState(646);
			match(RPAREN);
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
		case 9:
			return name_sempred((NameContext)_localctx, predIndex);
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 17:
			return inRightOperand_sempred((InRightOperandContext)_localctx, predIndex);
		case 29:
			return havingExpression_sempred((HavingExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean name_sempred(NameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean inRightOperand_sempred(InRightOperandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean havingExpression_sempred(HavingExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0087\u028b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\5\2g\n\2\3\2"+
		"\5\2j\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\3"+
		"\5\3z\n\3\3\3\5\3}\n\3\3\3\3\3\5\3\u0081\n\3\3\3\5\3\u0084\n\3\3\3\5\3"+
		"\u0087\n\3\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u0094"+
		"\n\5\f\5\16\5\u0097\13\5\3\5\5\5\u009a\n\5\3\5\5\5\u009d\n\5\3\5\5\5\u00a0"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af"+
		"\13\6\3\6\5\6\u00b2\n\6\3\6\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ca"+
		"\n\7\f\7\16\7\u00cd\13\7\3\7\3\7\5\7\u00d1\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00dc\n\b\f\b\16\b\u00df\13\b\3\b\5\b\u00e2\n\b\3\b\5"+
		"\b\u00e5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ef\n\b\3\b\5\b\u00f2"+
		"\n\b\3\t\3\t\3\t\3\t\7\t\u00f8\n\t\f\t\16\t\u00fb\13\t\5\t\u00fd\n\t\3"+
		"\n\5\n\u0100\n\n\3\n\3\n\3\n\5\n\u0105\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0111\n\13\3\13\3\13\5\13\u0115\n\13\3\13"+
		"\3\13\3\13\7\13\u011a\n\13\f\13\16\13\u011d\13\13\3\f\3\f\3\f\5\f\u0122"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u015f\n\r\f\r\16\r\u0162\13\r"+
		"\3\16\3\16\5\16\u0166\n\16\3\16\3\16\7\16\u016a\n\16\f\16\16\16\u016d"+
		"\13\16\3\16\3\16\3\17\3\17\5\17\u0173\n\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\5\20\u017b\n\20\3\20\3\20\3\21\3\21\5\21\u0181\n\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u018b\n\22\f\22\16\22\u018e\13\22\3\22"+
		"\3\22\5\22\u0192\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u019a\n\23\f"+
		"\23\16\23\u019d\13\23\3\24\3\24\3\24\5\24\u01a2\n\24\3\25\3\25\3\25\5"+
		"\25\u01a7\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u01b1\n\27"+
		"\f\27\16\27\u01b4\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01be"+
		"\n\30\f\30\16\30\u01c1\13\30\3\30\3\30\3\30\3\30\5\30\u01c7\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u01e5\n\35\f\35\16\35\u01e8\13\35\3\35\5\35\u01eb\n\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01f8\n\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0203\n\37\f\37\16\37\u0206\13\37"+
		"\3 \3 \3 \3 \3!\3!\5!\u020e\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0218"+
		"\n\"\f\"\16\"\u021b\13\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\7$\u0227\n$\f$"+
		"\16$\u022a\13$\3%\3%\3%\3%\3%\7%\u0231\n%\f%\16%\u0234\13%\3&\3&\3&\3"+
		"&\3&\7&\u023b\n&\f&\16&\u023e\13&\3\'\3\'\5\'\u0242\n\'\3(\3(\3(\5(\u0247"+
		"\n(\3(\3(\3)\3)\3)\5)\u024e\n)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\7,\u0264\n,\f,\16,\u0267\13,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u0278\n.\f.\16.\u027b\13.\3/\3/\3\60\3\60"+
		"\3\60\5\60\u0282\n\60\3\60\3\60\3\60\5\60\u0287\n\60\3\60\3\60\3\60\2"+
		"\6\24\30$<\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\13\7\2LLNNPPSSUU\3\2|}\4\2MMTU\4\2PPSS\3\2"+
		"ik\3\2]`\4\2XZ\\\\\5\2LLPPSU\4\2XX]`\2\u02bf\2f\3\2\2\2\4m\3\2\2\2\6\u0088"+
		"\3\2\2\2\b\u008e\3\2\2\2\n\u00a1\3\2\2\2\f\u00b6\3\2\2\2\16\u00d2\3\2"+
		"\2\2\20\u00fc\3\2\2\2\22\u00ff\3\2\2\2\24\u0114\3\2\2\2\26\u0121\3\2\2"+
		"\2\30\u013b\3\2\2\2\32\u0163\3\2\2\2\34\u0170\3\2\2\2\36\u0177\3\2\2\2"+
		" \u017e\3\2\2\2\"\u0191\3\2\2\2$\u0193\3\2\2\2&\u019e\3\2\2\2(\u01a6\3"+
		"\2\2\2*\u01a8\3\2\2\2,\u01ac\3\2\2\2.\u01b9\3\2\2\2\60\u01c8\3\2\2\2\62"+
		"\u01cf\3\2\2\2\64\u01d6\3\2\2\2\66\u01dc\3\2\2\28\u01df\3\2\2\2:\u01ec"+
		"\3\2\2\2<\u01f7\3\2\2\2>\u0207\3\2\2\2@\u020d\3\2\2\2B\u020f\3\2\2\2D"+
		"\u021c\3\2\2\2F\u0221\3\2\2\2H\u022b\3\2\2\2J\u0235\3\2\2\2L\u023f\3\2"+
		"\2\2N\u0243\3\2\2\2P\u024d\3\2\2\2R\u024f\3\2\2\2T\u0257\3\2\2\2V\u025d"+
		"\3\2\2\2X\u026a\3\2\2\2Z\u0271\3\2\2\2\\\u027c\3\2\2\2^\u027e\3\2\2\2"+
		"`g\5\4\3\2ag\5\b\5\2bg\5\6\4\2cg\5\n\6\2dg\5\f\7\2eg\5\16\b\2f`\3\2\2"+
		"\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gi\3\2\2\2hj\7u\2"+
		"\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\2\2\3l\3\3\2\2\2mn\7\n\2\2no\5\20"+
		"\t\2op\7\65\2\2pu\5&\24\2qr\7t\2\2rt\5&\24\2sq\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\5\66\34\2yx\3\2\2\2yz\3\2\2\2z|\3"+
		"\2\2\2{}\5H%\2|{\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~\u0081\58\35\2\177\u0081"+
		"\5> \2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\5J&\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0087\5N(\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\5\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008c\5&\24\2\u008a\u008b"+
		"\7N\2\2\u008b\u008d\5\26\f\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\7\3\2\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\65\2\2\u0090\u0095\5&\24"+
		"\2\u0091\u0092\7t\2\2\u0092\u0094\5&\24\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\5\66\34\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5H%\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5N(\2\u009f\u009e\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3"+
		"\5&\24\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\7\177\2\2\u00a5\u00a6\7X\2\2"+
		"\u00a6\u00ad\5\26\f\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7\177\2\2\u00a9\u00aa"+
		"\7X\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b2\5\66\34\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b5\5H%\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\13\3\2\2\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9"+
		"\5&\24\2\u00b9\u00ba\7n\2\2\u00ba\u00bf\5\26\f\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00be\5\26\f\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7o\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7n"+
		"\2\2\u00c6\u00cb\5\26\f\2\u00c7\u00c8\7t\2\2\u00c8\u00ca\5\26\f\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7o\2\2\u00cf"+
		"\u00d1\5H%\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\r\3\2\2\2\u00d2"+
		"\u00d3\7\f\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7\n"+
		"\2\2\u00d6\u00d7\5\20\t\2\u00d7\u00d8\7\65\2\2\u00d8\u00dd\5&\24\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00dc\5&\24\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e2\5\66\34\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5N(\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\7\67\2\2\u00e7\u00e8\7"+
		"X\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ee\7\u0084\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"\u00ec\7\u0084\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ef\7\u0084\2\2\u00ee\u00ea"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7o\2\2\u00f1"+
		"\u00e6\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00fd\7L\2\2"+
		"\u00f4\u00f9\5\22\n\2\u00f5\u00f6\7t\2\2\u00f6\u00f8\5\22\n\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f4\3\2"+
		"\2\2\u00fd\21\3\2\2\2\u00fe\u0100\7g\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\5\24\13\2\u0102\u0103\7\35\2"+
		"\2\u0103\u0105\7\177\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\23\3\2\2\2\u0106\u0107\b\13\1\2\u0107\u0108\7n\2\2\u0108\u0109\5\24\13"+
		"\2\u0109\u010a\7o\2\2\u010a\u0115\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u0115"+
		"\5\24\13\7\u010d\u010e\7\177\2\2\u010e\u0115\5\32\16\2\u010f\u0111\7\61"+
		"\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0115\7\177\2\2\u0113\u0115\5\\/\2\u0114\u0106\3\2\2\2\u0114\u010b\3"+
		"\2\2\2\u0114\u010d\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u011b\3\2\2\2\u0116\u0117\f\6\2\2\u0117\u0118\t\2\2\2\u0118\u011a\5\24"+
		"\13\7\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\25\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\7\177"+
		"\2\2\u011f\u0122\t\3\2\2\u0120\u0122\7\u0084\2\2\u0121\u011e\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\27\3\2\2\2\u0123\u0124\b\r\1"+
		"\2\u0124\u0125\7n\2\2\u0125\u0126\5\30\r\2\u0126\u0127\7o\2\2\u0127\u013c"+
		"\3\2\2\2\u0128\u0129\5\24\13\2\u0129\u012a\7(\2\2\u012a\u012b\5\26\f\2"+
		"\u012b\u012c\7\31\2\2\u012c\u012d\5\26\f\2\u012d\u013c\3\2\2\2\u012e\u013c"+
		"\5 \21\2\u012f\u013c\5\24\13\2\u0130\u013c\5\26\f\2\u0131\u013c\5\62\32"+
		"\2\u0132\u013c\5\60\31\2\u0133\u013c\5\36\20\2\u0134\u013c\5\64\33\2\u0135"+
		"\u013c\5\34\17\2\u0136\u013c\5P)\2\u0137\u013c\5(\25\2\u0138\u0139\7\33"+
		"\2\2\u0139\u013c\5\30\r\4\u013a\u013c\5Z.\2\u013b\u0123\3\2\2\2\u013b"+
		"\u0128\3\2\2\2\u013b\u012e\3\2\2\2\u013b\u012f\3\2\2\2\u013b\u0130\3\2"+
		"\2\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b"+
		"\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2"+
		"\2\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0160\3\2\2\2\u013d"+
		"\u013e\f\31\2\2\u013e\u013f\t\4\2\2\u013f\u015f\5\30\r\32\u0140\u0141"+
		"\f\30\2\2\u0141\u0142\t\5\2\2\u0142\u015f\5\30\r\31\u0143\u0144\f\27\2"+
		"\2\u0144\u0145\t\6\2\2\u0145\u015f\5\30\r\30\u0146\u0147\f\26\2\2\u0147"+
		"\u0148\t\7\2\2\u0148\u015f\5\30\r\27\u0149\u014a\f\25\2\2\u014a\u014b"+
		"\t\b\2\2\u014b\u015f\5\30\r\26\u014c\u014d\f\24\2\2\u014d\u014e\7\31\2"+
		"\2\u014e\u015f\5\30\r\25\u014f\u0150\f\23\2\2\u0150\u0151\7\32\2\2\u0151"+
		"\u015f\5\30\r\24\u0152\u0153\f\21\2\2\u0153\u0154\7g\2\2\u0154\u015f\5"+
		"\30\r\22\u0155\u0156\f\20\2\2\u0156\u0157\7c\2\2\u0157\u015f\5\30\r\21"+
		"\u0158\u0159\f\17\2\2\u0159\u015a\7W\2\2\u015a\u015b\5\30\r\2\u015b\u015c"+
		"\7z\2\2\u015c\u015d\5\30\r\17\u015d\u015f\3\2\2\2\u015e\u013d\3\2\2\2"+
		"\u015e\u0140\3\2\2\2\u015e\u0143\3\2\2\2\u015e\u0146\3\2\2\2\u015e\u0149"+
		"\3\2\2\2\u015e\u014c\3\2\2\2\u015e\u014f\3\2\2\2\u015e\u0152\3\2\2\2\u015e"+
		"\u0155\3\2\2\2\u015e\u0158\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\31\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165"+
		"\7n\2\2\u0164\u0166\5\26\f\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u016b\3\2\2\2\u0167\u0168\7t\2\2\u0168\u016a\5\26\f\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7o\2\2\u016f\33\3\2\2\2"+
		"\u0170\u0172\5\24\13\2\u0171\u0173\7\33\2\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\36\2\2\u0175\u0176\7"+
		"\u0084\2\2\u0176\35\3\2\2\2\u0177\u0178\5\24\13\2\u0178\u017a\7\34\2\2"+
		"\u0179\u017b\7\33\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017d\7\27\2\2\u017d\37\3\2\2\2\u017e\u0180\5\24\13\2\u017f"+
		"\u0181\7\33\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3"+
		"\2\2\2\u0182\u0183\7\63\2\2\u0183\u0184\5\"\22\2\u0184!\3\2\2\2\u0185"+
		"\u0192\5$\23\2\u0186\u0187\7n\2\2\u0187\u018c\5$\23\2\u0188\u0189\7t\2"+
		"\2\u0189\u018b\5$\23\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0190\7o\2\2\u0190\u0192\3\2\2\2\u0191\u0185\3\2\2\2\u0191\u0186\3\2"+
		"\2\2\u0192#\3\2\2\2\u0193\u0194\b\23\1\2\u0194\u0195\5\26\f\2\u0195\u019b"+
		"\3\2\2\2\u0196\u0197\f\3\2\2\u0197\u0198\t\t\2\2\u0198\u019a\5$\23\4\u0199"+
		"\u0196\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c%\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\7\177\2\2\u019f\u01a0"+
		"\7\35\2\2\u01a0\u01a2\7\177\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\'\3\2\2\2\u01a3\u01a7\5*\26\2\u01a4\u01a7\5,\27\2\u01a5\u01a7"+
		"\5.\30\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		")\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9\u01aa\7\62\2\2\u01aa\u01ab\7\u0084"+
		"\2\2\u01ab+\3\2\2\2\u01ac\u01ad\7n\2\2\u01ad\u01b2\5\24\13\2\u01ae\u01af"+
		"\7t\2\2\u01af\u01b1\5\24\13\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2"+
		"\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b5\u01b6\7o\2\2\u01b6\u01b7\7Y\2\2\u01b7\u01b8\7\u0084\2\2"+
		"\u01b8-\3\2\2\2\u01b9\u01ba\78\2\2\u01ba\u01bf\5\30\r\2\u01bb\u01bc\7"+
		"f\2\2\u01bc\u01be\5\30\r\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c6\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\7\31\2\2\u01c3\u01c4\79\2\2\u01c4\u01c5\7X\2\2\u01c5"+
		"\u01c7\7}\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7/\3\2\2\2\u01c8"+
		"\u01c9\7-\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\5\24\13\2\u01cb\u01cc\7t"+
		"\2\2\u01cc\u01cd\5\30\r\2\u01cd\u01ce\7o\2\2\u01ce\61\3\2\2\2\u01cf\u01d0"+
		"\7.\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\5\24\13\2\u01d2\u01d3\7t\2\2\u01d3"+
		"\u01d4\5\30\r\2\u01d4\u01d5\7o\2\2\u01d5\63\3\2\2\2\u01d6\u01d7\7r\2\2"+
		"\u01d7\u01d8\7\177\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\5\30\r\2\u01da\u01db"+
		"\7s\2\2\u01db\65\3\2\2\2\u01dc\u01dd\7\64\2\2\u01dd\u01de\5\30\r\2\u01de"+
		"\67\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e1\7\62\2\2\u01e1\u01e6\7\177"+
		"\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e5\7\177\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\5:\36\2\u01ea\u01e9\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb9\3\2\2\2\u01ec\u01ed\7\66\2\2\u01ed\u01ee\5<\37\2"+
		"\u01ee;\3\2\2\2\u01ef\u01f0\b\37\1\2\u01f0\u01f1\7n\2\2\u01f1\u01f2\5"+
		"<\37\2\u01f2\u01f3\7o\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f8\5\26\f\2\u01f5"+
		"\u01f6\7\177\2\2\u01f6\u01f8\5\32\16\2\u01f7\u01ef\3\2\2\2\u01f7\u01f4"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u0204\3\2\2\2\u01f9\u01fa\f\7\2\2\u01fa"+
		"\u01fb\7\31\2\2\u01fb\u0203\5<\37\b\u01fc\u01fd\f\6\2\2\u01fd\u01fe\7"+
		"\32\2\2\u01fe\u0203\5<\37\7\u01ff\u0200\f\5\2\2\u0200\u0201\t\n\2\2\u0201"+
		"\u0203\5<\37\6\u0202\u01f9\3\2\2\2\u0202\u01fc\3\2\2\2\u0202\u01ff\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"=\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7*\2\2\u0208\u0209\7\62\2\2"+
		"\u0209\u020a\5@!\2\u020a?\3\2\2\2\u020b\u020e\5F$\2\u020c\u020e\5B\"\2"+
		"\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020eA\3\2\2\2\u020f\u0210\7"+
		"r\2\2\u0210\u0211\7\177\2\2\u0211\u0212\7t\2\2\u0212\u0213\5@!\2\u0213"+
		"\u0219\7s\2\2\u0214\u0215\7t\2\2\u0215\u0218\5@!\2\u0216\u0218\5D#\2\u0217"+
		"\u0214\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021aC\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d"+
		"\7]\2\2\u021d\u021e\7n\2\2\u021e\u021f\5@!\2\u021f\u0220\7o\2\2\u0220"+
		"E\3\2\2\2\u0221\u0222\7\177\2\2\u0222\u0228\5\32\16\2\u0223\u0224\7t\2"+
		"\2\u0224\u0227\5@!\2\u0225\u0227\5D#\2\u0226\u0223\3\2\2\2\u0226\u0225"+
		"\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"G\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7+\2\2\u022c\u022d\7\62\2\2"+
		"\u022d\u0232\7\u0084\2\2\u022e\u022f\7t\2\2\u022f\u0231\7\u0084\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233I\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7$\2\2\u0236\u0237"+
		"\7\62\2\2\u0237\u023c\5L\'\2\u0238\u0239\7t\2\2\u0239\u023b\5L\'\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023dK\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0241\5\24\13\2\u0240\u0242"+
		"\7%\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242M\3\2\2\2\u0243\u0246"+
		"\7#\2\2\u0244\u0245\7|\2\2\u0245\u0247\7t\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7|\2\2\u0249O\3\2\2\2\u024a"+
		"\u024e\5R*\2\u024b\u024e\5T+\2\u024c\u024e\5V,\2\u024d\u024a\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024eQ\3\2\2\2\u024f\u0250\7\177\2"+
		"\2\u0250\u0251\7X\2\2\u0251\u0252\5X-\2\u0252\u0253\7\31\2\2\u0253\u0254"+
		"\7:\2\2\u0254\u0255\7X\2\2\u0255\u0256\7\u0084\2\2\u0256S\3\2\2\2\u0257"+
		"\u0258\7\177\2\2\u0258\u0259\7(\2\2\u0259\u025a\5X-\2\u025a\u025b\7\31"+
		"\2\2\u025b\u025c\5X-\2\u025cU\3\2\2\2\u025d\u025e\7\177\2\2\u025e\u025f"+
		"\7\63\2\2\u025f\u0260\7r\2\2\u0260\u0265\5X-\2\u0261\u0262\7t\2\2\u0262"+
		"\u0264\5X-\2\u0263\u0261\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2"+
		"\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7s\2\2\u0269W\3\2\2\2\u026a\u026b\7r\2\2\u026b\u026c\t\3\2\2\u026c\u026d"+
		"\7t\2\2\u026d\u026e\t\3\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7s\2\2\u0270"+
		"Y\3\2\2\2\u0271\u0272\7/\2\2\u0272\u0273\5\30\r\2\u0273\u0274\7=\2\2\u0274"+
		"\u0279\5\30\r\2\u0275\u0276\7f\2\2\u0276\u0278\5\30\r\2\u0277\u0275\3"+
		"\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"[\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\5^\60\2\u027d]\3\2\2\2\u027e"+
		"\u027f\7?\2\2\u027f\u0281\7n\2\2\u0280\u0282\7\30\2\2\u0281\u0280\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\7\177\2\2\u0284"+
		"\u0285\7t\2\2\u0285\u0287\7|\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2"+
		"\2\u0287\u0288\3\2\2\2\u0288\u0289\7o\2\2\u0289_\3\2\2\2Efiuy|\u0080\u0083"+
		"\u0086\u008c\u0095\u0099\u009c\u009f\u00ad\u00b1\u00b4\u00bf\u00cb\u00d0"+
		"\u00dd\u00e1\u00e4\u00ee\u00f1\u00f9\u00fc\u00ff\u0104\u0110\u0114\u011b"+
		"\u0121\u013b\u015e\u0160\u0165\u016b\u0172\u017a\u0180\u018c\u0191\u019b"+
		"\u01a1\u01a6\u01b2\u01bf\u01c6\u01e6\u01ea\u01f7\u0202\u0204\u020d\u0217"+
		"\u0219\u0226\u0228\u0232\u023c\u0241\u0246\u024d\u0265\u0279\u0281\u0286";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}