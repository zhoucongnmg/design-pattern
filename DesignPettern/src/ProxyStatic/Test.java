package ProxyStatic;

public class Test {
	public static void main(String[] args){
		Moveable clp = new CarLogProxy();
		clp.move();
	}
}
