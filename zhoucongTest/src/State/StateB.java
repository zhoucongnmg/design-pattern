package State;

public class StateB implements State{

	@Override
	public void handle(Context context) {
		System.out.println("״̬B��������,֮���״̬��Ϊ״̬A");	
		context.setState(new StateA());
	}

}
