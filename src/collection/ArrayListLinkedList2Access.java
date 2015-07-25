package collection;

import java.util.List;

public class ArrayListLinkedList2Access {
	
	public static long access(List list) {
		long start = System.currentTimeMillis(); 
        for(int i=0; i<10000;i++) list.get(i); 
        long end = System.currentTimeMillis(); 
        return end - start; 
	}

}
