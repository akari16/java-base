/*
 * ������
 * ��һ�������棬��һ�����߶�����󷽷�
 * �����಻�ܱ�ʵ����
 * ������֮���ǳ���
 * �̳г����������
 * ����ʵ�ֳ��󷽷�
 * ���߱���Ҳ�ǳ�����
 * 
 * */

package Test15;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal a = new Animal(); //�����಻��ֱ�ӱ�ʵ����
		Dog dog = new Dog();
		dog.run();
	}

}

abstract class Animal {
	public abstract void run();
}

//ʵ�ֳ��󷽷�
class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("dog run....");
	}
}

//�Լ��ǳ�����
abstract class Cat extends Animal {

}
