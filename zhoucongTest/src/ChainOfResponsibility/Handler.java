package ChainOfResponsibility;

public abstract class Handler {
	
	/*
	 * ֱ�Ӻ�̣����ڴ�������
	 */
	protected Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	/*
	 * ��������
	 */
	public abstract void handlerRequest(int level);
}
