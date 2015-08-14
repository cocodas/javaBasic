package collection.array_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListMain {

	public static void main(String[] args) {

		 ArrayListImpl<Integer> arrayList = new ArrayListImpl<Integer>();
		 
	        arrayList.add(10);
	        arrayList.add(20);
	        arrayList.add(30);
	        arrayList.add(3, 40);
	        arrayList.add(-10);
	 
	        Set<Integer> addAll = new HashSet<Integer>();
	        addAll.add(101);
	        addAll.add(200);
	        addAll.add(300);
	        arrayList.addAll(addAll);
	 
	        Set<Integer> indexAddAll = new HashSet<Integer>();
	        indexAddAll.add(101);
	        indexAddAll.add(102);
	        indexAddAll.add(103);
	 
	        arrayList.addAll(5, indexAddAll);
	        
	 
	        if (arrayList.contains(101))
	            System.out.println("arrayList에 101이 포함되어 있습니다.");
	        else
	            System.out.println("arrayList에 101이 포함되어 있지 않습니다.");
	        System.out.println();
	 
	        arrayList.ensureCapacity(15);
	        System.out.println("arrayList는 5번째 목록에 " + "[ " + arrayList.get(5) +" ]" + "가 저장되어 있습니다.");
	        System.out.println("101이 저장되어 있는 목록은 " + "[ " + arrayList.indexOf(101) + " 번째] 입니다.");
	        System.out.println();
	        
	        System.out.println("arrayList의 요소 ");
	        Iterator<Integer> itr = arrayList.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        System.out.println("101의 요소를 가지고 있는 마지막 목록은 [ " + arrayList.lastIndexOf(101) + " 번째 ] 입니다.");
	        System.out.println();
	        
	        System.out.println("3번째 목록 이후의 요소");
	        ListIterator<Integer> listIterator = arrayList.listIterator(3);
	        while (listIterator.hasNext())
	        {
	            System.out.print(listIterator.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        // removes element at index 5
	        System.out.println("5번째 목록의 요소를 삭제하겠습니다...");
	        arrayList.remove(5);
	        System.out.println();
	        
	        System.out.println("5번째 요소가 삭제 되었는지 확인!!");
	        itr = arrayList.iterator();
	        while (itr.hasNext()) {
				System.out.print(itr.next() + "\t");
			}
//	        Iterator<Integer> removeIterator = arrayList.iterator();
//	        while (removeIterator.hasNext()) {
//				System.out.print(removeIterator.next() + "\t");
//			}
	        System.out.println();
	        System.out.println();
	        
	        System.out.println("30, 300, 101로 구성된 Set을 removeAll한 후의 남은 요소 : ");
	        Set<Integer> removeAll = new HashSet<Integer>();
	        removeAll.add(30);
	        removeAll.add(300);
	        removeAll.add(101);	 
	        arrayList.removeAll(removeAll);
	        
	        Iterator<Integer> removeAllIterator = arrayList.iterator();
	        while (removeAllIterator.hasNext()) {
				System.out.print(removeAllIterator.next() + "\t");
			}
	        System.out.println();
	        System.out.println();
	     
	        //retainAll() : Set에 저장된 요소중에서 주어진 컬렉셕과 공통된 것들 삭제 
	        Set<Integer> retainAll = new HashSet<Integer>();
	        retainAll.add(10);
	        retainAll.add(20);
	        retainAll.add(200);
	        retainAll.add(-10);
	        retainAll.addAll(addAll);	 
	        arrayList.retainAll(retainAll);
	        
//			retainAll 요소 확인	        
//	        Iterator<Integer> setElementIterator = retainAll.iterator();
//	        while (setElementIterator.hasNext()) {
//				System.out.print(setElementIterator.next() + "\t");
//			}
	        
	        System.out.println("10, 20, 200, -10, 101, 102, 103으로 구성된 Set을 retainAll한 후의 남은 요소 : ");
	        Iterator<Integer> retainAllIterator = arrayList.iterator();
	        while (retainAllIterator.hasNext()) {
				System.out.print(retainAllIterator.next() + "\t");
			}
	        System.out.println("\n");
	        
	        System.out.println("set()메소드 사용 set(1, 101) = 1번째 목록에 101로 대체 ");
	        arrayList.set(1, 101);
	        
	        Iterator<Integer> setIterator = arrayList.iterator();
	        while (setIterator.hasNext()) {
				System.out.print(setIterator.next() + "\t");
			}
	        System.out.println("\n");
	        
	        System.out.println("arrayList의 크기 :  " + arrayList.size());
	        System.out.println();
	        
	        System.out.println("subList()메소드 사용 subList(0,1) -> 리스트에서 0부터 1을 포함 하지 않는 리스트의 요소 리턴 ");
	        System.out.println("list에서 리턴된 요소 : ");
	        List<Integer> list = arrayList.subList(0,1);
	        for (int i = 0; i < list.size(); i++)
	        {
	            System.out.println(list.get(i) + "\t");
	        }
	        System.out.println();
	        
	        System.out.println("the elements of returned array are");
	        Object[] array = (Object[]) arrayList.toArray();
	        for (int i = 0; i < array.length; i++)
	        {
	            System.out.print(array[i] + "\t");
	        }
	        System.out.println("\n");
	        
	        // trimToSize()
	        // 빈 공간을 없앤다.(용량(capacity)과 크기(size)가 같아진다.) 
	        // -> 배열은 크기를 변경할 수 없기 때문에 새로운 배열을 생성해서 그 주소값을 변수 arrayList에 할당한다. 
	        // 기존의 Vector인스턴스는 더 이상 사용할 수 없으며, 후에 가비지컬렉터(garbage collector)에 의해서 메모리에서 제거된다.

	        System.out.println("trimToSize()메소드 사용");
	        arrayList.trimToSize();
	        System.out.println("arrayList의 크기 : " + arrayList.size());
	        System.out.println();
	        
	        System.out.println("clear()메소드 사용");
	        arrayList.clear();
	        if (arrayList.isEmpty())
	            System.out.println("arrayList는 비어 있습니다.");
	        else
	            System.out.println("arrayList는 비어 있지 않습니다.");
	}

}
