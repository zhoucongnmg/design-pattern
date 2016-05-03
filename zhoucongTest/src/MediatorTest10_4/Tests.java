package MediatorTest10_4;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TubMediator mediator = new TubMediator();
		Machine m1 = new Machine("1001",mediator);
		change(m1);
		System.out.println(m1.getId());
	}
	
	private static void change(Machine m){

		//java值传递，具体参考http://guhanjie.iteye.com/blog/1683637
		TubMediator mediator = new TubMediator();
		m = new Machine("1002",mediator);
		//m.setId("111");
	}

}
