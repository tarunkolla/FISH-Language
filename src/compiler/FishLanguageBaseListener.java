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
	Stack<Integer> loopStart = new Stack<Integer>();
	int ifNext, elseNext, temp,temp1 = 0;
	
	
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
		instructionNo++;
		instructionStack.add(instructionNo+" END FISHING");
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
	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" STARTIF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" ENDIFGOTO ");
		ifNext = ifStack.pop();
		int temp = instructionNo + 1;
		elseStack.push(instructionNo);
		instructionStack.set(ifNext -1,  instructionStack.get(ifNext-1)+temp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElseBlock(FishLanguageParser.ElseBlockContext ctx) { 
		instructionNo++;
		instructionStack.add(instructionNo+" STARTELSE");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElseBlock(FishLanguageParser.ElseBlockContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" ENDELSE");
		elseNext = elseStack.pop();
		int temp = instructionNo + 1;
		instructionStack.set(elseNext-1, instructionStack.get(elseNext-1)+temp);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoopStatement(FishLanguageParser.LoopStatementContext ctx) {
		instructionNo++;
		loopStart.push(instructionNo);
		instructionStack.add(instructionNo+" LOOP");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoopStatement(FishLanguageParser.LoopStatementContext ctx) {
		instructionNo++;
		temp = loopStart.pop();
		instructionStack.add(instructionNo+" GOTO "+temp);
		instructionNo++;
		instructionStack.add(instructionNo+" ENDLOOP");
		temp = loopStack.pop();
		temp1 = instructionNo;
		instructionStack.set(temp-1, instructionStack.get(temp-1) + temp1 );
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWriteStatement(FishLanguageParser.WriteStatementContext ctx) {
	}
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
		else if(ctx.EQUALS()!= null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" EQUALS");
		}
	
		instructionNo++;
		ifStack.push(instructionNo);
		loopStack.push(instructionNo);
		instructionStack.add(instructionNo+" FAILGOTO ");
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
			instructionStack.add(instructionNo+" ADD ");
		}
		else if(ctx.SUBTRACT()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" SUBTRACT ");
		}
		else if(ctx.MULTIPLY()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" MULTIPLY ");
		}
		else if(ctx.DIVIDE()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" DIVIDE " );
		}
		else if(ctx.MOD()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" MOD " );
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