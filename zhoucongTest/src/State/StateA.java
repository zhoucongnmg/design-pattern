package State;

public class StateA implements State{

	@Override
	public void handle(Context context) {
		System.out.println("״̬A��������,֮���״̬��Ϊ״̬B");	
		context.setState(new StateB());
	}

}
