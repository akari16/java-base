/*
 * �������͵�����ת��
 * ����ת��������������ֱ�ӵ����������ʹ�ã�����ǿ��ת��
 * ����ת��������������������ʹ�ã���Ҫǿ������ת���������׳��쳣 
 */

package Test22;

public class Test {
	public static void main(String[] args) {
		// ��������ת�� downcasting �׳��쳣
		Animal cat = new Cat();
//		Cat c = (Cat) cat;
//		c.run();

		Dog d = (Dog) cat;
		d.run();

		// upcasting ��������ת��
		// Cat cat = new Cat();
		/*
		 * Animal cat = new Cat(); cat.run();
		 * 
		 * Dog dog = new Dog(); dog.run();
		 * 
		 * Animal[] as = { cat, dog }; for (int i = 0; i < 2; i++) { Animal ax = as[i];
		 * ax.run(); }
		 */ }
}

interface Animal {
	public void run();
}

class Dog implements Animal {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog run");
	}
}

class Cat implements Animal {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cat run");
	}
}