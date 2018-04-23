package compiler;
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
		T__9=10, BOOLEAN=11, NUMBER=12, IDENTIFIER=13, DOLLAR=14, ASSIGNMENT=15, 
		MULTIPLY=16, DIVIDE=17, MOD=18, ADD=19, SUBTRACT=20, LBRACE=21, RBRACE=22, 
		EQUALS=23, GTE=24, LTE=25, NE=26, GT=27, LT=28, AND=29, STRING=30, OR=31, 
		NEWLINE=32;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_declarationStatement = 2, 
		RULE_assignmentStatement = 3, RULE_ifStatement = 4, RULE_ifBlock = 5, 
		RULE_elseBlock = 6, RULE_loopStatement = 7, RULE_writeStatement = 8, RULE_readStatement = 9, 
		RULE_booleanExpression = 10, RULE_expression = 11;
	public static final String[] ruleNames = {
		"program", "statements", "declarationStatement", "assignmentStatement", 
		"ifStatement", "ifBlock", "elseBlock", "loopStatement", "writeStatement", 
		"readStatement", "booleanExpression", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'endif'", "'if'", "':'", "'else'", 
		"'loop'", "'endloop'", "'write'", "'read'", null, null, null, "'$'", "'='", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'=='", "'>='", "'<='", 
		"'!='", "'>'", "'<'", "'&&'", null, "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
		"NUMBER", "IDENTIFIER", "DOLLAR", "ASSIGNMENT", "MULTIPLY", "DIVIDE", 
		"MOD", "ADD", "SUBTRACT", "LBRACE", "RBRACE", "EQUALS", "GTE", "LTE", 
		"NE", "GT", "LT", "AND", "STRING", "OR", "NEWLINE"
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
			setState(24);
			match(T__0);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				statements();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
			setState(30);
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
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(32);
				assignmentStatement();
				}
				break;
			case T__3:
				{
				setState(33);
				ifStatement();
				}
				break;
			case T__6:
				{
				setState(34);
				loopStatement();
				}
				break;
			case T__8:
				{
				setState(35);
				writeStatement();
				}
				break;
			case DOLLAR:
				{
				setState(36);
				declarationStatement();
				}
				break;
			case T__9:
				{
				setState(37);
				readStatement();
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
			setState(40);
			match(DOLLAR);
			setState(41);
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
			setState(43);
			match(IDENTIFIER);
			setState(44);
			match(ASSIGNMENT);
			setState(45);
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
			setState(47);
			ifBlock();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(48);
				elseBlock();
				}
			}

			setState(51);
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
			setState(53);
			match(T__3);
			setState(54);
			match(LBRACE);
			setState(55);
			booleanExpression(0);
			setState(56);
			match(RBRACE);
			setState(57);
			match(T__4);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				statements();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
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
			setState(63);
			match(T__5);
			setState(64);
			match(T__4);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				statements();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
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
			setState(70);
			match(T__6);
			setState(71);
			match(LBRACE);
			setState(72);
			booleanExpression(0);
			setState(73);
			match(RBRACE);
			setState(74);
			match(T__4);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				statements();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << IDENTIFIER) | (1L << DOLLAR))) != 0) );
			setState(80);
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
		public TerminalNode STRING() { return getToken(FishLanguageParser.STRING, 0); }
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__8);
				setState(83);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__8);
				setState(85);
				match(STRING);
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

	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitReadStatement(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
			setState(89);
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
		public TerminalNode AND() { return getToken(FishLanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(FishLanguageParser.OR, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(92);
				expression(0);
				setState(93);
				match(EQUALS);
				setState(94);
				expression(0);
				}
				break;
			case 2:
				{
				setState(96);
				expression(0);
				setState(97);
				match(GTE);
				setState(98);
				expression(0);
				}
				break;
			case 3:
				{
				setState(100);
				expression(0);
				setState(101);
				match(LTE);
				setState(102);
				expression(0);
				}
				break;
			case 4:
				{
				setState(104);
				expression(0);
				setState(105);
				match(NE);
				setState(106);
				expression(0);
				}
				break;
			case 5:
				{
				setState(108);
				expression(0);
				setState(109);
				match(GT);
				setState(110);
				expression(0);
				}
				break;
			case 6:
				{
				setState(112);
				expression(0);
				setState(113);
				match(LT);
				setState(114);
				expression(0);
				}
				break;
			case 7:
				{
				setState(116);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(AND);
						setState(121);
						booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						match(OR);
						setState(124);
						booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode STRING() { return getToken(FishLanguageParser.STRING, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(131);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				setState(132);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				setState(133);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(134);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				{
				setState(135);
				match(LBRACE);
				setState(136);
				expression(0);
				setState(137);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(142);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 10:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\64\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7>\n\7\r\7\16\7?\3\b\3\b\3\b\6\bE\n\b"+
		"\r\b\16\bF\3\t\3\t\3\t\3\t\3\t\3\t\6\tO\n\t\r\t\16\tP\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"x\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0080\n\f\f\f\16\f\u0083\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u0096\n\r\f\r\16\r\u0099\13\r\3\r\2\4\26\30\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\4\3\2\22\24\3\2\25\26\2\u00a7\2\32\3\2\2\2\4(\3\2\2\2\6*\3"+
		"\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2\2\16A\3\2\2\2\20H\3\2\2\2\22"+
		"X\3\2\2\2\24Z\3\2\2\2\26w\3\2\2\2\30\u008d\3\2\2\2\32\34\7\3\2\2\33\35"+
		"\5\4\3\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3"+
		"\2\2\2 !\7\4\2\2!\3\3\2\2\2\")\5\b\5\2#)\5\n\6\2$)\5\20\t\2%)\5\22\n\2"+
		"&)\5\6\4\2\')\5\24\13\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2"+
		"\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7\20\2\2+,\7\17\2\2,\7\3\2\2\2-.\7\17\2\2"+
		"./\7\21\2\2/\60\5\30\r\2\60\t\3\2\2\2\61\63\5\f\7\2\62\64\5\16\b\2\63"+
		"\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66\13\3\2\2\2\67"+
		"8\7\6\2\289\7\27\2\29:\5\26\f\2:;\7\30\2\2;=\7\7\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2AB\7\b\2\2BD\7\7\2\2CE\5\4"+
		"\3\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\17\3\2\2\2HI\7\t\2\2IJ\7"+
		"\27\2\2JK\5\26\f\2KL\7\30\2\2LN\7\7\2\2MO\5\4\3\2NM\3\2\2\2OP\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\n\2\2S\21\3\2\2\2TU\7\13\2\2UY\5\30"+
		"\r\2VW\7\13\2\2WY\7 \2\2XT\3\2\2\2XV\3\2\2\2Y\23\3\2\2\2Z[\7\f\2\2[\\"+
		"\7\17\2\2\\\25\3\2\2\2]^\b\f\1\2^_\5\30\r\2_`\7\31\2\2`a\5\30\r\2ax\3"+
		"\2\2\2bc\5\30\r\2cd\7\32\2\2de\5\30\r\2ex\3\2\2\2fg\5\30\r\2gh\7\33\2"+
		"\2hi\5\30\r\2ix\3\2\2\2jk\5\30\r\2kl\7\34\2\2lm\5\30\r\2mx\3\2\2\2no\5"+
		"\30\r\2op\7\35\2\2pq\5\30\r\2qx\3\2\2\2rs\5\30\r\2st\7\36\2\2tu\5\30\r"+
		"\2ux\3\2\2\2vx\7\r\2\2w]\3\2\2\2wb\3\2\2\2wf\3\2\2\2wj\3\2\2\2wn\3\2\2"+
		"\2wr\3\2\2\2wv\3\2\2\2x\u0081\3\2\2\2yz\f\5\2\2z{\7\37\2\2{\u0080\5\26"+
		"\f\6|}\f\4\2\2}~\7!\2\2~\u0080\5\26\f\5\177y\3\2\2\2\177|\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\27\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0085\b\r\1\2\u0085\u008e\7\16\2\2\u0086\u008e"+
		"\7\r\2\2\u0087\u008e\7 \2\2\u0088\u008e\7\17\2\2\u0089\u008a\7\27\2\2"+
		"\u008a\u008b\5\30\r\2\u008b\u008c\7\30\2\2\u008c\u008e\3\2\2\2\u008d\u0084"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u0097\3\2\2\2\u008f\u0090\f\t\2\2\u0090\u0091\t\2"+
		"\2\2\u0091\u0096\5\30\r\n\u0092\u0093\f\b\2\2\u0093\u0094\t\3\2\2\u0094"+
		"\u0096\5\30\r\t\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\17\36(\63?FPXw\177\u0081\u008d\u0095\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}