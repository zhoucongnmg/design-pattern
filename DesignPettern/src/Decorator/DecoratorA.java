package Decorator;

public class DecoratorA extends Decorator{

	public DecoratorA(Component component) {
		super(component);
	}
	
	public void functionA(){
		super.functionA();
		functionB();
	}
	
	public void functionB(){
		System.out.println("��չ�Ĺ���B");
	}

}
