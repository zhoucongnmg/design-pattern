package Interpreter;

public class Sub implements Expression{

	private Expression left , right;
	public Sub(Expression left , Expression right){     
		this.left = left;     
	    this.right= right;
	}
	@Override
	public int interpret(Context con) {
		return left.interpret(con) - right.interpret(con);
	}

}
