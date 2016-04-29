package ProxyDynamicWithReflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {

	/**
	 * JDK动态代理测试类
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler timeHandler = new TimeHandler(car);
//		InvocationHandler logHandler = new LogHandler(timeHandler);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
												cls.getInterfaces(), timeHandler);
		m.move();
	}

}
