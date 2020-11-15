package Test4.java;

public class Test4 {
	public static void main(String[] args) {
		Person tom = new Person();
		tom.pid = 1;
		tom.age = 23;
		tom.name = "tom";
		tom.display();
	}
}

class Person {
	//  Ù–‘
	public int pid;
	public String name;
	public int age;

	Person() {

	}

	void display() {
		String msg = pid + "," + name + "," + age;
		System.out.println(msg);
	}
}
