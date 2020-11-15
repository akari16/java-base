package Test6;

public class Test6 {
	public static void main(String[] args) {
		Person per = new Person();
		per.display();

		Person per2 = new Person(2, "kite", 21);
		per2.display();
	}
}

class Person {
	//如果定义了有参数的构造方法，无参数的构造方法将不再提供
	// 默认构造方法，无参数构造方法
	public Person() {
		System.out.println("Person");
		pid = 1;
		name = "tom";
		age = 20;
	}

	// 给实例变量赋初值
	public Person(int pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}

	// 构造方法重载
	int pid;
	String name;
	int age;
	// 给实例变量赋值

	void display() {
		String msg = pid + "," + name + "," + age;
		System.out.println(msg);
	}
}