package Observer;

/**
 * ����һ���۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı�ʱ��֪ͨ�Ķ���
 * @author zc
 *
 */
public interface Observer {
	/**
	 * ���µĽӿڣ�
	 * @param subject �����Ŀ����󣬷����ȡ��ӦĿ���״̬
	 */
	public void update(Observable subject);
}
