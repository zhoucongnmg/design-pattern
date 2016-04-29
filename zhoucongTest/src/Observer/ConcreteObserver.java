package Observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @author zc
 *
 */
public class ConcreteObserver implements Observer{
	//观察者状态
	private String observerState;
	private String name;
	private String job;

	/**
	 * update时直接获得目标对象，为拉模型
	 */
	@Override
	public void update(Observable subject) {
		//同步状态
		observerState = ((ConcreteSubject)subject).getSubjectState();
		
		System.out.println("观察者"+name+"，收到通知，"+observerState+"去做这件事"+job);
	}
	//获取部分信息，而不是目标类 为推模型
//	public void update(String state) {
//		
//		System.out.println("观察者"+name+"，收到通知，"+state+"去做这件事"+job);
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
