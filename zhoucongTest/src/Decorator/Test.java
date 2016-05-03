package Decorator;

public class Test {
	public static void main(String[] args){
		Component component = new DecoratorA(new ConcreteComponent());
		component.functionA();
		Component component1 = new DecoratorB(new ConcreteComponent());
		component1.functionA();
	}
}
