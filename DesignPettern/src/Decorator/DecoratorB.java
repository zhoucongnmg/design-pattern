package Decorator;

public class DecoratorB extends Decorator{

	public DecoratorB(Component component) {
		super(component);
	}

	public DecoratorB(){}
	@Override
	public void function(){
		super.function();
		functionC();
	}
	
	public void functionC(){
		System.out.println("��չ�Ĺ���C");
	}

}
