package Decorator;

/**
 * ³éÏó×°ÊÎÕß
 * @author zhoucong
 *
 */
public class Decorator implements Component{

	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void functionA() {
		component.functionA();
	}

}
