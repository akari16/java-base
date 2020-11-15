/**
 * �ڲ���
 * ������һ�����ڲ���������ڲ��࣬�����ڲ�������Ϊ�ⲿ��
 * �ڲ����������public protected private�ȷ������ƣ���������Ϊabstract�Ĺ������ڲ�������ⲿ��̳�����չ
 * ��������Ϊstatic final�ģ�Ҳ����ʵ���ض��Ľӿ�
 * static���ڲ�����Ϊ����һ���������࣬��static����Ϊ������������Ի��߷����ҽ�ֹ����static�ķ���
 * �ڲ�����Է����ⲿ������з��������ԣ�����static���ڲ���ֻ�ܷ����ⲿ��ľ�̬�����뷽��
 * 
 * �ڲ���ķ���:��̬�ڲ��࣬ʵ���ڲ��࣬�ֲ��ڲ��࣬�����ڲ���
 */

package Test21;

public class Test {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.StaticClass sic = new OuterClass.StaticClass();

		OuterClass.InnerClass ic = oc.new InnerClass();

		USB u = new USB() {

			@Override
			public void read() {
				// TODO Auto-generated method stub

			}

			@Override
			public void write() {
				// TODO Auto-generated method stub

			}
		};

		Animal a = new Animal() {

			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
		};
		a.run();
	}
}

abstract class Animal {
	abstract void run();
}

//class Computer implements USB{}

interface USB {
	public void read();

	public void write();
}