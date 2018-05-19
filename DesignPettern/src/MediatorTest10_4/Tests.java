package MediatorTest10_4;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxBallMediator mediator = new BoxBallMediator();
		Box m1 = new Box("1001",mediator);
		change(m1);
		System.out.println(m1.getId());
	}
	
	private static void change(Box m){

		//java值传递，具体参考http://guhanjie.iteye.com/blog/1683637
		BoxBallMediator mediator = new BoxBallMediator();
		m = new Box("1002",mediator);
		//m.setId("111");
	}

}
