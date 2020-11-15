/*
 * final关键字
 * 在类面前
 * 阻止继承
 * 在方法面前，阻止方法覆盖
 * 在属性面前是常量
 * 
 * 
 * */
package Test16;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A {
	final void m() {

	}

	final double PI = 3.14;
	// final 常量
//	void test() { PI = 3.1415 }

}

//final方法阻止重写/覆盖
//class A1 extends A{ void m() {} }

final class FinalClass {

}

//不能实现，final阻止继承
//class SubClass extends FinalClass{ 	}