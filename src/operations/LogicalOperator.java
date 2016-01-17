package operations;

public enum LogicalOperator {


	AND("&&"),OR("||"),EQUAL("=="),NEQUAL("!="),GT(">"),GE(">="),LT("<"),LE("<=");
	
	String operator;
	LogicalOperator(String operator)
	{
		this.operator = operator;
	}
	
	public static LogicalOperator fromString(String operator)
	{
		for(LogicalOperator l : LogicalOperator.values())
		{
			if(l.equals(operator)) return l;
		}
		throw new RuntimeException("Nieprawidłowy operator");
	}
}
