package ProxyStatic;

//使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。 
public class CarLogProxy implements Moveable{

	private Moveable m;
	
	public CarLogProxy() {
		super();
		this.m = new Car();
	}
	@Override
	public void move() {
		System.out.println("记录日志开始");
		m.move();
		System.out.println("记录日志结束");
	}

}
