package collection.hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {

		 HashSet<Integer> hashSet = new HashSet<Integer>();
	        if (hashSet.add(10))
	            System.out.println("element 10 added");
	        if (hashSet.add(20))
	            System.out.println("element 20 added");
	        if (hashSet.add(30))
	            System.out.println("element 30 added");
	        System.out.println();
	 
	        System.out.println("the size of set is " + hashSet.size());
	        System.out.println();
	 
	        if (hashSet.contains(40))
	            System.out.println("set contains 40");
	        else
	            System.out.println("set does not contain 40");
	        System.out.println();
	 
	        if (hashSet.remove(20))
	            System.out.println("element 20 removed");
	        else
	            System.out.println("element 20 not removed");
	        System.out.println();
	 
	        System.out.println("the element of set are");
	        Iterator<Integer> iterator = hashSet.iterator();
	        while (iterator.hasNext())
	        {
	            System.out.print(iterator.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        Set<Integer> removedSet = new HashSet<Integer>();
	        removedSet.add(10);
	        removedSet.add(20);
	 
	        System.out.println("the elements after removing");
	        hashSet.removeAll(removedSet);
	        Iterator<Integer> riterator = hashSet.iterator();
	        while(riterator.hasNext())
	        {
	            System.out.print(riterator.next() + "\t");
	        }
	        System.out.println();
	 
	        hashSet.clear();
	        System.out.println("hashSet cleared");
	        if (hashSet.isEmpty())
	            System.out.println("hashSet is empty");
	        else
	            System.out.println("hashSet is not empty");
	}

}
