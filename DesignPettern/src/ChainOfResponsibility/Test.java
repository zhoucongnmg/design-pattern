package ChainOfResponsibility;

public class Test {
	public static void main(String[] args){
		
		//�˴����Խ��������Ĺ��̷��뵥�����ࣨ������
		HandlerA h1 = new HandlerA();
		HandlerB h2 = new HandlerB();
		HandlerC h3 = new HandlerC();
		HandlerD h4 = new HandlerD();
		
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		h3.setNextHandler(h4);
		
		//�˴������ɿͻ��˵�������
		h1.handlerRequest(3);
		h1.handlerRequest(6);
	}
}
