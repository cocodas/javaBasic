package collection.copy_on_write_array_list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTestMain {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
		
		copyOnWriteArrayList.add("Java");
		copyOnWriteArrayList.add("CopyOnWriteArrayList");
		copyOnWriteArrayList.add("Collection");
		
		Iterator<String> failSafeIterator = copyOnWriteArrayList.listIterator();
		
		while (failSafeIterator.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
	
			//failSafeIterator.remove(); //CopyOnWriteArrayList에서 remove는 지원 하지 않는다.
		}
		
	}

}
