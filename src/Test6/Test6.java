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
	//����������в����Ĺ��췽�����޲����Ĺ��췽���������ṩ
	// Ĭ�Ϲ��췽�����޲������췽��
	public Person() {
		System.out.println("Person");
		pid = 1;
		name = "tom";
		age = 20;
	}

	// ��ʵ����������ֵ
	public Person(int pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}

	// ���췽������
	int pid;
	String name;
	int age;
	// ��ʵ��������ֵ

	void display() {
		String msg = pid + "," + name + "," + age;
		System.out.println(msg);
	}
}