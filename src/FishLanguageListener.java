// Generated from FishLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FishLanguageParser}.
 */
public interface FishLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FishLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FishLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(FishLanguageParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(FishLanguageParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FishLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FishLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#parametersHelp}.
	 * @param ctx the parse tree
	 */
	void enterParametersHelp(FishLanguageParser.ParametersHelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#parametersHelp}.
	 * @param ctx the parse tree
	 */
	void exitParametersHelp(FishLanguageParser.ParametersHelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FishLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FishLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#declarationHelp}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationHelp(FishLanguageParser.DeclarationHelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#declarationHelp}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationHelp(FishLanguageParser.DeclarationHelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(FishLanguageParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(FishLanguageParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#statementsHelp}.
	 * @param ctx the parse tree
	 */
	void enterStatementsHelp(FishLanguageParser.StatementsHelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#statementsHelp}.
	 * @param ctx the parse tree
	 */
	void exitStatementsHelp(FishLanguageParser.StatementsHelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FishLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FishLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(FishLanguageParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(FishLanguageParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(FishLanguageParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(FishLanguageParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FishLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FishLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FishLanguageParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FishLanguageParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FishLanguageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FishLanguageParser.FactorContext ctx);
}