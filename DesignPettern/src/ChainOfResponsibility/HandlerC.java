package ChainOfResponsibility;

public class HandlerC extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 3)
			System.out.println("HandlerC处理级别3的请求");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("无法处理请求");
		}
		
	}

}
