package Interpreter;

public class Constant implements Expression{
	private int value;
	public Constant(int value){
		this.value = value;
	}
	@Override
	public int interpret(Context con) {
		return value;
	}

}
