package Decorator;

public class DecoratorA extends Decorator{

	public DecoratorA(Component component) {
		super(component);
	}

	public DecoratorA(){

	}

	@Override
	public void function(){
		super.function();
		functionB();
	}
	
	public void functionB(){
		System.out.println("扩展的功能B");
	}

}
