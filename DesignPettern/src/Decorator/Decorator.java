package Decorator;

/**
 * ����װ����
 * @author zhoucong
 *
 */
public class Decorator implements Component{

	public Decorator(){}

	private Component component;
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void function() {
		component.function();
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}
}
