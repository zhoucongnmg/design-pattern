package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，他知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 * @author zc
 *
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	//注册
	public void attach(Observer observer){
		observers.add(observer);
	}
	//删除
	public void detach(Observer observer){
		observers.remove(observer);
	}
	//通知
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
