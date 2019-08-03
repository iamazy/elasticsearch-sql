// Generated from /Users/iamazy/Documents/GitHub/elasticsql/java/src/main/resources/antlr4/ElasticsearchParser.g4 by ANTLR 4.7.2
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
		FROM=51, HAVING=52, DISTANCE=53, GEOPOINT=54, GEOHASH=55, TOP_LEFT=56, 
		BOTTOM_RIGHT=57, VAR_ASSIGN=58, PLUS_ASSIGN=59, MINUS_ASSIGN=60, MULT_ASSIGN=61, 
		DIV_ASSIGN=62, MOD_ASSIGN=63, AND_ASSIGN=64, XOR_ASSIGN=65, OR_ASSIGN=66, 
		ALSH=67, ARSH=68, AUSH=69, STAR=70, MUL=71, DIVIDE=72, MODULE=73, PLUS=74, 
		INCR=75, DECR=76, MINUS=77, DIV=78, MOD=79, POUND=80, COND=81, EQ=82, 
		AEQ=83, TEQ=84, EQEQ=85, NE=86, GT=87, GTE=88, LT=89, LTE=90, BOOLNOT=91, 
		BWNOT=92, BWOR=93, BOOLOR=94, BWAND=95, BOOLAND=96, XOR=97, ARROW=98, 
		LSH=99, RSH=100, USH=101, DOT=102, NSDOT=103, LPAREN=104, RPAREN=105, 
		LBRACE=106, RBRACE=107, LBRACKET=108, RBRACKET=109, COMMA=110, SEMI=111, 
		AT_SIGN=112, SINGLE_QUOTE=113, DOUBLE_QUOTE=114, REVERSE_QUOTE=115, COLON=116, 
		UNDERLINE=117, INT=118, FLOAT=119, DOT_ID=120, ID=121, OCTAL=122, HEX=123, 
		INTEGER=124, DECIMAL=125, STRING=126, REGEX=127, DOTINTEGER=128, DOTID=129;
	public static final int
		RULE_sql = 0, RULE_selectOperation = 1, RULE_descOperation = 2, RULE_deleteOperation = 3, 
		RULE_updateOperation = 4, RULE_insertOperation = 5, RULE_fieldList = 6, 
		RULE_nameOperand = 7, RULE_name = 8, RULE_identity = 9, RULE_expression = 10, 
		RULE_collection = 11, RULE_likeClause = 12, RULE_isClause = 13, RULE_inClause = 14, 
		RULE_inRightOperandList = 15, RULE_inRightOperand = 16, RULE_tableRef = 17, 
		RULE_fullTextClause = 18, RULE_queryStringClause = 19, RULE_hasParentClause = 20, 
		RULE_hasChildClause = 21, RULE_nestedClause = 22, RULE_whereClause = 23, 
		RULE_groupClause = 24, RULE_aggregateClause = 25, RULE_aggregateItemClause = 26, 
		RULE_routingClause = 27, RULE_orderClause = 28, RULE_order = 29, RULE_limitClause = 30, 
		RULE_geoClause = 31, RULE_geoDistanceClause = 32, RULE_geoBoundingBoxClause = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "selectOperation", "descOperation", "deleteOperation", "updateOperation", 
			"insertOperation", "fieldList", "nameOperand", "name", "identity", "expression", 
			"collection", "likeClause", "isClause", "inClause", "inRightOperandList", 
			"inRightOperand", "tableRef", "fullTextClause", "queryStringClause", 
			"hasParentClause", "hasChildClause", "nestedClause", "whereClause", "groupClause", 
			"aggregateClause", "aggregateItemClause", "routingClause", "orderClause", 
			"order", "limitClause", "geoClause", "geoDistanceClause", "geoBoundingBoxClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "':='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", 
			"'>>>='", "'*'", null, "'/'", "'%'", "'+'", "'++'", "'--'", "'-'", null, 
			null, "'#'", "'?'", "'='", "'~='", "'~=='", "'=='", "'!='", "'>'", "'>='", 
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
			"TOP", "UPDATE", "CREATE", "TABLE", "IF", "ALTER", "DROP", "SET", "NULL", 
			"DISTINCT", "AND", "OR", "NOT", "IS", "AS", "LIKE", "RLIKE", "EXISTS", 
			"TRUE", "FALSE", "LIMIT", "ORDER", "ASC", "DESC", "BEFORE", "BETWEEN", 
			"GROUP", "AGGREGATE", "ROUTING", "PARENT_ID", "HAS_PARENT", "HAS_CHILD", 
			"QUERY", "NESTED", "HIGHLIGHTER", "BY", "IN", "WHERE", "FROM", "HAVING", 
			"DISTANCE", "GEOPOINT", "GEOHASH", "TOP_LEFT", "BOTTOM_RIGHT", "VAR_ASSIGN", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "ALSH", "ARSH", "AUSH", "STAR", 
			"MUL", "DIVIDE", "MODULE", "PLUS", "INCR", "DECR", "MINUS", "DIV", "MOD", 
			"POUND", "COND", "EQ", "AEQ", "TEQ", "EQEQ", "NE", "GT", "GTE", "LT", 
			"LTE", "BOOLNOT", "BWNOT", "BWOR", "BOOLOR", "BWAND", "BOOLAND", "XOR", 
			"ARROW", "LSH", "RSH", "USH", "DOT", "NSDOT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "REVERSE_QUOTE", "COLON", "UNDERLINE", "INT", "FLOAT", 
			"DOT_ID", "ID", "OCTAL", "HEX", "INTEGER", "DECIMAL", "STRING", "REGEX", 
			"DOTINTEGER", "DOTID"
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(68);
				selectOperation();
				}
				break;
			case DELETE:
				{
				setState(69);
				deleteOperation();
				}
				break;
			case DESCRIBE:
				{
				setState(70);
				descOperation();
				}
				break;
			case UPDATE:
				{
				setState(71);
				updateOperation();
				}
				break;
			case INSERT:
				{
				setState(72);
				insertOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(75);
				match(SEMI);
				}
			}

			setState(78);
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
		public GroupClauseContext groupClause() {
			return getRuleContext(GroupClauseContext.class,0);
		}
		public AggregateClauseContext aggregateClause() {
			return getRuleContext(AggregateClauseContext.class,0);
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
			setState(80);
			match(SELECT);
			setState(81);
			fieldList();
			setState(82);
			match(FROM);
			setState(83);
			tableRef();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				tableRef();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(91);
				whereClause();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(94);
				routingClause();
				}
			}

			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GROUP:
				{
				setState(97);
				groupClause();
				}
				break;
			case AGGREGATE:
				{
				setState(98);
				aggregateClause();
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(101);
				orderClause();
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(104);
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
			setState(107);
			match(DESCRIBE);
			setState(108);
			tableRef();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIVIDE) {
				{
				setState(109);
				match(DIVIDE);
				setState(110);
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
			setState(113);
			match(DELETE);
			setState(114);
			match(FROM);
			setState(115);
			tableRef();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				tableRef();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(123);
				whereClause();
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROUTING) {
				{
				setState(126);
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
			setState(129);
			match(UPDATE);
			setState(130);
			tableRef();
			setState(131);
			match(SET);
			setState(132);
			match(ID);
			setState(133);
			match(EQ);
			setState(134);
			identity();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(ID);
				setState(137);
				match(EQ);
				setState(138);
				identity();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(144);
				whereClause();
				}
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
			setState(150);
			match(INSERT);
			setState(151);
			match(INTO);
			setState(152);
			tableRef();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(153);
				match(LPAREN);
				setState(154);
				identity();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(155);
					match(COMMA);
					setState(156);
					identity();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(RPAREN);
				}
			}

			setState(166);
			match(VALUES);
			setState(167);
			match(LPAREN);
			setState(168);
			identity();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				identity();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RPAREN);
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
		enterRule(_localctx, 12, RULE_fieldList);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
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
				setState(181);
				nameOperand();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					nameOperand();
					}
					}
					setState(188);
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
		enterRule(_localctx, 14, RULE_nameOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XOR) {
				{
				setState(191);
				((NameOperandContext)_localctx).exclude = match(XOR);
				}
			}

			setState(194);
			((NameOperandContext)_localctx).fieldName = name(0);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(195);
				match(AS);
				setState(196);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_name, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new LrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(200);
				match(LPAREN);
				setState(201);
				name(0);
				setState(202);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new DistinctNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(DISTINCT);
				setState(205);
				((DistinctNameContext)_localctx).fieldName = name(4);
				}
				break;
			case 3:
				{
				_localctx = new FunctionNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				((FunctionNameContext)_localctx).functionName = match(ID);
				setState(207);
				((FunctionNameContext)_localctx).params = collection();
				}
				break;
			case 4:
				{
				_localctx = new FieldNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HIGHLIGHTER) {
					{
					setState(208);
					((FieldNameContext)_localctx).highlighter = match(HIGHLIGHTER);
					}
				}

				setState(211);
				((FieldNameContext)_localctx).field = match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryNameContext(new NameContext(_parentctx, _parentState));
					((BinaryNameContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(214);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(215);
					((BinaryNameContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STAR - 70)) | (1L << (DIVIDE - 70)) | (1L << (PLUS - 70)) | (1L << (MINUS - 70)) | (1L << (MOD - 70)))) != 0)) ) {
						((BinaryNameContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(216);
					((BinaryNameContext)_localctx).right = name(4);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 18, RULE_identity);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
				setState(224);
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
		public TerminalNode BOOLAND() { return getToken(ElasticsearchParser.BOOLAND, 0); }
		public TerminalNode OR() { return getToken(ElasticsearchParser.OR, 0); }
		public TerminalNode BOOLOR() { return getToken(ElasticsearchParser.BOOLOR, 0); }
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
		public IdentityContext expr;
		public IdentityContext left;
		public IdentityContext right;
		public TerminalNode BETWEEN() { return getToken(ElasticsearchParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ElasticsearchParser.AND, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new LrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(228);
				match(LPAREN);
				setState(229);
				expression(0);
				setState(230);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new BetweenAndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				((BetweenAndContext)_localctx).expr = identity();
				setState(233);
				match(BETWEEN);
				setState(234);
				((BetweenAndContext)_localctx).left = identity();
				setState(235);
				match(AND);
				setState(236);
				((BetweenAndContext)_localctx).right = identity();
				}
				break;
			case 3:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				inClause();
				}
				break;
			case 4:
				{
				_localctx = new NameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				name(0);
				}
				break;
			case 5:
				{
				_localctx = new PrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				identity();
				}
				break;
			case 6:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				hasChildClause();
				}
				break;
			case 7:
				{
				_localctx = new JoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				hasParentClause();
				}
				break;
			case 8:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				isClause();
				}
				break;
			case 9:
				{
				_localctx = new NestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				nestedClause();
				}
				break;
			case 10:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				likeClause();
				}
				break;
			case 11:
				{
				_localctx = new GeoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				geoClause();
				}
				break;
			case 12:
				{
				_localctx = new FullTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				fullTextClause();
				}
				break;
			case 13:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				((BinaryContext)_localctx).not = match(NOT);
				setState(249);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(253);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (MUL - 71)) | (1L << (DIV - 71)) | (1L << (MOD - 71)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						((BinaryContext)_localctx).rightExpr = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(256);
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
						setState(257);
						((BinaryContext)_localctx).rightExpr = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(259);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (LSH - 99)) | (1L << (RSH - 99)) | (1L << (USH - 99)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						((BinaryContext)_localctx).rightExpr = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(262);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (GT - 87)) | (1L << (GTE - 87)) | (1L << (LT - 87)) | (1L << (LTE - 87)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						((BinaryContext)_localctx).rightExpr = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(265);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EQ - 82)) | (1L << (AEQ - 82)) | (1L << (TEQ - 82)) | (1L << (NE - 82)))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						((BinaryContext)_localctx).rightExpr = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(268);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==BOOLAND) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((BinaryContext)_localctx).rightExpr = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(271);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==BOOLOR) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((BinaryContext)_localctx).rightExpr = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(274);
						((BinaryContext)_localctx).operator = match(XOR);
						setState(275);
						((BinaryContext)_localctx).rightExpr = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(277);
						((BinaryContext)_localctx).operator = match(BWOR);
						setState(278);
						((BinaryContext)_localctx).rightExpr = expression(14);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(280);
						match(COND);
						setState(281);
						((ConditionalContext)_localctx).leftExpr = expression(0);
						setState(282);
						match(COLON);
						setState(283);
						((ConditionalContext)_localctx).rightExpr = expression(12);
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 22, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (INT - 118)) | (1L << (FLOAT - 118)) | (1L << (ID - 118)) | (1L << (STRING - 118)))) != 0)) {
				{
				setState(291);
				identity();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				identity();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		enterRule(_localctx, 24, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((LikeClauseContext)_localctx).field = name(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(304);
				((LikeClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(307);
			match(LIKE);
			setState(308);
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
		enterRule(_localctx, 26, RULE_isClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((IsClauseContext)_localctx).field = name(0);
			setState(311);
			match(IS);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(312);
				((IsClauseContext)_localctx).not = match(NOT);
				}
			}

			setState(315);
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
		public IdentityContext left;
		public InRightOperandListContext right;
		public TerminalNode IN() { return getToken(ElasticsearchParser.IN, 0); }
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
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
		enterRule(_localctx, 28, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((InClauseContext)_localctx).left = identity();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(318);
				match(NOT);
				}
			}

			setState(321);
			match(IN);
			setState(322);
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
		enterRule(_localctx, 30, RULE_inRightOperandList);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				inRightOperand(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(LPAREN);
				setState(326);
				inRightOperand(0);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(327);
					match(COMMA);
					setState(328);
					inRightOperand(0);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inRightOperand, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConstLiteralContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(339);
			identity();
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticLiteralContext(new InRightOperandContext(_parentctx, _parentState));
					((ArithmeticLiteralContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inRightOperand);
					setState(341);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(342);
					((ArithmeticLiteralContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STAR - 70)) | (1L << (PLUS - 70)) | (1L << (MINUS - 70)) | (1L << (DIV - 70)) | (1L << (MOD - 70)))) != 0)) ) {
						((ArithmeticLiteralContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(343);
					((ArithmeticLiteralContext)_localctx).right = inRightOperand(2);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 34, RULE_tableRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((TableRefContext)_localctx).indexName = match(ID);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(350);
				match(AS);
				setState(351);
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
		enterRule(_localctx, 36, RULE_fullTextClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			queryStringClause();
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
		public TerminalNode INT() { return getToken(ElasticsearchParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ElasticsearchParser.FLOAT, 0); }
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
		enterRule(_localctx, 38, RULE_queryStringClause);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(QUERY);
				setState(357);
				match(BY);
				setState(358);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(FLOAT);
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
		enterRule(_localctx, 40, RULE_hasParentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(HAS_PARENT);
			setState(364);
			match(LPAREN);
			setState(365);
			((HasParentClauseContext)_localctx).type = name(0);
			setState(366);
			match(COMMA);
			setState(367);
			((HasParentClauseContext)_localctx).query = expression(0);
			setState(368);
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
		enterRule(_localctx, 42, RULE_hasChildClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(HAS_CHILD);
			setState(371);
			match(LPAREN);
			setState(372);
			((HasChildClauseContext)_localctx).type = name(0);
			setState(373);
			match(COMMA);
			setState(374);
			((HasChildClauseContext)_localctx).query = expression(0);
			setState(375);
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
		public IdentityContext nestedPath;
		public ExpressionContext query;
		public TerminalNode LBRACKET() { return getToken(ElasticsearchParser.LBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(ElasticsearchParser.COMMA, 0); }
		public TerminalNode RBRACKET() { return getToken(ElasticsearchParser.RBRACKET, 0); }
		public IdentityContext identity() {
			return getRuleContext(IdentityContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_nestedClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(LBRACKET);
			setState(378);
			((NestedClauseContext)_localctx).nestedPath = identity();
			setState(379);
			match(COMMA);
			setState(380);
			((NestedClauseContext)_localctx).query = expression(0);
			setState(381);
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
		enterRule(_localctx, 46, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(WHERE);
			setState(384);
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

	public static class GroupClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ElasticsearchParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
		}
		public GroupClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterGroupClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitGroupClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitGroupClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupClauseContext groupClause() throws RecognitionException {
		GroupClauseContext _localctx = new GroupClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_groupClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(GROUP);
			setState(387);
			match(BY);
			setState(388);
			name(0);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				name(0);
				}
				}
				setState(395);
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

	public static class AggregateClauseContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(ElasticsearchParser.AGGREGATE, 0); }
		public TerminalNode BY() { return getToken(ElasticsearchParser.BY, 0); }
		public AggregateItemClauseContext aggregateItemClause() {
			return getRuleContext(AggregateItemClauseContext.class,0);
		}
		public AggregateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).enterAggregateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElasticsearchParserListener ) ((ElasticsearchParserListener)listener).exitAggregateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ElasticsearchParserVisitor ) return ((ElasticsearchParserVisitor<? extends T>)visitor).visitAggregateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateClauseContext aggregateClause() throws RecognitionException {
		AggregateClauseContext _localctx = new AggregateClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aggregateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(AGGREGATE);
			setState(397);
			match(BY);
			setState(398);
			aggregateItemClause();
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
		public TerminalNode GT() { return getToken(ElasticsearchParser.GT, 0); }
		public TerminalNode LPAREN() { return getToken(ElasticsearchParser.LPAREN, 0); }
		public List<AggregateItemClauseContext> aggregateItemClause() {
			return getRuleContexts(AggregateItemClauseContext.class);
		}
		public AggregateItemClauseContext aggregateItemClause(int i) {
			return getRuleContext(AggregateItemClauseContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ElasticsearchParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElasticsearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElasticsearchParser.COMMA, i);
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
		enterRule(_localctx, 52, RULE_aggregateItemClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(ID);
			setState(401);
			collection();
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LIMIT:
			case ORDER:
			case RPAREN:
			case COMMA:
			case SEMI:
				{
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(COMMA);
						setState(403);
						aggregateItemClause();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case GT:
				{
				setState(409);
				match(GT);
				setState(410);
				match(LPAREN);
				setState(411);
				aggregateItemClause();
				setState(412);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 54, RULE_routingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ROUTING);
			setState(417);
			match(BY);
			setState(418);
			match(STRING);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(419);
				match(COMMA);
				setState(420);
				match(STRING);
				}
				}
				setState(425);
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
		enterRule(_localctx, 56, RULE_orderClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ORDER);
			setState(427);
			match(BY);
			setState(428);
			order();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(429);
				match(COMMA);
				setState(430);
				order();
				}
				}
				setState(435);
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
		public Token type;
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
		enterRule(_localctx, 58, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			name(0);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(437);
				((OrderContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 60, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(LIMIT);
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(441);
				((LimitClauseContext)_localctx).offset = match(INT);
				setState(442);
				match(COMMA);
				}
				break;
			}
			setState(445);
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
		enterRule(_localctx, 62, RULE_geoClause);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				geoDistanceClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				geoBoundingBoxClause();
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
		public Token field;
		public Token coordinate;
		public Token distance;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> EQ() { return getTokens(ElasticsearchParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ElasticsearchParser.EQ, i);
		}
		public List<TerminalNode> AND() { return getTokens(ElasticsearchParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ElasticsearchParser.AND, i);
		}
		public TerminalNode DISTANCE() { return getToken(ElasticsearchParser.DISTANCE, 0); }
		public List<TerminalNode> STRING() { return getTokens(ElasticsearchParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ElasticsearchParser.STRING, i);
		}
		public TerminalNode GEOPOINT() { return getToken(ElasticsearchParser.GEOPOINT, 0); }
		public TerminalNode GEOHASH() { return getToken(ElasticsearchParser.GEOHASH, 0); }
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
		enterRule(_localctx, 64, RULE_geoDistanceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			name(0);
			setState(452);
			match(EQ);
			setState(453);
			((GeoDistanceClauseContext)_localctx).field = match(STRING);
			setState(454);
			match(AND);
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==GEOPOINT || _la==GEOHASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(456);
			match(EQ);
			setState(457);
			((GeoDistanceClauseContext)_localctx).coordinate = match(STRING);
			setState(458);
			match(AND);
			setState(459);
			match(DISTANCE);
			setState(460);
			match(EQ);
			setState(461);
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
		public Token leftTop;
		public Token rightBottom;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> EQ() { return getTokens(ElasticsearchParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ElasticsearchParser.EQ, i);
		}
		public List<TerminalNode> AND() { return getTokens(ElasticsearchParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ElasticsearchParser.AND, i);
		}
		public TerminalNode TOP_LEFT() { return getToken(ElasticsearchParser.TOP_LEFT, 0); }
		public TerminalNode BOTTOM_RIGHT() { return getToken(ElasticsearchParser.BOTTOM_RIGHT, 0); }
		public List<TerminalNode> STRING() { return getTokens(ElasticsearchParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ElasticsearchParser.STRING, i);
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
		enterRule(_localctx, 66, RULE_geoBoundingBoxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			name(0);
			setState(464);
			match(EQ);
			setState(465);
			((GeoBoundingBoxClauseContext)_localctx).field = match(STRING);
			setState(466);
			match(AND);
			setState(467);
			match(TOP_LEFT);
			setState(468);
			match(EQ);
			setState(469);
			((GeoBoundingBoxClauseContext)_localctx).leftTop = match(STRING);
			setState(470);
			match(AND);
			setState(471);
			match(BOTTOM_RIGHT);
			setState(472);
			match(EQ);
			setState(473);
			((GeoBoundingBoxClauseContext)_localctx).rightBottom = match(STRING);
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
		case 8:
			return name_sempred((NameContext)_localctx, predIndex);
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return inRightOperand_sempred((InRightOperandContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean name_sempred(NameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u01de\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\2\5\2O\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\5\3_\n\3\3\3\5\3b"+
		"\n\3\3\3\3\3\5\3f\n\3\3\3\5\3i\n\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\5\4r\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\5\5\177\n\5\3\5\5\5"+
		"\u0082\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16"+
		"\6\u0091\13\6\3\6\5\6\u0094\n\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\7\5\7\u00a7\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\5\7\u00b5\n\7"+
		"\3\b\3\b\3\b\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\5\b\u00c0\n\b\3\t\5"+
		"\t\u00c3\n\t\3\t\3\t\3\t\5\t\u00c8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00d4\n\n\3\n\5\n\u00d7\n\n\3\n\3\n\3\n\7\n\u00dc\n\n\f\n"+
		"\16\n\u00df\13\n\3\13\3\13\3\13\5\13\u00e4\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00fd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0120\n\f\f\f\16\f\u0123\13\f\3\r\3\r\5\r\u0127\n\r\3\r\3\r"+
		"\7\r\u012b\n\r\f\r\16\r\u012e\13\r\3\r\3\r\3\16\3\16\5\16\u0134\n\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\5\17\u013c\n\17\3\17\3\17\3\20\3\20\5\20"+
		"\u0142\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u014c\n\21\f"+
		"\21\16\21\u014f\13\21\3\21\3\21\5\21\u0153\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u015b\n\22\f\22\16\22\u015e\13\22\3\23\3\23\3\23\5\23\u0163"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u016c\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u018a\n\32"+
		"\f\32\16\32\u018d\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0197"+
		"\n\34\f\34\16\34\u019a\13\34\3\34\3\34\3\34\3\34\3\34\5\34\u01a1\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u01a8\n\35\f\35\16\35\u01ab\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01b2\n\36\f\36\16\36\u01b5\13\36\3\37\3\37"+
		"\5\37\u01b9\n\37\3 \3 \3 \5 \u01be\n \3 \3 \3!\3!\5!\u01c4\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\2\5\22\26\"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BD\2\16\7\2HHJJLLOOQQ\3\2xy\4\2IIPQ\4\2LLOO\3\2eg\3"+
		"\2Y\\\4\2TVXX\4\2\31\31bb\4\2\32\32``\5\2HHLLOQ\3\2%&\3\289\2\u0206\2"+
		"K\3\2\2\2\4R\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\n\u0083\3\2\2\2\f\u0098\3\2"+
		"\2\2\16\u00bf\3\2\2\2\20\u00c2\3\2\2\2\22\u00d6\3\2\2\2\24\u00e3\3\2\2"+
		"\2\26\u00fc\3\2\2\2\30\u0124\3\2\2\2\32\u0131\3\2\2\2\34\u0138\3\2\2\2"+
		"\36\u013f\3\2\2\2 \u0152\3\2\2\2\"\u0154\3\2\2\2$\u015f\3\2\2\2&\u0164"+
		"\3\2\2\2(\u016b\3\2\2\2*\u016d\3\2\2\2,\u0174\3\2\2\2.\u017b\3\2\2\2\60"+
		"\u0181\3\2\2\2\62\u0184\3\2\2\2\64\u018e\3\2\2\2\66\u0192\3\2\2\28\u01a2"+
		"\3\2\2\2:\u01ac\3\2\2\2<\u01b6\3\2\2\2>\u01ba\3\2\2\2@\u01c3\3\2\2\2B"+
		"\u01c5\3\2\2\2D\u01d1\3\2\2\2FL\5\4\3\2GL\5\b\5\2HL\5\6\4\2IL\5\n\6\2"+
		"JL\5\f\7\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LN\3\2\2\2"+
		"MO\7q\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RS\7\n\2\2"+
		"ST\5\16\b\2TU\7\65\2\2UZ\5$\23\2VW\7p\2\2WY\5$\23\2XV\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\5\60\31\2^]\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`b\58\35\2a`\3\2\2\2ab\3\2\2\2be\3\2\2\2cf\5\62\32\2d"+
		"f\5\64\33\2ec\3\2\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5:\36\2hg\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jl\5> \2kj\3\2\2\2kl\3\2\2\2l\5\3\2\2\2mn\7\t\2"+
		"\2nq\5$\23\2op\7J\2\2pr\5\24\13\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2\2st\7\13"+
		"\2\2tu\7\65\2\2uz\5$\23\2vw\7p\2\2wy\5$\23\2xv\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5\60\31\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080\u0082\58\35\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085\5$\23\2\u0085"+
		"\u0086\7\26\2\2\u0086\u0087\7{\2\2\u0087\u0088\7T\2\2\u0088\u008f\5\24"+
		"\13\2\u0089\u008a\7p\2\2\u008a\u008b\7{\2\2\u008b\u008c\7T\2\2\u008c\u008e"+
		"\5\24\13\2\u008d\u0089\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094"+
		"\5\60\31\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0097\58\35\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\13"+
		"\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\7\r\2\2\u009a\u00a6\5$\23\2\u009b"+
		"\u009c\7j\2\2\u009c\u00a1\5\24\13\2\u009d\u009e\7p\2\2\u009e\u00a0\5\24"+
		"\13\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7k"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009b\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\7j\2\2\u00aa\u00af\5\24"+
		"\13\2\u00ab\u00ac\7p\2\2\u00ac\u00ae\5\24\13\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7k\2\2\u00b3\u00b5\58\35\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\r\3\2\2\2\u00b6\u00c0\7H\2\2"+
		"\u00b7\u00bc\5\20\t\2\u00b8\u00b9\7p\2\2\u00b9\u00bb\5\20\t\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2"+
		"\2\2\u00c0\17\3\2\2\2\u00c1\u00c3\7c\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\5\22\n\2\u00c5\u00c6\7\35\2\2"+
		"\u00c6\u00c8\7{\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\21\3"+
		"\2\2\2\u00c9\u00ca\b\n\1\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\5\22\n\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00d7\3\2\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d7\5\22"+
		"\n\6\u00d0\u00d1\7{\2\2\u00d1\u00d7\5\30\r\2\u00d2\u00d4\7\61\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\7{"+
		"\2\2\u00d6\u00c9\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\f\5\2\2\u00d9\u00da\t\2"+
		"\2\2\u00da\u00dc\5\22\n\6\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\23\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\u00e4\7{\2\2\u00e1\u00e4\t\3\2\2\u00e2\u00e4\7\u0080\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\25\3\2\2"+
		"\2\u00e5\u00e6\b\f\1\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00fd\3\2\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec\7(\2\2\u00ec"+
		"\u00ed\5\24\13\2\u00ed\u00ee\7\31\2\2\u00ee\u00ef\5\24\13\2\u00ef\u00fd"+
		"\3\2\2\2\u00f0\u00fd\5\36\20\2\u00f1\u00fd\5\22\n\2\u00f2\u00fd\5\24\13"+
		"\2\u00f3\u00fd\5,\27\2\u00f4\u00fd\5*\26\2\u00f5\u00fd\5\34\17\2\u00f6"+
		"\u00fd\5.\30\2\u00f7\u00fd\5\32\16\2\u00f8\u00fd\5@!\2\u00f9\u00fd\5&"+
		"\24\2\u00fa\u00fb\7\33\2\2\u00fb\u00fd\5\26\f\3\u00fc\u00e5\3\2\2\2\u00fc"+
		"\u00ea\3\2\2\2\u00fc\u00f0\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f2\3\2"+
		"\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0121\3\2\2\2\u00fe\u00ff\f\30\2\2\u00ff"+
		"\u0100\t\4\2\2\u0100\u0120\5\26\f\31\u0101\u0102\f\27\2\2\u0102\u0103"+
		"\t\5\2\2\u0103\u0120\5\26\f\30\u0104\u0105\f\26\2\2\u0105\u0106\t\6\2"+
		"\2\u0106\u0120\5\26\f\27\u0107\u0108\f\25\2\2\u0108\u0109\t\7\2\2\u0109"+
		"\u0120\5\26\f\26\u010a\u010b\f\24\2\2\u010b\u010c\t\b\2\2\u010c\u0120"+
		"\5\26\f\25\u010d\u010e\f\23\2\2\u010e\u010f\t\t\2\2\u010f\u0120\5\26\f"+
		"\24\u0110\u0111\f\22\2\2\u0111\u0112\t\n\2\2\u0112\u0120\5\26\f\23\u0113"+
		"\u0114\f\20\2\2\u0114\u0115\7c\2\2\u0115\u0120\5\26\f\21\u0116\u0117\f"+
		"\17\2\2\u0117\u0118\7_\2\2\u0118\u0120\5\26\f\20\u0119\u011a\f\16\2\2"+
		"\u011a\u011b\7S\2\2\u011b\u011c\5\26\f\2\u011c\u011d\7v\2\2\u011d\u011e"+
		"\5\26\f\16\u011e\u0120\3\2\2\2\u011f\u00fe\3\2\2\2\u011f\u0101\3\2\2\2"+
		"\u011f\u0104\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u010a\3\2\2\2\u011f\u010d"+
		"\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0119\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\27\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7j\2\2\u0125\u0127"+
		"\5\24\13\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012c\3\2\2\2"+
		"\u0128\u0129\7p\2\2\u0129\u012b\5\24\13\2\u012a\u0128\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\7k\2\2\u0130\31\3\2\2\2\u0131\u0133\5\22\n"+
		"\2\u0132\u0134\7\33\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7\36\2\2\u0136\u0137\7\u0080\2\2\u0137\33\3"+
		"\2\2\2\u0138\u0139\5\22\n\2\u0139\u013b\7\34\2\2\u013a\u013c\7\33\2\2"+
		"\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\7\27\2\2\u013e\35\3\2\2\2\u013f\u0141\5\24\13\2\u0140\u0142\7\33\2\2"+
		"\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\7\63\2\2\u0144\u0145\5 \21\2\u0145\37\3\2\2\2\u0146\u0153\5\"\22\2\u0147"+
		"\u0148\7j\2\2\u0148\u014d\5\"\22\2\u0149\u014a\7p\2\2\u014a\u014c\5\""+
		"\22\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7k"+
		"\2\2\u0151\u0153\3\2\2\2\u0152\u0146\3\2\2\2\u0152\u0147\3\2\2\2\u0153"+
		"!\3\2\2\2\u0154\u0155\b\22\1\2\u0155\u0156\5\24\13\2\u0156\u015c\3\2\2"+
		"\2\u0157\u0158\f\3\2\2\u0158\u0159\t\13\2\2\u0159\u015b\5\"\22\4\u015a"+
		"\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d#\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0162\7{\2\2\u0160\u0161"+
		"\7\35\2\2\u0161\u0163\7{\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"%\3\2\2\2\u0164\u0165\5(\25\2\u0165\'\3\2\2\2\u0166\u0167\7/\2\2\u0167"+
		"\u0168\7\62\2\2\u0168\u016c\7\u0080\2\2\u0169\u016c\7x\2\2\u016a\u016c"+
		"\7y\2\2\u016b\u0166\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		")\3\2\2\2\u016d\u016e\7-\2\2\u016e\u016f\7j\2\2\u016f\u0170\5\22\n\2\u0170"+
		"\u0171\7p\2\2\u0171\u0172\5\26\f\2\u0172\u0173\7k\2\2\u0173+\3\2\2\2\u0174"+
		"\u0175\7.\2\2\u0175\u0176\7j\2\2\u0176\u0177\5\22\n\2\u0177\u0178\7p\2"+
		"\2\u0178\u0179\5\26\f\2\u0179\u017a\7k\2\2\u017a-\3\2\2\2\u017b\u017c"+
		"\7n\2\2\u017c\u017d\5\24\13\2\u017d\u017e\7p\2\2\u017e\u017f\5\26\f\2"+
		"\u017f\u0180\7o\2\2\u0180/\3\2\2\2\u0181\u0182\7\64\2\2\u0182\u0183\5"+
		"\26\f\2\u0183\61\3\2\2\2\u0184\u0185\7)\2\2\u0185\u0186\7\62\2\2\u0186"+
		"\u018b\5\22\n\2\u0187\u0188\7p\2\2\u0188\u018a\5\22\n\2\u0189\u0187\3"+
		"\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\63\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7*\2\2\u018f\u0190\7\62\2"+
		"\2\u0190\u0191\5\66\34\2\u0191\65\3\2\2\2\u0192\u0193\7{\2\2\u0193\u01a0"+
		"\5\30\r\2\u0194\u0195\7p\2\2\u0195\u0197\5\66\34\2\u0196\u0194\3\2\2\2"+
		"\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a1"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7Y\2\2\u019c\u019d\7j\2\2\u019d"+
		"\u019e\5\66\34\2\u019e\u019f\7k\2\2\u019f\u01a1\3\2\2\2\u01a0\u0198\3"+
		"\2\2\2\u01a0\u019b\3\2\2\2\u01a1\67\3\2\2\2\u01a2\u01a3\7+\2\2\u01a3\u01a4"+
		"\7\62\2\2\u01a4\u01a9\7\u0080\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a8\7\u0080"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa9\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7$\2\2\u01ad"+
		"\u01ae\7\62\2\2\u01ae\u01b3\5<\37\2\u01af\u01b0\7p\2\2\u01b0\u01b2\5<"+
		"\37\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4;\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5\22\n\2"+
		"\u01b7\u01b9\t\f\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9=\3"+
		"\2\2\2\u01ba\u01bd\7#\2\2\u01bb\u01bc\7x\2\2\u01bc\u01be\7p\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7x"+
		"\2\2\u01c0?\3\2\2\2\u01c1\u01c4\5B\"\2\u01c2\u01c4\5D#\2\u01c3\u01c1\3"+
		"\2\2\2\u01c3\u01c2\3\2\2\2\u01c4A\3\2\2\2\u01c5\u01c6\5\22\n\2\u01c6\u01c7"+
		"\7T\2\2\u01c7\u01c8\7\u0080\2\2\u01c8\u01c9\7\31\2\2\u01c9\u01ca\t\r\2"+
		"\2\u01ca\u01cb\7T\2\2\u01cb\u01cc\7\u0080\2\2\u01cc\u01cd\7\31\2\2\u01cd"+
		"\u01ce\7\67\2\2\u01ce\u01cf\7T\2\2\u01cf\u01d0\7\u0080\2\2\u01d0C\3\2"+
		"\2\2\u01d1\u01d2\5\22\n\2\u01d2\u01d3\7T\2\2\u01d3\u01d4\7\u0080\2\2\u01d4"+
		"\u01d5\7\31\2\2\u01d5\u01d6\7:\2\2\u01d6\u01d7\7T\2\2\u01d7\u01d8\7\u0080"+
		"\2\2\u01d8\u01d9\7\31\2\2\u01d9\u01da\7;\2\2\u01da\u01db\7T\2\2\u01db"+
		"\u01dc\7\u0080\2\2\u01dcE\3\2\2\2\62KNZ^aehkqz~\u0081\u008f\u0093\u0096"+
		"\u00a1\u00a6\u00af\u00b4\u00bc\u00bf\u00c2\u00c7\u00d3\u00d6\u00dd\u00e3"+
		"\u00fc\u011f\u0121\u0126\u012c\u0133\u013b\u0141\u014d\u0152\u015c\u0162"+
		"\u016b\u018b\u0198\u01a0\u01a9\u01b3\u01b8\u01bd\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}