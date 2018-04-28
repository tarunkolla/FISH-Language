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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOLEAN=15, SUBTRACT=16, 
		NUMBER=17, REAL=18, IDENTIFIER=19, DOLLAR=20, ASSIGNMENT=21, MULTIPLY=22, 
		DIVIDE=23, MOD=24, ADD=25, LBRACE=26, RBRACE=27, EQUALS=28, GTE=29, LTE=30, 
		NE=31, GT=32, LT=33, AND=34, STRING=35, OR=36, FUNCNAME=37, NEWLINE=38;
	public static final int
		RULE_program = 0, RULE_mainBlock = 1, RULE_statements = 2, RULE_declarationStatement = 3, 
		RULE_functions = 4, RULE_parameters = 5, RULE_functionCallStatement = 6, 
		RULE_arguments = 7, RULE_returnStatement = 8, RULE_assignmentStatement = 9, 
		RULE_ifStatement = 10, RULE_ifBlock = 11, RULE_elseBlock = 12, RULE_loopStatement = 13, 
		RULE_writeStatement = 14, RULE_readStatement = 15, RULE_booleanExpression = 16, 
		RULE_expression = 17;
	public static final String[] ruleNames = {
		"program", "mainBlock", "statements", "declarationStatement", "functions", 
		"parameters", "functionCallStatement", "arguments", "returnStatement", 
		"assignmentStatement", "ifStatement", "ifBlock", "elseBlock", "loopStatement", 
		"writeStatement", "readStatement", "booleanExpression", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'fun'", "':'", "'endfun'", "','", "'return'", 
		"'endif'", "'if'", "'else'", "'loop'", "'endloop'", "'write'", "'read'", 
		null, "'-'", null, null, null, "'$'", "'='", "'*'", "'/'", "'%'", "'+'", 
		"'('", "')'", "'=='", "'>='", "'<='", "'!='", "'>'", "'<'", "'&&'", null, 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOLEAN", "SUBTRACT", "NUMBER", "REAL", "IDENTIFIER", 
		"DOLLAR", "ASSIGNMENT", "MULTIPLY", "DIVIDE", "MOD", "ADD", "LBRACE", 
		"RBRACE", "EQUALS", "GTE", "LTE", "NE", "GT", "LT", "AND", "STRING", "OR", 
		"FUNCNAME", "NEWLINE"
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
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public List<FunctionsContext> functions() {
			return getRuleContexts(FunctionsContext.class);
		}
		public FunctionsContext functions(int i) {
			return getRuleContext(FunctionsContext.class,i);
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
			setState(36);
			mainBlock();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(37);
				functions();
				}
				}
				setState(42);
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

	public static class MainBlockContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitMainBlock(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				statements();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER) | (1L << DOLLAR) | (1L << FUNCNAME))) != 0) );
			setState(49);
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
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 4, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(51);
				assignmentStatement();
				}
				break;
			case T__8:
				{
				setState(52);
				ifStatement();
				}
				break;
			case T__10:
				{
				setState(53);
				loopStatement();
				}
				break;
			case T__12:
				{
				setState(54);
				writeStatement();
				}
				break;
			case DOLLAR:
				{
				setState(55);
				declarationStatement();
				}
				break;
			case T__13:
				{
				setState(56);
				readStatement();
				}
				break;
			case FUNCNAME:
				{
				setState(57);
				functionCallStatement();
				}
				break;
			case T__6:
				{
				setState(58);
				returnStatement();
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
		enterRule(_localctx, 6, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(DOLLAR);
			setState(62);
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

	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCNAME() { return getToken(FishLanguageParser.FUNCNAME, 0); }
		public TerminalNode LBRACE() { return getToken(FishLanguageParser.LBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FishLanguageParser.RBRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			match(FUNCNAME);
			setState(66);
			match(LBRACE);
			setState(67);
			parameters();
			setState(68);
			match(RBRACE);
			setState(69);
			match(T__3);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statements();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER) | (1L << DOLLAR) | (1L << FUNCNAME))) != 0) );
			setState(75);
			match(T__4);
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(FishLanguageParser.DOLLAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			match(DOLLAR);
			setState(78);
			match(IDENTIFIER);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(80);
				match(T__5);
				setState(81);
				parameters();
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode FUNCNAME() { return getToken(FishLanguageParser.FUNCNAME, 0); }
		public TerminalNode LBRACE() { return getToken(FishLanguageParser.LBRACE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FishLanguageParser.RBRACE, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FUNCNAME);
			setState(85);
			match(LBRACE);
			setState(86);
			arguments();
			setState(87);
			match(RBRACE);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			expression(0);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(90);
				match(T__5);
				setState(91);
				arguments();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__6);
			setState(95);
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
		enterRule(_localctx, 18, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(ASSIGNMENT);
			setState(99);
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
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			ifBlock();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(102);
				elseBlock();
				}
			}

			setState(105);
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
		enterRule(_localctx, 22, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__8);
			setState(108);
			match(LBRACE);
			setState(109);
			booleanExpression(0);
			setState(110);
			match(RBRACE);
			setState(111);
			match(T__3);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				statements();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER) | (1L << DOLLAR) | (1L << FUNCNAME))) != 0) );
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
		enterRule(_localctx, 24, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			match(T__3);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				statements();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER) | (1L << DOLLAR) | (1L << FUNCNAME))) != 0) );
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
		enterRule(_localctx, 26, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__10);
			setState(125);
			match(LBRACE);
			setState(126);
			booleanExpression(0);
			setState(127);
			match(RBRACE);
			setState(128);
			match(T__3);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				statements();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER) | (1L << DOLLAR) | (1L << FUNCNAME))) != 0) );
			setState(134);
			match(T__11);
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
		enterRule(_localctx, 28, RULE_writeStatement);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__12);
				setState(137);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__12);
				setState(139);
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
		enterRule(_localctx, 30, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__13);
			setState(143);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(146);
				expression(0);
				setState(147);
				match(EQUALS);
				setState(148);
				expression(0);
				}
				break;
			case 2:
				{
				setState(150);
				expression(0);
				setState(151);
				match(GTE);
				setState(152);
				expression(0);
				}
				break;
			case 3:
				{
				setState(154);
				expression(0);
				setState(155);
				match(LTE);
				setState(156);
				expression(0);
				}
				break;
			case 4:
				{
				setState(158);
				expression(0);
				setState(159);
				match(NE);
				setState(160);
				expression(0);
				}
				break;
			case 5:
				{
				setState(162);
				expression(0);
				setState(163);
				match(GT);
				setState(164);
				expression(0);
				}
				break;
			case 6:
				{
				setState(166);
				expression(0);
				setState(167);
				match(LT);
				setState(168);
				expression(0);
				}
				break;
			case 7:
				{
				setState(170);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(AND);
						setState(175);
						booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(OR);
						setState(178);
						booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode REAL() { return getToken(FishLanguageParser.REAL, 0); }
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(185);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				setState(186);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				setState(187);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				setState(188);
				match(IDENTIFIER);
				}
				break;
			case REAL:
				{
				setState(189);
				match(REAL);
				}
				break;
			case FUNCNAME:
				{
				setState(190);
				functionCallStatement();
				}
				break;
			case LBRACE:
				{
				setState(191);
				match(LBRACE);
				setState(192);
				expression(0);
				setState(193);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(198);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==SUBTRACT || _la==ADD) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 16:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 17:
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
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\6\3\60\n\3\r\3\16\3"+
		"\61\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6J\n\6\r\6\16\6K\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7U\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\5\fj\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\6\rt\n"+
		"\r\r\r\16\ru\3\16\3\16\3\16\6\16{\n\16\r\16\16\16|\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\6\17\u0085\n\17\r\17\16\17\u0086\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\5\20\u008f\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00ae\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00b6\n\22\f\22\16\22\u00b9\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00c6\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23\3\23\2\4\"$\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\4\3\2\30\32\4\2\22\22\33\33\2\u00e1\2&"+
		"\3\2\2\2\4-\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nB\3\2\2\2\fO\3\2\2\2\16V\3"+
		"\2\2\2\20[\3\2\2\2\22`\3\2\2\2\24c\3\2\2\2\26g\3\2\2\2\30m\3\2\2\2\32"+
		"w\3\2\2\2\34~\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u00ad\3\2\2\2"+
		"$\u00c5\3\2\2\2&*\5\4\3\2\')\5\n\6\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+"+
		"\3\2\2\2+\3\3\2\2\2,*\3\2\2\2-/\7\3\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\4\2\2\64\5\3\2"+
		"\2\2\65>\5\24\13\2\66>\5\26\f\2\67>\5\34\17\28>\5\36\20\29>\5\b\5\2:>"+
		"\5 \21\2;>\5\16\b\2<>\5\22\n\2=\65\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3"+
		"\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?@\7\26\2\2@"+
		"A\7\25\2\2A\t\3\2\2\2BC\7\5\2\2CD\7\'\2\2DE\7\34\2\2EF\5\f\7\2FG\7\35"+
		"\2\2GI\7\6\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\7\7\2\2N\13\3\2\2\2OP\7\26\2\2PQ\7\25\2\2QT\3\2\2\2RS\7\b\2\2S"+
		"U\5\f\7\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VW\7\'\2\2WX\7\34\2\2XY\5\20\t"+
		"\2YZ\7\35\2\2Z\17\3\2\2\2[^\5$\23\2\\]\7\b\2\2]_\5\20\t\2^\\\3\2\2\2^"+
		"_\3\2\2\2_\21\3\2\2\2`a\7\t\2\2ab\5$\23\2b\23\3\2\2\2cd\7\25\2\2de\7\27"+
		"\2\2ef\5$\23\2f\25\3\2\2\2gi\5\30\r\2hj\5\32\16\2ih\3\2\2\2ij\3\2\2\2"+
		"jk\3\2\2\2kl\7\n\2\2l\27\3\2\2\2mn\7\13\2\2no\7\34\2\2op\5\"\22\2pq\7"+
		"\35\2\2qs\7\6\2\2rt\5\6\4\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\31"+
		"\3\2\2\2wx\7\f\2\2xz\7\6\2\2y{\5\6\4\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|"+
		"}\3\2\2\2}\33\3\2\2\2~\177\7\r\2\2\177\u0080\7\34\2\2\u0080\u0081\5\""+
		"\22\2\u0081\u0082\7\35\2\2\u0082\u0084\7\6\2\2\u0083\u0085\5\6\4\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\16\2\2\u0089\35\3\2\2\2\u008a\u008b"+
		"\7\17\2\2\u008b\u008f\5$\23\2\u008c\u008d\7\17\2\2\u008d\u008f\7%\2\2"+
		"\u008e\u008a\3\2\2\2\u008e\u008c\3\2\2\2\u008f\37\3\2\2\2\u0090\u0091"+
		"\7\20\2\2\u0091\u0092\7\25\2\2\u0092!\3\2\2\2\u0093\u0094\b\22\1\2\u0094"+
		"\u0095\5$\23\2\u0095\u0096\7\36\2\2\u0096\u0097\5$\23\2\u0097\u00ae\3"+
		"\2\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\37\2\2\u009a\u009b\5$\23\2\u009b"+
		"\u00ae\3\2\2\2\u009c\u009d\5$\23\2\u009d\u009e\7 \2\2\u009e\u009f\5$\23"+
		"\2\u009f\u00ae\3\2\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7!\2\2\u00a2\u00a3"+
		"\5$\23\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\"\2\2\u00a6"+
		"\u00a7\5$\23\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\7#"+
		"\2\2\u00aa\u00ab\5$\23\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\7\21\2\2\u00ad"+
		"\u0093\3\2\2\2\u00ad\u0098\3\2\2\2\u00ad\u009c\3\2\2\2\u00ad\u00a0\3\2"+
		"\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b7\3\2\2\2\u00af\u00b0\f\5\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b6\5\""+
		"\22\6\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b6\5\"\22\5\u00b5"+
		"\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb"+
		"\b\23\1\2\u00bb\u00c6\7\23\2\2\u00bc\u00c6\7\21\2\2\u00bd\u00c6\7%\2\2"+
		"\u00be\u00c6\7\25\2\2\u00bf\u00c6\7\24\2\2\u00c0\u00c6\5\16\b\2\u00c1"+
		"\u00c2\7\34\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\35\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\f\13\2\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\u00ce\5$\23\f\u00ca\u00cb\f\n\2\2\u00cb\u00cc\t\3\2\2\u00cc\u00ce\5$"+
		"\23\13\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\23*\61=KT^iu|\u0086\u008e\u00ad\u00b5\u00b7\u00c5\u00cd\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}