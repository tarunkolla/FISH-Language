package runtime;

import java.util.Hashtable;
/*
*This class extends the Typechecking and computes the 2 basic Logical operations within the code.
*
*@author: Siva Pranav Mandadi
*/
public class LogicalOperations extends TypeChecking{
	public String evaluate(String operation, String operand1, String operand2,  Hashtable<String, Pair<String, String>> environment)
	{
		setOperands(operand1,environment);
		setOperands(operand2,environment);
		String type1 = findType(operand1, environment);
		String type2 = findType(operand2, environment);
		String resType = checkCompatibility(type1, type2);
		String value1 = getValue(operand1, environment);
		String value2 = getValue(operand2, environment);
		boolean result = true;
		switch(operation) {
		case "AND":
			result = (Boolean.parseBoolean(value1) && Boolean.parseBoolean(value2));
			return String.valueOf(result);
		case "OR":
			result = (Boolean.parseBoolean(value1) || Boolean.parseBoolean(value2));
			return String.valueOf(result);			
		}
		return value2;
	}
	public String checkCompatibility(String type1, String type2) {
		if (type1.equals("BOOLEAN") && type1.equals("BOOLEAN"))
			return type1;
		else
		{
			System.out.println("INCOMPATIBLE TYPES");
			System.exit(0);
			return "error";
		}
	}
}
