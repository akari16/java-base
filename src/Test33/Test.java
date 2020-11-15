/*	Map接口
 * 	特征：是一种 键-值 对象，即所持有的是 key - value对
 * 	Map中不能有重复的key，拥有自己内部的排列机制
 * 	
 * 	HashMap以哈希表数据结构实现，查找对象时通过哈希函数计算其位置，它是为快速查询而设计的，
 * 	其内部定义了一个hash表数组（empty[] table），元素会通过哈希转换函数将元素的哈希地址转换成数组中存放的索引
 * 	如果有冲突，则使用散列链表的形式将所有相同哈希地址的元素串起来，可能通过查看HashMap entry的源码它	
 * 	是一个单链表结构
 * 	map的选择
 * 	Hashtable和HashMap效率大致相同（通常HashMap更快一点，所以HashMap有意取代HashTable）
 * 	TreeMap通常比HashMap慢，因为要维护排序
 * 	HashMap正是为快速排序而设计的
 * 	LinkedHashMap比HashMap慢一点，因为它维护散列数据结构的同事还有维护链表
 * */
package Test33;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		test2();
	}

	static void test1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "a");
		hm.put("1", "b");
		hm.put("2", "c");
		hm.put("2", "c1");
		String v1 = hm.get("1");
		System.out.println(v1);

		// 循环遍历
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			String value = hm.get(key);
			System.out.println(key + ":" + value);
		}
	}

	static void test2() {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("0", "a");
		tm.put("1", "b");
		tm.put("2", "c");
		tm.put("3", "d");
		System.out.println(tm);
	}

}
