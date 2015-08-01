package collection.vector;

import java.util.Enumeration;

public class VectorMain {

	public static void main(String[] args) {

		  VectorImpl<Integer> vector = new VectorImpl<Integer>();
	        vector.add(100);
	        vector.add(200);
	        vector.add(399);
	        vector.add(120);
	        vector.addElement(400);
	        vector.addElement(40);
	        System.out.println("the capacity of the vector is " + vector.capacity());
	        System.out.println("elements of vector is ");
	        Enumeration<Integer> elements = vector.elements();
	        while (elements.hasMoreElements())
	        {
	            System.out.print(elements.nextElement() + "\t");
	        }
	        System.out.println();
	        if (vector.contains(200))
	            System.out.println("the vector contains 200");
	        System.out.println("the first element is " + vector.firstElement());
	        System.out.println("the last element is  " + vector.lastElement());
	        System.out.println("element " + vector.remove(2) + " at index 2 removed"); 
	        System.out.println("the size of the vector is " + vector.size());
	}

}
