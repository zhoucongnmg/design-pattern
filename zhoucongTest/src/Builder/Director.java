package Builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(){
		builder.buildPartA("A");
		builder.buildPartB("B");
		builder.buildPartC("C");
	}
}
