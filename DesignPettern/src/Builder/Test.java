package Builder;

public class Test {
	public static void main(String[] args) {
		test(new ConcreteBuilderA());
		test(new ConcreteBuilderB());
	}

	public static void test(Builder builder){
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getProduct());
	}
}
