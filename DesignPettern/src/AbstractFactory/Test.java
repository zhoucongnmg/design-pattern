package AbstractFactory;

public class Test {
	public static void main(String[] args){
		AbstractFactory factoryA = new FactoryA();
		Phone phone = factoryA.getPhone();
		phone.brand();
		AbstractFactory factoryB = new FactoryB();
		Computer computerB = factoryB.getComputer();
		computerB.brand();
	}

}
