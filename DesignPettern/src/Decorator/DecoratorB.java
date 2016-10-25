package Decorator;

public class DecoratorB extends Decorator{

	public DecoratorB(Component component) {
		super(component);
	}
	
	public void functionA(){
		super.functionA();
		functionC();
	}
	
	public void functionC(){
		System.out.println("��չ�Ĺ���C");
	}

}
