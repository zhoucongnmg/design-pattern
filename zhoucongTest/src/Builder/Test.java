package Builder;

public class Test {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getProduct());
	}
}
