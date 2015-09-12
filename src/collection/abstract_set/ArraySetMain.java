package collection.abstract_set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class ArraySetMain {
	public static void main(String[] args) {
		String elements[] = { "A", "B", "C", "D", "E", "A" };
		Set<String> set = new ArraySet<String>(Arrays.asList(elements));
	    Iterator<String> iter = set.iterator();
	    while (iter.hasNext()) {
	      System.out.print(iter.next() + "\t");
	    }
	    
	    //중복된 원소는 하나만 저장 
	}
}
