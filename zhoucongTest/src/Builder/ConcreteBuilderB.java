package Builder;

public class ConcreteBuilderB implements Builder{
	
	private Product product = new Product();
	@Override
	public void buildHead() {
		System.out.println("������żͷ");
		product.setHead("��żͷ��");
	}

	@Override
	public void buildHand() {
		System.out.println("������ż��֫");
		product.setHand("��ż��֫");
	}

	@Override
	public void buildBody() {
		System.out.println("������ż����");
		product.setBody("��ż����");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
