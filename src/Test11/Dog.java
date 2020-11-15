package Test11;

public class Dog extends Animal {

	public Dog() {
		// 调用父类默认的构造方法
		// super();
		super(1,"hahah",1);
		System.out.println("Dog.........");
	}

	void test() {
		super.pid = 100;
	}
}
