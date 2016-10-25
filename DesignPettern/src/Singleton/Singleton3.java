package Singleton;

public class Singleton3 {
	//http://jiangzhengjun.iteye.com/blog/652440   À´÷ÿºÏ≤‚‘≠“Ú
	private volatile static Singleton3 instance = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) {// 1
				if (instance == null) {// 2
					instance = new Singleton3();// 3
				}
			}
		}
		return instance;
	}
}