package State;

public class Test {
	public static void main(String[] args){
		Context context = new Context();
		context.setState(new StateA());
		System.out.println("��ǰ״̬Ϊ"+context.getState());
		context.request();
		System.out.println("��ǰ״̬Ϊ"+context.getState());
		context.request();
	}
}
