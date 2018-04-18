package compiler;
// Generated from FishLanguage.g4 by ANTLR 4.7.1

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link FishLanguageListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class FishLanguageBaseListener implements FishLanguageListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	Stack<String> ir = new Stack<String>();
	
	@Override public void enterProgram(FishLanguageParser.ProgramContext ctx) { 
		ir.push("START FISHING");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(FishLanguageParser.ProgramContext ctx) {
		ir.push("END FISHING");
	}
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
	@Override public void enterDeclarationStatement(FishLanguageParser.DeclarationStatementContext ctx) {}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationStatement(FishLanguageParser.DeclarationStatementContext ctx) { 
		ir.push("DECLARE " + ctx.IDENTIFIER() );
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { 
		ir.push("PUSH " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { 
		ir.push("LOAD ");
	}
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
	@Override public void enterIfBlock(FishLanguageParser.IfBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfBlock(FishLanguageParser.IfBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseBlock(FishLanguageParser.ElseBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseBlock(FishLanguageParser.ElseBlockContext ctx) { }
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
	@Override public void enterWriteStatement(FishLanguageParser.WriteStatementContext ctx) {}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWriteStatement(FishLanguageParser.WriteStatementContext ctx) { 
		ir.push("DISPLAY ");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx) { 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx) { 
		if(ctx.GTE()!=null)
		{
			ir.push("GREATERTHANEQUAL");
		}
		else if(ctx.LTE()!= null)
		{
			ir.push("LESSTHANEQUAL");
		}
		else if(ctx.NE()!= null)
		{
			ir.push("NOTEQUAL");
		}
		else if(ctx.GT()!= null)
		{
			ir.push("GREATERTHAN");
		}
		else if(ctx.LT()!= null)
		{
			ir.push("LESSTHAN");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(FishLanguageParser.ExpressionContext ctx) { 
		if(ctx.IDENTIFIER()!=null)
		{
			ir.add("PUSH " + ctx.IDENTIFIER());
		}
		else if(ctx.NUMBER()!=null)
		{
			ir.add("PUSH " + ctx.NUMBER());
		}
		else if(ctx.BOOLEAN()!=null)
		{
			ir.add("PUSH " + ctx.BOOLEAN());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(FishLanguageParser.ExpressionContext ctx) {
		if(ctx.ADD()!=null)
		{
			ir.add("ADD " + ctx.IDENTIFIER());
		}
		else if(ctx.SUBTRACT()!=null)
		{
			ir.add("SUBTRACT " + ctx.NUMBER());
		}
		else if(ctx.MULTIPLY()!=null)
		{
			ir.add("MULTIPLY " + ctx.BOOLEAN());
		}
		else if(ctx.DIVIDE()!=null)
		{
			ir.add("DIVIDE " + ctx.BOOLEAN());
		}
		else if(ctx.MOD()!=null)
		{
			ir.add("MOD " + ctx.BOOLEAN());
		}
	}

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