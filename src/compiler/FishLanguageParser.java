// Generated from FishLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FishLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOLEAN=10, BINARY=11, NUMBER=12, IDENTIFIER=13, DOLLAR=14, ASSIGNMENT=15, 
		MULTIPLY=16, DIVIDE=17, MOD=18, ADD=19, SUBTRACT=20, LBRACE=21, RBRACE=22, 
		EQUALS=23, GTE=24, LTE=25, NE=26, GT=27, LT=28, BOR=29, BAND=30, NEWLINE=31;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_declarationStatement = 2, 
		RULE_assignmentStatement = 3, RULE_ifStatement = 4, RULE_ifBlock = 5, 
		RULE_elseBlock = 6, RULE_loopStatement = 7, RULE_writeStatement = 8, RULE_booleanExpression = 9, 
		RULE_expression = 10;
	public static final String[] ruleNames = {
		"program", "statements", "declarationStatement", "assignmentStatement", 
		"ifStatement", "ifBlock", "elseBlock", "loopStatement", "writeStatement", 
		"booleanExpression", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'endif'", "'if'", "':'", "'else'", 
		"'loop'", "'endloop'", "'write'", null, null, null, null, "'$'", "'='", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'=='", "'>='", "'<='", 
		"'!='", "'>'", "'<'", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
		"BINARY", "NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", 
		"DIVIDE", "MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", 
		"LTE", "NE", "GT", "LT", "BOR", "BAND", "NEWLINE"
	};
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
	public String getGrammarFileName() { return "FishLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FishLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				statements();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
			setState(28);
			match(T__1);
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

	public static class StatementsContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(30);
				assignmentStatement();
				}
				break;
			case T__3:
				{
				setState(31);
				ifStatement();
				}
				break;
			case T__6:
				{
				setState(32);
				loopStatement();
				}
				break;
			case T__8:
				{
				setState(33);
				writeStatement();
				}
				break;
			case DOLLAR:
				{
				setState(34);
				declarationStatement();
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(FishLanguageParser.DOLLAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(DOLLAR);
			setState(38);
			match(IDENTIFIER);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(FishLanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(ASSIGNMENT);
			setState(42);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			ifBlock();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(45);
				elseBlock();
				}
			}

			setState(48);
			match(T__2);
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FishLanguageParser.LBRACE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FishLanguageParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			match(LBRACE);
			setState(52);
			booleanExpression(0);
			setState(53);
			match(RBRACE);
			setState(54);
			match(T__4);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				statements();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
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

	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			match(T__4);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				statements();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FishLanguageParser.LBRACE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FishLanguageParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			match(LBRACE);
			setState(69);
			booleanExpression(0);
			setState(70);
			match(RBRACE);
			setState(71);
			match(T__4);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				statements();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
			setState(77);
			match(T__7);
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

	public static class WriteStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__8);
			setState(80);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(FishLanguageParser.EQUALS, 0); }
		public TerminalNode GTE() { return getToken(FishLanguageParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(FishLanguageParser.LTE, 0); }
		public TerminalNode NE() { return getToken(FishLanguageParser.NE, 0); }
		public TerminalNode GT() { return getToken(FishLanguageParser.GT, 0); }
		public TerminalNode LT() { return getToken(FishLanguageParser.LT, 0); }
		public TerminalNode BOOLEAN() { return getToken(FishLanguageParser.BOOLEAN, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode BINARY() { return getToken(FishLanguageParser.BINARY, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(83);
				expression(0);
				setState(84);
				match(EQUALS);
				setState(85);
				expression(0);
				}
				break;
			case 2:
				{
				setState(87);
				expression(0);
				setState(88);
				match(GTE);
				setState(89);
				expression(0);
				}
				break;
			case 3:
				{
				setState(91);
				expression(0);
				setState(92);
				match(LTE);
				setState(93);
				expression(0);
				}
				break;
			case 4:
				{
				setState(95);
				expression(0);
				setState(96);
				match(NE);
				setState(97);
				expression(0);
				}
				break;
			case 5:
				{
				setState(99);
				expression(0);
				setState(100);
				match(GT);
				setState(101);
				expression(0);
				}
				break;
			case 6:
				{
				setState(103);
				expression(0);
				setState(104);
				match(LT);
				setState(105);
				expression(0);
				}
				break;
			case 7:
				{
				setState(107);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
					setState(110);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(111);
					match(BINARY);
					setState(112);
					booleanExpression(9);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FishLanguageParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(FishLanguageParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(FishLanguageParser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(FishLanguageParser.RBRACE, 0); }
		public TerminalNode MULTIPLY() { return getToken(FishLanguageParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(FishLanguageParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(FishLanguageParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(FishLanguageParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(FishLanguageParser.SUBTRACT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitExpression(this);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(119);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				setState(120);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				{
				setState(121);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(122);
				match(LBRACE);
				setState(123);
				expression(0);
				setState(124);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\61\n\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7;\n\7\r\7\16\7<\3\b\3\b\3\b\6\bB\n\b\r\b\16\bC\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\6\tL\n\t\r\t\16\tM\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\13\3\13"+
		"\3\13\7\13t\n\13\f\13\16\13w\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0081\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3"+
		"\f\2\4\24\26\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\22\24\3\2\25\26\2\u0097"+
		"\2\30\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b*\3\2\2\2\n.\3\2\2\2\f\64\3\2\2"+
		"\2\16>\3\2\2\2\20E\3\2\2\2\22Q\3\2\2\2\24n\3\2\2\2\26\u0080\3\2\2\2\30"+
		"\32\7\3\2\2\31\33\5\4\3\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\36\3\2\2\2\36\37\7\4\2\2\37\3\3\2\2\2 &\5\b\5\2!&\5\n\6"+
		"\2\"&\5\20\t\2#&\5\22\n\2$&\5\6\4\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3"+
		"\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\7\20\2\2()\7\17\2\2)\7\3\2\2\2*+\7\17\2"+
		"\2+,\7\21\2\2,-\5\26\f\2-\t\3\2\2\2.\60\5\f\7\2/\61\5\16\b\2\60/\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\5\2\2\63\13\3\2\2\2\64\65\7\6\2"+
		"\2\65\66\7\27\2\2\66\67\5\24\13\2\678\7\30\2\28:\7\7\2\29;\5\4\3\2:9\3"+
		"\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2>?\7\b\2\2?A\7\7\2\2@B"+
		"\5\4\3\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\17\3\2\2\2EF\7\t\2\2"+
		"FG\7\27\2\2GH\5\24\13\2HI\7\30\2\2IK\7\7\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\n\2\2P\21\3\2\2\2QR\7\13\2\2RS"+
		"\5\26\f\2S\23\3\2\2\2TU\b\13\1\2UV\5\26\f\2VW\7\31\2\2WX\5\26\f\2Xo\3"+
		"\2\2\2YZ\5\26\f\2Z[\7\32\2\2[\\\5\26\f\2\\o\3\2\2\2]^\5\26\f\2^_\7\33"+
		"\2\2_`\5\26\f\2`o\3\2\2\2ab\5\26\f\2bc\7\34\2\2cd\5\26\f\2do\3\2\2\2e"+
		"f\5\26\f\2fg\7\35\2\2gh\5\26\f\2ho\3\2\2\2ij\5\26\f\2jk\7\36\2\2kl\5\26"+
		"\f\2lo\3\2\2\2mo\7\f\2\2nT\3\2\2\2nY\3\2\2\2n]\3\2\2\2na\3\2\2\2ne\3\2"+
		"\2\2ni\3\2\2\2nm\3\2\2\2ou\3\2\2\2pq\f\n\2\2qr\7\r\2\2rt\5\24\13\13sp"+
		"\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wu\3\2\2\2xy\b\f\1\2"+
		"y\u0081\7\16\2\2z\u0081\7\f\2\2{\u0081\7\17\2\2|}\7\27\2\2}~\5\26\f\2"+
		"~\177\7\30\2\2\177\u0081\3\2\2\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0080{"+
		"\3\2\2\2\u0080|\3\2\2\2\u0081\u008a\3\2\2\2\u0082\u0083\f\b\2\2\u0083"+
		"\u0084\t\2\2\2\u0084\u0089\5\26\f\t\u0085\u0086\f\7\2\2\u0086\u0087\t"+
		"\3\2\2\u0087\u0089\5\26\f\b\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\27\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\r\34%\60<CMnu\u0080\u0088\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}