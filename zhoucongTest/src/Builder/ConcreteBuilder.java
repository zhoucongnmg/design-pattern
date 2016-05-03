package Builder;

public class ConcreteBuilder implements Builder{
	private Product product = new Product();
	@Override
	public void buildPartA(String partA) {
		System.out.println("构建A部分");
		product.setPartA(partA);
		
	}

	@Override
	public void buildPartB(String partB) {
		System.out.println("构建B部分");
		product.setPartB(partB);
	}

	@Override
	public void buildPartC(String partC) {
		System.out.println("构建C部分");
		product.setPartC(partC);
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
