package ProxyStatic;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		//ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
