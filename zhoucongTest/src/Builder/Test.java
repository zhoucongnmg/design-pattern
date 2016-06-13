package Builder;

public class Test {
	public static void main(String[] args) {
		Builder builderA = new ConcreteBuilderA();
		Director directorA = new Director(builderA);
		directorA.construct();
		System.out.println(builderA.getProduct());
		Builder builderB = new ConcreteBuilderB();
		Director directorB = new Director(builderB);
		directorB.construct();
		System.out.println(builderB.getProduct());
	}
}
