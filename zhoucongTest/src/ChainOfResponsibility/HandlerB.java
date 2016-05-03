package ChainOfResponsibility;

public class HandlerB extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 2)
			System.out.println("HandlerB处理级别2的请求");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("无法处理请求");
		}
		
	}
	
}
