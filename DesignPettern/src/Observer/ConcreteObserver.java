package Observer;

/**
 * ����Ĺ۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 * @author zc
 *
 */
public class ConcreteObserver implements Observer{
	//�۲���״̬
	private String observerState;
	private String name;
	private String job;

	/**
	 * updateʱֱ�ӻ��Ŀ�����Ϊ��ģ��
	 */
	@Override
	public void update(Observable subject) {
		//ͬ��״̬
		observerState = ((ConcreteSubject)subject).getSubjectState();
		
		System.out.println("�۲���"+name+"���յ�֪ͨ��"+observerState+"ȥ�������"+job);
	}
	//��ȡ������Ϣ��������Ŀ���� Ϊ��ģ��
//	public void update(String state) {
//		
//		System.out.println("�۲���"+name+"���յ�֪ͨ��"+state+"ȥ�������"+job);
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
