package Test5.java;

public class Test5 {
	public static void main(String[] args) {
		// System.out.println("111");
		Test5.printStart(2);
		Test5 test5 = new Test5();
		test5.m1();
		
		int s = sum();
		System.out.println(s);
		
	}
	
	//方法的重载   系统的方法可以重载
	static int sum() {
		int i = 1;
		int j = 2;
		return i + j;
	}

	static int sum(int i, int j) {
		return i + j;
	}

	// 有static关键字的方法称为静态方法或者是类方法
	// main称之为主方法
	static void printStart(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	// 实例方法，非静态方法
	void m1() {
		System.out.println("1");
	}
}
//方法必须放到类里面去定义，不能单独定义，体现了类的封装性
//可重用性
