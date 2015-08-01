package collection.copy_on_write_array_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CopyOnWriteArraySetMain {

	public static void main(String[] args) {

		CopyOnWriteArraySetImpl<Integer> copyOnWriteArraySet = new CopyOnWriteArraySetImpl<Integer>();
		
		if (copyOnWriteArraySet.add(10))
			System.out.println("element 10 added");
		if (copyOnWriteArraySet.add(20))
			System.out.println("element 20 added");
		if (copyOnWriteArraySet.add(30))
			System.out.println("element 30 added");
		
		System.out.println("the size of copyOnWriteArraySet is " + copyOnWriteArraySet.size());
		
		if (copyOnWriteArraySet.contains(40)) 
			System.out.println("copyOnWriteArraySet contains 40");
		else
			System.out.println("copyOnWriteArraySet does not contain 40");
		
		if (copyOnWriteArraySet.remove(20))
			System.out.println("element 20 removed");
		else
			System.out.println("element 20 not removed");
		
		System.out.println("the element of copyOnWriteArraySet are");
		Iterator<Integer> iterator = copyOnWriteArraySet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		
		Set<Integer> removedSet = new HashSet<Integer>();
		removedSet.add(10);
		removedSet.add(20);
		System.out.println("the elements after removing");
		copyOnWriteArraySet.removeAll(removedSet);
		Iterator<Integer> riterator = copyOnWriteArraySet.iterator();
		while (riterator.hasNext()) {
			System.out.print(riterator.next() + "\t");
		}
		System.out.println();
		
		copyOnWriteArraySet.clear();
		System.out.println("copyOnWriteArraySet cleared");
		if (copyOnWriteArraySet.isEmpty())
			System.out.println("copyOnWriteArraySet is empty");
		else
			System.out.println("copyOnWriteArraySet is not empty");
	}

}
