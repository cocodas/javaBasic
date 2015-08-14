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
			//ArrayList는 스레드에 안전하게 설계되지 않았다. 그 덕분에 빠르기는 하지만 스레드 처리에 민감한 경우 Vector를 쓰거나 
			//ArrayList를 쓰면서 synchroized를 적절하게 사용해야만 했다. 그러나 이러한 방식은 각각의 스레드가 과도하게 혹은
			//필요 이상으로 이 synchronized에 따라 멈추거나 기다려야만 하는 상황을 유발시키므로 성능에 안좋은 영향을 미치기도 한다.
			//따라서 이러한 경우의 해결방법 중의 하나가 바로 CopyOnWriteArrayList이다. CopyOnWriteArrayList는 딱 한가지특징만을
			//제외하면 ArrayList와 동일하다. CopyOnWriteArrayList의 컨텐츠를 읽기 위해 어딘가에 전달할때 CopyOnWriteArrayList는
			//컨텐츠를 복사해서 전달한다. 따라서 CopyOnWriteArrayList를 쓰는 다양한 스레드에서 안심하고 읽을수 있다. 
			//물론 CopyOnWriteArrayList는  주로 많은 수의 스레드는 주로  List를 읽고 소수의 스레드나 메소드내에서만 해당 List를 수정하는 경우에 
			//유리할 것이다.
		}
		
	}

}
