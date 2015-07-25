package collection.abstractset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class ArraySetMain {
	public static void main(String[] args) {
		String elements[] = { "A", "B", "C", "D", "E" };
		Set<String> set = new ArraySet<String>(Arrays.asList(elements));
	    Iterator<String> iter = set.iterator();
	    while (iter.hasNext()) {
	      System.out.println(iter.next());
	    }
	}
}
