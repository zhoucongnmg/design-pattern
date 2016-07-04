package Interpreter;

public class Variable implements Expression{

	@Override
	public int interpret(Context con) {
		return con.getValue(this);
	}
	
}
