package operations;

public enum ArithmeticalOperator {

	PLUS("+"),SUB("-"),MULT("*"),DIV("/");
	
	String operator;
	ArithmeticalOperator(String operator)
	{
		this.operator = operator;
	}
	
	public static ArithmeticalOperator fromString(String operator)
	{
		for(ArithmeticalOperator l : ArithmeticalOperator.values())
		{
			if(l.toString().equals(operator)) return l;
		}
		throw new RuntimeException("Nieprawidłowy operator");
	}
	
	@Override
	public String toString()
	{
		return operator;
	}
}
