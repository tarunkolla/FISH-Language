package runtime;

import java.util.Hashtable;

public class TypeChecking {
	public String getValue(String operand, Hashtable<String, Pair<String, String>> environment) {
		if (environment.containsKey(operand))
		{
			return environment.get(operand).second;
		}
		else
		{
			return operand;
		}
	}

	public String checkCompatibility(String type1, String type2) {
		if (type1.equals(type2))
			return type1;
		else if(type1.equals("NONE") && type2.equals("NUMBER"))
			return "NUMBER";
		else if(type2.equals("NONE") && type1.equals("NUMBER"))
			return "NUMBER";
		else if(type1.equals("NONE") && type2.equals("REAL"))
			return "REAL";
		else if(type2.equals("NONE") && type1.equals("REAL"))
			return "REAL";
		else if(type1.equals("REAL") && type2.equals("NUMBER"))
			return "REAL";
		else if(type2.equals("REAL") && type1.equals("NUMBER"))
			return "REAL";
		else
		{
			System.out.println("INCOMPATIBLE TYPES");
			System.exit(0);
			return "error";
		}
		
	}

	public String findType(String operand, Hashtable<String, Pair<String, String>> environment)
	{
		if (environment.containsKey(operand))
		{
			return environment.get(operand).first;
		}
		else {
		if (operand.matches("[-]?[0-9]+"))
		{
			//System.out.println("here_2!!!!");
			return "NUMBER";
		}
		else if(operand.matches("[-]?[0-9]+[.][0-9]+"))
		{
			return "REAL";
		}
		else if(operand.matches("True|False"))
		{
			return "BOOLEAN";
		}
		return "NONE";
		
		}
	}
	public void setOperands(String operand, Hashtable<String, Pair<String, String>> environment) {
		if (!environment.containsKey(operand))
		{
			if(checkType(operand))
			{
				return;
			}
			else
			{
				System.out.println("variable not declared " + operand);
				System.exit(0);
			}
		}
	}

	public boolean checkType(String value)
	{
		if (value.matches("[-]?[0-9]+") || value.matches("True|False") || value.matches("[-]?[0-9]+[.][0-9]+"))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
