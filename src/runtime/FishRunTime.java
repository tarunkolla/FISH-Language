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
	String relationalOperations[] = {"GREATERTHANEQUAL", "LESSTHANEQUAL","NOTEQUAL","GREATERTHAN","LESSTHAN",
			"EQUALS"};
	Pair<String, String> temporary = Pair.of(" ", " ");
	
	public static boolean checkComptability(String operandType1, String operandType2)
	{
		if(operandType1.equals(operandType2) || operandType1.equals("NONE") || operandType2.equals("NONE")) return true;
		else return false;
	}
	public static String findType(String value)
	{
		if (value.matches("[-]?[0-9]+"))
		{
			//System.out.println("here_2!!!!");
			return "NUMBER";
		}
		else if(value.matches("[-]?[0-9]+[.][0-9]+"))
		{
			return "REAL";
		}
		else
			return "BOOLEAN";
	}
	public static int getValue(String operand, Hashtable<String, Pair<String, String>> environment)
	{
		if(environment.containsKey(operand))
		{
			return Integer.parseInt(environment.get(operand).second);
		}
		else 
		{
			return Integer.parseInt(operand);
		}
	}
	public static boolean getBoolValue(String operand, Hashtable<String, Pair<String, String>> environment)
	{
		if(environment.containsKey(operand))
		{
			return Boolean.parseBoolean(environment.get(operand).second);
		}
		else 
		{
			return Boolean.parseBoolean(operand);
		}
	}
	
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
				if(environment.containsKey(variable))
				{
					Scanner scan = new Scanner(System.in);
					data = scan.next();
					temporaryRead.first = findType(data);
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
				String paramvalue;
				String paramvar = runTimeStack.pop();
				//System.out.println(val+"value");
				String paramval = runTimeStack.pop();
				//System.out.println(var+"var");
				if(environment.containsKey(paramval))
				{
					//System.out.println("jump");
					paramvalue = environment.get(paramval).second;
					temporaryParamAssign.first = findType(paramvalue);
				}	
				else
				{
					paramvalue = paramval;
					temporaryParamAssign.first = findType(paramvalue);
				}
				temporaryParamAssign.second = paramvalue;
				environment.put(paramvar, temporaryParamAssign);
				//System.out.println("assign " + environment);
				//System.out.println("assign1 " + runTimeStack);
				break;
			case "ASSIGN":
				Pair<String, String> temporaryAssign = Pair.of(" ", " ");
				String value;
				String val = runTimeStack.pop();
				//System.out.println(val+"value");
				String var = runTimeStack.pop();
				//System.out.println(var+"var");
				if(environment.containsKey(val))
				{
					//System.out.println("jump");
					value = environment.get(val).second;
					temporaryAssign.first = findType(value);
				}	
				else
				{
					value = val;
					temporaryAssign.first = findType(value);
				}
				temporaryAssign.second = value;
				environment.put(var, temporaryAssign);
				//System.out.println("assign " + environment);
				//System.out.println("assign1 " + runTimeStack);
				break;
			/*case "AND":
				Boolean opAnd2, opAnd1,resAnd;
				String intermediateAnd = "";
				String type1And = "", type2And = "";
				String operand2And = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1And = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2And))
				{
					intermediateAnd = environment.get(operand2And).second;
					type2And = environment.get(operand2And).first;
				}
				else {
					type2And = findType(operand2And);
				}
				if(environment.containsKey(operand1And))
				{
					intermediateAnd = environment.get(operand1And).second;	
					type1And = environment.get(operand1And).first;
				}
				else
				{
					type1And = findType(operand1And);
				}
				Boolean checkTypeAnd = checkComptability(type1And, type2And);
				if(checkTypeAnd && (type1And.equals("BOOLEAN") || type2And.equals("BOOLEAN")))
				{
					opAnd1 = getBoolValue(operand1And, environment);
					opAnd2 = getBoolValue(operand2And, environment);
					resAnd = opAnd1 && opAnd2;
					//System.out.println(resAnd + "result");
					runTimeStack.push(String.valueOf(resAnd));
					//System.out.println("And " + environment);
					//System.out.println("And1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "OR":
				Boolean opOr2 ,opOr1 ,resOr;
				String intermediateOr = "";
				String type1Or = "", type2Or = "";
				String operand2Or = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Or = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Or))
				{
					intermediateOr = environment.get(operand2Or).second;
					type2Or = environment.get(operand2Or).first;
				}
				else {
					type2Or = findType(operand2Or);
				}
				if(environment.containsKey(operand1Or))
				{
					intermediateOr = environment.get(operand1Or).second;	
					type1Or = environment.get(operand1Or).first;
				}
				else
				{
					type1Or = findType(operand1Or);
				}
				Boolean checkTypeOr = checkComptability(type1Or, type2Or);
				if(checkTypeOr && (type1Or.equals("BOOLEAN") || type2Or.equals("BOOLEAN")))
				{
					opOr1 = getBoolValue(operand1Or, environment);
					opOr2 = getBoolValue(operand2Or, environment);
					resOr = opOr1 || opOr2;
					//System.out.println(resOr + "result");
					runTimeStack.push(String.valueOf(resOr));
					//System.out.println("Or " + environment);
					//System.out.println("Or1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}

				break;*/
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
				//System.out.println("dec " + environment);
				//System.out.println("dec1 " + runTimeStack);
				break;
			case "PUSH":
				if (element[2].contains("\""))
				{
					Pattern p = Pattern.compile("\"([^\"]*)\"");
					Matcher m = p.matcher(instruction);
					String s;
					m.find();
					runTimeStack.push(m.group(1));
					
				}
				else
				{
					runTimeStack.push(element[2]);
				}
				//System.out.println("push " + environment);
				//System.out.println("push1 " + runTimeStack);
				break;
			case "PARAMPUSH":
				runTimeStack.push(element[2]);
				break;
			case "FAILGOTO":
				String decision = runTimeStack.pop();
				//System.out.println(Integer.parseInt(element[2]) + " hello and hi!!");
				if(decision.equals("false"))
					return Integer.parseInt(element[2])-1;
				//System.out.println("fail " + environment);
				//System.out.println("fail1 " + runTimeStack);
				break;
			case "ENDIFGOTO":
				//System.out.println("endifgoto dude" + (Integer.parseInt(element[2])-1));
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
