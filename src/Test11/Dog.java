package Test11;

public class Dog extends Animal {

	public Dog() {
		// ���ø���Ĭ�ϵĹ��췽��
		// super();
		super(1,"hahah",1);
		System.out.println("Dog.........");
	}

	void test() {
		super.pid = 100;
	}
}
