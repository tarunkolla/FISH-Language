package runtime;

import java.util.Hashtable;

/*
*This class extends the Typechecking and computes the 5 basic Arithemetic operations within the code.
*
*@author: Siva Pranav Mandadi
*/
public class ArithmeticOperations extends TypeChecking {

	public String evaluate(String operation, String operand1, String operand2,  Hashtable<String, Pair<String, String>> environment)
	{
		setOperands(operand1,environment);
		setOperands(operand2,environment);
		String type1 = findType(operand1, environment);
		String type2 = findType(operand2, environment);
		String resType = checkCompatibility(type1, type2);
		String value1 = getValue(operand1, environment);
		String value2 = getValue(operand2, environment);
		int result = 0;
		double resDou = 0.0;
		switch(operation) {
		case "ADD":
			
			if (resType.equals("NUMBER"))
			{
				result = Integer.parseInt(value1)  + Integer.parseInt(value2);
				return String.valueOf(result);
			}
			else if (resType.equals("REAL"))
			{
				resDou = Double.parseDouble(value1)  + Double.parseDouble(value2);
				return String.valueOf(resDou);
			}
		case "SUBTRACT":
			if (resType.equals("NUMBER"))
			{
				result = Integer.parseInt(value1)  - Integer.parseInt(value2);
				return String.valueOf(result);
			}
			else if (resType.equals("REAL"))
			{
				resDou = Double.parseDouble(value1) - Double.parseDouble(value2);
				return String.valueOf(resDou);
			}
		case "MULTIPLY":
			if (resType.equals("NUMBER"))
			{
				result = Integer.parseInt(value1)  * Integer.parseInt(value2);
				return String.valueOf(result);
			}
			else if (resType.equals("REAL"))
			{
				resDou = Double.parseDouble(value1) * Double.parseDouble(value2);
				return String.valueOf(resDou);
			}
		case "DIVIDE":
			if (resType.equals("NUMBER"))
			{
				result = Integer.parseInt(value1)  / Integer.parseInt(value2);
				return String.valueOf(result);
			}
			else if (resType.equals("REAL"))
			{
				resDou = Double.parseDouble(value1) / Double.parseDouble(value2);
				return String.valueOf(resDou);
			}
		case "MOD":
			if (resType.equals("NUMBER"))
			{
				result = Integer.parseInt(value1)  % Integer.parseInt(value2);
				return String.valueOf(result);
			}
			else if (resType.equals("REAL"))
			{
				resDou = Double.parseDouble(value1) % Double.parseDouble(value2);
				return String.valueOf(resDou);
			}
		}
		return value2;
	}
}
