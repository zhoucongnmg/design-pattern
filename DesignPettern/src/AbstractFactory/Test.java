package AbstractFactory;

public class Test {
	public static void main(String[] args){
		test(new FactoryA());
	}

	public static void test(AbstractFactory factory){
		Phone phone = factory.getPhone();
		phone.brand();
	}

}
