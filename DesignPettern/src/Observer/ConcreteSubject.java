package Observer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @author zc
 *
 */
public class ConcreteSubject extends Observable{
	//目标状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
}
