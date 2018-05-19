package Decorator;

public class DecoratorA extends Decorator{

	public DecoratorA(Component component) {
		super(component);
	}
	
	@Override
	public void functionA(){
		super.functionA();
		functionB();
	}
	
	public void functionB(){
		System.out.println("扩展的功能B");
	}

}
