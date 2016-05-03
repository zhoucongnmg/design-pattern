package Builder;

public class ConcreteBuilder implements Builder{
	private Product product = new Product();
	@Override
	public void buildPartA(String partA) {
		System.out.println("����A����");
		product.setPartA(partA);
		
	}

	@Override
	public void buildPartB(String partB) {
		System.out.println("����B����");
		product.setPartB(partB);
	}

	@Override
	public void buildPartC(String partC) {
		System.out.println("����C����");
		product.setPartC(partC);
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
