package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayListPrint arrayListPrint = new ArrayListPrint();

		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		arrayListPrint.print(list1, list2);

		Collections.sort(list1);	// list1�� list2�� �����Ѵ�.
		Collections.sort(list2);	// Collections.sort(List l)
		
		arrayListPrint.print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		arrayListPrint.print(list1, list2);
		
		list2.set(3, "AA");
		arrayListPrint.print(list1, list2);
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		
		arrayListPrint.print(list1, list2);
		
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		arrayListPrint.print(list1, list2);
	}

}