//static关键字

package Test8;

public class Test8 {
	public static void main(String[] args) {
		Person per1 = new Person();
		System.out.println(per1.pid + "," + per1.age);

		Person per2 = new Person();
		System.out.println(per2.pid + "," + per2.age);

	}
}

class Person {
	//static 变量是所有对象共享的
	
	static int pid;
	int age;

	public Person() {
		pid++;
		age++;
	}
	
	//静态的方法不能直接访问非静态的变量，静态方法没有this
	static void m1() {
		
		
	}
	
}
