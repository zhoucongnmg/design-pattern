package ChainOfResponsibility;

public class HandlerA extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 1)
			System.out.println("HandlerA处理级别1的请求");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("无法处理请求");
		}
	}

}
