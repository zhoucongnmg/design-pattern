package ProxyDynamicWithReflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {

	/**
	 * JDK��̬���������
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler timeHandler = new TimeHandler(car);
//		InvocationHandler logHandler = new LogHandler(timeHandler);
		Class<?> cls = car.getClass();
		/**
		 * loader  �������
		 * interfaces  ʵ�ֽӿ�
		 * h InvocationHandler
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
												cls.getInterfaces(), timeHandler);
		m.move();
	}

}
