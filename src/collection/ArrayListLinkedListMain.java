package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListMain {

	public static void main(String[] args) {

		// 추가할 데이터의 개수를 고려하여 충분히 잡아야한다.
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        
        ArrayListLinkedListAdd1 linkedListAdd1 = new ArrayListLinkedListAdd1();
        ArrayListLinkedListAdd2 linkedListAdd2 = new ArrayListLinkedListAdd2();
        ArrayListLinkedListRemove1 linkedListRemove1 = new ArrayListLinkedListRemove1();
        ArrayListLinkedListRemove2 linkedListRemove2 = new ArrayListLinkedListRemove2();

        System.out.println("= 순차적으로 추가하기 ="); 
        System.out.println("ArrayList :" + linkedListAdd1.add1(al)); 
        System.out.println("LinkedList :"+ linkedListAdd1.add1(ll)); 

        System.out.println(); 
        System.out.println("= 중간에 추가하기 ="); 
        System.out.println("ArrayList :"+linkedListAdd2.add2(al)); 
        System.out.println("LinkedList :"+linkedListAdd2.add2(ll)); 

        System.out.println(); 
        System.out.println("= 중간에서 삭제하기 ="); 
        System.out.println("ArrayList :"+linkedListRemove2.remove2(al)); 
        System.out.println("LinkedList :"+linkedListRemove2.remove2(ll)); 

        System.out.println(); 
        System.out.println("= 순차적으로 삭제하기 ="); 
        System.out.println("ArrayList :"+linkedListRemove1.remove1(al)); 
        System.out.println("LinkedList :"+linkedListRemove1.remove1(ll)); 
	} 

}


