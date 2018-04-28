package runtime;

import java.util.Hashtable;

public class RelationalOperations extends TypeChecking{
	public String evaluate(String operation, String operand1, String operand2,  Hashtable<String, Pair<String, String>> environment)
	{
		setOperands(operand1,environment);
		setOperands(operand2,environment);
		String type1 = findType(operand1, environment);
		String type2 = findType(operand2, environment);
		String resType = checkCompatibility(type1, type2);
		String value1 = getValue(operand1, environment);
		String value2 = getValue(operand2, environment);
		Boolean result = true;
		switch(operation) {
		case "GREATERTHAN":
			
			if (resType.equals("NUMBER"))
			{
				if (Integer.parseInt(value1)  > Integer.parseInt(value2))
				{
					result = true;
				}
				else
				{
					result = false;
				}
				
			}
			else if (resType.equals("REAL"))
			{
				 if(Double.parseDouble(value1)  > Double.parseDouble(value2))
				 {
					 result = true;
				 }
				 else
				 {
					 result = false;
				 }
			}
			return String.valueOf(result);
			case "LESSTHAN":
			
			if (resType.equals("NUMBER"))
			{
				if (Integer.parseInt(value1)  < Integer.parseInt(value2))
				{
					result = true;
				}
				else
				{
					result = false;
				}
				
			}
			else if (resType.equals("REAL"))
			{
				 if(Double.parseDouble(value1)  < Double.parseDouble(value2))
				 {
					 result = true;
				 }
				 else
				 {
					 result = false;
				 }
			}
			return String.valueOf(result);
		case "GREATERTHANEQUAL":
				
				if (resType.equals("NUMBER"))
				{
					if (Integer.parseInt(value1)  >= Integer.parseInt(value2))
					{
						result = true;
					}
					else
					{
						result = false;
					}
					
				}
				else if (resType.equals("REAL"))
				{
					 if(Double.parseDouble(value1)  >= Double.parseDouble(value2))
					 {
						 result = true;
					 }
					 else
					 {
						 result = false;
					 }
				}
				return String.valueOf(result);
		case "LESSTHANEQUAL":
			
			if (resType.equals("NUMBER"))
			{
				if (Integer.parseInt(value1)  <= Integer.parseInt(value2))
				{
					result = true;
				}
				else
				{
					result = false;
				}
				
			}
			else if (resType.equals("REAL"))
			{
				 if(Double.parseDouble(value1)  <= Double.parseDouble(value2))
				 {
					 result = true;
				 }
				 else
				 {
					 result = false;
				 }
			}
			return String.valueOf(result);
		case "EQUALS":
			
			if (resType.equals("NUMBER"))
			{
				if (Integer.parseInt(value1)  == Integer.parseInt(value2))
				{
					result = true;
				}
				else
				{
					result = false;
				}
				
			}
			else if (resType.equals("REAL"))
			{
				 if(Double.parseDouble(value1)  == Double.parseDouble(value2))
				 {
					 result = true;
				 }
				 else
				 {
					 result = false;
				 }
			}
			return String.valueOf(result);
		case "NOTEQUALS":
		
		if (resType.equals("NUMBER"))
		{
			if (Integer.parseInt(value1)  != Integer.parseInt(value2))
			{
				result = true;
			}
			else
			{
				result = false;
			}
			
		}
		else if (resType.equals("REAL"))
		{
			 if(Double.parseDouble(value1)  != Double.parseDouble(value2))
			 {
				 result = true;
			 }
			 else
			 {
				 result = false;
			 }
		}
		return String.valueOf(result);
	}
		return value2;
	}
	
	
}
