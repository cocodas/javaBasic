package collection;

import java.util.List;

public class ArrayListLinkedListAdd2 {
	
	public static long add2(List list) {
		 long start = System.currentTimeMillis(); 
	        for(int i=0; i<1000;i++) list.add(500, "X"); 
	        long end = System.currentTimeMillis(); 
	        return end - start; 
	}

}
