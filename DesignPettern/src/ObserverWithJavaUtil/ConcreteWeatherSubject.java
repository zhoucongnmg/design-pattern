package ObserverWithJavaUtil;

import java.util.Observable;

/**
 * 天气目标类
 * @author zc
 *
 */
public class ConcreteWeatherSubject extends Observable{
	//天气内容
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		//在通知观察者前，一定要有下面这句话
		this.setChanged();
		//使用推方式通知观察者
		this.notifyObservers(content);
		
		//使用拉方法通知观察者
//		this.notifyObservers();
	}

}
