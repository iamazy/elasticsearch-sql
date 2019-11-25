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
		NULL=21, DISTINCT=22, AND=23, OR=24, NOT=25, IS=26, AS=27, LIKE=28, FUZZY=29, 
		PREFIX=30, REGEXP=31, WILDCARD=32, RLIKE=33, EXISTS=34, TRUE=35, FALSE=36, 
		LIMIT=37, TRACK=38, TOTAL=39, ORDER=40, ASC=41, DESC=42, BEFORE=43, BETWEEN=44, 
		RANGED=45, GROUP=46, AGGREGATE=47, ROUTING=48, PARENT_ID=49, HAS_PARENT=50, 
		HAS_CHILD=51, QUERY=52, NESTED=53, HIGHLIGHTER=54, BY=55, IN=56, WHERE=57, 
		FROM=58, HAVING=59, REMOTE=60, DIS_MAX=61, TIE_BREAKER=62, DISTANCE=63, 
		GEOPOINT=64, GEOHASH=65, POINT=66, LINESTRING=67, POLYGON=68, MULTIPOINT=69, 
		MULTILINESTRING=70, MULTIPOLYGON=71, GEOMETRYCOLLECTION=72, ENVELOPE=73, 
		CIRCLE=74, SHAPED=75, INTERSECTS=76, DISJOINT=77, WITHIN=78, CONTAINS=79, 
		FUNCTION_SCORE=80, CONSTANT_SCORE=81, COUNT=82, VAR_ASSIGN=83, PLUS_ASSIGN=84, 
		MINUS_ASSIGN=85, MULT_ASSIGN=86, DIV_ASSIGN=87, MOD_ASSIGN=88, AND_ASSIGN=89, 
		XOR_ASSIGN=90, OR_ASSIGN=91, ALSH=92, ARSH=93, AUSH=94, STAR=95, MUL=96, 
		DIVIDE=97, MODULE=98, PLUS=99, INCR=100, DECR=101, MINUS=102, DIV=103, 
		MOD=104, POUND=105, COND=106, EQ=107, AEQ=108, NAEQ=109, TEQ=110, NTEQ=111, 
		MPPEQ=112, NMPPEQ=113, EQEQ=114, NE=115, GT=116, GTE=117, LT=118, LTE=119, 
		BOOLNOT=120, BWNOT=121, BWOR=122, BOOLOR=123, BWAND=124, BOOLAND=125, 
		XOR=126, ARROW=127, LSH=128, RSH=129, USH=130, DOT=131, NSDOT=132, LPAREN=133, 
		RPAREN=134, LBRACE=135, RBRACE=136, LBRACKET=137, RBRACKET=138, COMMA=139, 
		SEMI=140, AT_SIGN=141, SINGLE_QUOTE=142, DOUBLE_QUOTE=143, REVERSE_QUOTE=144, 
		COLON=145, UNDERLINE=146, INT=147, FLOAT=148, DOT_ID=149, ID=150, OCTAL=151, 
		HEX=152, INTEGER=153, DECIMAL=154, STRING=155, REGEX=156, DOTINTEGER=157, 
		DOTID=158;
	public static final int
		RULE_sql = 0, RULE_selectOperation = 1, RULE_descOperation = 2, RULE_deleteOperation = 3, 
		RULE_updateOperation = 4, RULE_insertOperation = 5, RULE_reindexOperation = 6, 
		RULE_fieldList = 7, RULE_nameOperand = 8, RULE_name = 9, RULE_identity = 10, 
		RULE_expression = 11, RULE_rangeClause = 12, RULE_rangeItemClause = 13, 
		RULE_collection = 14, RULE_likeClause = 15, RULE_notClause = 16, RULE_isClause = 17, 
		RULE_inClause = 18, RULE_inRightOperandList = 19, RULE_inRightOperand = 20, 
		RULE_tableRef = 21, RULE_fullTextClause = 22, RULE_queryStringClause = 23, 
		RULE_multiMatchClause = 24, RULE_hasParentClause = 25, RULE_hasChildClause = 26, 
		RULE_nestedClause = 27, RULE_whereClause = 28, RULE_groupByClause = 29, 
		RULE_havingClause = 30, RULE_havingExpression = 31, RULE_aggregateByClause = 32, 
		RULE_aggregationClause = 33, RULE_nestedAggregationClause = 34, RULE_subAggregationClause = 35, 
		RULE_aggregateItemClause = 36, RULE_routingClause = 37, RULE_orderClause = 38, 
		RULE_order = 39, RULE_limitClause = 40, RULE_trackTotalClause = 41, RULE_geoClause = 42, 
		RULE_geoDistanceClause = 43, RULE_geoBoundingBoxClause = 44, RULE_geoPolygonClause = 45, 
		RULE_point = 46, RULE_points = 47, RULE_polygon = 48, RULE_multiPolygon = 49, 
		RULE_geoShapeClause = 50, RULE_geoJsonShapeClause = 51, RULE_geometryCollectionClause = 52, 
		RULE_functionScoreClause = 53, RULE_disMaxClause = 54, RULE_groupByFunctionClause = 55, 
		RULE_count = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "selectOperation", "descOperation", "deleteOperation", "updateOperation", 
			"insertOperation", "reindexOperation", "fieldList", "nameOperand", "name", 
			"identity", "expression", "rangeClause", "rangeItemClause", "collection", 
			"likeClause", "notClause", "isClause", "inClause", "inRightOperandList", 
			"inRightOperand", "tableRef", "fullTextClause", "queryStringClause", 
			"multiMatchClause", "hasParentClause", "hasChildClause", "nestedClause", 
			"whereClause", "groupByClause", "havingClause", "havingExpression", "aggregateByClause", 
			"aggregationClause", "nestedAggregationClause", "subAggregationClause", 
			"aggregateItemClause", "routingClause", "orderClause", "order", "limitClause", 
			"trackTotalClause", "geoClause", "geoDistanceClause", "geoBoundingBoxClause", 
			"geoPolygonClause", "point", "points", "polygon", "multiPolygon", "geoShapeClause", 
			"geoJsonShapeClause", "geometryCollectionClause", "functionScoreClause", 
			"disMaxClause", "groupByFunctionClause", "count"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "':='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", 
			"'>>='", "'>>>='", "'*'", null, "'/'", "'%'", "'+'", "'++'", "'--'", 
			"'-'", null, null, "'#'", "'?'", "'='", "'~='", "'!~='", "'~=='", "'!~=='", 
			"'~==='", "'!~==='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'!'", 
			"'~'", "'|'", "'||'", "'&'", "'&&'", "'^'", "'->'", "'<<'", "'>>'", "'>>>'", 
			"'.'", "'?.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", 
			"'@'", "'''", "'\"'", "'`'", "':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"EXPLAIN", "ADD", "DESCRIBE", "SELECT", "DELETE", "INSERT", "INTO", "VALUES", 
			"TOP", "UPDATE", "CREATE", "TABLE", "IF", "ALTER", "DROP", "SET", "NULL", 
			"DISTINCT", "AND", "OR", "NOT", "IS", "AS", "LIKE", "FUZZY", "PREFIX", 
			"REGEXP", "WILDCARD", "RLIKE", "EXISTS", "TRUE", "FALSE", "LIMIT", "TRACK", 
			"TOTAL", "ORDER", "ASC", "DESC", "BEFORE", "BETWEEN", "RANGED", "GROUP", 
			"AGGREGATE", "ROUTING", "PARENT_ID", "HAS_PARENT", "HAS_CHILD", "QUERY", 
			"NESTED", "HIGHLIGHTER", "BY", "IN", "WHERE", "FROM", "HAVING", "REMOTE", 
			"DIS_MAX", "TIE_BREAKER", "DISTANCE", "GEOPOINT", "GEOHASH", "POINT", 
			"LINESTRING", "POLYGON", "MULTIPOINT", "MULTILINESTRING", "MULTIPOLYGON", 
			"GEOMETRYCOLLECTION", "ENVELOPE", "CIRCLE", "SHAPED", "INTERSECTS", "DISJOINT", 
			"WITHIN", "CONTAINS", "FUNCTION_SCORE", "CONSTANT_SCORE", "COUNT", "VAR_ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "ALSH", "ARSH", "AUSH", "STAR", 
			"MUL", "DIVIDE", "MODULE", "PLUS", "INCR", "DECR", "MINUS", "DIV", "MOD", 
			"POUND", "COND", "EQ", "AEQ", "NAEQ", "TEQ", "NTEQ", "MPPEQ", "NMPPEQ", 
			"EQEQ", "NE", "GT", "GTE", "LT", "LTE", "BOOLNOT", "BWNOT", "BWOR", "BOOLOR", 
			"BWAND", "BOOLAND", "XOR", "ARROW", "LSH", "RSH", "USH", "DOT", "NSDOT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "COMMA", 
			"SEMI", "AT_SIGN", "SINGLE_QUOTE", "DOUBLE_QUOTE", "REVERSE_QUOTE", "COLON", 
			"UNDERLINE", "INT", "FLOAT", "DOT_ID", "ID", "OCTAL", "HEX", "INTEGER", 
			"DECIMAL", "STRING", "REGEX", "DOTINTEGER", "DOTID"
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(114);
				selectOperation();
				}
				break;
			case 2:
				{
				setState(115);
				deleteOperation();
				}
				break;
			case 3:
				{
				setState(116);
				descOperation();
				}
				break;
			case 4:
				{
				setState(117);
				updateOperation();
				}
				break;
			case 5:
				{
				setState(118);
				insertOperation();
				}
				break;
			case 6:
				{
				setState(119);
				reindexOperation();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(122);
				match(SEMI);
				}
			}

			setState(125);
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
		public DisMaxClauseContext disMaxClause() {
			return getRuleContext(DisMaxClauseContext.class,0);
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
		public TrackTotalClauseContext trackTotalClause() {
			return getRuleContext(TrackTotalClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FunctionScoreClauseContext functionScoreClause() {
			return getRuleContext(FunctionScoreClauseContext.class,0);
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
			setState(127);
			match(SELECT);
			setState(128);
			fieldList();
			setState(129);
			match(FROM);
			setState(130);
			tableRef();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				tableRef();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				{
				{
				setState(138);
				whereClause();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION_SCORE) {
					{
					setState(139);
					functionScoreClause();
					}
				}

				}
				}
				break;
			case DIS_MAX:
				{
				setState(142);
				disMaxClause();
				}
				break;
			case EOF:
			case LIMIT:
			case TRACK:
			case ORDER:
			case GROUP:
			case AGGREGATE:
			case ROUTING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(145);
				routingClause();
				}
			}

			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				{
				setState(148);
				groupByClause();
				}
				break;
			case AGGREGATE:
				{
				setState(149);
				aggregateByClause();
				}
				break;
			case EOF:
			case LIMIT:
			case TRACK:
			case ORDER:
			case SEMI:
				break;
			default:
				break;
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(152);
				orderClause();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(155);
				limitClause();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRACK) {
				{
				setState(158);
				trackTotalClause();
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
			setState(161);
			match(DESCRIBE);
			setState(162);
			tableRef();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVIDE) {
				{
				setState(163);
				match(DIVIDE);
				setState(164);
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
			setState(167);
			match(DELETE);
			setState(168);
			match(FROM);
			setState(169);
			tableRef();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				tableRef();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(177);
				whereClause();
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(180);
				routingClause();
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(183);
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
			setState(186);
			match(UPDATE);
			setState(187);
			tableRef();
			setState(188);
			match(SET);
			setState(189);
			match(ID);
			setState(190);
			match(EQ);
			setState(191);
			identity();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				match(ID);
				setState(194);
				match(EQ);
				setState(195);
				identity();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(201);
				whereClause();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(204);
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
			setState(207);
			match(INSERT);
			setState(208);
			match(INTO);
			setState(209);
			tableRef();
			{
			setState(210);
			match(LPAREN);
			setState(211);
			identity();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212);
				match(COMMA);
				setState(213);
				identity();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(RPAREN);
			}
			setState(221);
			match(VALUES);
			setState(222);
			match(LPAREN);
			setState(223);
			identity();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				identity();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(RPAREN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(232);
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
			setState(235);
			match(INSERT);
			setState(236);
			match(INTO);
			setState(237);
			tableRef();
			setState(238);
			match(SELECT);
			setState(239);
			fieldList();
			setState(240);
			match(FROM);
			setState(241);
			tableRef();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				tableRef();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(249);
				whereClause();
				}
			}

			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(252);
				limitClause();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REMOTE) {
				{
				setState(255);
				match(REMOTE);
				setState(256);
				match(EQ);
				setState(257);
				match(LPAREN);
				setState(258);
				((ReindexOperationContext)_localctx).host = match(STRING);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(259);
					match(COMMA);
					setState(260);
					((ReindexOperationContext)_localctx).user = match(STRING);
					setState(261);
					match(COMMA);
					setState(262);
					((ReindexOperationContext)_localctx).password = match(STRING);
					}
				}

				setState(265);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
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
				setState(269);
				nameOperand();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(270);
					match(COMMA);
					setState(271);
					nameOperand();
					}
					}
					setState(276);
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
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(279);
				((NameOperandContext)_localctx).exclude = match(XOR);
				}
			}

			setState(282);
			((NameOperandContext)_localctx).fieldName = name(0);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(283);
				match(AS);
				setState(284);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new LrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(288);
				match(LPAREN);
				setState(289);
				name(0);
				setState(290);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new DistinctNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(DISTINCT);
				setState(293);
				((DistinctNameContext)_localctx).fieldName = name(5);
				}
				break;
			case 3:
				{
				_localctx = new FunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				((FunctionNameContext)_localctx).functionName = match(ID);
				setState(295);
				((FunctionNameContext)_localctx).params = collection();
				}
				break;
			case 4:
				{
				_localctx = new FieldNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGHLIGHTER) {
					{
					setState(296);
					((FieldNameContext)_localctx).highlighter = match(HIGHLIGHTER);
					}
				}

				setState(299);
				((FieldNameContext)_localctx).field = match(ID);
				}
				break;
			case 5:
				{
				_localctx = new GroupByFunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				groupByFunctionClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryNameContext(new NameContext(_parentctx, _parentState));
					((BinaryNameContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(303);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(304);
					((BinaryNameContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (STAR - 95)) | (1L << (DIVIDE - 95)) | (1L << (PLUS - 95)) | (1L << (MINUS - 95)) | (1L << (MOD - 95)))) != 0)) ) {
						((BinaryNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(305);
					((BinaryNameContext)_localctx).right = name(5);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
				setState(313);
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
		public Token operator;
		public ExpressionContext rightExpr;
		public IsClauseContext isClause() {
			return getRuleContext(IsClauseContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public NotClauseContext notClause() {
			return getRuleContext(NotClauseContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public TerminalNode NAEQ() { return getToken(ElasticsearchParser.NAEQ, 0); }
		public TerminalNode TEQ() { return getToken(ElasticsearchParser.TEQ, 0); }
		public TerminalNode NTEQ() { return getToken(ElasticsearchParser.NTEQ, 0); }
		public TerminalNode MPPEQ() { return getToken(ElasticsearchParser.MPPEQ, 0); }
		public TerminalNode NMPPEQ() { return getToken(ElasticsearchParser.NMPPEQ, 0); }
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
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(317);
				match(LPAREN);
				setState(318);
				expression(0);
				setState(319);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				((BetweenAndContext)_localctx).expr = name(0);
				setState(322);
				match(BETWEEN);
				setState(323);
				((BetweenAndContext)_localctx).left = identity();
				setState(324);
				match(AND);
				setState(325);
				((BetweenAndContext)_localctx).right = identity();
				}
				break;
			case 3:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				rangeClause();
				}
				break;
			case 4:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				inClause();
				}
				break;
			case 5:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				name(0);
				}
				break;
			case 6:
				{
				_localctx = new PrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				identity();
				}
				break;
			case 7:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				hasChildClause();
				}
				break;
			case 8:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				hasParentClause();
				}
				break;
			case 9:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				isClause();
				}
				break;
			case 10:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				nestedClause();
				}
				break;
			case 11:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				likeClause();
				}
				break;
			case 12:
				{
				_localctx = new GeoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				geoClause();
				}
				break;
			case 13:
				{
				_localctx = new FullTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				fullTextClause();
				}
				break;
			case 14:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				notClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(374);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(342);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MUL - 96)) | (1L << (DIV - 96)) | (1L << (MOD - 96)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						((BinaryContext)_localctx).rightExpr = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(345);
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
						setState(346);
						((BinaryContext)_localctx).rightExpr = expression(23);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(348);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (LSH - 128)) | (1L << (RSH - 128)) | (1L << (USH - 128)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						((BinaryContext)_localctx).rightExpr = expression(22);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(351);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (GT - 116)) | (1L << (GTE - 116)) | (1L << (LT - 116)) | (1L << (LTE - 116)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						((BinaryContext)_localctx).rightExpr = expression(21);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(354);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EQ - 107)) | (1L << (AEQ - 107)) | (1L << (NAEQ - 107)) | (1L << (TEQ - 107)) | (1L << (NTEQ - 107)) | (1L << (MPPEQ - 107)) | (1L << (NMPPEQ - 107)) | (1L << (NE - 107)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						((BinaryContext)_localctx).rightExpr = expression(20);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(357);
						((BinaryContext)_localctx).operator = match(AND);
						setState(358);
						((BinaryContext)_localctx).rightExpr = expression(19);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(360);
						((BinaryContext)_localctx).operator = match(OR);
						setState(361);
						((BinaryContext)_localctx).rightExpr = expression(18);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(363);
						((BinaryContext)_localctx).operator = match(XOR);
						setState(364);
						((BinaryContext)_localctx).rightExpr = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(366);
						((BinaryContext)_localctx).operator = match(BWOR);
						setState(367);
						((BinaryContext)_localctx).rightExpr = expression(14);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(369);
						match(COND);
						setState(370);
						((ConditionalContext)_localctx).leftExpr = expression(0);
						setState(371);
						match(COLON);
						setState(372);
						((ConditionalContext)_localctx).rightExpr = expression(12);
						}
						break;
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class RangeClauseContext extends ParserRuleContext {
		public NameContext field;
		public RangeItemClauseContext left;
		public RangeItemClauseContext right;
		public TerminalNode RANGED() { return getToken(ElasticsearchParser.RANGED, 0); }
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<RangeItemClauseContext> rangeItemClause() {
			return getRuleContexts(RangeItemClauseContext.class);
		}
		public RangeItemClauseContext rangeItemClause(int i) {
			return getRuleContext(RangeItemClauseContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			((RangeClauseContext)_localctx).field = name(0);
			setState(380);
			match(RANGED);
			setState(381);
			match(IN);
			setState(382);
			_la = _input.LA(1);
			if ( !(_la==LPAREN || _la==LBRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(383);
			((RangeClauseContext)_localctx).left = rangeItemClause();
			setState(384);
			match(COMMA);
			setState(385);
			((RangeClauseContext)_localctx).right = rangeItemClause();
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==RPAREN || _la==RBRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RangeItemClauseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ElasticsearchParser.FLOAT, 0); }
		public RangeItemClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeItemClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterRangeItemClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitRangeItemClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitRangeItemClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeItemClauseContext rangeItemClause() throws RecognitionException {
		RangeItemClauseContext _localctx = new RangeItemClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rangeItemClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (INT - 147)) | (1L << (FLOAT - 147)) | (1L << (STRING - 147)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 28, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LPAREN);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (INT - 147)) | (1L << (FLOAT - 147)) | (1L << (ID - 147)) | (1L << (STRING - 147)))) != 0)) {
				{
				setState(391);
				identity();
				}
			}

			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(394);
				match(COMMA);
				setState(395);
				identity();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
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
		public Token funName;
		public Token pattern;
		public TerminalNode LIKE() { return getToken(ElasticsearchParser.LIKE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public List<TerminalNode> FUZZY() { return getTokens(ElasticsearchParser.FUZZY); }
		public TerminalNode FUZZY(int i) {
			return getToken(ElasticsearchParser.FUZZY, i);
		}
		public List<TerminalNode> PREFIX() { return getTokens(ElasticsearchParser.PREFIX); }
		public TerminalNode PREFIX(int i) {
			return getToken(ElasticsearchParser.PREFIX, i);
		}
		public List<TerminalNode> REGEXP() { return getTokens(ElasticsearchParser.REGEXP); }
		public TerminalNode REGEXP(int i) {
			return getToken(ElasticsearchParser.REGEXP, i);
		}
		public List<TerminalNode> WILDCARD() { return getTokens(ElasticsearchParser.WILDCARD); }
		public TerminalNode WILDCARD(int i) {
			return getToken(ElasticsearchParser.WILDCARD, i);
		}
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
		enterRule(_localctx, 30, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((LikeClauseContext)_localctx).field = name(0);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(404);
				((LikeClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY) | (1L << PREFIX) | (1L << REGEXP) | (1L << WILDCARD))) != 0)) {
				{
				{
				setState(407);
				((LikeClauseContext)_localctx).funName = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY) | (1L << PREFIX) | (1L << REGEXP) | (1L << WILDCARD))) != 0)) ) {
					((LikeClauseContext)_localctx).funName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(LIKE);
			setState(414);
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

	public static class NotClauseContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ElasticsearchParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterNotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitNotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitNotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotClauseContext notClause() throws RecognitionException {
		NotClauseContext _localctx = new NotClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(NOT);
			setState(417);
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
		enterRule(_localctx, 34, RULE_isClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((IsClauseContext)_localctx).field = name(0);
			setState(420);
			match(IS);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(421);
				((IsClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(424);
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
		enterRule(_localctx, 36, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((InClauseContext)_localctx).left = name(0);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(427);
				match(NOT);
				}
			}

			setState(430);
			match(IN);
			setState(431);
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
		enterRule(_localctx, 38, RULE_inRightOperandList);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				inRightOperand(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(LPAREN);
				setState(435);
				inRightOperand(0);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(436);
					match(COMMA);
					setState(437);
					inRightOperand(0);
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_inRightOperand, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConstLiteralContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(448);
			identity();
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticLiteralContext(new InRightOperandContext(_parentctx, _parentState));
					((ArithmeticLiteralContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inRightOperand);
					setState(450);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(451);
					((ArithmeticLiteralContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (STAR - 95)) | (1L << (PLUS - 95)) | (1L << (MINUS - 95)) | (1L << (DIV - 95)) | (1L << (MOD - 95)))) != 0)) ) {
						((ArithmeticLiteralContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(452);
					((ArithmeticLiteralContext)_localctx).right = inRightOperand(2);
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 42, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			((TableRefContext)_localctx).indexName = match(ID);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(459);
				match(AS);
				setState(460);
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
		enterRule(_localctx, 44, RULE_fullTextClause);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				queryStringClause();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				multiMatchClause();
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
		enterRule(_localctx, 46, RULE_queryStringClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(QUERY);
			setState(468);
			match(BY);
			setState(469);
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
		enterRule(_localctx, 48, RULE_multiMatchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(LPAREN);
			setState(472);
			name(0);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(473);
				match(COMMA);
				setState(474);
				name(0);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(RPAREN);
			setState(481);
			match(AEQ);
			setState(482);
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
		enterRule(_localctx, 50, RULE_hasParentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(HAS_PARENT);
			setState(485);
			match(LPAREN);
			setState(486);
			((HasParentClauseContext)_localctx).type = name(0);
			setState(487);
			match(COMMA);
			setState(488);
			((HasParentClauseContext)_localctx).query = expression(0);
			setState(489);
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
		enterRule(_localctx, 52, RULE_hasChildClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(HAS_CHILD);
			setState(492);
			match(LPAREN);
			setState(493);
			((HasChildClauseContext)_localctx).type = name(0);
			setState(494);
			match(COMMA);
			setState(495);
			((HasChildClauseContext)_localctx).query = expression(0);
			setState(496);
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
		enterRule(_localctx, 54, RULE_nestedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(LBRACKET);
			setState(499);
			((NestedClauseContext)_localctx).nestedPath = match(ID);
			setState(500);
			match(COMMA);
			setState(501);
			((NestedClauseContext)_localctx).query = expression(0);
			setState(502);
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
		enterRule(_localctx, 56, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(WHERE);
			setState(505);
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
		enterRule(_localctx, 58, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(GROUP);
			setState(508);
			match(BY);
			setState(509);
			match(ID);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(510);
				match(COMMA);
				setState(511);
				match(ID);
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(517);
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
		enterRule(_localctx, 60, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(HAVING);
			setState(521);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_havingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				_localctx = new LrHavingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(524);
				match(LPAREN);
				setState(525);
				havingExpression(0);
				setState(526);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new HavingPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(528);
				identity();
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529);
				((FunctionExprContext)_localctx).funcName = match(ID);
				setState(530);
				collection();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(542);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(533);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(534);
						((HavingBinaryContext)_localctx).operator = match(AND);
						setState(535);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(536);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(537);
						((HavingBinaryContext)_localctx).operator = match(OR);
						setState(538);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(539);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(540);
						((HavingBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (EQ - 107)) | (1L << (GT - 107)) | (1L << (GTE - 107)) | (1L << (LT - 107)) | (1L << (LTE - 107)))) != 0)) ) {
							((HavingBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(541);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(4);
						}
						break;
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 64, RULE_aggregateByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(AGGREGATE);
			setState(548);
			match(BY);
			setState(549);
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
		enterRule(_localctx, 66, RULE_aggregationClause);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				aggregateItemClause();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
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
		enterRule(_localctx, 68, RULE_nestedAggregationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(LBRACKET);
			setState(556);
			((NestedAggregationClauseContext)_localctx).nestedPath = match(ID);
			setState(557);
			match(COMMA);
			setState(558);
			aggregationClause();
			setState(559);
			match(RBRACKET);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(563);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(560);
						match(COMMA);
						setState(561);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(562);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		enterRule(_localctx, 70, RULE_subAggregationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(GT);
			setState(569);
			match(LPAREN);
			setState(570);
			aggregationClause();
			setState(571);
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
		enterRule(_localctx, 72, RULE_aggregateItemClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(ID);
			setState(574);
			collection();
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(578);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(575);
						match(COMMA);
						setState(576);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(577);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 74, RULE_routingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(ROUTING);
			setState(584);
			match(BY);
			setState(585);
			match(STRING);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(586);
				match(COMMA);
				setState(587);
				match(STRING);
				}
				}
				setState(592);
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
		enterRule(_localctx, 76, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(ORDER);
			setState(594);
			match(BY);
			setState(595);
			order();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(596);
				match(COMMA);
				setState(597);
				order();
				}
				}
				setState(602);
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
		public TerminalNode DESC() { return getToken(ElasticsearchParser.DESC, 0); }
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
		enterRule(_localctx, 78, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			name(0);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(604);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 80, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LIMIT);
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(608);
				((LimitClauseContext)_localctx).offset = match(INT);
				setState(609);
				match(COMMA);
				}
				break;
			}
			setState(612);
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

	public static class TrackTotalClauseContext extends ParserRuleContext {
		public TerminalNode TRACK() { return getToken(ElasticsearchParser.TRACK, 0); }
		public TerminalNode TOTAL() { return getToken(ElasticsearchParser.TOTAL, 0); }
		public TrackTotalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackTotalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterTrackTotalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitTrackTotalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitTrackTotalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackTotalClauseContext trackTotalClause() throws RecognitionException {
		TrackTotalClauseContext _localctx = new TrackTotalClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_trackTotalClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(TRACK);
			setState(615);
			match(TOTAL);
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
		public GeoShapeClauseContext geoShapeClause() {
			return getRuleContext(GeoShapeClauseContext.class,0);
		}
		public GeoJsonShapeClauseContext geoJsonShapeClause() {
			return getRuleContext(GeoJsonShapeClauseContext.class,0);
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
		enterRule(_localctx, 84, RULE_geoClause);
		try {
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				geoDistanceClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				geoBoundingBoxClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				geoPolygonClause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				geoShapeClause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(621);
				geoJsonShapeClause();
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
		public PointContext coordinate;
		public Token distance;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public List<TerminalNode> EQ() { return getTokens(ElasticsearchParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ElasticsearchParser.EQ, i);
		}
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode DISTANCE() { return getToken(ElasticsearchParser.DISTANCE, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
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
		enterRule(_localctx, 86, RULE_geoDistanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(ID);
			setState(625);
			match(EQ);
			setState(626);
			((GeoDistanceClauseContext)_localctx).coordinate = point();
			setState(627);
			match(AND);
			setState(628);
			match(DISTANCE);
			setState(629);
			match(EQ);
			setState(630);
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
		public PointContext leftTop;
		public PointContext rightBottom;
		public TerminalNode BETWEEN() { return getToken(ElasticsearchParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
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
		enterRule(_localctx, 88, RULE_geoBoundingBoxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			((GeoBoundingBoxClauseContext)_localctx).field = match(ID);
			setState(633);
			match(BETWEEN);
			setState(634);
			((GeoBoundingBoxClauseContext)_localctx).leftTop = point();
			setState(635);
			match(AND);
			setState(636);
			((GeoBoundingBoxClauseContext)_localctx).rightBottom = point();
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
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
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
		enterRule(_localctx, 90, RULE_geoPolygonClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(ID);
			setState(639);
			match(IN);
			setState(640);
			match(LBRACKET);
			setState(641);
			point();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				point();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
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

	public static class PointContext extends ParserRuleContext {
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
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(LBRACKET);
			{
			setState(652);
			((PointContext)_localctx).lon = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((PointContext)_localctx).lon = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(653);
			match(COMMA);
			setState(654);
			((PointContext)_localctx).lat = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((PointContext)_localctx).lat = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(656);
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

	public static class PointsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitPoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitPoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_points);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(LBRACKET);
			setState(659);
			point();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(660);
				match(COMMA);
				setState(661);
				point();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667);
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

	public static class PolygonContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<PointsContext> points() {
			return getRuleContexts(PointsContext.class);
		}
		public PointsContext points(int i) {
			return getRuleContext(PointsContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public PolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitPolygon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitPolygon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_polygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(LBRACKET);
			setState(670);
			points();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(671);
				match(COMMA);
				setState(672);
				points();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
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

	public static class MultiPolygonContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<PolygonContext> polygon() {
			return getRuleContexts(PolygonContext.class);
		}
		public PolygonContext polygon(int i) {
			return getRuleContext(PolygonContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public MultiPolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiPolygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterMultiPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitMultiPolygon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitMultiPolygon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiPolygonContext multiPolygon() throws RecognitionException {
		MultiPolygonContext _localctx = new MultiPolygonContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_multiPolygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(LBRACKET);
			setState(681);
			polygon();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(682);
				match(COMMA);
				setState(683);
				polygon();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
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

	public static class GeoShapeClauseContext extends ParserRuleContext {
		public Token field;
		public Token relation;
		public Token shape;
		public TerminalNode SHAPED() { return getToken(ElasticsearchParser.SHAPED, 0); }
		public TerminalNode AS() { return getToken(ElasticsearchParser.AS, 0); }
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode INTERSECTS() { return getToken(ElasticsearchParser.INTERSECTS, 0); }
		public TerminalNode DISJOINT() { return getToken(ElasticsearchParser.DISJOINT, 0); }
		public TerminalNode WITHIN() { return getToken(ElasticsearchParser.WITHIN, 0); }
		public TerminalNode CONTAINS() { return getToken(ElasticsearchParser.CONTAINS, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public PolygonContext polygon() {
			return getRuleContext(PolygonContext.class,0);
		}
		public MultiPolygonContext multiPolygon() {
			return getRuleContext(MultiPolygonContext.class,0);
		}
		public TerminalNode POINT() { return getToken(ElasticsearchParser.POINT, 0); }
		public TerminalNode MULTIPOINT() { return getToken(ElasticsearchParser.MULTIPOINT, 0); }
		public TerminalNode LINESTRING() { return getToken(ElasticsearchParser.LINESTRING, 0); }
		public TerminalNode ENVELOPE() { return getToken(ElasticsearchParser.ENVELOPE, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(ElasticsearchParser.MULTILINESTRING, 0); }
		public TerminalNode POLYGON() { return getToken(ElasticsearchParser.POLYGON, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(ElasticsearchParser.MULTIPOLYGON, 0); }
		public GeoShapeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoShapeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoShapeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoShapeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoShapeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoShapeClauseContext geoShapeClause() throws RecognitionException {
		GeoShapeClauseContext _localctx = new GeoShapeClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_geoShapeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			((GeoShapeClauseContext)_localctx).field = match(ID);
			setState(692);
			((GeoShapeClauseContext)_localctx).relation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (INTERSECTS - 76)) | (1L << (DISJOINT - 76)) | (1L << (WITHIN - 76)) | (1L << (CONTAINS - 76)))) != 0)) ) {
				((GeoShapeClauseContext)_localctx).relation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(693);
				point();
				}
				break;
			case 2:
				{
				setState(694);
				points();
				}
				break;
			case 3:
				{
				setState(695);
				polygon();
				}
				break;
			case 4:
				{
				setState(696);
				multiPolygon();
				}
				break;
			}
			setState(699);
			match(SHAPED);
			setState(700);
			match(AS);
			setState(701);
			((GeoShapeClauseContext)_localctx).shape = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (POINT - 66)) | (1L << (LINESTRING - 66)) | (1L << (POLYGON - 66)) | (1L << (MULTIPOINT - 66)) | (1L << (MULTILINESTRING - 66)) | (1L << (MULTIPOLYGON - 66)) | (1L << (ENVELOPE - 66)))) != 0)) ) {
				((GeoShapeClauseContext)_localctx).shape = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class GeoJsonShapeClauseContext extends ParserRuleContext {
		public Token field;
		public Token relation;
		public Token geojson;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public TerminalNode INTERSECTS() { return getToken(ElasticsearchParser.INTERSECTS, 0); }
		public TerminalNode DISJOINT() { return getToken(ElasticsearchParser.DISJOINT, 0); }
		public TerminalNode WITHIN() { return getToken(ElasticsearchParser.WITHIN, 0); }
		public TerminalNode CONTAINS() { return getToken(ElasticsearchParser.CONTAINS, 0); }
		public GeoJsonShapeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geoJsonShapeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeoJsonShapeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeoJsonShapeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeoJsonShapeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeoJsonShapeClauseContext geoJsonShapeClause() throws RecognitionException {
		GeoJsonShapeClauseContext _localctx = new GeoJsonShapeClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_geoJsonShapeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			((GeoJsonShapeClauseContext)_localctx).field = match(ID);
			setState(704);
			((GeoJsonShapeClauseContext)_localctx).relation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (INTERSECTS - 76)) | (1L << (DISJOINT - 76)) | (1L << (WITHIN - 76)) | (1L << (CONTAINS - 76)))) != 0)) ) {
				((GeoJsonShapeClauseContext)_localctx).relation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(705);
			((GeoJsonShapeClauseContext)_localctx).geojson = match(STRING);
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

	public static class GeometryCollectionClauseContext extends ParserRuleContext {
		public GeometryCollectionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometryCollectionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGeometryCollectionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGeometryCollectionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGeometryCollectionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometryCollectionClauseContext geometryCollectionClause() throws RecognitionException {
		GeometryCollectionClauseContext _localctx = new GeometryCollectionClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_geometryCollectionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode FUNCTION_SCORE() { return getToken(ElasticsearchParser.FUNCTION_SCORE, 0); }
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
		enterRule(_localctx, 106, RULE_functionScoreClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(FUNCTION_SCORE);
			setState(710);
			expression(0);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLAND) {
				{
				{
				setState(711);
				match(BOOLAND);
				setState(712);
				expression(0);
				}
				}
				setState(717);
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

	public static class DisMaxClauseContext extends ParserRuleContext {
		public Token tieBreaker;
		public TerminalNode DIS_MAX() { return getToken(ElasticsearchParser.DIS_MAX, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> BOOLOR() { return getTokens(ElasticsearchParser.BOOLOR); }
		public TerminalNode BOOLOR(int i) {
			return getToken(ElasticsearchParser.BOOLOR, i);
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
		enterRule(_localctx, 108, RULE_disMaxClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(DIS_MAX);
			setState(719);
			expression(0);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLOR) {
				{
				{
				setState(720);
				match(BOOLOR);
				setState(721);
				expression(0);
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(727);
				match(AND);
				setState(728);
				match(TIE_BREAKER);
				setState(729);
				match(EQ);
				setState(730);
				((DisMaxClauseContext)_localctx).tieBreaker = match(FLOAT);
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
		enterRule(_localctx, 110, RULE_groupByFunctionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		enterRule(_localctx, 112, RULE_count);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(COUNT);
			setState(736);
			match(LPAREN);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(737);
				match(DISTINCT);
				}
			}

			setState(740);
			((CountContext)_localctx).field = match(ID);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(741);
				match(COMMA);
				setState(742);
				((CountContext)_localctx).size = match(INT);
				}
			}

			setState(745);
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
		case 20:
			return inRightOperand_sempred((InRightOperandContext)_localctx, predIndex);
		case 31:
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
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u02ee\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2{\n\2\3\2\5\2~\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0088"+
		"\n\3\f\3\16\3\u008b\13\3\3\3\3\3\5\3\u008f\n\3\3\3\5\3\u0092\n\3\3\3\5"+
		"\3\u0095\n\3\3\3\3\3\5\3\u0099\n\3\3\3\5\3\u009c\n\3\3\3\5\3\u009f\n\3"+
		"\3\3\5\3\u00a2\n\3\3\4\3\4\3\4\3\4\5\4\u00a8\n\4\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u00af\n\5\f\5\16\5\u00b2\13\5\3\5\5\5\u00b5\n\5\3\5\5\5\u00b8\n\5\3"+
		"\5\5\5\u00bb\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c7\n\6"+
		"\f\6\16\6\u00ca\13\6\3\6\5\6\u00cd\n\6\3\6\5\6\u00d0\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00e5\n\7\f\7\16\7\u00e8\13\7\3\7\3\7\5\7\u00ec\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00f7\n\b\f\b\16\b\u00fa\13\b\3\b\5\b"+
		"\u00fd\n\b\3\b\5\b\u0100\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010a"+
		"\n\b\3\b\5\b\u010d\n\b\3\t\3\t\3\t\3\t\7\t\u0113\n\t\f\t\16\t\u0116\13"+
		"\t\5\t\u0118\n\t\3\n\5\n\u011b\n\n\3\n\3\n\3\n\5\n\u0120\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012c\n\13\3\13\3\13\5\13"+
		"\u0130\n\13\3\13\3\13\3\13\7\13\u0135\n\13\f\13\16\13\u0138\13\13\3\f"+
		"\3\f\3\f\5\f\u013d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0156\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0179\n\r\f\r\16"+
		"\r\u017c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\5\20\u018b\n\20\3\20\3\20\7\20\u018f\n\20\f\20\16\20\u0192\13"+
		"\20\3\20\3\20\3\21\3\21\5\21\u0198\n\21\3\21\7\21\u019b\n\21\f\21\16\21"+
		"\u019e\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u01a9\n"+
		"\23\3\23\3\23\3\24\3\24\5\24\u01af\n\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u01b9\n\25\f\25\16\25\u01bc\13\25\3\25\3\25\5\25\u01c0"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01c8\n\26\f\26\16\26\u01cb\13"+
		"\26\3\27\3\27\3\27\5\27\u01d0\n\27\3\30\3\30\5\30\u01d4\n\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u01de\n\32\f\32\16\32\u01e1\13\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0203\n\37\f\37\16\37\u0206\13\37\3\37\5\37"+
		"\u0209\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0216\n!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\7!\u0221\n!\f!\16!\u0224\13!\3\"\3\"\3\"\3\"\3#\3#\5#\u022c"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0236\n$\f$\16$\u0239\13$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\7&\u0245\n&\f&\16&\u0248\13&\3\'\3\'\3\'\3\'\3\'\7\'"+
		"\u024f\n\'\f\'\16\'\u0252\13\'\3(\3(\3(\3(\3(\7(\u0259\n(\f(\16(\u025c"+
		"\13(\3)\3)\5)\u0260\n)\3*\3*\3*\5*\u0265\n*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		",\3,\5,\u0271\n,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\7/\u0287\n/\f/\16/\u028a\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\7\61\u0299\n\61\f\61\16\61\u029c\13\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u02a4\n\62\f\62\16\62\u02a7\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\7\63\u02af\n\63\f\63\16\63\u02b2\13\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02bc\n\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u02cc\n\67"+
		"\f\67\16\67\u02cf\13\67\38\38\38\38\78\u02d5\n8\f8\168\u02d8\138\38\3"+
		"8\38\38\58\u02de\n8\39\39\3:\3:\3:\5:\u02e5\n:\3:\3:\3:\5:\u02ea\n:\3"+
		":\3:\3:\2\6\24\30*@;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\22\7\2aacceehhjj\3\2\u0095"+
		"\u0096\4\2bbij\4\2eehh\3\2\u0082\u0084\3\2vy\4\2msuu\4\2\u0087\u0087\u008b"+
		"\u008b\4\2\u0088\u0088\u008c\u008c\4\2\u0095\u0096\u009d\u009d\3\2\37"+
		"\"\5\2aaeehj\4\2mmvy\3\2+,\3\2NQ\4\2DIKK\2\u0323\2z\3\2\2\2\4\u0081\3"+
		"\2\2\2\6\u00a3\3\2\2\2\b\u00a9\3\2\2\2\n\u00bc\3\2\2\2\f\u00d1\3\2\2\2"+
		"\16\u00ed\3\2\2\2\20\u0117\3\2\2\2\22\u011a\3\2\2\2\24\u012f\3\2\2\2\26"+
		"\u013c\3\2\2\2\30\u0155\3\2\2\2\32\u017d\3\2\2\2\34\u0186\3\2\2\2\36\u0188"+
		"\3\2\2\2 \u0195\3\2\2\2\"\u01a2\3\2\2\2$\u01a5\3\2\2\2&\u01ac\3\2\2\2"+
		"(\u01bf\3\2\2\2*\u01c1\3\2\2\2,\u01cc\3\2\2\2.\u01d3\3\2\2\2\60\u01d5"+
		"\3\2\2\2\62\u01d9\3\2\2\2\64\u01e6\3\2\2\2\66\u01ed\3\2\2\28\u01f4\3\2"+
		"\2\2:\u01fa\3\2\2\2<\u01fd\3\2\2\2>\u020a\3\2\2\2@\u0215\3\2\2\2B\u0225"+
		"\3\2\2\2D\u022b\3\2\2\2F\u022d\3\2\2\2H\u023a\3\2\2\2J\u023f\3\2\2\2L"+
		"\u0249\3\2\2\2N\u0253\3\2\2\2P\u025d\3\2\2\2R\u0261\3\2\2\2T\u0268\3\2"+
		"\2\2V\u0270\3\2\2\2X\u0272\3\2\2\2Z\u027a\3\2\2\2\\\u0280\3\2\2\2^\u028d"+
		"\3\2\2\2`\u0294\3\2\2\2b\u029f\3\2\2\2d\u02aa\3\2\2\2f\u02b5\3\2\2\2h"+
		"\u02c1\3\2\2\2j\u02c5\3\2\2\2l\u02c7\3\2\2\2n\u02d0\3\2\2\2p\u02df\3\2"+
		"\2\2r\u02e1\3\2\2\2t{\5\4\3\2u{\5\b\5\2v{\5\6\4\2w{\5\n\6\2x{\5\f\7\2"+
		"y{\5\16\b\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2"+
		"\2{}\3\2\2\2|~\7\u008e\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\2\2\3\u0080\3\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u0084\7<\2\2\u0084\u0089\5,\27\2\u0085\u0086\7\u008d\2\2\u0086\u0088"+
		"\5,\27\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0091\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5:"+
		"\36\2\u008d\u008f\5l\67\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u0092\5n8\2\u0091\u008c\3\2\2\2\u0091\u0090\3\2\2"+
		"\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5L\'\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0099\5<\37\2\u0097"+
		"\u0099\5B\"\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5N(\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5R*\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\5T+\2\u00a1\u00a0\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\5\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a7"+
		"\5,\27\2\u00a5\u00a6\7c\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\7\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7<\2\2"+
		"\u00ab\u00b0\5,\27\2\u00ac\u00ad\7\u008d\2\2\u00ad\u00af\5,\27\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\5:\36\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\5L"+
		"\'\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00bb\5R*\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\t\3\2\2\2\u00bc"+
		"\u00bd\7\20\2\2\u00bd\u00be\5,\27\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\7"+
		"\u0098\2\2\u00c0\u00c1\7m\2\2\u00c1\u00c8\5\26\f\2\u00c2\u00c3\7\u008d"+
		"\2\2\u00c3\u00c4\7\u0098\2\2\u00c4\u00c5\7m\2\2\u00c5\u00c7\5\26\f\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5:\36\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\5L"+
		"\'\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\13\3\2\2\2\u00d1\u00d2"+
		"\7\f\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\7\u0087\2"+
		"\2\u00d5\u00da\5\26\f\2\u00d6\u00d7\7\u008d\2\2\u00d7\u00d9\5\26\f\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\u0088\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0\u00e1\7\u0087\2\2\u00e1\u00e6"+
		"\5\26\f\2\u00e2\u00e3\7\u008d\2\2\u00e3\u00e5\5\26\f\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\7\u0088\2\2\u00ea\u00ec"+
		"\5L\'\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\r\3\2\2\2\u00ed"+
		"\u00ee\7\f\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5,\27\2\u00f0\u00f1\7\n"+
		"\2\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\7<\2\2\u00f3\u00f8\5,\27\2\u00f4"+
		"\u00f5\7\u008d\2\2\u00f5\u00f7\5,\27\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fd\5:\36\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\5R*\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u010c\3\2\2\2\u0101\u0102\7>\2\2\u0102\u0103\7m\2\2\u0103"+
		"\u0104\7\u0087\2\2\u0104\u0109\7\u009d\2\2\u0105\u0106\7\u008d\2\2\u0106"+
		"\u0107\7\u009d\2\2\u0107\u0108\7\u008d\2\2\u0108\u010a\7\u009d\2\2\u0109"+
		"\u0105\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\7\u0088"+
		"\2\2\u010c\u0101\3\2\2\2\u010c\u010d\3\2\2\2\u010d\17\3\2\2\2\u010e\u0118"+
		"\7a\2\2\u010f\u0114\5\22\n\2\u0110\u0111\7\u008d\2\2\u0111\u0113\5\22"+
		"\n\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u010e\3\2"+
		"\2\2\u0117\u010f\3\2\2\2\u0118\21\3\2\2\2\u0119\u011b\7\u0080\2\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\5\24"+
		"\13\2\u011d\u011e\7\35\2\2\u011e\u0120\7\u0098\2\2\u011f\u011d\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\23\3\2\2\2\u0121\u0122\b\13\1\2\u0122\u0123"+
		"\7\u0087\2\2\u0123\u0124\5\24\13\2\u0124\u0125\7\u0088\2\2\u0125\u0130"+
		"\3\2\2\2\u0126\u0127\7\30\2\2\u0127\u0130\5\24\13\7\u0128\u0129\7\u0098"+
		"\2\2\u0129\u0130\5\36\20\2\u012a\u012c\78\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\7\u0098\2\2\u012e\u0130"+
		"\5p9\2\u012f\u0121\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0128\3\2\2\2\u012f"+
		"\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0136\3\2\2\2\u0131\u0132\f\6"+
		"\2\2\u0132\u0133\t\2\2\2\u0133\u0135\5\24\13\7\u0134\u0131\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\25\3\2\2"+
		"\2\u0138\u0136\3\2\2\2\u0139\u013d\7\u0098\2\2\u013a\u013d\t\3\2\2\u013b"+
		"\u013d\7\u009d\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\27\3\2\2\2\u013e\u013f\b\r\1\2\u013f\u0140\7\u0087\2\2"+
		"\u0140\u0141\5\30\r\2\u0141\u0142\7\u0088\2\2\u0142\u0156\3\2\2\2\u0143"+
		"\u0144\5\24\13\2\u0144\u0145\7.\2\2\u0145\u0146\5\26\f\2\u0146\u0147\7"+
		"\31\2\2\u0147\u0148\5\26\f\2\u0148\u0156\3\2\2\2\u0149\u0156\5\32\16\2"+
		"\u014a\u0156\5&\24\2\u014b\u0156\5\24\13\2\u014c\u0156\5\26\f\2\u014d"+
		"\u0156\5\66\34\2\u014e\u0156\5\64\33\2\u014f\u0156\5$\23\2\u0150\u0156"+
		"\58\35\2\u0151\u0156\5 \21\2\u0152\u0156\5V,\2\u0153\u0156\5.\30\2\u0154"+
		"\u0156\5\"\22\2\u0155\u013e\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0149\3"+
		"\2\2\2\u0155\u014a\3\2\2\2\u0155\u014b\3\2\2\2\u0155\u014c\3\2\2\2\u0155"+
		"\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0150\3\2"+
		"\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u017a\3\2\2\2\u0157\u0158\f\31\2\2\u0158\u0159\t"+
		"\4\2\2\u0159\u0179\5\30\r\32\u015a\u015b\f\30\2\2\u015b\u015c\t\5\2\2"+
		"\u015c\u0179\5\30\r\31\u015d\u015e\f\27\2\2\u015e\u015f\t\6\2\2\u015f"+
		"\u0179\5\30\r\30\u0160\u0161\f\26\2\2\u0161\u0162\t\7\2\2\u0162\u0179"+
		"\5\30\r\27\u0163\u0164\f\25\2\2\u0164\u0165\t\b\2\2\u0165\u0179\5\30\r"+
		"\26\u0166\u0167\f\24\2\2\u0167\u0168\7\31\2\2\u0168\u0179\5\30\r\25\u0169"+
		"\u016a\f\23\2\2\u016a\u016b\7\32\2\2\u016b\u0179\5\30\r\24\u016c\u016d"+
		"\f\20\2\2\u016d\u016e\7\u0080\2\2\u016e\u0179\5\30\r\21\u016f\u0170\f"+
		"\17\2\2\u0170\u0171\7|\2\2\u0171\u0179\5\30\r\20\u0172\u0173\f\16\2\2"+
		"\u0173\u0174\7l\2\2\u0174\u0175\5\30\r\2\u0175\u0176\7\u0093\2\2\u0176"+
		"\u0177\5\30\r\16\u0177\u0179\3\2\2\2\u0178\u0157\3\2\2\2\u0178\u015a\3"+
		"\2\2\2\u0178\u015d\3\2\2\2\u0178\u0160\3\2\2\2\u0178\u0163\3\2\2\2\u0178"+
		"\u0166\3\2\2\2\u0178\u0169\3\2\2\2\u0178\u016c\3\2\2\2\u0178\u016f\3\2"+
		"\2\2\u0178\u0172\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\31\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\5\24\13"+
		"\2\u017e\u017f\7/\2\2\u017f\u0180\7:\2\2\u0180\u0181\t\t\2\2\u0181\u0182"+
		"\5\34\17\2\u0182\u0183\7\u008d\2\2\u0183\u0184\5\34\17\2\u0184\u0185\t"+
		"\n\2\2\u0185\33\3\2\2\2\u0186\u0187\t\13\2\2\u0187\35\3\2\2\2\u0188\u018a"+
		"\7\u0087\2\2\u0189\u018b\5\26\f\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u0190\3\2\2\2\u018c\u018d\7\u008d\2\2\u018d\u018f\5\26\f\2"+
		"\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\u0088\2"+
		"\2\u0194\37\3\2\2\2\u0195\u0197\5\24\13\2\u0196\u0198\7\33\2\2\u0197\u0196"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019c\3\2\2\2\u0199\u019b\t\f\2\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7\36\2\2\u01a0"+
		"\u01a1\7\u009d\2\2\u01a1!\3\2\2\2\u01a2\u01a3\7\33\2\2\u01a3\u01a4\5\30"+
		"\r\2\u01a4#\3\2\2\2\u01a5\u01a6\5\24\13\2\u01a6\u01a8\7\34\2\2\u01a7\u01a9"+
		"\7\33\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2"+
		"\u01aa\u01ab\7\27\2\2\u01ab%\3\2\2\2\u01ac\u01ae\5\24\13\2\u01ad\u01af"+
		"\7\33\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2"+
		"\u01b0\u01b1\7:\2\2\u01b1\u01b2\5(\25\2\u01b2\'\3\2\2\2\u01b3\u01c0\5"+
		"*\26\2\u01b4\u01b5\7\u0087\2\2\u01b5\u01ba\5*\26\2\u01b6\u01b7\7\u008d"+
		"\2\2\u01b7\u01b9\5*\26\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01be\7\u0088\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b3\3\2\2\2\u01bf"+
		"\u01b4\3\2\2\2\u01c0)\3\2\2\2\u01c1\u01c2\b\26\1\2\u01c2\u01c3\5\26\f"+
		"\2\u01c3\u01c9\3\2\2\2\u01c4\u01c5\f\3\2\2\u01c5\u01c6\t\r\2\2\u01c6\u01c8"+
		"\5*\26\4\u01c7\u01c4\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca+\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\7\u0098"+
		"\2\2\u01cd\u01ce\7\35\2\2\u01ce\u01d0\7\u0098\2\2\u01cf\u01cd\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0-\3\2\2\2\u01d1\u01d4\5\60\31\2\u01d2\u01d4"+
		"\5\62\32\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4/\3\2\2\2\u01d5"+
		"\u01d6\7\66\2\2\u01d6\u01d7\79\2\2\u01d7\u01d8\7\u009d\2\2\u01d8\61\3"+
		"\2\2\2\u01d9\u01da\7\u0087\2\2\u01da\u01df\5\24\13\2\u01db\u01dc\7\u008d"+
		"\2\2\u01dc\u01de\5\24\13\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e3\7\u0088\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7\u009d\2"+
		"\2\u01e5\63\3\2\2\2\u01e6\u01e7\7\64\2\2\u01e7\u01e8\7\u0087\2\2\u01e8"+
		"\u01e9\5\24\13\2\u01e9\u01ea\7\u008d\2\2\u01ea\u01eb\5\30\r\2\u01eb\u01ec"+
		"\7\u0088\2\2\u01ec\65\3\2\2\2\u01ed\u01ee\7\65\2\2\u01ee\u01ef\7\u0087"+
		"\2\2\u01ef\u01f0\5\24\13\2\u01f0\u01f1\7\u008d\2\2\u01f1\u01f2\5\30\r"+
		"\2\u01f2\u01f3\7\u0088\2\2\u01f3\67\3\2\2\2\u01f4\u01f5\7\u008b\2\2\u01f5"+
		"\u01f6\7\u0098\2\2\u01f6\u01f7\7\u008d\2\2\u01f7\u01f8\5\30\r\2\u01f8"+
		"\u01f9\7\u008c\2\2\u01f99\3\2\2\2\u01fa\u01fb\7;\2\2\u01fb\u01fc\5\30"+
		"\r\2\u01fc;\3\2\2\2\u01fd\u01fe\7\60\2\2\u01fe\u01ff\79\2\2\u01ff\u0204"+
		"\7\u0098\2\2\u0200\u0201\7\u008d\2\2\u0201\u0203\7\u0098\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\5> \2\u0208\u0207\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209=\3\2\2\2\u020a\u020b\7=\2\2\u020b\u020c\5"+
		"@!\2\u020c?\3\2\2\2\u020d\u020e\b!\1\2\u020e\u020f\7\u0087\2\2\u020f\u0210"+
		"\5@!\2\u0210\u0211\7\u0088\2\2\u0211\u0216\3\2\2\2\u0212\u0216\5\26\f"+
		"\2\u0213\u0214\7\u0098\2\2\u0214\u0216\5\36\20\2\u0215\u020d\3\2\2\2\u0215"+
		"\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0222\3\2\2\2\u0217\u0218\f\7"+
		"\2\2\u0218\u0219\7\31\2\2\u0219\u0221\5@!\b\u021a\u021b\f\6\2\2\u021b"+
		"\u021c\7\32\2\2\u021c\u0221\5@!\7\u021d\u021e\f\5\2\2\u021e\u021f\t\16"+
		"\2\2\u021f\u0221\5@!\6\u0220\u0217\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u021d"+
		"\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"A\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\61\2\2\u0226\u0227\79\2\2"+
		"\u0227\u0228\5D#\2\u0228C\3\2\2\2\u0229\u022c\5J&\2\u022a\u022c\5F$\2"+
		"\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022cE\3\2\2\2\u022d\u022e\7"+
		"\u008b\2\2\u022e\u022f\7\u0098\2\2\u022f\u0230\7\u008d\2\2\u0230\u0231"+
		"\5D#\2\u0231\u0237\7\u008c\2\2\u0232\u0233\7\u008d\2\2\u0233\u0236\5D"+
		"#\2\u0234\u0236\5H%\2\u0235\u0232\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238G\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023b\7v\2\2\u023b\u023c\7\u0087\2\2\u023c\u023d"+
		"\5D#\2\u023d\u023e\7\u0088\2\2\u023eI\3\2\2\2\u023f\u0240\7\u0098\2\2"+
		"\u0240\u0246\5\36\20\2\u0241\u0242\7\u008d\2\2\u0242\u0245\5D#\2\u0243"+
		"\u0245\5H%\2\u0244\u0241\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2"+
		"\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247K\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\u024a\7\62\2\2\u024a\u024b\79\2\2\u024b\u0250\7\u009d\2"+
		"\2\u024c\u024d\7\u008d\2\2\u024d\u024f\7\u009d\2\2\u024e\u024c\3\2\2\2"+
		"\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251M\3"+
		"\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7*\2\2\u0254\u0255\79\2\2\u0255"+
		"\u025a\5P)\2\u0256\u0257\7\u008d\2\2\u0257\u0259\5P)\2\u0258\u0256\3\2"+
		"\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"O\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025f\5\24\13\2\u025e\u0260\t\17\2"+
		"\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260Q\3\2\2\2\u0261\u0264"+
		"\7\'\2\2\u0262\u0263\7\u0095\2\2\u0263\u0265\7\u008d\2\2\u0264\u0262\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7\u0095\2\2"+
		"\u0267S\3\2\2\2\u0268\u0269\7(\2\2\u0269\u026a\7)\2\2\u026aU\3\2\2\2\u026b"+
		"\u0271\5X-\2\u026c\u0271\5Z.\2\u026d\u0271\5\\/\2\u026e\u0271\5f\64\2"+
		"\u026f\u0271\5h\65\2\u0270\u026b\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026d"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271W\3\2\2\2\u0272"+
		"\u0273\7\u0098\2\2\u0273\u0274\7m\2\2\u0274\u0275\5^\60\2\u0275\u0276"+
		"\7\31\2\2\u0276\u0277\7A\2\2\u0277\u0278\7m\2\2\u0278\u0279\7\u009d\2"+
		"\2\u0279Y\3\2\2\2\u027a\u027b\7\u0098\2\2\u027b\u027c\7.\2\2\u027c\u027d"+
		"\5^\60\2\u027d\u027e\7\31\2\2\u027e\u027f\5^\60\2\u027f[\3\2\2\2\u0280"+
		"\u0281\7\u0098\2\2\u0281\u0282\7:\2\2\u0282\u0283\7\u008b\2\2\u0283\u0288"+
		"\5^\60\2\u0284\u0285\7\u008d\2\2\u0285\u0287\5^\60\2\u0286\u0284\3\2\2"+
		"\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7\u008c\2\2\u028c]\3\2\2\2\u028d"+
		"\u028e\7\u008b\2\2\u028e\u028f\t\3\2\2\u028f\u0290\7\u008d\2\2\u0290\u0291"+
		"\t\3\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7\u008c\2\2\u0293_\3\2\2\2\u0294"+
		"\u0295\7\u008b\2\2\u0295\u029a\5^\60\2\u0296\u0297\7\u008d\2\2\u0297\u0299"+
		"\5^\60\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7\u008c"+
		"\2\2\u029ea\3\2\2\2\u029f\u02a0\7\u008b\2\2\u02a0\u02a5\5`\61\2\u02a1"+
		"\u02a2\7\u008d\2\2\u02a2\u02a4\5`\61\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7"+
		"\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a8\u02a9\7\u008c\2\2\u02a9c\3\2\2\2\u02aa\u02ab\7\u008b"+
		"\2\2\u02ab\u02b0\5b\62\2\u02ac\u02ad\7\u008d\2\2\u02ad\u02af\5b\62\2\u02ae"+
		"\u02ac\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b4\7\u008c\2\2\u02b4"+
		"e\3\2\2\2\u02b5\u02b6\7\u0098\2\2\u02b6\u02bb\t\20\2\2\u02b7\u02bc\5^"+
		"\60\2\u02b8\u02bc\5`\61\2\u02b9\u02bc\5b\62\2\u02ba\u02bc\5d\63\2\u02bb"+
		"\u02b7\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\7M\2\2\u02be\u02bf\7\35\2\2\u02bf"+
		"\u02c0\t\21\2\2\u02c0g\3\2\2\2\u02c1\u02c2\7\u0098\2\2\u02c2\u02c3\t\20"+
		"\2\2\u02c3\u02c4\7\u009d\2\2\u02c4i\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"k\3\2\2\2\u02c7\u02c8\7R\2\2\u02c8\u02cd\5\30\r\2\u02c9\u02ca\7\177\2"+
		"\2\u02ca\u02cc\5\30\r\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02cem\3\2\2\2\u02cf\u02cd\3\2\2\2"+
		"\u02d0\u02d1\7?\2\2\u02d1\u02d6\5\30\r\2\u02d2\u02d3\7}\2\2\u02d3\u02d5"+
		"\5\30\r\2\u02d4\u02d2\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2"+
		"\u02d6\u02d7\3\2\2\2\u02d7\u02dd\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da"+
		"\7\31\2\2\u02da\u02db\7@\2\2\u02db\u02dc\7m\2\2\u02dc\u02de\7\u0096\2"+
		"\2\u02dd\u02d9\3\2\2\2\u02dd\u02de\3\2\2\2\u02deo\3\2\2\2\u02df\u02e0"+
		"\5r:\2\u02e0q\3\2\2\2\u02e1\u02e2\7T\2\2\u02e2\u02e4\7\u0087\2\2\u02e3"+
		"\u02e5\7\30\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3"+
		"\2\2\2\u02e6\u02e9\7\u0098\2\2\u02e7\u02e8\7\u008d\2\2\u02e8\u02ea\7\u0095"+
		"\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\7\u0088\2\2\u02ecs\3\2\2\2Lz}\u0089\u008e\u0091\u0094\u0098\u009b"+
		"\u009e\u00a1\u00a7\u00b0\u00b4\u00b7\u00ba\u00c8\u00cc\u00cf\u00da\u00e6"+
		"\u00eb\u00f8\u00fc\u00ff\u0109\u010c\u0114\u0117\u011a\u011f\u012b\u012f"+
		"\u0136\u013c\u0155\u0178\u017a\u018a\u0190\u0197\u019c\u01a8\u01ae\u01ba"+
		"\u01bf\u01c9\u01cf\u01d3\u01df\u0204\u0208\u0215\u0220\u0222\u022b\u0235"+
		"\u0237\u0244\u0246\u0250\u025a\u025f\u0264\u0270\u0288\u029a\u02a5\u02b0"+
		"\u02bb\u02cd\u02d6\u02dd\u02e4\u02e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}