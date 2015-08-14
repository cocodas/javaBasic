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
	        
	        System.out.println("vector�� �뷮 : " + vector.capacity());
	        System.out.println();
	        
	        System.out.println("vector�� ���� : ");
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
	            System.out.println("vector�� 200�� ���ԵǾ� �ֽ��ϴ�.");
	        else
	        	System.out.println("vector�� 200�� ���ԵǾ� ���� �ʽ��ϴ�.");
	        System.out.println();
	        
	        System.out.println("vector�� ù��° ���� : " + vector.firstElement());
	        System.out.println("vector�� ������ ���� : " + vector.lastElement());
	        System.out.println("vector�� �ι�° ��Ͽ� ����� [ " + vector.remove(2) + " ]�� ���� �Ǿ����ϴ�."); 
	        System.out.println("vector�� ũ�� : " + vector.size());
	}

}
