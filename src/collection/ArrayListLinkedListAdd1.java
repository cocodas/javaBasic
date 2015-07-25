package collection;

import java.util.List;

public class ArrayListLinkedListAdd1 {
	
	public static long add1(List list) {
		long start = System.currentTimeMillis(); 
        for(int i=0; i<100000;i++) list.add(i+""); 
        long end = System.currentTimeMillis(); 
        return end - start; 
	}

}
