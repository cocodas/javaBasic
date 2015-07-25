package collection;

import java.util.List;

public class ArrayListLinkedListRemove2 {
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis(); 
        for(int i=0; i<1000;i++) list.remove(i); 
        long end = System.currentTimeMillis(); 
        return end - start; 
	}

}
