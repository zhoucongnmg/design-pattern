package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩע�ᣨ��ӣ���ɾ���۲��ߵĽӿ�
 * @author zc
 *
 */
public class Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	
	//ע��
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	//ɾ��
	public void deleteObserver(Observer observer){
		observers.remove(observer);
	}
	//֪ͨ ע��ɼ���Ϊprotected���Կͻ����ɼ�
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
