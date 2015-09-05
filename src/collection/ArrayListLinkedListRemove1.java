package collection;

import java.util.List;

public class ArrayListLinkedListRemove1 {
	
	public static long remove1(List list) {
		 long start = System.currentTimeMillis(); 
	        for(int i=list.size()-1; i > 0;i--) list.remove(i); 
	        long end = System.currentTimeMillis(); 
	        return end - start; 
	}

}
