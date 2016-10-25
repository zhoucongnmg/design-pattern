package ChainOfResponsibility;

public class HandlerD extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 4)
			System.out.println("HandlerD处理级别4的请求");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("无法处理请求");
		}
		
		
	}

}
