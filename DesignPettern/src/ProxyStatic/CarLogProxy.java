package ProxyStatic;

//ʹ�ô���ģʽ���������ʵ����֮��ĵĹ�ϵͨ���ڱ���ʱ���Ѿ�ȷ���ˣ���װ�����ܹ�������ʱ�ݹ�ر����졣 
public class CarLogProxy implements Moveable{

	private Moveable m;
	
	public CarLogProxy() {
		super();
		this.m = new Car();
	}
	@Override
	public void move() {
		System.out.println("��¼��־��ʼ");
		m.move();
		System.out.println("��¼��־����");
	}

}
