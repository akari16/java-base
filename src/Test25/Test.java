/*
 * 	异常的概念
 * 	异常是java在运行期出现的错误，如：空指针异常，数组越界等
 * 	java异常提供了处理运行期间错误的机制，java异常是面向对象的，当异常发生是自动产生一个异常对象，再有catch方法来捕获异常
 * 	
 * */
package Test25;

public class Test {
	public static void main(String[] args) {
		m1();
		System.out.println("-------分割线---------");

		m2();
		System.out.println("-------分割线1---------");
	}
	
	static void m3() {
		try {
			Class.forName("demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void m2() {
		// 数组越界
		try {
			int[] a = { 1, 2, 3 };
			int x = a[3];
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			String str = e.getMessage();
			System.out.println(str);
		}
	}

	static void m1() {
		try {
			String str = null;
			int len = str.length();
		} catch (NullPointerException e) {
			// TODO: handle exception 异常处理
			e.printStackTrace();
		}

	}
}
