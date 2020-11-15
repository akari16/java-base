package com.liao.Test9;

//java.lang类在所有包内不需要导入，系统默认导入
//import java.lang.System

//import java.util.Date;
//按需加载，多了会载入过慢，影响系统性能
import java.util.*;
import com.A;
import com.liao.B;

public class Test {
	public static void main(String[] args) {
		// alt + /
		// ctrl + shift + o 自动导入类相关的包

		// A a = new A();

		com.liao.Test9.A a = new com.liao.Test9.A();

		B b = new B();

		Date date = new Date();

		System.out.println("hello world");

	}
}
