package jingtaiProxy;

public class CarLogProxy implements Moveable{

	private Moveable m;
	
	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}
	@Override
	public void move() {
		System.out.println("记录日志开始");
		m.move();
		System.out.println("记录日志结束");
	}

}
