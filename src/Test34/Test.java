/*	collection�㷨
 * 	�����㷨
 * 	sort shuffe binarySearch fill max min reverse swap
 * 	
 * */
package Test34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		list.add(1);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		System.out.println(list);

		// ����
		Collections.sort(list);
		System.out.println(list);
		// ϴ��
//		Collections.shuffle(list);
		System.out.println(list);
		// ���ֲ���
		int index = Collections.binarySearch(list, 3);
		System.out.println(index);
		// �����Сֵ
		int max = Collections.max(list);
		int min = Collections.min(list);
		System.out.println(max + "," + min);

//		Collections.reverse(list);
		System.out.println(list);
		Collections.swap(list, 2, 4);
		System.out.println(list);

	}
}
