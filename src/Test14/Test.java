/*
    * 抽象方法
 *一些方法只被声明，而没有被实现
 *没有方法体
 *前面用abstract关键字进行修饰
 *不能被声明为private  static final 
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

//一个方法实现多种行为
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
