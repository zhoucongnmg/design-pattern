package State;

public class StateA implements State{

	@Override
	public void handle(Context context) {
		System.out.println("状态A处理请求,之后把状态变为状态B");	
		context.setState(new StateB());
	}

}
