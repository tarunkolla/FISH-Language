package runtime;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;

public class FishRunTime {
	
	String operations[] = {"DISPLAY", "GREATERTHANEQUAL", "LESSTHANEQUAL","NOTEQUAL","GREATERTHAN","LESSTHAN",
						"EQUALS", "ADD","SUBTRACT","MULTIPLY", "DIVIDE", "MOD","ASSIGN"};
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
	public int process(String instruction,Hashtable<String, Pair<String, String>> environment, Stack<String> runTimeStack,int eipRegister)
	{
		String[] element = instruction.split(" ");
		Boolean check = Arrays.asList(operations).contains(element[1]);
		if(check)
		{
			switch(element[1]) {
			case "DISPLAY":
				String output = runTimeStack.pop();
				String result;
				if(environment.containsKey(output))
					result = (String) environment.get(output).second;
				else
					result = output;
				//System.out.println("dis " + environment);
				//System.out.println("dis1 " + runTimeStack);
				System.out.println(result);
				break;
			case "GREATERTHANEQUAL":
				break;
			case "LESSTHANEQUAL":
				break;
			case "NOTEQUAL":
				break;
			case "GREATERTHAN":
				break;
			case "LESSTHAN":
				break;
			case "EQUALS":
				int opEqu2 = 0,opEqu1 = 0;
				String resEqu;
				String intermediateEqu = "";
				String type1Equ = "", type2Equ = "";
				String operand2Equ= runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Equ = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Equ))
				{
					intermediateEqu = environment.get(operand2Equ).second;
					type2Equ = environment.get(operand2Equ).first;
				}
				else {
					type2Equ = findType(operand2Equ);
				}
				if(environment.containsKey(operand1Equ))
				{
					intermediateEqu = environment.get(operand1Equ).second;	
					type1Equ = environment.get(operand1Equ).first;
				}
				else
				{
					type1Equ = findType(operand1Equ);
				}
				Boolean checkTypeEqu = checkComptability(type1Equ, type2Equ);
				if(checkTypeEqu)
				{
					opEqu1 = getValue(operand1Equ, environment);
					opEqu2 = getValue(operand2Equ, environment);
					if (opEqu1 == opEqu2)
						resEqu = "true";
					else
						resEqu = "false";
					//System.out.println(resEqu + "result");
					runTimeStack.push(resEqu);
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "ADD":
				int op2 = 0,op1 = 0,res;
				String intermediate = "";
				String type1 = "", type2 = "";
				String operand2 = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1 = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2))
				{
					intermediate = environment.get(operand2).second;
					type2 = environment.get(operand2).first;
				}
				else {
					type2 = findType(operand2);
				}
				if(environment.containsKey(operand1))
				{
					intermediate = environment.get(operand1).second;	
					type1 = environment.get(operand1).first;
				}
				else
				{
					type1 = findType(operand1);
				}
				Boolean checkType = checkComptability(type1, type2);
				if(checkType && (type1.equals("NUMBER") || type2.equals("NUMBER")))
				{
					op1 = getValue(operand1, environment);
					op2 = getValue(operand2, environment);
					res = op1 + op2;
					//System.out.println(res + "result");
					runTimeStack.push(String.valueOf(res));
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;				
			case "SUBTRACT":
				int opSub2 = 0,opSub1 = 0,resSub;
				String intermediateSub = "";
				String type1Sub = "", type2Sub = "";
				String operand2Sub = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Sub = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Sub))
				{
					intermediateSub = environment.get(operand2Sub).second;
					type2Sub = environment.get(operand2Sub).first;
				}
				else {
					type2Sub = findType(operand2Sub);
				}
				if(environment.containsKey(operand1Sub))
				{
					intermediateSub = environment.get(operand1Sub).second;	
					type1Sub = environment.get(operand1Sub).first;
				}
				else
				{
					type1Sub = findType(operand1Sub);
				}
				Boolean checkTypeSub = checkComptability(type1Sub, type2Sub);
				if(checkTypeSub && (type1Sub.equals("NUMBER") || type2Sub.equals("NUMBER")))
				{
					opSub1 = getValue(operand1Sub, environment);
					opSub2 = getValue(operand2Sub, environment);
					resSub = opSub1 - opSub2;
					//System.out.println(resSub + "result");
					runTimeStack.push(String.valueOf(resSub));
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared sub");
					System.exit(0);
				}
				break;
			case "MULTIPLY":
				int opMul2 = 0,opMul1 = 0,resMul;
				String intermediateMul = "";
				String type1Mul = "", type2Mul = "";
				String operand2Mul = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Mul = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Mul))
				{
					intermediateMul = environment.get(operand2Mul).second;
					type2Mul = environment.get(operand2Mul).first;
				}
				else {
					type2Mul = findType(operand2Mul);
				}
				if(environment.containsKey(operand1Mul))
				{
					intermediateMul = environment.get(operand1Mul).second;	
					type1Mul = environment.get(operand1Mul).first;
				}
				else
				{
					type1Mul = findType(operand1Mul);
				}
				Boolean checkTypeMul = checkComptability(type1Mul, type2Mul);
				if(checkTypeMul && (type1Mul.equals("NUMBER") || type2Mul.equals("NUMBER")))
				{
					opMul1 = getValue(operand1Mul, environment);
					opMul2 = getValue(operand2Mul, environment);
					resMul = opMul1 * opMul2;
					//System.out.println(resMul + "result");
					runTimeStack.push(String.valueOf(resMul));
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "DIVIDE":
				int opDiv2 = 0,opDiv1 = 0,resDiv;
				String intermediateDiv = "";
				String type1Div = "", type2Div = "";
				String operand2Div = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Div = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Div))
				{
					intermediateDiv = environment.get(operand2Div).second;
					type2Div = environment.get(operand2Div).first;
				}
				else {
					type2Div = findType(operand2Div);
				}
				if(environment.containsKey(operand1Div))
				{
					intermediateDiv = environment.get(operand1Div).second;	
					type1Div = environment.get(operand1Div).first;
				}
				else
				{
					type1Div = findType(operand1Div);
				}
				Boolean checkTypeDiv = checkComptability(type1Div, type2Div);
				if(checkTypeDiv && (type1Div.equals("NUMBER") || type2Div.equals("NUMBER")))
				{
					opDiv1 = getValue(operand1Div, environment);
					opDiv2 = getValue(operand2Div, environment);
					resDiv = opDiv1 / opDiv2;
					//System.out.println(resDiv + "result");
					runTimeStack.push(String.valueOf(resDiv));
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "MOD":
				int opMod2 = 0,opMod1 = 0,resMod;
				String intermediateMod = "";
				String type1Mod = "", type2Mod = "";
				String operand2Mod = runTimeStack.pop();
				//System.out.println(operand2+" asda");
				String operand1Mod = runTimeStack.pop();
				//System.out.println("asd " + operand1);
				if(environment.containsKey(operand2Mod))
				{
					intermediateMod = environment.get(operand2Mod).second;
					type2Mod = environment.get(operand2Mod).first;
				}
				else {
					type2Mod = findType(operand2Mod);
				}
				if(environment.containsKey(operand1Mod))
				{
					intermediateMod = environment.get(operand1Mod).second;	
					type1Mod = environment.get(operand1Mod).first;
				}
				else
				{
					type1Mod = findType(operand1Mod);
				}
				Boolean checkTypeMod = checkComptability(type1Mod, type2Mod);
				if(checkTypeMod && (type1Mod.equals("NUMBER") || type2Mod.equals("NUMBER")))
				{
					opMod1 = getValue(operand1Mod, environment);
					opMod2 = getValue(operand2Mod, environment);
					resMod = opMod1 % opMod2;
					//System.out.println(resMod + "result");
					runTimeStack.push(String.valueOf(resMod));
					//System.out.println("add " + environment);
					//System.out.println("add1 " + runTimeStack);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
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
			default:
				System.out.println("error");
			}
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
				runTimeStack.push(element[2]);
				//System.out.println("push " + environment);
				//System.out.println("push1 " + runTimeStack);
				break;
			case "FAILGOTO":
				String decision = runTimeStack.pop();
				//System.out.println(Integer.parseInt(element[2]) + " hello and hi!!");
				if(decision.equals("false"))
					return Integer.parseInt(element[2]);
				//System.out.println("fail " + environment);
				//System.out.println("fail1 " + runTimeStack);
				break;
			case "ENDIFGOTO":
				return Integer.parseInt(element[2]); 
			case "GOTO":
				return Integer.parseInt(element[2]);
			default:
				return ++eipRegister;
			}
		}
		return ++eipRegister;
	}

}
