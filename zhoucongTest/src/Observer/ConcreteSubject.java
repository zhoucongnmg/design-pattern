package Observer;

/**
 * �����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * @author zc
 *
 */
public class ConcreteSubject extends Observable{
	//Ŀ��״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
}
