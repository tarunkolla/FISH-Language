package runtime;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FishRunTime {
	
	String operations[] = {"DISPLAY", "ASSIGN", "READ","ENDFISHING", "PARAMASSIGN","STARTFUN"};
	String arithmeticOperations[] = {"ADD", "SUBTRACT","MOD","DIVIDE","MULTIPLY"};
	String logicalOperations[] = {"AND","OR"};
	String relationalOperations[] = {"GREATERTHANEQUAL", "LESSTHANEQUAL","NOTEQUAL","GREATERTHAN","LESSTHAN","EQUALS"};
	Pair<String, String> temporary = Pair.of(" ", " ");

	public int process(String instruction,Hashtable<String, Pair<String, String>> environment, Stack<String> runTimeStack,int eipRegister)
	{
		String[] element = instruction.split(" ");
		Boolean check = Arrays.asList(operations).contains(element[1]);
		Boolean arthimeticCheck = Arrays.asList(arithmeticOperations).contains(element[1]);
		Boolean relationalCheck = Arrays.asList(relationalOperations).contains(element[1]);
		Boolean logicalCheck = Arrays.asList(logicalOperations).contains(element[1]);
		if(check)
		{
			switch(element[1]) {
			case "READ":
				String variable = runTimeStack.pop();
				String data;
				Pair<String, String> temporaryRead = Pair.of(" ", " ");
				TypeChecking tcRead = new TypeChecking();
				if(environment.containsKey(variable))
				{
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					data = scan.next();
					temporaryRead.first = tcRead.findType(data, environment);
					temporaryRead.second = data;
					environment.put(variable, temporaryRead);
				}
				else
				{
					System.out.println("Variable not declared");
				}
				break;
			case "DISPLAY":
				String output = runTimeStack.pop();
				String result;
				if(environment.containsKey(output))
				{
					result = environment.get(output).second;
					System.out.println(result + " type:" + environment.get(output).first);
				}
				else
				{
					result = output;
					System.out.println(result);
				}
				break;
			case "PARAMASSIGN":
				Pair<String, String> temporaryParamAssign = Pair.of(" ", " ");
				TypeChecking tcParam = new TypeChecking();
				String paramvalue;
				String paramvar = runTimeStack.pop();
				String paramval = runTimeStack.pop();
				if(environment.containsKey(paramval))
				{
					paramvalue = environment.get(paramval).second;
					temporaryParamAssign.first = tcParam.findType(paramvalue,environment);
				}	
				else
				{
					paramvalue = paramval;
					temporaryParamAssign.first = tcParam.findType(paramvalue,environment);
				}
				temporaryParamAssign.second = paramvalue;
				environment.put(paramvar, temporaryParamAssign);
				break;
			case "ASSIGN":
				Pair<String, String> temporaryAssign = Pair.of(" ", " ");
				TypeChecking tc = new TypeChecking();
				String value;
				String val = runTimeStack.pop();
				String var = runTimeStack.pop();
				tc.setOperands(var, environment);
				if(environment.containsKey(val))
				{
					value = environment.get(val).second;
					temporaryAssign.first = tc.findType(value,environment);
				}	
				else
				{
					
					tc.setOperands(val, environment);
					value = val;
					temporaryAssign.first = tc.findType(value,environment);
				}
				temporaryAssign.second = value;
				environment.put(var, temporaryAssign);
				break;
			case "ENDFISHING":
				System.exit(0);
				break;
			default:
				System.out.println("error");
			}
		}
		else if (logicalCheck)
		{
			LogicalOperations lo = new  LogicalOperations();
			String operand2 = runTimeStack.pop();
			String operand1 = runTimeStack.pop();
			String result100 = lo.evaluate(element[1],operand1,operand2,environment);
			runTimeStack.push(result100);
		}
		else if(arthimeticCheck)
		{
			ArithmeticOperations ao = new  ArithmeticOperations();
			String operand2 = runTimeStack.pop();
			String operand1 = runTimeStack.pop();
			String result100 = ao.evaluate(element[1],operand1,operand2,environment);
			runTimeStack.push(result100);
		}
		else if(relationalCheck)
		{
			RelationalOperations ro = new RelationalOperations();
			String operand2 = runTimeStack.pop();
			String operand1 = runTimeStack.pop();
			String result100 = ro.evaluate(element[1],operand1,operand2,environment);
			runTimeStack.push(result100);
		}
		else
		{
			switch(element[1])
			{
			case "DECLARE":
				temporary.first = "NONE";
				temporary.second = "0";
				environment.put(element[2], temporary);
				break;
			case "PUSH":
				if (element[2].contains("\""))
				{
					Pattern p = Pattern.compile("\"([^\"]*)\"");
					Matcher m = p.matcher(instruction);
					m.find();
					runTimeStack.push(m.group(1));			
				}
				else
				{
					runTimeStack.push(element[2]);
				}
				break;
			case "PARAMPUSH":
				runTimeStack.push(element[2]);
				break;
			case "FAILGOTO":
				String decision = runTimeStack.pop();;
				if(decision.equals("false"))
					return Integer.parseInt(element[2])-1;
				break;
			case "ENDIFGOTO":
				return (Integer.parseInt(element[2])-1); 
			case "GOTO":
				return Integer.parseInt(element[2]);
			case "RETURNTO":
				return Integer.parseInt(element[2]);
			case "CALL":
				return Integer.parseInt(element[3]);
			}
		}
		return ++eipRegister;
	}

}
