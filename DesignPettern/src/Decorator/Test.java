package Decorator;

public class Test {
	public static void main(String[] args){
		test(new DecoratorA(),new ConcreteComponent());
	}

	public static void test(Decorator decorator,Component component){
		decorator.setComponent(component);
		decorator.function();
	}
}
