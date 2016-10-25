package ObserverWithJavaUtil;

public class Test {

	public static void main(String[] args) {	
		//创建目标（被观察者）
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		//创建观察者
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setObserverName("观察者A");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setObserverName("观察者B");
		
		//注册观察者
		subject.addObserver(observer1);
		subject.addObserver(observer2);	
		//目标状态更新
		subject.setContent("天气晴！");

	}

}
