/*
 * 里氏代换原则
 * 任何父类都能够出现的地方，子类一定能够出现 
 * */
package Test23;

public class Test {
	public static void main(String[] args) {
		Pet cat = new Cat();
		Pet dog = new Dog();
		Person per = new Person();
		per.care(cat);
		per.care(dog);
	}
}

interface Pet {
	public void run();
}

class Person {
	public void care(Pet p) {
		//理氏代换
		p.run();
	}
}

class Cat implements Pet {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cat....");
	}
}

class Dog implements Pet {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("dog....");
	}
}