package ChainOfResponsibility;

public class HandlerC extends Handler{

	@Override
	public void handlerRequest(int level) {
		if(level == 3)
			System.out.println("HandlerC������3������");
		else{
			if(this.nextHandler != null)
				this.nextHandler.handlerRequest(level);
			else 
				System.out.println("�޷���������");
		}
		
	}

}
