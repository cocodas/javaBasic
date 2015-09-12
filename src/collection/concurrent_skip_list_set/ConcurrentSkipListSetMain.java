package collection.concurrent_skip_list_set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetMain {

	public static void main(String[] args) {

		Set<String> concurrentSkipListSet = new ConcurrentSkipListSet<String>();
		concurrentSkipListSet.add("Test");

		Iterator<String> iterator = concurrentSkipListSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// fail-safe
		while (iterator.hasNext()) {
			concurrentSkipListSet.add("newElement1");
			System.out.println(iterator.next());
		}
		System.out.println();

		// fail-safe
		Enumeration<String> listEnum = Collections.enumeration(concurrentSkipListSet);
		while (listEnum.hasMoreElements()) {
			concurrentSkipListSet.add("newElement2");
			System.out.println(listEnum.nextElement());
		}
		System.out.println();

		// enhanced for loop is fail-safe
		for (String string : concurrentSkipListSet) {
			concurrentSkipListSet.add("newElement3");
			System.out.println(string);
		}

	}
}
