package ChainOfResponsibility;

public class HandlerD extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 4)
			System.out.println("HandlerD������4������");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("�޷���������");
		}
		
		
	}

}
