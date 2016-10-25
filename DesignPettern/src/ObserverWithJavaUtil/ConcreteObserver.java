package ObserverWithJavaUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者对象
 * @author zc
 *
 */
public class ConcreteObserver implements Observer{

	private String observerName;
	
	@Override
	public void update(Observable o, Object arg) {
		//推方式
		System.out.println(observerName+"收到了消息,推送来的是" + arg);
		
		//拉方式
		System.out.println(observerName+"收到了消息，主动拉的内容是" + ((ConcreteWeatherSubject)o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
