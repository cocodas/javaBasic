package collection.vector;

import java.util.Enumeration;
import java.util.Iterator;

public class VectorMain {

	public static void main(String[] args) {

		  VectorImpl<Integer> vector = new VectorImpl<Integer>();
	        vector.add(100);
	        vector.add(200);
	        vector.add(399);
	        vector.add(120);
	        vector.addElement(400);
	        vector.addElement(40);
	        
	        System.out.println("vector의 용량 : " + vector.capacity());
	        System.out.println();
	        
	        System.out.println("vector의 원소 : ");
	        Enumeration<Integer> elements = vector.elements();
	        while (elements.hasMoreElements())
	        {
	            System.out.print(elements.nextElement() + "\t");
	        }
	        System.out.println("\n");
	       
	        
//	        Iterator<Integer> itr = vector.iterator();
//	        while (itr.hasNext()) {
//				System.out.print(itr.next() + "\t");
//			}
//	        System.out.println("\n");
	        
	        
	        if (vector.contains(200))
	            System.out.println("vector에 200이 포함되어 있습니다.");
	        else
	        	System.out.println("vector에 200이 포함되어 있지 않습니다.");
	        System.out.println();
	        
	        System.out.println("vector의 첫번째 원소 : " + vector.firstElement());
	        System.out.println("vector의 마지막 원소 : " + vector.lastElement());
	        System.out.println("vector의 두번째 목록에 저장된 [ " + vector.remove(2) + " ]가 삭제 되었습니다."); 
	        System.out.println("vector의 크기 : " + vector.size());
	}

}
