package Command;

public class Test {
	public static void main(String[] args){
		Receiver receiver = new Receiver();  
        Command command = new ConcreteCommand(receiver);  
        //�ͻ���ֱ��ִ�о������ʽ���˷�ʽ����ͼ�����  
        command.execute();  
        
        //�ͻ���ͨ����������ִ������ 
        Invoker invoker = new Invoker(command);
        invoker.action();
        
	}
}
