//this¹Ø¼ü×Ö

package Test7;

public class Test7 {
	public static void main(String[] args) {
		Person per = new Person();
		per.pid = 1;
		per.name = "ÕÅÈı";
		per.age = 20;
		per.display();
		
		
		
		
		Person per2 = new Person();
		per2.pid = 2;
		per2.name = "kite";
		per2.age = 21;
		per2.display();
	
		
	}
}

class Person {
	int pid;
	String name;
	int age;
	
	public Person() {
		System.out.println("Person");
		
	}
	
	public Person(int pid,String name,int age) {
		this();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
	void display() {
		String msg = pid + "," + name + "," + age;
		System.out.println(msg);
	}
}