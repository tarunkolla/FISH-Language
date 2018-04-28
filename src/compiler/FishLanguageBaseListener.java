package compiler;
// Generated from FishLanguage.g4 by ANTLR 4.7.1

import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiler.FishLanguageParser.ArgumentsContext;
import compiler.FishLanguageParser.FunctionCallStatementContext;
import compiler.FishLanguageParser.FunctionsContext;
import compiler.FishLanguageParser.MainBlockContext;
import compiler.FishLanguageParser.ParametersContext;
import compiler.FishLanguageParser.ReadStatementContext;
import compiler.FishLanguageParser.ReturnStatementContext;

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
	Stack<Integer> returnAddrStack = new Stack<Integer>();
	Stack<Integer> callAddrStack = new Stack<Integer>();
	int ifNext, elseNext, temp,temp1 = 0;
	int ifPresCount=0, ifPrevCount=0, loopPresCount=0, loopPrevCount=0, boolExprCount=0;
	int instructionNo = 0,arg=0;
	@Override public void enterProgram(FishLanguageParser.ProgramContext ctx) {
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(FishLanguageParser.ProgramContext ctx) {
		
	}
	@Override
	public void enterMainBlock(MainBlockContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo+" STARTFISHING");
	}
	@Override
	public void exitMainBlock(MainBlockContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo+" ENDFISHING");
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
	@Override public void enterDeclarationStatement(FishLanguageParser.DeclarationStatementContext ctx) { }
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
	@Override public void enterIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		ifPresCount++;
		instructionStack.add(instructionNo+" STARTIF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfBlock(FishLanguageParser.IfBlockContext ctx) {
		instructionNo++;
		ifPresCount--;
		ifPrevCount--;
		int next = instructionNo + 1;
		instructionStack.add(instructionNo+" ENDIFGOTO "+ next);
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
		instructionStack.set(elseNext-1, elseNext + " ENDIFGOTO " +temp);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoopStatement(FishLanguageParser.LoopStatementContext ctx) { 
		instructionNo++;
		loopPresCount++;
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
		loopPresCount--;
		loopPrevCount--;
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
	@Override public void enterWriteStatement(FishLanguageParser.WriteStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWriteStatement(FishLanguageParser.WriteStatementContext ctx) {
		instructionNo++;
		instructionStack.add(instructionNo+" DISPLAY ");
	}
	
	@Override public void enterBooleanExpression(FishLanguageParser.BooleanExpressionContext ctx) { 
		boolExprCount++;
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
		else if(ctx.AND()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" AND ");
		}
		else if(ctx.OR()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" OR ");
		}
	
		instructionNo++;
		if(ifPresCount > ifPrevCount)
		{
			ifStack.push(instructionNo);
			ifPrevCount = ifPresCount;
			instructionStack.add(instructionNo+" FAILGOTO ");
		}
		if(loopPresCount > loopPrevCount)
		{
			loopStack.push(instructionNo);
			loopPrevCount = loopPresCount;
			instructionStack.add(instructionNo+" FAILGOTO ");
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
		else if(ctx.REAL()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" PUSH " + ctx.REAL());
		}
		else if(ctx.STRING()!=null)
		{
			instructionNo++;
			instructionStack.add(instructionNo+" PUSH " + ctx.STRING());
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
	@Override
	public void enterReadStatement(ReadStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitReadStatement(ReadStatementContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionNo++;
		instructionStack.add(instructionNo+" PUSH "+ctx.IDENTIFIER());
		instructionStack.add(instructionNo+" READ ");
		
	}
	@Override
	public void enterFunctions(FunctionsContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo+" STARTFUN ");
		int temp = callAddrStack.pop();
		instructionStack.set(temp-1, temp+ " CALL "+ctx.FUNCNAME()+ " "+instructionNo);
	}
	@Override
	public void exitFunctions(FunctionsContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo+" ENDFUN ");
		
	}
	@Override
	public void enterParameters(ParametersContext ctx) {
		// TODO Auto-generated method stub
	}
	@Override
	public void exitParameters(ParametersContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo + " PARAMPUSH "+ctx.IDENTIFIER());
		instructionNo++;
		instructionStack.add(instructionNo + " PARAMASSIGN ");
		
		//instructionStack.add(instructionNo+" PARAM "+arg);
	}
	@Override
	public void enterFunctionCallStatement(FunctionCallStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitFunctionCallStatement(FunctionCallStatementContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		returnAddrStack.push(instructionNo);
		callAddrStack.push(instructionNo);
		instructionStack.add(instructionNo+" CALL "+ctx.FUNCNAME()+ " ");
	}
	@Override
	public void enterArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void exitArguments(ArgumentsContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		instructionNo++;
		instructionStack.add(instructionNo+ " RETURNTO "+returnAddrStack.pop());
	}
	
}