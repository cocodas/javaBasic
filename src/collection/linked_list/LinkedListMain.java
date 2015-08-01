package collection.linked_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
        linkedList.add(100);
        linkedList.add(20);
        linkedList.addFirst(101);
        linkedList.addLast(200);
 
        Set<Integer> set = new HashSet<Integer>();
        set.add(101);
        set.add(30);
        set.add(32);
        linkedList.addAll(4, set);
 
        System.out.println("linked list에 300이 포함되어 있을까?? ");
        if (linkedList.contains(300))
            System.out.println("linked list에 300이 포함되어 있습니다. ");
        else
            System.out.println("linked list에 300이 포함되어 있지 않습니다.");
        
        System.out.println();
        
        System.out.println("요소를 내림 차순 :  ");
        Iterator<Integer> descendingitr = linkedList.descendingIterator();
        while (descendingitr.hasNext())
        {
            System.out.print(descendingitr.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        System.out.println("the head of this list is " + linkedList.element());
        System.out.println("the element at index 2 is " + linkedList.get(2));
        System.out.println("the element first pos is  " + linkedList.getFirst());
        System.out.println("the element at last pos is " + linkedList.getLast());
        System.out.println("the index of element 200 is "+ linkedList.indexOf(200));
        System.out.println("the last index of element 101 is "+ linkedList.lastIndexOf(101));
        
        System.out.println();
 
        System.out.println("list의 요소 : ");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        linkedList.offer(45);
        linkedList.offerFirst(32);
        linkedList.offerLast(19);
 
        System.out.println("the head of the linkedlist is " + linkedList.peek());
        System.out.println("the first element of linkedList is "+ linkedList.peekFirst());
        System.out.println("the last element of linked List is "+ linkedList.peekLast());
 
        System.out.println("the elements of list are");
        itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        System.out.println();
 
        System.out.println("the first element of linkedList is (poll) "+ linkedList.poll());
        System.out.println("the first element polled is "+ linkedList.pollFirst());
        System.out.println("the last element polled is "+ linkedList.pollLast());
        linkedList.push(36);
        System.out.println("the element poped from linked List is "+ linkedList.pop());
        System.out.println("index 3 element removed from list "+ linkedList.remove(3));
        System.out.println("last occurence of 101 removed "+ linkedList.removeLastOccurence(101));
        System.out.println();
        
        linkedList.clear();
        if (linkedList.isEmpty())
            System.out.println("the linkedList is empty");
        else
            System.out.println("the linked list is not empty");
    }	

}
