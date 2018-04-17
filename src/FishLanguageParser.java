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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, BOOLEAN=26, NUMBER=27, IDENTIFIER=28, FUNCTIONNAME=29, NEWLINE=30;
	public static final int
		RULE_program = 0, RULE_mainBlock = 1, RULE_block = 2, RULE_parametersHelp = 3, 
		RULE_declaration = 4, RULE_declarationHelp = 5, RULE_statements = 6, RULE_statementsHelp = 7, 
		RULE_assignmentStatement = 8, RULE_ifStatement = 9, RULE_loopStatement = 10, 
		RULE_writeStatement = 11, RULE_booleanExpression = 12, RULE_expression = 13, 
		RULE_term = 14, RULE_factor = 15;
	public static final String[] ruleNames = {
		"program", "mainBlock", "block", "parametersHelp", "declaration", "declarationHelp", 
		"statements", "statementsHelp", "assignmentStatement", "ifStatement", 
		"loopStatement", "writeStatement", "booleanExpression", "expression", 
		"term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'startFISH'", "'endFISH'", "'$'", "','", "'='", "'if'", "'('", 
		"')'", "':'", "'else'", "'endif'", "'loop'", "'endloop'", "'write'", "'=='", 
		"'>='", "'<='", "'!='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "BOOLEAN", "NUMBER", "IDENTIFIER", "FUNCTIONNAME", "NEWLINE"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			mainBlock();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			block();
			setState(36);
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaration();
				setState(39);
				statements();
				}
				break;
			case T__5:
			case T__11:
			case T__13:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				statements();
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

	public static class ParametersHelpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public ParametersHelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersHelp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterParametersHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitParametersHelp(this);
		}
	}

	public final ParametersHelpContext parametersHelp() throws RecognitionException {
		ParametersHelpContext _localctx = new ParametersHelpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametersHelp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationHelpContext declarationHelp() {
			return getRuleContext(DeclarationHelpContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				declarationHelp();
				setState(48);
				match(T__3);
				setState(49);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				declarationHelp();
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

	public static class DeclarationHelpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(FishLanguageParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(FishLanguageParser.BOOLEAN, 0); }
		public DeclarationHelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationHelp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterDeclarationHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitDeclarationHelp(this);
		}
	}

	public final DeclarationHelpContext declarationHelp() throws RecognitionException {
		DeclarationHelpContext _localctx = new DeclarationHelpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationHelp);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__2);
				setState(55);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__2);
				setState(57);
				match(IDENTIFIER);
				setState(58);
				match(T__4);
				setState(59);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__2);
				setState(61);
				match(IDENTIFIER);
				setState(62);
				match(T__4);
				setState(63);
				match(BOOLEAN);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsHelpContext statementsHelp() {
			return getRuleContext(StatementsHelpContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				statementsHelp();
				setState(67);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				statementsHelp();
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

	public static class StatementsHelpContext extends ParserRuleContext {
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
		public StatementsHelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementsHelp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterStatementsHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitStatementsHelp(this);
		}
	}

	public final StatementsHelpContext statementsHelp() throws RecognitionException {
		StatementsHelpContext _localctx = new StatementsHelpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementsHelp);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				assignmentStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				ifStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				loopStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				writeStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(T__4);
			setState(80);
			expression();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(83);
			match(T__6);
			setState(84);
			booleanExpression();
			setState(85);
			match(T__7);
			setState(86);
			match(T__8);
			setState(87);
			block();
			setState(88);
			match(T__9);
			setState(89);
			match(T__8);
			setState(90);
			block();
			setState(91);
			match(T__10);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 20, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__11);
			setState(94);
			match(T__6);
			setState(95);
			booleanExpression();
			setState(96);
			match(T__7);
			setState(97);
			match(T__8);
			setState(98);
			block();
			setState(99);
			match(T__12);
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
		enterRule(_localctx, 22, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__13);
			setState(102);
			expression();
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
		public TerminalNode BOOLEAN() { return getToken(FishLanguageParser.BOOLEAN, 0); }
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
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanExpression);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				expression();
				setState(105);
				match(T__14);
				setState(106);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				expression();
				setState(109);
				match(T__15);
				setState(110);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				expression();
				setState(113);
				match(T__16);
				setState(114);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				expression();
				setState(117);
				match(T__17);
				setState(118);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				expression();
				setState(121);
				match(T__18);
				setState(122);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				expression();
				setState(125);
				match(T__19);
				setState(126);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(BOOLEAN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				term();
				setState(132);
				match(T__20);
				setState(133);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				term();
				setState(136);
				match(T__21);
				setState(137);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				factor();
				setState(143);
				match(T__22);
				setState(144);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				factor();
				setState(147);
				match(T__23);
				setState(148);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				factor();
				setState(151);
				match(T__24);
				setState(152);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(FishLanguageParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FishLanguageParser.IDENTIFIER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FishLanguageListener ) ((FishLanguageListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__6);
				setState(158);
				expression();
				setState(159);
				match(T__7);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\67\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b\3\b"+
		"\3\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0084\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u008f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u009e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a6\n\21\3"+
		"\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00ac\2\"\3\2"+
		"\2\2\4$\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n\66\3\2\2\2\fB\3\2\2\2\16H\3\2"+
		"\2\2\20N\3\2\2\2\22P\3\2\2\2\24T\3\2\2\2\26_\3\2\2\2\30g\3\2\2\2\32\u0083"+
		"\3\2\2\2\34\u008e\3\2\2\2\36\u009d\3\2\2\2 \u00a5\3\2\2\2\"#\5\4\3\2#"+
		"\3\3\2\2\2$%\7\3\2\2%&\5\6\4\2&\'\7\4\2\2\'\5\3\2\2\2()\5\n\6\2)*\5\16"+
		"\b\2*-\3\2\2\2+-\5\16\b\2,(\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7\5\2\2/\60"+
		"\7\36\2\2\60\t\3\2\2\2\61\62\5\f\7\2\62\63\7\6\2\2\63\64\5\n\6\2\64\67"+
		"\3\2\2\2\65\67\5\f\7\2\66\61\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\289\7\5"+
		"\2\29C\7\36\2\2:;\7\5\2\2;<\7\36\2\2<=\7\7\2\2=C\7\35\2\2>?\7\5\2\2?@"+
		"\7\36\2\2@A\7\7\2\2AC\7\34\2\2B8\3\2\2\2B:\3\2\2\2B>\3\2\2\2C\r\3\2\2"+
		"\2DE\5\20\t\2EF\5\16\b\2FI\3\2\2\2GI\5\20\t\2HD\3\2\2\2HG\3\2\2\2I\17"+
		"\3\2\2\2JO\5\22\n\2KO\5\24\13\2LO\5\26\f\2MO\5\30\r\2NJ\3\2\2\2NK\3\2"+
		"\2\2NL\3\2\2\2NM\3\2\2\2O\21\3\2\2\2PQ\7\36\2\2QR\7\7\2\2RS\5\34\17\2"+
		"S\23\3\2\2\2TU\7\b\2\2UV\7\t\2\2VW\5\32\16\2WX\7\n\2\2XY\7\13\2\2YZ\5"+
		"\6\4\2Z[\7\f\2\2[\\\7\13\2\2\\]\5\6\4\2]^\7\r\2\2^\25\3\2\2\2_`\7\16\2"+
		"\2`a\7\t\2\2ab\5\32\16\2bc\7\n\2\2cd\7\13\2\2de\5\6\4\2ef\7\17\2\2f\27"+
		"\3\2\2\2gh\7\20\2\2hi\5\34\17\2i\31\3\2\2\2jk\5\34\17\2kl\7\21\2\2lm\5"+
		"\34\17\2m\u0084\3\2\2\2no\5\34\17\2op\7\22\2\2pq\5\34\17\2q\u0084\3\2"+
		"\2\2rs\5\34\17\2st\7\23\2\2tu\5\34\17\2u\u0084\3\2\2\2vw\5\34\17\2wx\7"+
		"\24\2\2xy\5\34\17\2y\u0084\3\2\2\2z{\5\34\17\2{|\7\25\2\2|}\5\34\17\2"+
		"}\u0084\3\2\2\2~\177\5\34\17\2\177\u0080\7\26\2\2\u0080\u0081\5\34\17"+
		"\2\u0081\u0084\3\2\2\2\u0082\u0084\7\34\2\2\u0083j\3\2\2\2\u0083n\3\2"+
		"\2\2\u0083r\3\2\2\2\u0083v\3\2\2\2\u0083z\3\2\2\2\u0083~\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\33\3\2\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\27"+
		"\2\2\u0087\u0088\5\34\17\2\u0088\u008f\3\2\2\2\u0089\u008a\5\36\20\2\u008a"+
		"\u008b\7\30\2\2\u008b\u008c\5\34\17\2\u008c\u008f\3\2\2\2\u008d\u008f"+
		"\5\36\20\2\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\35\3\2\2\2\u0090\u0091\5 \21\2\u0091\u0092\7\31\2\2\u0092\u0093"+
		"\5\36\20\2\u0093\u009e\3\2\2\2\u0094\u0095\5 \21\2\u0095\u0096\7\32\2"+
		"\2\u0096\u0097\5\36\20\2\u0097\u009e\3\2\2\2\u0098\u0099\5 \21\2\u0099"+
		"\u009a\7\33\2\2\u009a\u009b\5\36\20\2\u009b\u009e\3\2\2\2\u009c\u009e"+
		"\5 \21\2\u009d\u0090\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\37\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0\u00a1\5\34\17"+
		"\2\u00a1\u00a2\7\n\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a6\7\35\2\2\u00a4"+
		"\u00a6\7\36\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3"+
		"\2\2\2\u00a6!\3\2\2\2\13,\66BHN\u0083\u008e\u009d\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}