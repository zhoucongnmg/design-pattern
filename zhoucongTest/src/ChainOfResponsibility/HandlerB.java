package ChainOfResponsibility;

public class HandlerB extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 2)
			System.out.println("HandlerB������2������");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("�޷���������");
		}
		
	}
	
}
