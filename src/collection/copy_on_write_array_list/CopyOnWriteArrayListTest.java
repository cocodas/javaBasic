package collection.copy_on_write_array_list;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
	
	CopyOnWriteArrayList<String> threadSafeList;
	
	public CopyOnWriteArrayListTest() {
		threadSafeList = new CopyOnWriteArrayList<String>();
	}
	
	public void add(String s) {
		threadSafeList.add(s);
		
	}
	
	public ListIterator<String> listIterator() {
		
		ListIterator<String> li = (ListIterator<String>) threadSafeList.iterator();
		
		return li;
		
	}

}
