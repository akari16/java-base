/*	��ܺϼ����
 * 	����Ҳ��Ϊ����
 * 	��װ��һ����������
 * 	ѧϰ���Ͽ�ܵ�����˼·����ɾ�Ĳ�
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
		System.out.println("--------�ָ���-----");
		remove("b");
		query();
		find("a");

	}

	// ���
	static void add(String e) {
		List.add(e);
	}

	// ɾ��
	static void remove(String e) {
		List.remove(e);
	}

	// find ����
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
			System.out.println("δ�ҵ�");
		}
	}

	// ����
	static void query() {
		for (String s : List) {
			System.out.println(s);
		}
	}
}
