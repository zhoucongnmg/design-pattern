package Observer;

public class Test {

	public static void main(String[] args) {
		//����Ŀ��
		ConcreteSubject subject = new ConcreteSubject();
		//�����۲���
		ConcreteObserver observer1 = new ConcreteObserver();
		observer1.setName("�۲���1");
		observer1.setJob("����1");
		
		ConcreteObserver observer2 = new ConcreteObserver();
		observer2.setName("�۲���2");
		observer2.setJob("����2");
		
		//ע��۲���
		subject.attach(observer1);
		subject.attach(observer2);

		//Ŀ��״̬�仯
		subject.setSubjectState("״̬�仯��");
	}

}
