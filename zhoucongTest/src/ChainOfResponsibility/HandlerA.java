package ChainOfResponsibility;

public class HandlerA extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 1)
			System.out.println("HandlerA������1������");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("�޷���������");
		}
	}

}
