/*
 * 	异常块结构
 * 	try catch finally三个语句块均不能单独使用，三者可以组成 try catch finally try catch try finally三种结构
 * 	catch语句可以有一个或者多个，finally语句最多一个
 * 	try catch finally三个代码块中变量的作用域为代码块内部，分别独立而不能互相访问
 * 	如果要在三个代码块中都可以访问，则需要将变量到这些块的外面
 * 	多个catch块的时候，只会匹配其中一个异常类并执行catch块代码
 * 	而不会再执行别的catch快，并且匹配catch语句的顺序是由上而下
 * */

package Test27;

public class Test {
	public static void main(String[] args) {
		try {
			String str = null;
			int len = str.length();
			int[] a = { 1, 2, 3 };
			int x = a[1];
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("空指针异常");
//			System.out.println(len);
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} finally {
			System.out.println("finally");
		}
	}
}
