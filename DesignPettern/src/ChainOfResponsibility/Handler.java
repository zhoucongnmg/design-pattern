package ChainOfResponsibility;

public abstract class Handler {
	
	/*
	 * 直接后继，用于传递请求
	 */
	protected Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	/*
	 * 处理请求
	 */
	public abstract void handlerRequest(int level);
}
