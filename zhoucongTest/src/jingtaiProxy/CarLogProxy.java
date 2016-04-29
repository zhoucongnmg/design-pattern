package jingtaiProxy;

public class CarLogProxy implements Moveable{

	private Moveable m;
	
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}
	@Override
	public void move() {
		System.out.println("��¼��־��ʼ");
		m.move();
		System.out.println("��¼��־����");
	}

}
