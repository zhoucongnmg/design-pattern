package ObserverWithJavaUtil;

public class Test {

	public static void main(String[] args) {	
		//����Ŀ�꣨���۲��ߣ�
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		
		//�����۲���
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setObserverName("�۲���A");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setObserverName("�۲���B");
		
		//ע��۲���
		subject.addObserver(observer1);
		subject.addObserver(observer2);	
		//Ŀ��״̬����
		subject.setContent("�����磡");

	}

}
