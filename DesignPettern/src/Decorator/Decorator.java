package Decorator;

/**
 * ����װ����
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
