package compiler;
// Generated from FishLanguage.g4 by ANTLR 4.7.1

import java.util.ArrayList;
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
	ArrayList<String> instructionStack = new ArrayList<String>();
	Stack<Integer> ifStack = new Stack<Integer>();
	Stack<Integer> elseStack = new Stack<Integer>();
	Stack<Integer> loopStack = new Stack<Integer>();
	int elseStart, temp, elseEnd, ifEnd, failNo = 0;
	
	
	int instructionNo = 0;
	
	@Override public void enterProgram(FishLanguageParser.ProgramContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" START FISHING");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(FishLanguageParser.ProgramContext ctx) {
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

		instructionNo++;
		instructionStack.add(instructionNo+" DECLARE " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { 
		instructionNo++;
		instructionStack.add(instructionNo+" PUSH " + ctx.IDENTIFIER());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(FishLanguageParser.AssignmentStatementContext ctx) { 
		instructionNo++;
		instructionStack.add(instructionNo+" ASSIGN ");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(FishLanguageParser.IfStatementContext ctx) { 
			
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(FishLanguageParser.IfStatementContext ctx) {
	elseStart = ifStack.pop();
	instructionStack.set(elseStart -1,  instructionStack.get(elseStart-1)+ instructionNo);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" IF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" ENDIF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseBlock(FishLanguageParser.ElseBlockContext ctx) { 
		instructionNo++;
		instructionStack.add(instructionNo+"ELSE ");
		elseStack.push(instructionNo);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseBlock(FishLanguageParser.ElseBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" ENDELSE");
		elseStack.push(instructionNo);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoopStatement(FishLanguageParser.LoopStatementContext ctx) {
		instructionNo++;
		instructionStack.add("LOOP"+instructionNo);
		loopStack.push(instructionNo);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoopStatement(FishLanguageParser.LoopStatementContext ctx) {
		instructionNo++;
		instructionStack.add("ENDLOOP"+instructionNo);
		loopStack.push(instructionNo);
	}
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
		instructionNo++;
		instructionStack.add(instructionNo+" DISPLAY ");
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
			instructionNo++;
			instructionStack.add(instructionNo+" GREATERTHANEQUAL");
		}
		else if(ctx.LTE()!= null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" LESSTHANEQUAL");
		}
		else if(ctx.NE()!= null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" NOTEQUAL");
		}
		else if(ctx.GT()!= null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" GREATERTHAN");
		}
		else if(ctx.LT()!= null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" LESSTHAN");
		}
	
		instructionNo++;
		ifStack.push(instructionNo);
		instructionStack.add(instructionNo+" FAILGOTO");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(FishLanguageParser.ExpressionContext ctx) { 
		if(ctx.IDENTIFIER()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" PUSH " + ctx.IDENTIFIER());
		}
		else if(ctx.NUMBER()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" PUSH " + ctx.NUMBER());
		}
		else if(ctx.BOOLEAN()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" PUSH " + ctx.BOOLEAN());
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
			instructionNo++;
			instructionStack.add(instructionNo+" ADD " + ctx.IDENTIFIER());
		}
		else if(ctx.SUBTRACT()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" SUBTRACT " + ctx.NUMBER());
		}
		else if(ctx.MULTIPLY()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" MULTIPLY " + ctx.BOOLEAN());
		}
		else if(ctx.DIVIDE()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" DIVIDE " + ctx.BOOLEAN());
		}
		else if(ctx.MOD()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" MOD " + ctx.BOOLEAN());
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
