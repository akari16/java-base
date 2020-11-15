/*	Iterator接口
 * 	boolean hasNext()
 * 	Object next()
 *  void remove
 * */

package Test31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		// 使用迭代器进行循环
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//使用增强型的for循环
		for(String s : list) {
			System.out.println(s);
		}
		
		
		
		/*
		 * boolean b = it.hasNext(); System.out.println(b);
		 * 
		 * String e = it.next(); System.out.println(e); e = it.next();
		 * System.out.println(e); // remove不能直接使用，需要先使用next()方法 it.remove();
		 * System.out.println(list);
		 */
	}

}
