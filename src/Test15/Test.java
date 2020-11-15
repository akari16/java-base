/*
 * 抽象类
 * 在一个类里面，有一个或者多个抽象方法
 * 抽象类不能被实例化
 * 抽象类之能是超类
 * 继承抽象类的子类
 * 必须实现抽象方法
 * 或者本身也是抽象类
 * 
 * */

package Test15;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal a = new Animal(); //抽象类不能直接被实例化
		Dog dog = new Dog();
		dog.run();
	}

}

abstract class Animal {
	public abstract void run();
}

//实现抽象方法
class Dog extends Animal {
	@Override
	public void run() {
		System.out.println("dog run....");
	}
}

//自己是抽象类
abstract class Cat extends Animal {

}
