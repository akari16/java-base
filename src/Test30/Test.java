/*	框架合集简介
 * 	集合也成为容器
 * 	是装载一组对象的容器
 * 	学习集合框架的整体思路：增删改查
 * */
package Test30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	static List<String> List;

	public static void main(String[] args) {
		List = new ArrayList<String>();
		List.add("a");
		List.add("b");
		List.add("c");
		List.add("d");
		query();
		System.out.println("--------分割线-----");
		remove("b");
		query();
		find("a");

	}

	// 添加
	static void add(String e) {
		List.add(e);
	}

	// 删除
	static void remove(String e) {
		List.remove(e);
	}

	// find 查找
	static void find(String e) {
		boolean b = false;
		for (String s : List) {
			if (s.equals(e)) {
				System.out.println("found: " + e);
				b = true;
				return;
			}
		}
		if (!b) {
			System.out.println("未找到");
		}
	}

	// 遍历
	static void query() {
		for (String s : List) {
			System.out.println(s);
		}
	}
}
