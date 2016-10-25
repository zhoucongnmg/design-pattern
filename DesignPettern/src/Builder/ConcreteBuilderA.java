package Builder;

public class ConcreteBuilderA implements Builder{
	private Product product = new Product();
	@Override
	public void buildHead() {
		System.out.println("�������ν��ͷ");
		product.setHead("���ν��ͷ");
		
	}

	@Override
	public void buildHand() {
		System.out.println("�������ν����֫");
		product.setHand("���ν����֫");
	}

	@Override
	public void buildBody() {
		System.out.println("�������ν������");
		product.setBody("���ν������");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
