package Factory;

public class Test {
	public static void main(String[] args) {
		//根据参数判断创建哪个类
		HairFactory factory = new HairFactory();
		HairInterface right = factory.getHair("right");
		right.draw();
		
		//根据类名判断创建哪个类
		HairFactory factory1 = new HairFactory();
		HairInterface left = factory1.getHairByClass("Factory.LeftHair");
		left.draw();
	}
}
