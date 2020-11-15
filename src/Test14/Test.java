/*
    * ���󷽷�
 *һЩ����ֻ����������û�б�ʵ��
 *û�з�����
 *ǰ����abstract�ؼ��ֽ�������
 *���ܱ�����Ϊprivate  static final 
 * 
 * */

package Test14;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.run();
		Dog dog = new Dog();
		dog.run();
	}

}

abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void run();

	// private abstract void m1();
	// public static void m1();
	// public final void m2();
}

//һ������ʵ�ֶ�����Ϊ
class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("Dog run ---------");
	}

}

class Cat extends Animal {
	@Override
	public void run() {
		System.out.println("Cat run ---------");
	}

}
