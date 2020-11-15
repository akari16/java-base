/*
 * 引用类型的类型转换
 * 向上转换：子类对象可以直接当作父类对象使用，无需强制转换
 * 向下转换：父类对象当作子类对象使用，需要强制类型转换，可能抛出异常 
 */

package Test22;

public class Test {
	public static void main(String[] args) {
		// 向下类型转换 downcasting 抛出异常
		Animal cat = new Cat();
//		Cat c = (Cat) cat;
//		c.run();

		Dog d = (Dog) cat;
		d.run();

		// upcasting 向上类型转换
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