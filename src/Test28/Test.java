/*
 * 	异常的处理
 * 	捕获异常的catch
 * 	可以使用try catch finally 异常处理块来捕获异常，当异常发生是程序组织当前的执行路径
 * 	跳转到catch块中执行
 * 
 * 	异常类的相关方法
 * 	
 * 	catch中的异常对象由系统自动产生，无论是否有异常产生finally块始终执行
 * 	异常类的相关方法
 * 	可以使用异常类的相关方法显示异常信息，便于调试，如getMessage(), printStackTrance()等
 * 	
 * 	抛出异常 throws
 * 
 * 	在方法生命处使用throws关键字生命可能抛出的异常
 * 	在方法中使用throws抛出异常对象
 * */
package Test28;

public class Test {
	public static void main(String[] args) {
		// m3();
		// m5();
		System.out.println("456。。。。。。。。。。");
	}

	static void m5() throws ClassNotFoundException {
		Class.forName("Demo");
	}

	static void m1() {
		try {
			String str = null;
			int len = str.length();
			System.out.println("123.........");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally...");
		}
	}

	static void m2() {
		m1();
	}

	static void m3() {
		m2();
	}
}
