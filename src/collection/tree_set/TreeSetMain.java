package collection.tree_set;

import java.util.Iterator;
import java.util.NavigableSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSetImpl<Integer> treeSet = new TreeSetImpl<Integer>();
		 
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(5);
        treeSet.add(-10);
 
        Iterator<Integer> titerator = treeSet.iterator();
        System.out.println("the elements are");
        while (titerator.hasNext())
        {
            System.out.print(titerator.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        System.out.println("the size of the TreeSet is " + treeSet.size());
        System.out.println();
 
        System.out.println("the ceiling of -100 in the TreeSet is "+ treeSet.ceiling(-100));
        System.out.println();
 
        Iterator<Integer> revitr = treeSet.descendingIterator();
        System.out.println("the reverse order is ");
        while (revitr.hasNext())
        {
            System.out.print(revitr.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        System.out.println("the lowest element in the set is " + treeSet.first());
        System.out.println();
        
        System.out.println("the floor of 20 in treeSet is " + treeSet.floor(20));
        System.out.println();
 
        System.out.println("the last element in the set is " + treeSet.last());
        System.out.println();
        
        System.out.println("element 20 removed is " + treeSet.remove(20));
        System.out.println();
 
        if (treeSet.isEmpty())
            System.out.println("the set is empty");
        else
            System.out.println("the set is not empty");
        System.out.println();
 
        NavigableSet<Integer> navigableSet;
        Iterator<Integer> itr;
 
        System.out.println("the headSet of 40 is  ");
        navigableSet = treeSet.headSet(40, true);
        itr = navigableSet.iterator();
 
        while (itr.hasNext())
        {
            System.out.println(itr.next() + "\t");
        }
        System.out.println();
 
        System.out.println("the subset between 5 and 30 ");
        navigableSet = treeSet.subSet(5, true, 30, true);
        itr = navigableSet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next() + "\t");
        }
        System.out.println();
 
        System.out.println("the tailSet of 10 is  ");
        navigableSet = treeSet.tailSet(10, true);
        itr = navigableSet.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next() + "\t");
        }
        System.out.println();

	}

}
