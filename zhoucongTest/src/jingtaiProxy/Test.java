package jingtaiProxy;

public class Test {
	public static void main(String[] args){
		Moveable car = new Car();
		Moveable ctp = new CarTimeProxy(car);
		Moveable clp = new CarLogProxy(ctp);
		clp.move();
	}
}
