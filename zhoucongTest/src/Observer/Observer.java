package Observer;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变时被通知的对象
 * @author zc
 *
 */
public interface Observer {
	/**
	 * 更新的接口，
	 * @param subject 传入的目标对象，方便获取对应目标的状态
	 */
	public void update(Observable subject);
}
