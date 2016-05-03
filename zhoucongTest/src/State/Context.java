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
     * 用户感兴趣的接口方法
     */
    public void request() {
        //转调state来处理
        state.handle(this);
    }
}
