package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList2Main {

	public static void main(String[] args) {
		
		ArrayListLinkedList2Add arrayListLinkedList2Add = new ArrayListLinkedList2Add();
		ArrayListLinkedList2Access arrayListLinkedList2Access = new ArrayListLinkedList2Access();
		ArrayList al = new ArrayList(1000000); 
        LinkedList ll = new LinkedList(); 
        arrayListLinkedList2Add.add(al);
        arrayListLinkedList2Add.add(ll);
        
        System.out.println("= 접근시간테스트 ="); 
        System.out.println("ArrayList :"+ arrayListLinkedList2Access.access(al)); 
        System.out.println("LinkedList :"+arrayListLinkedList2Access.access(ll)); 
  }
}
