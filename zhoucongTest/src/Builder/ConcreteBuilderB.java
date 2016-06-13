package Builder;

public class ConcreteBuilderB implements Builder{
	
	private Product product = new Product();
	@Override
	public void buildHead() {
		System.out.println("构建人偶头");
		product.setHead("人偶头部");
	}

	@Override
	public void buildHand() {
		System.out.println("构建人偶四肢");
		product.setHand("人偶四肢");
	}

	@Override
	public void buildBody() {
		System.out.println("构建人偶身体");
		product.setBody("人偶身体");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
