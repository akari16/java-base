//static�ؼ���

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
	//static ���������ж������
	
	static int pid;
	int age;

	public Person() {
		pid++;
		age++;
	}
	
	//��̬�ķ�������ֱ�ӷ��ʷǾ�̬�ı�������̬����û��this
	static void m1() {
		
		
	}
	
}
