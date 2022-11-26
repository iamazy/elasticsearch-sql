// Generated from C:/Users/iamazy/Documents/GitHub/elasticsearch-sql/elasticsearch-sql-core/src/main/resources/antlr4\ElasticsearchParser.g4 by ANTLR 4.7.2
package io.github.iamazy.elasticsearch.dsl.antlr4;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElasticsearchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_ESSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, EXPLAIN=5, 
		ADD=6, DESCRIBE=7, SELECT=8, DELETE=9, INSERT=10, INTO=11, VALUES=12, 
		TOP=13, UPDATE=14, IDENTIFY=15, CREATE=16, TABLE=17, IF=18, ALTER=19, 
		DROP=20, SET=21, NULL=22, DISTINCT=23, AND=24, OR=25, NOT=26, IS=27, AS=28, 
		LIKE=29, FUZZY=30, PREFIX=31, REGEXP=32, WILDCARD=33, RLIKE=34, EXISTS=35, 
		TRUE=36, FALSE=37, LIMIT=38, BATCH=39, TRACK=40, TOTAL=41, ORDER=42, ASC=43, 
		DESC=44, BEFORE=45, BETWEEN=46, RANGED=47, GROUP=48, AGGREGATE=49, ROUTING=50, 
		PARENT_ID=51, HAS_PARENT=52, HAS_CHILD=53, QUERY=54, NESTED=55, HIGHLIGHTER=56, 
		BY=57, IN=58, WHERE=59, FROM=60, HAVING=61, REMOTE=62, DIS_MAX=63, TIE_BREAKER=64, 
		DISTANCE=65, GEOPOINT=66, GEOHASH=67, POINT=68, LINESTRING=69, POLYGON=70, 
		MULTIPOINT=71, MULTILINESTRING=72, MULTIPOLYGON=73, GEOMETRYCOLLECTION=74, 
		ENVELOPE=75, CIRCLE=76, SHAPED=77, INTERSECTS=78, DISJOINT=79, WITHIN=80, 
		CONTAINS=81, FUNCTION_SCORE=82, CONSTANT_SCORE=83, COUNT=84, VAR_ASSIGN=85, 
		PLUS_ASSIGN=86, MINUS_ASSIGN=87, MULT_ASSIGN=88, DIV_ASSIGN=89, MOD_ASSIGN=90, 
		AND_ASSIGN=91, XOR_ASSIGN=92, OR_ASSIGN=93, ALSH=94, ARSH=95, AUSH=96, 
		STAR=97, MUL=98, DIVIDE=99, MODULE=100, PLUS=101, INCR=102, DECR=103, 
		MINUS=104, DIV=105, MOD=106, POUND=107, COND=108, EQ=109, AEQ=110, NAEQ=111, 
		TEQ=112, NTEQ=113, MPPEQ=114, NMPPEQ=115, EQEQ=116, NE=117, GT=118, GTE=119, 
		LT=120, LTE=121, BOOLNOT=122, BWNOT=123, BWOR=124, BOOLOR=125, BWAND=126, 
		BOOLAND=127, XOR=128, ARROW=129, LSH=130, RSH=131, USH=132, DOT=133, NSDOT=134, 
		LPAREN=135, RPAREN=136, LBRACE=137, RBRACE=138, LBRACKET=139, RBRACKET=140, 
		COMMA=141, SEMI=142, AT_SIGN=143, SINGLE_QUOTE=144, DOUBLE_QUOTE=145, 
		REVERSE_QUOTE=146, COLON=147, UNDERLINE=148, INT=149, FLOAT=150, DOT_ID=151, 
		ID=152, OCTAL=153, HEX=154, INTEGER=155, DECIMAL=156, STRING=157, REGEX=158, 
		DOTINTEGER=159, DOTID=160;
	public static final int
		RULE_sql = 0, RULE_selectOperation = 1, RULE_descOperation = 2, RULE_deleteOperation = 3, 
		RULE_updateOperation = 4, RULE_insertOperation = 5, RULE_reindexOperation = 6, 
		RULE_fieldList = 7, RULE_nameOperand = 8, RULE_nameClause = 9, RULE_identity = 10, 
		RULE_identifyClause = 11, RULE_expression = 12, RULE_rangeClause = 13, 
		RULE_rangeItemClause = 14, RULE_collection = 15, RULE_identityList = 16, 
		RULE_likeClause = 17, RULE_notClause = 18, RULE_isClause = 19, RULE_inClause = 20, 
		RULE_inRightOperandList = 21, RULE_inRightOperand = 22, RULE_tableRef = 23, 
		RULE_fullTextClause = 24, RULE_queryStringClause = 25, RULE_multiMatchClause = 26, 
		RULE_hasParentClause = 27, RULE_hasChildClause = 28, RULE_nestedClause = 29, 
		RULE_whereClause = 30, RULE_groupByClause = 31, RULE_havingClause = 32, 
		RULE_havingExpression = 33, RULE_aggregateByClause = 34, RULE_aggregationClause = 35, 
		RULE_nestedAggregationClause = 36, RULE_subAggregationClause = 37, RULE_aggregateItemClause = 38, 
		RULE_routingClause = 39, RULE_orderClause = 40, RULE_order = 41, RULE_limitClause = 42, 
		RULE_batchClause = 43, RULE_trackTotalClause = 44, RULE_geoClause = 45, 
		RULE_geoDistanceClause = 46, RULE_geoBoundingBoxClause = 47, RULE_geoPolygonClause = 48, 
		RULE_point = 49, RULE_points = 50, RULE_polygon = 51, RULE_multiPolygon = 52, 
		RULE_geoShapeClause = 53, RULE_geoJsonShapeClause = 54, RULE_geometryCollectionClause = 55, 
		RULE_functionScoreClause = 56, RULE_disMaxClause = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "selectOperation", "descOperation", "deleteOperation", "updateOperation", 
			"insertOperation", "reindexOperation", "fieldList", "nameOperand", "nameClause", 
			"identity", "identifyClause", "expression", "rangeClause", "rangeItemClause", 
			"collection", "identityList", "likeClause", "notClause", "isClause", 
			"inClause", "inRightOperandList", "inRightOperand", "tableRef", "fullTextClause", 
			"queryStringClause", "multiMatchClause", "hasParentClause", "hasChildClause", 
			"nestedClause", "whereClause", "groupByClause", "havingClause", "havingExpression", 
			"aggregateByClause", "aggregationClause", "nestedAggregationClause", 
			"subAggregationClause", "aggregateItemClause", "routingClause", "orderClause", 
			"order", "limitClause", "batchClause", "trackTotalClause", "geoClause", 
			"geoDistanceClause", "geoBoundingBoxClause", "geoPolygonClause", "point", 
			"points", "polygon", "multiPolygon", "geoShapeClause", "geoJsonShapeClause", 
			"geometryCollectionClause", "functionScoreClause", "disMaxClause"
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", 
			"'|='", "'<<='", "'>>='", "'>>>='", "'*'", null, "'/'", "'%'", "'+'", 
			"'++'", "'--'", "'-'", null, null, "'#'", "'?'", "'='", "'~='", "'!~='", 
			"'~=='", "'!~=='", "'~==='", "'!~==='", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'!'", "'~'", "'|'", "'||'", "'&'", "'&&'", "'^'", "'->'", 
			"'<<'", "'>>'", "'>>>'", "'.'", "'?.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "','", "';'", "'@'", "'''", "'\"'", "'`'", "':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"EXPLAIN", "ADD", "DESCRIBE", "SELECT", "DELETE", "INSERT", "INTO", "VALUES", 
			"TOP", "UPDATE", "IDENTIFY", "CREATE", "TABLE", "IF", "ALTER", "DROP", 
			"SET", "NULL", "DISTINCT", "AND", "OR", "NOT", "IS", "AS", "LIKE", "FUZZY", 
			"PREFIX", "REGEXP", "WILDCARD", "RLIKE", "EXISTS", "TRUE", "FALSE", "LIMIT", 
			"BATCH", "TRACK", "TOTAL", "ORDER", "ASC", "DESC", "BEFORE", "BETWEEN", 
			"RANGED", "GROUP", "AGGREGATE", "ROUTING", "PARENT_ID", "HAS_PARENT", 
			"HAS_CHILD", "QUERY", "NESTED", "HIGHLIGHTER", "BY", "IN", "WHERE", "FROM", 
			"HAVING", "REMOTE", "DIS_MAX", "TIE_BREAKER", "DISTANCE", "GEOPOINT", 
			"GEOHASH", "POINT", "LINESTRING", "POLYGON", "MULTIPOINT", "MULTILINESTRING", 
			"MULTIPOLYGON", "GEOMETRYCOLLECTION", "ENVELOPE", "CIRCLE", "SHAPED", 
			"INTERSECTS", "DISJOINT", "WITHIN", "CONTAINS", "FUNCTION_SCORE", "CONSTANT_SCORE", 
			"COUNT", "VAR_ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", 
			"ALSH", "ARSH", "AUSH", "STAR", "MUL", "DIVIDE", "MODULE", "PLUS", "INCR", 
			"DECR", "MINUS", "DIV", "MOD", "POUND", "COND", "EQ", "AEQ", "NAEQ", 
			"TEQ", "NTEQ", "MPPEQ", "NMPPEQ", "EQEQ", "NE", "GT", "GTE", "LT", "LTE", 
			"BOOLNOT", "BWNOT", "BWOR", "BOOLOR", "BWAND", "BOOLAND", "XOR", "ARROW", 
			"LSH", "RSH", "USH", "DOT", "NSDOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(116);
				selectOperation();
				}
				break;
			case 2:
				{
				setState(117);
				deleteOperation();
				}
				break;
			case 3:
				{
				setState(118);
				descOperation();
				}
				break;
			case 4:
				{
				setState(119);
				updateOperation();
				}
				break;
			case 5:
				{
				setState(120);
				insertOperation();
				}
				break;
			case 6:
				{
				setState(121);
				reindexOperation();
				}
				break;
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(124);
				match(SEMI);
				}
			}

			setState(127);
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
			setState(129);
			match(SELECT);
			setState(130);
			fieldList();
			setState(131);
			match(FROM);
			setState(132);
			tableRef();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				tableRef();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				{
				{
				setState(140);
				whereClause();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION_SCORE) {
					{
					setState(141);
					functionScoreClause();
					}
				}

				}
				}
				break;
			case DIS_MAX:
				{
				setState(144);
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
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(147);
				routingClause();
				}
			}

			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				{
				setState(150);
				groupByClause();
				}
				break;
			case AGGREGATE:
				{
				setState(151);
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
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(154);
				orderClause();
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(157);
				limitClause();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRACK) {
				{
				setState(160);
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
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode DESCRIBE() { return getToken(ElasticsearchParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(ElasticsearchParser.DESC, 0); }
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
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==DESCRIBE || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			tableRef();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVIDE) {
				{
				setState(165);
				match(DIVIDE);
				setState(166);
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
		public IdentifyClauseContext identifyClause() {
			return getRuleContext(IdentifyClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public BatchClauseContext batchClause() {
			return getRuleContext(BatchClauseContext.class,0);
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
			setState(169);
			match(DELETE);
			setState(170);
			match(FROM);
			setState(171);
			tableRef();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				tableRef();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFY:
				{
				setState(179);
				identifyClause();
				}
				break;
			case WHERE:
				{
				setState(180);
				whereClause();
				}
				break;
			case EOF:
			case LIMIT:
			case BATCH:
			case ROUTING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(183);
				routingClause();
				}
			}

			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BATCH) {
				{
				setState(186);
				batchClause();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(189);
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
		public IdentifyClauseContext identifyClause() {
			return getRuleContext(IdentifyClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public RoutingClauseContext routingClause() {
			return getRuleContext(RoutingClauseContext.class,0);
		}
		public BatchClauseContext batchClause() {
			return getRuleContext(BatchClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
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
			setState(192);
			match(UPDATE);
			setState(193);
			tableRef();
			setState(194);
			match(SET);
			setState(195);
			match(ID);
			setState(196);
			match(EQ);
			setState(197);
			identity();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				match(ID);
				setState(200);
				match(EQ);
				setState(201);
				identity();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFY:
				{
				setState(207);
				identifyClause();
				}
				break;
			case WHERE:
				{
				setState(208);
				whereClause();
				}
				break;
			case EOF:
			case LIMIT:
			case BATCH:
			case ROUTING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(211);
				routingClause();
				}
			}

			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BATCH) {
				{
				setState(214);
				batchClause();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(217);
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
			setState(220);
			match(INSERT);
			setState(221);
			match(INTO);
			setState(222);
			tableRef();
			{
			setState(223);
			match(LPAREN);
			setState(224);
			identity();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225);
				match(COMMA);
				setState(226);
				identity();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(RPAREN);
			}
			setState(234);
			match(VALUES);
			setState(235);
			match(LPAREN);
			setState(236);
			identity();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(237);
				match(COMMA);
				setState(238);
				identity();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RPAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(245);
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
		public BatchClauseContext batchClause() {
			return getRuleContext(BatchClauseContext.class,0);
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
			setState(248);
			match(INSERT);
			setState(249);
			match(INTO);
			setState(250);
			tableRef();
			setState(251);
			match(SELECT);
			setState(252);
			fieldList();
			setState(253);
			match(FROM);
			setState(254);
			tableRef();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				tableRef();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(262);
				whereClause();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BATCH) {
				{
				setState(265);
				batchClause();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(268);
				limitClause();
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REMOTE) {
				{
				setState(271);
				match(REMOTE);
				setState(272);
				match(EQ);
				setState(273);
				match(LPAREN);
				setState(274);
				((ReindexOperationContext)_localctx).host = match(STRING);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(275);
					match(COMMA);
					setState(276);
					((ReindexOperationContext)_localctx).user = match(STRING);
					setState(277);
					match(COMMA);
					setState(278);
					((ReindexOperationContext)_localctx).password = match(STRING);
					}
				}

				setState(281);
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
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(STAR);
				}
				break;
			case DISTINCT:
			case HIGHLIGHTER:
			case XOR:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(285);
				nameOperand();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					nameOperand();
					}
					}
					setState(292);
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
		public NameClauseContext fieldName;
		public Token alias;
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(295);
				((NameOperandContext)_localctx).exclude = match(XOR);
				}
			}

			setState(298);
			((NameOperandContext)_localctx).fieldName = nameClause(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(299);
				match(AS);
				setState(300);
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

	public static class NameClauseContext extends ParserRuleContext {
		public NameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameClause; }
	 
		public NameClauseContext() { }
		public void copyFrom(NameClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldNameContext extends NameClauseContext {
		public Token highlighter;
		public Token field;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode HIGHLIGHTER() { return getToken(ElasticsearchParser.HIGHLIGHTER, 0); }
		public FieldNameContext(NameClauseContext ctx) { copyFrom(ctx); }
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
	public static class DistinctNameContext extends NameClauseContext {
		public NameClauseContext fieldName;
		public TerminalNode DISTINCT() { return getToken(ElasticsearchParser.DISTINCT, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public DistinctNameContext(NameClauseContext ctx) { copyFrom(ctx); }
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
	public static class FunctionNameContext extends NameClauseContext {
		public Token functionName;
		public CollectionContext params;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public FunctionNameContext(NameClauseContext ctx) { copyFrom(ctx); }
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
	public static class LrNameContext extends NameClauseContext {
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public LrNameContext(NameClauseContext ctx) { copyFrom(ctx); }
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
	public static class BinaryNameContext extends NameClauseContext {
		public NameClauseContext left;
		public Token op;
		public NameClauseContext right;
		public List<NameClauseContext> nameClause() {
			return getRuleContexts(NameClauseContext.class);
		}
		public NameClauseContext nameClause(int i) {
			return getRuleContext(NameClauseContext.class,i);
		}
		public TerminalNode STAR() { return getToken(ElasticsearchParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(ElasticsearchParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(ElasticsearchParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ElasticsearchParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ElasticsearchParser.MINUS, 0); }
		public BinaryNameContext(NameClauseContext ctx) { copyFrom(ctx); }
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

	public final NameClauseContext nameClause() throws RecognitionException {
		return nameClause(0);
	}

	private NameClauseContext nameClause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NameClauseContext _localctx = new NameClauseContext(_ctx, _parentState);
		NameClauseContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_nameClause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new LrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(304);
				match(LPAREN);
				setState(305);
				nameClause(0);
				setState(306);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new DistinctNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(DISTINCT);
				setState(309);
				((DistinctNameContext)_localctx).fieldName = nameClause(4);
				}
				break;
			case 3:
				{
				_localctx = new FunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				((FunctionNameContext)_localctx).functionName = match(ID);
				setState(311);
				((FunctionNameContext)_localctx).params = collection();
				}
				break;
			case 4:
				{
				_localctx = new FieldNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGHLIGHTER) {
					{
					setState(312);
					((FieldNameContext)_localctx).highlighter = match(HIGHLIGHTER);
					}
				}

				setState(315);
				((FieldNameContext)_localctx).field = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryNameContext(new NameClauseContext(_parentctx, _parentState));
					((BinaryNameContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nameClause);
					setState(318);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(319);
					((BinaryNameContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (STAR - 97)) | (1L << (DIVIDE - 97)) | (1L << (PLUS - 97)) | (1L << (MINUS - 97)) | (1L << (MOD - 97)))) != 0)) ) {
						((BinaryNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(320);
					((BinaryNameContext)_localctx).right = nameClause(4);
					}
					} 
				}
				setState(325);
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

	public static class IdentityContext extends ParserRuleContext {
		public Token number;
		public Token str;
		public IdentityListContext list;
		public TerminalNode ID() { return getToken(ElasticsearchParser.ID, 0); }
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ElasticsearchParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public IdentityListContext identityList() {
			return getRuleContext(IdentityListContext.class,0);
		}
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
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
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
				setState(328);
				((IdentityContext)_localctx).str = match(STRING);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				((IdentityContext)_localctx).list = identityList();
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

	public static class IdentifyClauseContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFY() { return getToken(ElasticsearchParser.IDENTIFY, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public TerminalNode STRING() { return getToken(ElasticsearchParser.STRING, 0); }
		public IdentifyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterIdentifyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitIdentifyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitIdentifyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifyClauseContext identifyClause() throws RecognitionException {
		IdentifyClauseContext _localctx = new IdentifyClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(IDENTIFY);
			setState(333);
			match(BY);
			setState(334);
			((IdentifyClauseContext)_localctx).id = match(STRING);
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
		public NameClauseContext expr;
		public IdentityContext left;
		public IdentityContext right;
		public TerminalNode BETWEEN() { return getToken(ElasticsearchParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(337);
				match(LPAREN);
				setState(338);
				expression(0);
				setState(339);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				((BetweenAndContext)_localctx).expr = nameClause(0);
				setState(342);
				match(BETWEEN);
				setState(343);
				((BetweenAndContext)_localctx).left = identity();
				setState(344);
				match(AND);
				setState(345);
				((BetweenAndContext)_localctx).right = identity();
				}
				break;
			case 3:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				rangeClause();
				}
				break;
			case 4:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				inClause();
				}
				break;
			case 5:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				nameClause(0);
				}
				break;
			case 6:
				{
				_localctx = new PrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				identity();
				}
				break;
			case 7:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				hasChildClause();
				}
				break;
			case 8:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				hasParentClause();
				}
				break;
			case 9:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				isClause();
				}
				break;
			case 10:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				nestedClause();
				}
				break;
			case 11:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				likeClause();
				}
				break;
			case 12:
				{
				_localctx = new GeoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				geoClause();
				}
				break;
			case 13:
				{
				_localctx = new FullTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				fullTextClause();
				}
				break;
			case 14:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				notClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(362);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (MUL - 98)) | (1L << (DIV - 98)) | (1L << (MOD - 98)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
						((BinaryContext)_localctx).rightExpr = expression(24);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(365);
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
						setState(366);
						((BinaryContext)_localctx).rightExpr = expression(23);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(368);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (LSH - 130)) | (1L << (RSH - 130)) | (1L << (USH - 130)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((BinaryContext)_localctx).rightExpr = expression(22);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(371);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (GT - 118)) | (1L << (GTE - 118)) | (1L << (LT - 118)) | (1L << (LTE - 118)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(372);
						((BinaryContext)_localctx).rightExpr = expression(21);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(374);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (EQ - 109)) | (1L << (AEQ - 109)) | (1L << (NAEQ - 109)) | (1L << (TEQ - 109)) | (1L << (NTEQ - 109)) | (1L << (MPPEQ - 109)) | (1L << (NMPPEQ - 109)) | (1L << (NE - 109)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						((BinaryContext)_localctx).rightExpr = expression(20);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(377);
						((BinaryContext)_localctx).operator = match(AND);
						setState(378);
						((BinaryContext)_localctx).rightExpr = expression(19);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(380);
						((BinaryContext)_localctx).operator = match(OR);
						setState(381);
						((BinaryContext)_localctx).rightExpr = expression(18);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(383);
						((BinaryContext)_localctx).operator = match(XOR);
						setState(384);
						((BinaryContext)_localctx).rightExpr = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(385);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(386);
						((BinaryContext)_localctx).operator = match(BWOR);
						setState(387);
						((BinaryContext)_localctx).rightExpr = expression(14);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(389);
						match(COND);
						setState(390);
						((ConditionalContext)_localctx).leftExpr = expression(0);
						setState(391);
						match(COLON);
						setState(392);
						((ConditionalContext)_localctx).rightExpr = expression(12);
						}
						break;
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public NameClauseContext field;
		public RangeItemClauseContext left;
		public RangeItemClauseContext right;
		public TerminalNode RANGED() { return getToken(ElasticsearchParser.RANGED, 0); }
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 26, RULE_rangeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((RangeClauseContext)_localctx).field = nameClause(0);
			setState(400);
			match(RANGED);
			setState(401);
			match(IN);
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==LPAREN || _la==LBRACKET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(403);
			((RangeClauseContext)_localctx).left = rangeItemClause();
			setState(404);
			match(COMMA);
			setState(405);
			((RangeClauseContext)_localctx).right = rangeItemClause();
			setState(406);
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
		enterRule(_localctx, 28, RULE_rangeItemClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (INT - 149)) | (1L << (FLOAT - 149)) | (1L << (STRING - 149)))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(LPAREN);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (LBRACKET - 139)) | (1L << (INT - 139)) | (1L << (FLOAT - 139)) | (1L << (ID - 139)) | (1L << (STRING - 139)))) != 0)) {
				{
				setState(411);
				identity();
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(414);
				match(COMMA);
				setState(415);
				identity();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
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

	public static class IdentityListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public List<IdentityContext> identity() {
			return getRuleContexts(IdentityContext.class);
		}
		public IdentityContext identity(int i) {
			return getRuleContext(IdentityContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public IdentityListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterIdentityList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitIdentityList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitIdentityList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentityListContext identityList() throws RecognitionException {
		IdentityListContext _localctx = new IdentityListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identityList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(LBRACKET);
			setState(424);
			identity();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(425);
				match(COMMA);
				setState(426);
				identity();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
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

	public static class LikeClauseContext extends ParserRuleContext {
		public NameClauseContext field;
		public Token not;
		public Token funName;
		public Token pattern;
		public TerminalNode LIKE() { return getToken(ElasticsearchParser.LIKE, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 34, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((LikeClauseContext)_localctx).field = nameClause(0);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(435);
				((LikeClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUZZY) | (1L << PREFIX) | (1L << REGEXP) | (1L << WILDCARD))) != 0)) {
				{
				{
				setState(438);
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
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(LIKE);
			setState(445);
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
		enterRule(_localctx, 36, RULE_notClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(NOT);
			setState(448);
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
		public NameClauseContext field;
		public Token not;
		public TerminalNode IS() { return getToken(ElasticsearchParser.IS, 0); }
		public TerminalNode NULL() { return getToken(ElasticsearchParser.NULL, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 38, RULE_isClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((IsClauseContext)_localctx).field = nameClause(0);
			setState(451);
			match(IS);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(452);
				((IsClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(455);
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
		public NameClauseContext left;
		public InRightOperandListContext right;
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 40, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((InClauseContext)_localctx).left = nameClause(0);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(458);
				match(NOT);
				}
			}

			setState(461);
			match(IN);
			setState(462);
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
		enterRule(_localctx, 42, RULE_inRightOperandList);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case INT:
			case FLOAT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				inRightOperand(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LPAREN);
				setState(466);
				inRightOperand(0);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(467);
					match(COMMA);
					setState(468);
					inRightOperand(0);
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_inRightOperand, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConstLiteralContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(479);
			identity();
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticLiteralContext(new InRightOperandContext(_parentctx, _parentState));
					((ArithmeticLiteralContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inRightOperand);
					setState(481);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(482);
					((ArithmeticLiteralContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (STAR - 97)) | (1L << (PLUS - 97)) | (1L << (MINUS - 97)) | (1L << (DIV - 97)) | (1L << (MOD - 97)))) != 0)) ) {
						((ArithmeticLiteralContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(483);
					((ArithmeticLiteralContext)_localctx).right = inRightOperand(2);
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 46, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((TableRefContext)_localctx).indexName = match(ID);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(490);
				match(AS);
				setState(491);
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
		enterRule(_localctx, 48, RULE_fullTextClause);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				queryStringClause();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
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
		enterRule(_localctx, 50, RULE_queryStringClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(QUERY);
			setState(499);
			match(BY);
			setState(500);
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
		public List<NameClauseContext> nameClause() {
			return getRuleContexts(NameClauseContext.class);
		}
		public NameClauseContext nameClause(int i) {
			return getRuleContext(NameClauseContext.class,i);
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
		enterRule(_localctx, 52, RULE_multiMatchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LPAREN);
			setState(503);
			nameClause(0);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(504);
				match(COMMA);
				setState(505);
				nameClause(0);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			match(RPAREN);
			setState(512);
			match(AEQ);
			setState(513);
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
		public NameClauseContext type;
		public ExpressionContext query;
		public TerminalNode HAS_PARENT() { return getToken(ElasticsearchParser.HAS_PARENT, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 54, RULE_hasParentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(HAS_PARENT);
			setState(516);
			match(LPAREN);
			setState(517);
			((HasParentClauseContext)_localctx).type = nameClause(0);
			setState(518);
			match(COMMA);
			setState(519);
			((HasParentClauseContext)_localctx).query = expression(0);
			setState(520);
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
		public NameClauseContext type;
		public ExpressionContext query;
		public TerminalNode HAS_CHILD() { return getToken(ElasticsearchParser.HAS_CHILD, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 56, RULE_hasChildClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(HAS_CHILD);
			setState(523);
			match(LPAREN);
			setState(524);
			((HasChildClauseContext)_localctx).type = nameClause(0);
			setState(525);
			match(COMMA);
			setState(526);
			((HasChildClauseContext)_localctx).query = expression(0);
			setState(527);
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
		enterRule(_localctx, 58, RULE_nestedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(LBRACKET);
			setState(530);
			((NestedClauseContext)_localctx).nestedPath = match(ID);
			setState(531);
			match(COMMA);
			setState(532);
			((NestedClauseContext)_localctx).query = expression(0);
			setState(533);
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
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(WHERE);
			setState(536);
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
		enterRule(_localctx, 62, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(GROUP);
			setState(539);
			match(BY);
			setState(540);
			match(ID);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(541);
				match(COMMA);
				setState(542);
				match(ID);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(548);
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
		enterRule(_localctx, 64, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(HAVING);
			setState(552);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_havingExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new LrHavingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(555);
				match(LPAREN);
				setState(556);
				havingExpression(0);
				setState(557);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new HavingPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(559);
				identity();
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(560);
				((FunctionExprContext)_localctx).funcName = match(ID);
				setState(561);
				collection();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(564);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(565);
						((HavingBinaryContext)_localctx).operator = match(AND);
						setState(566);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(567);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(568);
						((HavingBinaryContext)_localctx).operator = match(OR);
						setState(569);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new HavingBinaryContext(new HavingExpressionContext(_parentctx, _parentState));
						((HavingBinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_havingExpression);
						setState(570);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(571);
						((HavingBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (EQ - 109)) | (1L << (GT - 109)) | (1L << (GTE - 109)) | (1L << (LT - 109)) | (1L << (LTE - 109)))) != 0)) ) {
							((HavingBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						((HavingBinaryContext)_localctx).rightExpr = havingExpression(4);
						}
						break;
					}
					} 
				}
				setState(577);
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
		enterRule(_localctx, 68, RULE_aggregateByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(AGGREGATE);
			setState(579);
			match(BY);
			setState(580);
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
		enterRule(_localctx, 70, RULE_aggregationClause);
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				aggregateItemClause();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
		enterRule(_localctx, 72, RULE_nestedAggregationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(LBRACKET);
			setState(587);
			((NestedAggregationClauseContext)_localctx).nestedPath = match(ID);
			setState(588);
			match(COMMA);
			setState(589);
			aggregationClause();
			setState(590);
			match(RBRACKET);
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(594);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(591);
						match(COMMA);
						setState(592);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(593);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 74, RULE_subAggregationClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(GT);
			setState(600);
			match(LPAREN);
			setState(601);
			aggregationClause();
			setState(602);
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
		enterRule(_localctx, 76, RULE_aggregateItemClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ID);
			setState(605);
			collection();
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(609);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMA:
						{
						{
						setState(606);
						match(COMMA);
						setState(607);
						aggregationClause();
						}
						}
						break;
					case GT:
						{
						setState(608);
						subAggregationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 78, RULE_routingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(ROUTING);
			setState(615);
			match(BY);
			setState(616);
			match(STRING);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(617);
				match(COMMA);
				setState(618);
				match(STRING);
				}
				}
				setState(623);
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
		enterRule(_localctx, 80, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(ORDER);
			setState(625);
			match(BY);
			setState(626);
			order();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				order();
				}
				}
				setState(633);
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
		public NameClauseContext nameClause() {
			return getRuleContext(NameClauseContext.class,0);
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
		enterRule(_localctx, 82, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			nameClause(0);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(635);
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
		enterRule(_localctx, 84, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LIMIT);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(639);
				((LimitClauseContext)_localctx).offset = match(INT);
				setState(640);
				match(COMMA);
				}
				break;
			}
			setState(643);
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

	public static class BatchClauseContext extends ParserRuleContext {
		public Token size;
		public TerminalNode BATCH() { return getToken(ElasticsearchParser.BATCH, 0); }
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public BatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterBatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitBatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitBatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatchClauseContext batchClause() throws RecognitionException {
		BatchClauseContext _localctx = new BatchClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_batchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(BATCH);
			setState(646);
			((BatchClauseContext)_localctx).size = match(INT);
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
		enterRule(_localctx, 88, RULE_trackTotalClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(TRACK);
			setState(649);
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
		enterRule(_localctx, 90, RULE_geoClause);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				geoDistanceClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				geoBoundingBoxClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				geoPolygonClause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				geoShapeClause();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(655);
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
		enterRule(_localctx, 92, RULE_geoDistanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(ID);
			setState(659);
			match(EQ);
			setState(660);
			((GeoDistanceClauseContext)_localctx).coordinate = point();
			setState(661);
			match(AND);
			setState(662);
			match(DISTANCE);
			setState(663);
			match(EQ);
			setState(664);
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
		enterRule(_localctx, 94, RULE_geoBoundingBoxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			((GeoBoundingBoxClauseContext)_localctx).field = match(ID);
			setState(667);
			match(BETWEEN);
			setState(668);
			((GeoBoundingBoxClauseContext)_localctx).leftTop = point();
			setState(669);
			match(AND);
			setState(670);
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
		enterRule(_localctx, 96, RULE_geoPolygonClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(ID);
			setState(673);
			match(IN);
			setState(674);
			match(LBRACKET);
			setState(675);
			point();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				point();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
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
		enterRule(_localctx, 98, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LBRACKET);
			{
			setState(686);
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
			setState(687);
			match(COMMA);
			setState(688);
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
			setState(690);
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
		enterRule(_localctx, 100, RULE_points);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(LBRACKET);
			setState(693);
			point();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(694);
				match(COMMA);
				setState(695);
				point();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
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
		enterRule(_localctx, 102, RULE_polygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(LBRACKET);
			setState(704);
			points();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(705);
				match(COMMA);
				setState(706);
				points();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
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
		enterRule(_localctx, 104, RULE_multiPolygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LBRACKET);
			setState(715);
			polygon();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(716);
				match(COMMA);
				setState(717);
				polygon();
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
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
		enterRule(_localctx, 106, RULE_geoShapeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			((GeoShapeClauseContext)_localctx).field = match(ID);
			setState(726);
			((GeoShapeClauseContext)_localctx).relation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (INTERSECTS - 78)) | (1L << (DISJOINT - 78)) | (1L << (WITHIN - 78)) | (1L << (CONTAINS - 78)))) != 0)) ) {
				((GeoShapeClauseContext)_localctx).relation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(727);
				point();
				}
				break;
			case 2:
				{
				setState(728);
				points();
				}
				break;
			case 3:
				{
				setState(729);
				polygon();
				}
				break;
			case 4:
				{
				setState(730);
				multiPolygon();
				}
				break;
			}
			setState(733);
			match(SHAPED);
			setState(734);
			match(AS);
			setState(735);
			((GeoShapeClauseContext)_localctx).shape = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (POINT - 68)) | (1L << (LINESTRING - 68)) | (1L << (POLYGON - 68)) | (1L << (MULTIPOINT - 68)) | (1L << (MULTILINESTRING - 68)) | (1L << (MULTIPOLYGON - 68)) | (1L << (ENVELOPE - 68)))) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_geoJsonShapeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			((GeoJsonShapeClauseContext)_localctx).field = match(ID);
			setState(738);
			((GeoJsonShapeClauseContext)_localctx).relation = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (INTERSECTS - 78)) | (1L << (DISJOINT - 78)) | (1L << (WITHIN - 78)) | (1L << (CONTAINS - 78)))) != 0)) ) {
				((GeoJsonShapeClauseContext)_localctx).relation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(739);
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
		enterRule(_localctx, 110, RULE_geometryCollectionClause);
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
		enterRule(_localctx, 112, RULE_functionScoreClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(FUNCTION_SCORE);
			setState(744);
			expression(0);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLAND) {
				{
				{
				setState(745);
				match(BOOLAND);
				setState(746);
				expression(0);
				}
				}
				setState(751);
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
		enterRule(_localctx, 114, RULE_disMaxClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(DIS_MAX);
			setState(753);
			expression(0);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLOR) {
				{
				{
				setState(754);
				match(BOOLOR);
				setState(755);
				expression(0);
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(761);
				match(AND);
				setState(762);
				match(TIE_BREAKER);
				setState(763);
				match(EQ);
				setState(764);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return nameClause_sempred((NameClauseContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 22:
			return inRightOperand_sempred((InRightOperandContext)_localctx, predIndex);
		case 33:
			return havingExpression_sempred((HavingExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nameClause_sempred(NameClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a2\u0302\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2}\n\2\3\2\5\2\u0080\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\u008a\n\3\f\3\16\3\u008d\13\3\3\3\3\3\5\3\u0091\n\3\3\3\5\3\u0094"+
		"\n\3\3\3\5\3\u0097\n\3\3\3\3\3\5\3\u009b\n\3\3\3\5\3\u009e\n\3\3\3\5\3"+
		"\u00a1\n\3\3\3\5\3\u00a4\n\3\3\4\3\4\3\4\3\4\5\4\u00aa\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13\5\3\5\3\5\5\5\u00b8\n\5\3\5\5"+
		"\5\u00bb\n\5\3\5\5\5\u00be\n\5\3\5\5\5\u00c1\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\5\6\u00d4"+
		"\n\6\3\6\5\6\u00d7\n\6\3\6\5\6\u00da\n\6\3\6\5\6\u00dd\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00f2\n\7\f\7\16\7\u00f5\13\7\3\7\3\7\5\7\u00f9\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0104\n\b\f\b\16\b\u0107\13\b\3\b\5"+
		"\b\u010a\n\b\3\b\5\b\u010d\n\b\3\b\5\b\u0110\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u011a\n\b\3\b\5\b\u011d\n\b\3\t\3\t\3\t\3\t\7\t\u0123\n"+
		"\t\f\t\16\t\u0126\13\t\5\t\u0128\n\t\3\n\5\n\u012b\n\n\3\n\3\n\3\n\5\n"+
		"\u0130\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013c"+
		"\n\13\3\13\5\13\u013f\n\13\3\13\3\13\3\13\7\13\u0144\n\13\f\13\16\13\u0147"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u014d\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u016a\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u018d\n\16\f\16\16\16\u0190\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u019f\n\21\3\21\3\21\7\21\u01a3"+
		"\n\21\f\21\16\21\u01a6\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01ae"+
		"\n\22\f\22\16\22\u01b1\13\22\3\22\3\22\3\23\3\23\5\23\u01b7\n\23\3\23"+
		"\7\23\u01ba\n\23\f\23\16\23\u01bd\13\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u01c8\n\25\3\25\3\25\3\26\3\26\5\26\u01ce\n\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u01d8\n\27\f\27\16\27\u01db"+
		"\13\27\3\27\3\27\5\27\u01df\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01e7"+
		"\n\30\f\30\16\30\u01ea\13\30\3\31\3\31\3\31\5\31\u01ef\n\31\3\32\3\32"+
		"\5\32\u01f3\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u01fd\n"+
		"\34\f\34\16\34\u0200\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3!\3!\7!\u0222\n!\f!\16!\u0225\13!\3!\5!\u0228"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0235\n#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u0240\n#\f#\16#\u0243\13#\3$\3$\3$\3$\3%\3%\5%\u024b\n%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\7&\u0255\n&\f&\16&\u0258\13&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\7(\u0264\n(\f(\16(\u0267\13(\3)\3)\3)\3)\3)\7)\u026e"+
		"\n)\f)\16)\u0271\13)\3*\3*\3*\3*\3*\7*\u0278\n*\f*\16*\u027b\13*\3+\3"+
		"+\5+\u027f\n+\3,\3,\3,\5,\u0284\n,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\5/\u0293\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u02a9\n\62\f\62\16"+
		"\62\u02ac\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\7\64\u02bb\n\64\f\64\16\64\u02be\13\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\7\65\u02c6\n\65\f\65\16\65\u02c9\13\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u02d1\n\66\f\66\16\66\u02d4\13\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u02de\n\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\3:\3:\3:\3:\7:\u02ee\n:\f:\16:\u02f1\13:\3;\3;\3;\3;\7;\u02f7\n;"+
		"\f;\16;\u02fa\13;\3;\3;\3;\3;\5;\u0300\n;\3;\2\6\24\32.D<\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprt\2\23\4\2\t\t..\7\2cceeggjjll\3\2\u0097\u0098\4\2ddkl\4\2g"+
		"gjj\3\2\u0084\u0086\3\2x{\4\2ouww\4\2\u0089\u0089\u008d\u008d\4\2\u008a"+
		"\u008a\u008e\u008e\4\2\u0097\u0098\u009f\u009f\3\2 #\5\2ccggjl\4\2oox"+
		"{\3\2-.\3\2PS\4\2FKMM\2\u033b\2|\3\2\2\2\4\u0083\3\2\2\2\6\u00a5\3\2\2"+
		"\2\b\u00ab\3\2\2\2\n\u00c2\3\2\2\2\f\u00de\3\2\2\2\16\u00fa\3\2\2\2\20"+
		"\u0127\3\2\2\2\22\u012a\3\2\2\2\24\u013e\3\2\2\2\26\u014c\3\2\2\2\30\u014e"+
		"\3\2\2\2\32\u0169\3\2\2\2\34\u0191\3\2\2\2\36\u019a\3\2\2\2 \u019c\3\2"+
		"\2\2\"\u01a9\3\2\2\2$\u01b4\3\2\2\2&\u01c1\3\2\2\2(\u01c4\3\2\2\2*\u01cb"+
		"\3\2\2\2,\u01de\3\2\2\2.\u01e0\3\2\2\2\60\u01eb\3\2\2\2\62\u01f2\3\2\2"+
		"\2\64\u01f4\3\2\2\2\66\u01f8\3\2\2\28\u0205\3\2\2\2:\u020c\3\2\2\2<\u0213"+
		"\3\2\2\2>\u0219\3\2\2\2@\u021c\3\2\2\2B\u0229\3\2\2\2D\u0234\3\2\2\2F"+
		"\u0244\3\2\2\2H\u024a\3\2\2\2J\u024c\3\2\2\2L\u0259\3\2\2\2N\u025e\3\2"+
		"\2\2P\u0268\3\2\2\2R\u0272\3\2\2\2T\u027c\3\2\2\2V\u0280\3\2\2\2X\u0287"+
		"\3\2\2\2Z\u028a\3\2\2\2\\\u0292\3\2\2\2^\u0294\3\2\2\2`\u029c\3\2\2\2"+
		"b\u02a2\3\2\2\2d\u02af\3\2\2\2f\u02b6\3\2\2\2h\u02c1\3\2\2\2j\u02cc\3"+
		"\2\2\2l\u02d7\3\2\2\2n\u02e3\3\2\2\2p\u02e7\3\2\2\2r\u02e9\3\2\2\2t\u02f2"+
		"\3\2\2\2v}\5\4\3\2w}\5\b\5\2x}\5\6\4\2y}\5\n\6\2z}\5\f\7\2{}\5\16\b\2"+
		"|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\177\3\2"+
		"\2\2~\u0080\7\u0090\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0084\7\n\2\2\u0084\u0085"+
		"\5\20\t\2\u0085\u0086\7>\2\2\u0086\u008b\5\60\31\2\u0087\u0088\7\u008f"+
		"\2\2\u0088\u008a\5\60\31\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0090\5> \2\u008f\u0091\5r:\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5t;\2\u0093\u008e\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5P"+
		")\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009b\5@!\2\u0099\u009b\5F$\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5R*\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5V,\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4\5Z"+
		".\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\5\3\2\2\2\u00a5\u00a6"+
		"\t\2\2\2\u00a6\u00a9\5\60\31\2\u00a7\u00a8\7e\2\2\u00a8\u00aa\5\26\f\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\7\3\2\2\2\u00ab\u00ac\7"+
		"\13\2\2\u00ac\u00ad\7>\2\2\u00ad\u00b2\5\60\31\2\u00ae\u00af\7\u008f\2"+
		"\2\u00af\u00b1\5\60\31\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b8\5\30\r\2\u00b6\u00b8\5> \2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5P"+
		")\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00be\5X-\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00c1\5V,\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\t\3"+
		"\2\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\5\60\31\2\u00c4\u00c5\7\27\2\2"+
		"\u00c5\u00c6\7\u009a\2\2\u00c6\u00c7\7o\2\2\u00c7\u00ce\5\26\f\2\u00c8"+
		"\u00c9\7\u008f\2\2\u00c9\u00ca\7\u009a\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cd"+
		"\5\26\f\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4"+
		"\5\30\r\2\u00d2\u00d4\5> \2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5P)\2\u00d6\u00d5\3\2\2"+
		"\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\5X-\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5V,\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\13\3\2\2\2\u00de\u00df\7\f\2"+
		"\2\u00df\u00e0\7\r\2\2\u00e0\u00e1\5\60\31\2\u00e1\u00e2\7\u0089\2\2\u00e2"+
		"\u00e7\5\26\f\2\u00e3\u00e4\7\u008f\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\u008a\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\7\u0089\2\2\u00ee\u00f3\5\26"+
		"\f\2\u00ef\u00f0\7\u008f\2\2\u00f0\u00f2\5\26\f\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\u008a\2\2\u00f7\u00f9\5P)\2"+
		"\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\r\3\2\2\2\u00fa\u00fb\7"+
		"\f\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe\7\n\2\2\u00fe"+
		"\u00ff\5\20\t\2\u00ff\u0100\7>\2\2\u0100\u0105\5\60\31\2\u0101\u0102\7"+
		"\u008f\2\2\u0102\u0104\5\60\31\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010a\5> \2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u010d\5X-\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2"+
		"\2\u010d\u010f\3\2\2\2\u010e\u0110\5V,\2\u010f\u010e\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u011c\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7o\2\2\u0113"+
		"\u0114\7\u0089\2\2\u0114\u0119\7\u009f\2\2\u0115\u0116\7\u008f\2\2\u0116"+
		"\u0117\7\u009f\2\2\u0117\u0118\7\u008f\2\2\u0118\u011a\7\u009f\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\7\u008a"+
		"\2\2\u011c\u0111\3\2\2\2\u011c\u011d\3\2\2\2\u011d\17\3\2\2\2\u011e\u0128"+
		"\7c\2\2\u011f\u0124\5\22\n\2\u0120\u0121\7\u008f\2\2\u0121\u0123\5\22"+
		"\n\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011e\3\2"+
		"\2\2\u0127\u011f\3\2\2\2\u0128\21\3\2\2\2\u0129\u012b\7\u0082\2\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\5\24"+
		"\13\2\u012d\u012e\7\36\2\2\u012e\u0130\7\u009a\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\23\3\2\2\2\u0131\u0132\b\13\1\2\u0132\u0133"+
		"\7\u0089\2\2\u0133\u0134\5\24\13\2\u0134\u0135\7\u008a\2\2\u0135\u013f"+
		"\3\2\2\2\u0136\u0137\7\31\2\2\u0137\u013f\5\24\13\6\u0138\u0139\7\u009a"+
		"\2\2\u0139\u013f\5 \21\2\u013a\u013c\7:\2\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\7\u009a\2\2\u013e\u0131"+
		"\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0145\3\2\2\2\u0140\u0141\f\5\2\2\u0141\u0142\t\3\2\2\u0142\u0144\5\24"+
		"\13\6\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\25\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014d\7\u009a"+
		"\2\2\u0149\u014d\t\4\2\2\u014a\u014d\7\u009f\2\2\u014b\u014d\5\"\22\2"+
		"\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\27\3\2\2\2\u014e\u014f\7\21\2\2\u014f\u0150\7;\2\2\u0150"+
		"\u0151\7\u009f\2\2\u0151\31\3\2\2\2\u0152\u0153\b\16\1\2\u0153\u0154\7"+
		"\u0089\2\2\u0154\u0155\5\32\16\2\u0155\u0156\7\u008a\2\2\u0156\u016a\3"+
		"\2\2\2\u0157\u0158\5\24\13\2\u0158\u0159\7\60\2\2\u0159\u015a\5\26\f\2"+
		"\u015a\u015b\7\32\2\2\u015b\u015c\5\26\f\2\u015c\u016a\3\2\2\2\u015d\u016a"+
		"\5\34\17\2\u015e\u016a\5*\26\2\u015f\u016a\5\24\13\2\u0160\u016a\5\26"+
		"\f\2\u0161\u016a\5:\36\2\u0162\u016a\58\35\2\u0163\u016a\5(\25\2\u0164"+
		"\u016a\5<\37\2\u0165\u016a\5$\23\2\u0166\u016a\5\\/\2\u0167\u016a\5\62"+
		"\32\2\u0168\u016a\5&\24\2\u0169\u0152\3\2\2\2\u0169\u0157\3\2\2\2\u0169"+
		"\u015d\3\2\2\2\u0169\u015e\3\2\2\2\u0169\u015f\3\2\2\2\u0169\u0160\3\2"+
		"\2\2\u0169\u0161\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0163\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\u018e\3\2\2\2\u016b\u016c\f\31\2\2\u016c"+
		"\u016d\t\5\2\2\u016d\u018d\5\32\16\32\u016e\u016f\f\30\2\2\u016f\u0170"+
		"\t\6\2\2\u0170\u018d\5\32\16\31\u0171\u0172\f\27\2\2\u0172\u0173\t\7\2"+
		"\2\u0173\u018d\5\32\16\30\u0174\u0175\f\26\2\2\u0175\u0176\t\b\2\2\u0176"+
		"\u018d\5\32\16\27\u0177\u0178\f\25\2\2\u0178\u0179\t\t\2\2\u0179\u018d"+
		"\5\32\16\26\u017a\u017b\f\24\2\2\u017b\u017c\7\32\2\2\u017c\u018d\5\32"+
		"\16\25\u017d\u017e\f\23\2\2\u017e\u017f\7\33\2\2\u017f\u018d\5\32\16\24"+
		"\u0180\u0181\f\20\2\2\u0181\u0182\7\u0082\2\2\u0182\u018d\5\32\16\21\u0183"+
		"\u0184\f\17\2\2\u0184\u0185\7~\2\2\u0185\u018d\5\32\16\20\u0186\u0187"+
		"\f\16\2\2\u0187\u0188\7n\2\2\u0188\u0189\5\32\16\2\u0189\u018a\7\u0095"+
		"\2\2\u018a\u018b\5\32\16\16\u018b\u018d\3\2\2\2\u018c\u016b\3\2\2\2\u018c"+
		"\u016e\3\2\2\2\u018c\u0171\3\2\2\2\u018c\u0174\3\2\2\2\u018c\u0177\3\2"+
		"\2\2\u018c\u017a\3\2\2\2\u018c\u017d\3\2\2\2\u018c\u0180\3\2\2\2\u018c"+
		"\u0183\3\2\2\2\u018c\u0186\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\33\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192"+
		"\5\24\13\2\u0192\u0193\7\61\2\2\u0193\u0194\7<\2\2\u0194\u0195\t\n\2\2"+
		"\u0195\u0196\5\36\20\2\u0196\u0197\7\u008f\2\2\u0197\u0198\5\36\20\2\u0198"+
		"\u0199\t\13\2\2\u0199\35\3\2\2\2\u019a\u019b\t\f\2\2\u019b\37\3\2\2\2"+
		"\u019c\u019e\7\u0089\2\2\u019d\u019f\5\26\f\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a4\3\2\2\2\u01a0\u01a1\7\u008f\2\2\u01a1\u01a3"+
		"\5\26\f\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8"+
		"\7\u008a\2\2\u01a8!\3\2\2\2\u01a9\u01aa\7\u008d\2\2\u01aa\u01af\5\26\f"+
		"\2\u01ab\u01ac\7\u008f\2\2\u01ac\u01ae\5\26\f\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\u008e\2\2\u01b3#\3\2\2\2\u01b4"+
		"\u01b6\5\24\13\2\u01b5\u01b7\7\34\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\t\r\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\37\2\2\u01bf\u01c0\7\u009f\2\2"+
		"\u01c0%\3\2\2\2\u01c1\u01c2\7\34\2\2\u01c2\u01c3\5\32\16\2\u01c3\'\3\2"+
		"\2\2\u01c4\u01c5\5\24\13\2\u01c5\u01c7\7\35\2\2\u01c6\u01c8\7\34\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\30"+
		"\2\2\u01ca)\3\2\2\2\u01cb\u01cd\5\24\13\2\u01cc\u01ce\7\34\2\2\u01cd\u01cc"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7<\2\2\u01d0"+
		"\u01d1\5,\27\2\u01d1+\3\2\2\2\u01d2\u01df\5.\30\2\u01d3\u01d4\7\u0089"+
		"\2\2\u01d4\u01d9\5.\30\2\u01d5\u01d6\7\u008f\2\2\u01d6\u01d8\5.\30\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\u008a\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d2\3\2\2\2\u01de\u01d3\3\2\2\2\u01df-\3\2\2\2"+
		"\u01e0\u01e1\b\30\1\2\u01e1\u01e2\5\26\f\2\u01e2\u01e8\3\2\2\2\u01e3\u01e4"+
		"\f\3\2\2\u01e4\u01e5\t\16\2\2\u01e5\u01e7\5.\30\4\u01e6\u01e3\3\2\2\2"+
		"\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9/\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\7\u009a\2\2\u01ec\u01ed\7\36\2"+
		"\2\u01ed\u01ef\7\u009a\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\61\3\2\2\2\u01f0\u01f3\5\64\33\2\u01f1\u01f3\5\66\34\2\u01f2\u01f0\3"+
		"\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\63\3\2\2\2\u01f4\u01f5\78\2\2\u01f5\u01f6"+
		"\7;\2\2\u01f6\u01f7\7\u009f\2\2\u01f7\65\3\2\2\2\u01f8\u01f9\7\u0089\2"+
		"\2\u01f9\u01fe\5\24\13\2\u01fa\u01fb\7\u008f\2\2\u01fb\u01fd\5\24\13\2"+
		"\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\u008a\2"+
		"\2\u0202\u0203\7p\2\2\u0203\u0204\7\u009f\2\2\u0204\67\3\2\2\2\u0205\u0206"+
		"\7\66\2\2\u0206\u0207\7\u0089\2\2\u0207\u0208\5\24\13\2\u0208\u0209\7"+
		"\u008f\2\2\u0209\u020a\5\32\16\2\u020a\u020b\7\u008a\2\2\u020b9\3\2\2"+
		"\2\u020c\u020d\7\67\2\2\u020d\u020e\7\u0089\2\2\u020e\u020f\5\24\13\2"+
		"\u020f\u0210\7\u008f\2\2\u0210\u0211\5\32\16\2\u0211\u0212\7\u008a\2\2"+
		"\u0212;\3\2\2\2\u0213\u0214\7\u008d\2\2\u0214\u0215\7\u009a\2\2\u0215"+
		"\u0216\7\u008f\2\2\u0216\u0217\5\32\16\2\u0217\u0218\7\u008e\2\2\u0218"+
		"=\3\2\2\2\u0219\u021a\7=\2\2\u021a\u021b\5\32\16\2\u021b?\3\2\2\2\u021c"+
		"\u021d\7\62\2\2\u021d\u021e\7;\2\2\u021e\u0223\7\u009a\2\2\u021f\u0220"+
		"\7\u008f\2\2\u0220\u0222\7\u009a\2\2\u0221\u021f\3\2\2\2\u0222\u0225\3"+
		"\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0228\5B\"\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228A\3\2\2\2\u0229\u022a\7?\2\2\u022a\u022b\5D#\2\u022bC\3\2\2"+
		"\2\u022c\u022d\b#\1\2\u022d\u022e\7\u0089\2\2\u022e\u022f\5D#\2\u022f"+
		"\u0230\7\u008a\2\2\u0230\u0235\3\2\2\2\u0231\u0235\5\26\f\2\u0232\u0233"+
		"\7\u009a\2\2\u0233\u0235\5 \21\2\u0234\u022c\3\2\2\2\u0234\u0231\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0235\u0241\3\2\2\2\u0236\u0237\f\7\2\2\u0237\u0238"+
		"\7\32\2\2\u0238\u0240\5D#\b\u0239\u023a\f\6\2\2\u023a\u023b\7\33\2\2\u023b"+
		"\u0240\5D#\7\u023c\u023d\f\5\2\2\u023d\u023e\t\17\2\2\u023e\u0240\5D#"+
		"\6\u023f\u0236\3\2\2\2\u023f\u0239\3\2\2\2\u023f\u023c\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242E\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0245\7\63\2\2\u0245\u0246\7;\2\2\u0246\u0247\5H"+
		"%\2\u0247G\3\2\2\2\u0248\u024b\5N(\2\u0249\u024b\5J&\2\u024a\u0248\3\2"+
		"\2\2\u024a\u0249\3\2\2\2\u024bI\3\2\2\2\u024c\u024d\7\u008d\2\2\u024d"+
		"\u024e\7\u009a\2\2\u024e\u024f\7\u008f\2\2\u024f\u0250\5H%\2\u0250\u0256"+
		"\7\u008e\2\2\u0251\u0252\7\u008f\2\2\u0252\u0255\5H%\2\u0253\u0255\5L"+
		"\'\2\u0254\u0251\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257K\3\2\2\2\u0258\u0256\3\2\2\2"+
		"\u0259\u025a\7x\2\2\u025a\u025b\7\u0089\2\2\u025b\u025c\5H%\2\u025c\u025d"+
		"\7\u008a\2\2\u025dM\3\2\2\2\u025e\u025f\7\u009a\2\2\u025f\u0265\5 \21"+
		"\2\u0260\u0261\7\u008f\2\2\u0261\u0264\5H%\2\u0262\u0264\5L\'\2\u0263"+
		"\u0260\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266O\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7\64\2\2\u0269\u026a\7;\2\2\u026a\u026f\7\u009f\2\2\u026b\u026c\7\u008f"+
		"\2\2\u026c\u026e\7\u009f\2\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270Q\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0272\u0273\7,\2\2\u0273\u0274\7;\2\2\u0274\u0279\5T+\2\u0275\u0276\7"+
		"\u008f\2\2\u0276\u0278\5T+\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027aS\3\2\2\2\u027b\u0279\3\2\2\2"+
		"\u027c\u027e\5\24\13\2\u027d\u027f\t\20\2\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027fU\3\2\2\2\u0280\u0283\7(\2\2\u0281\u0282\7\u0097\2"+
		"\2\u0282\u0284\7\u008f\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\7\u0097\2\2\u0286W\3\2\2\2\u0287\u0288\7)\2"+
		"\2\u0288\u0289\7\u0097\2\2\u0289Y\3\2\2\2\u028a\u028b\7*\2\2\u028b\u028c"+
		"\7+\2\2\u028c[\3\2\2\2\u028d\u0293\5^\60\2\u028e\u0293\5`\61\2\u028f\u0293"+
		"\5b\62\2\u0290\u0293\5l\67\2\u0291\u0293\5n8\2\u0292\u028d\3\2\2\2\u0292"+
		"\u028e\3\2\2\2\u0292\u028f\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2"+
		"\2\2\u0293]\3\2\2\2\u0294\u0295\7\u009a\2\2\u0295\u0296\7o\2\2\u0296\u0297"+
		"\5d\63\2\u0297\u0298\7\32\2\2\u0298\u0299\7C\2\2\u0299\u029a\7o\2\2\u029a"+
		"\u029b\7\u009f\2\2\u029b_\3\2\2\2\u029c\u029d\7\u009a\2\2\u029d\u029e"+
		"\7\60\2\2\u029e\u029f\5d\63\2\u029f\u02a0\7\32\2\2\u02a0\u02a1\5d\63\2"+
		"\u02a1a\3\2\2\2\u02a2\u02a3\7\u009a\2\2\u02a3\u02a4\7<\2\2\u02a4\u02a5"+
		"\7\u008d\2\2\u02a5\u02aa\5d\63\2\u02a6\u02a7\7\u008f\2\2\u02a7\u02a9\5"+
		"d\63\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7\u008e"+
		"\2\2\u02aec\3\2\2\2\u02af\u02b0\7\u008d\2\2\u02b0\u02b1\t\4\2\2\u02b1"+
		"\u02b2\7\u008f\2\2\u02b2\u02b3\t\4\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\7\u008e\2\2\u02b5e\3\2\2\2\u02b6\u02b7\7\u008d\2\2\u02b7\u02bc\5d\63"+
		"\2\u02b8\u02b9\7\u008f\2\2\u02b9\u02bb\5d\63\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2"+
		"\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\7\u008e\2\2\u02c0g\3\2\2\2\u02c1"+
		"\u02c2\7\u008d\2\2\u02c2\u02c7\5f\64\2\u02c3\u02c4\7\u008f\2\2\u02c4\u02c6"+
		"\5f\64\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7\u008e"+
		"\2\2\u02cbi\3\2\2\2\u02cc\u02cd\7\u008d\2\2\u02cd\u02d2\5h\65\2\u02ce"+
		"\u02cf\7\u008f\2\2\u02cf\u02d1\5h\65\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d2\3\2\2\2\u02d5\u02d6\7\u008e\2\2\u02d6k\3\2\2\2\u02d7\u02d8\7\u009a"+
		"\2\2\u02d8\u02dd\t\21\2\2\u02d9\u02de\5d\63\2\u02da\u02de\5f\64\2\u02db"+
		"\u02de\5h\65\2\u02dc\u02de\5j\66\2\u02dd\u02d9\3\2\2\2\u02dd\u02da\3\2"+
		"\2\2\u02dd\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\7O\2\2\u02e0\u02e1\7\36\2\2\u02e1\u02e2\t\22\2\2\u02e2m\3\2\2\2"+
		"\u02e3\u02e4\7\u009a\2\2\u02e4\u02e5\t\21\2\2\u02e5\u02e6\7\u009f\2\2"+
		"\u02e6o\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8q\3\2\2\2\u02e9\u02ea\7T\2\2"+
		"\u02ea\u02ef\5\32\16\2\u02eb\u02ec\7\u0081\2\2\u02ec\u02ee\5\32\16\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0s\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7A\2\2\u02f3\u02f8"+
		"\5\32\16\2\u02f4\u02f5\7\177\2\2\u02f5\u02f7\5\32\16\2\u02f6\u02f4\3\2"+
		"\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02ff\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\7\32\2\2\u02fc\u02fd\7"+
		"B\2\2\u02fd\u02fe\7o\2\2\u02fe\u0300\7\u0098\2\2\u02ff\u02fb\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300u\3\2\2\2O|\177\u008b\u0090\u0093\u0096\u009a\u009d"+
		"\u00a0\u00a3\u00a9\u00b2\u00b7\u00ba\u00bd\u00c0\u00ce\u00d3\u00d6\u00d9"+
		"\u00dc\u00e7\u00f3\u00f8\u0105\u0109\u010c\u010f\u0119\u011c\u0124\u0127"+
		"\u012a\u012f\u013b\u013e\u0145\u014c\u0169\u018c\u018e\u019e\u01a4\u01af"+
		"\u01b6\u01bb\u01c7\u01cd\u01d9\u01de\u01e8\u01ee\u01f2\u01fe\u0223\u0227"+
		"\u0234\u023f\u0241\u024a\u0254\u0256\u0263\u0265\u026f\u0279\u027e\u0283"+
		"\u0292\u02aa\u02bc\u02c7\u02d2\u02dd\u02ef\u02f8\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}