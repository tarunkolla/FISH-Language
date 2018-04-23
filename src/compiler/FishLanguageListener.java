package compiler;
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
	 * Enter a parse tree produced by {@link FishLanguageParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(FishLanguageParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(FishLanguageParser.DeclarationStatementContext ctx);
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
	 * Enter a parse tree produced by {@link FishLanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(FishLanguageParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(FishLanguageParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FishLanguageParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(FishLanguageParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(FishLanguageParser.ElseBlockContext ctx);
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
	 * Enter a parse tree produced by {@link FishLanguageParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(FishLanguageParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FishLanguageParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(FishLanguageParser.ReadStatementContext ctx);
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
}