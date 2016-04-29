package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩע�ᣨ��ӣ���ɾ���۲��ߵĽӿ�
 * @author zc
 *
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	//ע��
	public void attach(Observer observer){
		observers.add(observer);
	}
	//ɾ��
	public void detach(Observer observer){
		observers.remove(observer);
	}
	//֪ͨ
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
