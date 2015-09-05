package collection.linked_hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {

		LinkedHashSetImpl<Integer> linkedHashSet = new LinkedHashSetImpl<Integer>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
 
        System.out.println("the size of the linkedhashset is : " + linkedHashSet.size());
        System.out.println();
 
        System.out.println("the elements in linkedhashset are :");
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while(iterator.hasNext())
        { 
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        System.out.println("element 40 removed is " + linkedHashSet.remove(40));
        System.out.println();
        
        if(linkedHashSet.isEmpty())
            System.out.println("the linkedHashset is empty");
        else
            System.out.println("the linkedhashset is not empty");
        System.out.println();
 
        Set<Integer> retainedSet = new HashSet<Integer>();
        retainedSet.add(10);
        retainedSet.add(20);
 
        System.out.println("the elements retained in LinkedhashSet");
        linkedHashSet.retainAll(retainedSet);
        Iterator<Integer> riterator = linkedHashSet.iterator();
        while(riterator.hasNext())
        {
            System.out.print(riterator.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        linkedHashSet.clear();
        System.out.println("the linkedHashSet cleared");
        if(linkedHashSet.isEmpty())
            System.out.println("the linkedHashSet is empty");
        else
            System.out.println("the linkedHashSet is not empty");
	}

}
