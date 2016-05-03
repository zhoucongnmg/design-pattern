package State;

public class StateB implements State{

	@Override
	public void handle(Context context) {
		System.out.println("状态B处理请求,之后把状态变为状态A");	
		context.setState(new StateA());
	}

}
