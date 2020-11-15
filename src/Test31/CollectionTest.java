package Test31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("a");
		Collection<String> c1 = new ArrayList<String>();
		c1.add("b");
		c1.add("c");

		c.addAll(c1);
		System.out.println(c);

//		c.clear();
		System.out.println("---------");
		System.out.println(c);

		boolean b = c.contains("a");
		System.out.println(b);

		b = c.isEmpty();
		System.out.println(b);

		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
