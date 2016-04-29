package Observer;

public class Test {

	public static void main(String[] args) {
		//创建目标
		ConcreteSubject subject = new ConcreteSubject();
		//创建观察者
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setName("观察者1");
		observer1.setJob("工作1");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setName("观察者2");
		observer2.setJob("工作2");
		
		//注册观察者
		subject.attach(observer1);
		subject.attach(observer2);

		//目标状态变化
		subject.setSubjectState("状态变化啦");
	}

}
