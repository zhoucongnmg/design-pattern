package State;

public class Context {
	private State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	 /**
     * �û�����Ȥ�Ľӿڷ���
     */
    public void request() {
        //ת��state������
        state.handle(this);
    }
}
