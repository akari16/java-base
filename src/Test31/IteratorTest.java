/*	Iterator�ӿ�
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
		// ʹ�õ���������ѭ��
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//ʹ����ǿ�͵�forѭ��
		for(String s : list) {
			System.out.println(s);
		}
		
		
		
		/*
		 * boolean b = it.hasNext(); System.out.println(b);
		 * 
		 * String e = it.next(); System.out.println(e); e = it.next();
		 * System.out.println(e); // remove����ֱ��ʹ�ã���Ҫ��ʹ��next()���� it.remove();
		 * System.out.println(list);
		 */
	}

}
