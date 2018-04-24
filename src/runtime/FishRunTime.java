package runtime;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FishRunTime {
	
	String operations[] = {"DISPLAY", "GREATERTHANEQUAL", "LESSTHANEQUAL","NOTEQUAL","GREATERTHAN","LESSTHAN",
						"EQUALS", "ADD","SUBTRACT","MULTIPLY", "DIVIDE", "MOD","ASSIGN", "AND", "OR", "READ"};
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
					//System.out.println(output + "from run time hii");
					result = output;
					System.out.println(result);
				}				
				break;
			case "GREATERTHANEQUAL":
				int opGte2 = 0,opGte1 = 0;
				String resGte;
				String intermediateGte = "";
				String type1Gte = "", type2Gte = "";
				String operand2Gte = runTimeStack.pop();
				String operand1Gte = runTimeStack.pop();
				if(environment.containsKey(operand2Gte))
				{
					intermediateGte = environment.get(operand2Gte).second;
					type2Gte = environment.get(operand2Gte).first;
				}
				else {
					type2Gte = findType(operand2Gte);
				}
				if(environment.containsKey(operand1Gte))
				{
					intermediateGte = environment.get(operand1Gte).second;	
					type1Gte = environment.get(operand1Gte).first;
				}
				else
				{
					type1Gte = findType(operand1Gte);
				}
				Boolean checkTypeGte = checkComptability(type1Gte, type2Gte);
				if(checkTypeGte)
				{
					opGte1 = getValue(operand1Gte, environment);
					opGte2 = getValue(operand2Gte, environment);
					if (opGte1 > opGte2)
						resGte = "true";
					else
						resGte = "false";
					runTimeStack.push(resGte);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "LESSTHANEQUAL":
				int opLte2 = 0,opLte1 = 0;
				String resLte;
				String intermediateLte = "";
				String type1Lte = "", type2Lte = "";
				String operand2Lte = runTimeStack.pop();
				String operand1Lte = runTimeStack.pop();
				if(environment.containsKey(operand2Lte))
				{
					intermediateLte = environment.get(operand2Lte).second;
					type2Lte = environment.get(operand2Lte).first;
				}
				else {
					type2Lte = findType(operand2Lte);
				}
				if(environment.containsKey(operand1Lte))
				{
					intermediateLte = environment.get(operand1Lte).second;	
					type1Lte = environment.get(operand1Lte).first;
				}
				else
				{
					type1Lte = findType(operand1Lte);
				}
				Boolean checkTypeLte = checkComptability(type1Lte, type2Lte);
				if(checkTypeLte)
				{
					opLte1 = getValue(operand1Lte, environment);
					opLte2 = getValue(operand2Lte, environment);
					if (opLte1 <= opLte2)
						resLte = "true";
					else
						resLte = "false";
					runTimeStack.push(resLte);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "NOTEQUAL":
				int opNEqu2 = 0,opNEqu1 = 0;
				String resNEqu;
				String intermediateNEqu = "";
				String type1NEqu = "", type2NEqu = "";
				String operand2NEqu= runTimeStack.pop();
				String operand1NEqu = runTimeStack.pop();
				if(environment.containsKey(operand2NEqu))
				{
					intermediateNEqu = environment.get(operand2NEqu).second;
					type2NEqu = environment.get(operand2NEqu).first;
				}
				else {
					type2NEqu = findType(operand2NEqu);
				}
				if(environment.containsKey(operand1NEqu))
				{
					intermediateNEqu = environment.get(operand1NEqu).second;	
					type1NEqu = environment.get(operand1NEqu).first;
				}
				else
				{
					type1NEqu = findType(operand1NEqu);
				}
				Boolean checkTypeNEqu = checkComptability(type1NEqu, type2NEqu);
				if(checkTypeNEqu)
				{
					opNEqu1 = getValue(operand1NEqu, environment);
					opNEqu2 = getValue(operand2NEqu, environment);
					if (opNEqu1 != opNEqu2)
						resNEqu = "true";
					else
						resNEqu = "false";
					runTimeStack.push(resNEqu);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "GREATERTHAN":
				int opGt2 = 0,opGt1 = 0;
				String resGt;
				String intermediateGt = "";
				String type1Gt = "", type2Gt = "";
				String operand2Gt= runTimeStack.pop();
				String operand1Gt = runTimeStack.pop();
				if(environment.containsKey(operand2Gt))
				{
					intermediateGt = environment.get(operand2Gt).second;
					type2Gt = environment.get(operand2Gt).first;
				}
				else {
					type2Gt = findType(operand2Gt);
				}
				if(environment.containsKey(operand1Gt))
				{
					intermediateGt = environment.get(operand1Gt).second;	
					type1Gt = environment.get(operand1Gt).first;
				}
				else
				{
					type1Gt = findType(operand1Gt);
				}
				Boolean checkTypeGt = checkComptability(type1Gt, type2Gt);
				if(checkTypeGt)
				{
					opGt1 = getValue(operand1Gt, environment);
					opGt2 = getValue(operand2Gt, environment);
					if (opGt1 > opGt2)
						resGt = "true";
					else
						resGt = "false";
					runTimeStack.push(resGt);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "LESSTHAN":
				int opLt2 = 0,opLt1 = 0;
				String resLt;
				String intermediateLt = "";
				String type1Lt = "", type2Lt = "";
				String operand2Lt= runTimeStack.pop();
				String operand1Lt = runTimeStack.pop();
				if(environment.containsKey(operand2Lt))
				{
					intermediateLt = environment.get(operand2Lt).second;
					type2Lt = environment.get(operand2Lt).first;
				}
				else {
					type2Lt = findType(operand2Lt);
				}
				if(environment.containsKey(operand1Lt))
				{
					intermediateLt = environment.get(operand1Lt).second;	
					type1Lt = environment.get(operand1Lt).first;
				}
				else
				{
					type1Lt = findType(operand1Lt);
				}
				Boolean checkTypeLt = checkComptability(type1Lt, type2Lt);
				if(checkTypeLt)
				{
					opLt1 = getValue(operand1Lt, environment);
					opLt2 = getValue(operand2Lt, environment);
					if (opLt1 < opLt2)
						resLt = "true";
					else
						resLt = "false";
					runTimeStack.push(resLt);
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}
				break;
			case "EQUALS":
				int opEqu2 = 0,opEqu1 = 0;
				String resEqu;
				String intermediateEqu = "";
				String type1Equ = "", type2Equ = "";
				String operand2Equ= runTimeStack.pop();
				String operand1Equ = runTimeStack.pop();
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
					if ((opEqu1 == opEqu2))
						resEqu = "true";
					else
						resEqu = "false";
					runTimeStack.push(resEqu);
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
				String operand1 = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(res));
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
				String operand2Sub = runTimeStack.pop()
				String operand1Sub = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resSub));
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
				String operand1Mul = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resMul));
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
				String operand1Div = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resDiv));
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
				String operand1Mod = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resMod));
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
				String var = runTimeStack.pop();
				if(environment.containsKey(val))
				{
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
				break;
			case "AND":
				Boolean opAnd2, opAnd1,resAnd;
				String intermediateAnd = "";
				String type1And = "", type2And = "";
				String operand2And = runTimeStack.pop();
				String operand1And = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resAnd));
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
				String operand1Or = runTimeStack.pop();
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
					runTimeStack.push(String.valueOf(resOr));
				}
				else
				{
					System.out.println("Incompatible types or Variable not declared");
					System.exit(0);
				}

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
				break;
			case "FAILGOTO":
				String decision = runTimeStack.pop();
				if(decision.equals("false"))
					return Integer.parseInt(element[2])-1;
				break;
			case "ENDIFGOTO":
				return (Integer.parseInt(element[2])-1); 
			case "GOTO":
				return Integer.parseInt(element[2]);
			}
		}
		return ++eipRegister;
	}

}
