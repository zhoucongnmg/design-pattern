package Template;

public class Coffee extends Template{

	@Override
	protected void brew() {
		System.out.println("�ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("������");
	}

}
