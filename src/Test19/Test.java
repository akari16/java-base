/*
 * �ӿڵ�ʵ��
 * ʹ��implements�ؼ���ʵ�ֽӿ�
 * һ����ʵ�ֽӿڱ���ʵ�ֽӿ��е����з���
 * һ�������ʵ�ֶ���ӿ�
 * �ӿڿ���ʵ�ֶ�̥�������ϵͳ�����
 * 
 */

package Test19;

public class Test {
	public static void main(String[] args) {
		// ��������ʵ��ͬһ���ӿ�
		Computer c = new Computer();
		c.read();
		c.write();

		Mobile m = new Mobile();
		m.read();
		m.write();
		// һ�������ʵ�ֶ���Խӿ�
		m.playMp3();
	}
}
