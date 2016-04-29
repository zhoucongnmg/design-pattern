package ObserverWithJavaUtil;

import java.util.Observable;

/**
 * ����Ŀ����
 * @author zc
 *
 */
public class ConcreteWeatherSubject extends Observable{
	//��������
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
		//��֪ͨ�۲���ǰ��һ��Ҫ��������仰
		this.setChanged();
		//ʹ���Ʒ�ʽ֪ͨ�۲���
		this.notifyObservers(content);
		
		//ʹ��������֪ͨ�۲���
//		this.notifyObservers();
	}

}
