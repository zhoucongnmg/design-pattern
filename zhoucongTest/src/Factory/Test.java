package Factory;

public class Test {
	public static void main(String[] args) {
		//���ݲ����жϴ����ĸ���
		HairFactory factory = new HairFactory();
		HairInterface right = factory.getHair("right");
		right.draw();
		
		//���������жϴ����ĸ���
		HairFactory factory1 = new HairFactory();
		HairInterface left = factory1.getHairByClass("Factory.LeftHair");
		left.draw();
	}
}
