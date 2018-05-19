package Decorator;

public class DecoratorB extends Decorator{

	public DecoratorB(Component component) {
		super(component);
	}
	
	@Override
	public void functionA(){
		super.functionA();
		functionC();
	}
	
	public void functionC(){
		System.out.println("扩展的功能C");
	}

}
