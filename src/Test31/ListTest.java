/*	List接口
 * 	继承 Collection,允许重复，以元素安插的次序来放置元素，不会重新排列
 *  ArrayList
 *  ArrayList类封装了一个动态再分配的Object[]数组
 *	是用数组实现的，读取速度快，插入与删除速度慢（是因为插入与删除时要移动后面的元素，适合随机访问）
 *	Linkedlist
 *	添加了一些处理列表两端元素的方法，删除与插入速度慢，读取速度较慢，因为它读取时是从头到尾
 *	如果节点在链的前半部分，或者尾向头（如果节点在链的后半部分）查找元素，因此适合于元素的插入与删除操作
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
