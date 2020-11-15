/*	List�ӿ�
 * 	�̳� Collection,�����ظ�����Ԫ�ذ���Ĵ���������Ԫ�أ�������������
 *  ArrayList
 *  ArrayList���װ��һ����̬�ٷ����Object[]����
 *	��������ʵ�ֵģ���ȡ�ٶȿ죬������ɾ���ٶ���������Ϊ������ɾ��ʱҪ�ƶ������Ԫ�أ��ʺ�������ʣ�
 *	Linkedlist
 *	�����һЩ�����б�����Ԫ�صķ�����ɾ��������ٶ�������ȡ�ٶȽ�������Ϊ����ȡʱ�Ǵ�ͷ��β
 *	����ڵ�������ǰ�벿�֣�����β��ͷ������ڵ������ĺ�벿�֣�����Ԫ�أ�����ʺ���Ԫ�صĲ�����ɾ������
 * */
package Test31;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
	public static void main(String[] args) {
		testLinkedList();
	}

	static void testLinkedList() {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.addFirst("a0");
		ll.addLast("a2");
		System.out.println(ll);
		String f = ll.getFirst();
		String f1 = ll.getLast();
		System.out.println(f + f1);
	}

	static void testArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add(0, "a");
		al.add("b");
		al.add("c");
		String e = al.get(0);
		System.out.println(e);

		int index = al.indexOf("a");
		System.out.println(index);
	}
}
