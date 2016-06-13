package Builder;

public class ConcreteBuilderA implements Builder{
	private Product product = new Product();
	@Override
	public void buildHead() {
		System.out.println("构建变形金刚头");
		product.setHead("变形金刚头");
		
	}

	@Override
	public void buildHand() {
		System.out.println("构建变形金刚四肢");
		product.setHand("变形金刚四肢");
	}

	@Override
	public void buildBody() {
		System.out.println("构建变形金刚身体");
		product.setBody("变形金刚身体");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
