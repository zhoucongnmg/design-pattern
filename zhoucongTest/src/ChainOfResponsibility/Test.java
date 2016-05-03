package ChainOfResponsibility;

public class Test {
	public static void main(String[] args){
		
		//此处可以将构造链的过程放入单独的类（链厂）
		HandlerA h1 = new HandlerA();
		HandlerB h2 = new HandlerB();
		HandlerC h3 = new HandlerC();
		HandlerD h4 = new HandlerD();
		
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		h3.setNextHandler(h4);
		
		//此处可以由客户端调用链首
		h1.handlerRequest(3);
		h1.handlerRequest(6);
	}
}
