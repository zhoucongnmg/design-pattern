package ObserverWithJavaUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * ����۲��߶���
 * @author zc
 *
 */
public class ConcreteObserver implements Observer{

	private String observerName;
	
	@Override
	public void update(Observable o, Object arg) {
		//�Ʒ�ʽ
		System.out.println(observerName+"�յ�����Ϣ,����������" + arg);
		
		//����ʽ
		System.out.println(observerName+"�յ�����Ϣ����������������" + ((ConcreteWeatherSubject)o).getContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
