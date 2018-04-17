import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FishLanguageNewListener extends FishLanguageBaseListener {
	
	//int flag = 0;
	Stack<String> fishStack;
	StringBuilder fishSB = new StringBuilder();
	
	public FishLanguageNewListener() {
		fishStack = new Stack<String>();
	}
	
	
	@Override public void enterProgram(FishLanguageParser.ProgramContext ctx) { 
		
		fishStack.push("StartFISH");
		super.enterProgram(ctx);
		
	}

	@Override public void exitProgram(FishLanguageParser.ProgramContext ctx) {
		
		fishStack.push("EndFISH");
		super.exitProgram(ctx);
		
	}

	@Override public void enterMainBlock(FishLanguageParser.MainBlockContext ctx) { 
		super.enterMainBlock(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMainBlock(FishLanguageParser.MainBlockContext ctx) {
		super.exitMainBlock(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(FishLanguageParser.BlockContext ctx) {
		super.enterBlock(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(FishLanguageParser.BlockContext ctx) { 
		super.exitBlock(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParametersHelp(FishLanguageParser.ParametersHelpContext ctx) {
		

		super.enterParametersHelp(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParametersHelp(FishLanguageParser.ParametersHelpContext ctx) { 
		super.exitParametersHelp(ctx);
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaration(FishLanguageParser.DeclarationContext ctx) {
		
		fishStack.push("Declare" + ctx.getText());
		super.enterDeclaration(ctx);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaration(FishLanguageParser.DeclarationContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarationHelp(FishLanguageParser.DeclarationHelpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationHelp(FishLanguageParser.DeclarationHelpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatements(FishLanguageParser.StatementsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatements(FishLanguageParser.StatementsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementsHelp(FishLanguageParser.StatementsHelpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementsHelp(FishLanguageParser.StatementsHelpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(FishLanguageParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(FishLanguageParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoopStatement(FishLanguageParser.LoopStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoopStatement(FishLanguageParser.LoopStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWriteStatement(FishLanguageParser.WriteStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWriteStatement(FishLanguageParser.WriteStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(FishLanguageParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(FishLanguageParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(FishLanguageParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(FishLanguageParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(FishLanguageParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(FishLanguageParser.FactorContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

}
