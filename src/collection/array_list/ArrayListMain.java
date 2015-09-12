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
	            System.out.println("arrayList�� 101�� ���ԵǾ� �ֽ��ϴ�.");
	        else
	            System.out.println("arrayList�� 101�� ���ԵǾ� ���� �ʽ��ϴ�.");
	        System.out.println();
	 
	        arrayList.ensureCapacity(15);
	        System.out.println("arrayList�� 5��° ��Ͽ� " + "[ " + arrayList.get(5) +" ]" + "�� ����Ǿ� �ֽ��ϴ�.");
	        System.out.println("101�� ����Ǿ� �ִ� ����� " + "[ " + arrayList.indexOf(101) + " ��°] �Դϴ�.");
	        System.out.println();
	        
	        System.out.println("arrayList�� ��� ");
	        Iterator<Integer> itr = arrayList.iterator();
	        while (itr.hasNext())
	        {
	            System.out.print(itr.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        System.out.println("101�� ��Ҹ� ������ �ִ� ������ ����� [ " + arrayList.lastIndexOf(101) + " ��° ] �Դϴ�.");
	        System.out.println();
	        
	        System.out.println("3��° ��� ������ ���");
	        ListIterator<Integer> listIterator = arrayList.listIterator(3);
	        while (listIterator.hasNext())
	        {
	            System.out.print(listIterator.next() + "\t");
	        }
	        System.out.println();
	        System.out.println();
	 
	        // removes element at index 5
	        System.out.println("5��° ����� ��Ҹ� �����ϰڽ��ϴ�...");
	        arrayList.remove(5);
	        System.out.println();
	        
	        System.out.println("5��° ��Ұ� ���� �Ǿ����� Ȯ��!!");
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
	        
	        System.out.println("30, 300, 101�� ������ Set�� removeAll�� ���� ���� ��� : ");
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
	     
	        //retainAll() : Set�� ����� ����߿��� �־��� �÷��ư� ����� �͵� ���� 
	        Set<Integer> retainAll = new HashSet<Integer>();
	        retainAll.add(10);
	        retainAll.add(20);
	        retainAll.add(200);
	        retainAll.add(-10);
	        retainAll.addAll(addAll);	 
	        arrayList.retainAll(retainAll);
	        
//			retainAll ��� Ȯ��	        
//	        Iterator<Integer> setElementIterator = retainAll.iterator();
//	        while (setElementIterator.hasNext()) {
//				System.out.print(setElementIterator.next() + "\t");
//			}
	        
	        System.out.println("10, 20, 200, -10, 101, 102, 103���� ������ Set�� retainAll�� ���� ���� ��� : ");
	        Iterator<Integer> retainAllIterator = arrayList.iterator();
	        while (retainAllIterator.hasNext()) {
				System.out.print(retainAllIterator.next() + "\t");
			}
	        System.out.println("\n");
	        
	        System.out.println("set()�޼ҵ� ��� set(1, 101) = 1��° ��Ͽ� 101�� ��ü ");
	        arrayList.set(1, 101);
	        
	        Iterator<Integer> setIterator = arrayList.iterator();
	        while (setIterator.hasNext()) {
				System.out.print(setIterator.next() + "\t");
			}
	        System.out.println("\n");
	        
	        System.out.println("arrayList�� ũ�� :  " + arrayList.size());
	        System.out.println();
	        
	        System.out.println("subList()�޼ҵ� ��� subList(0,1) -> ����Ʈ���� 0���� 1�� ���� ���� �ʴ� ����Ʈ�� ��� ���� ");
	        System.out.println("list���� ���ϵ� ��� : ");
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
	        // �� ������ ���ش�.(�뷮(capacity)�� ũ��(size)�� ��������.) 
	        // -> �迭�� ũ�⸦ ������ �� ���� ������ ���ο� �迭�� �����ؼ� �� �ּҰ��� ���� arrayList�� �Ҵ��Ѵ�. 
	        // ������ Vector�ν��Ͻ��� �� �̻� ����� �� ������, �Ŀ� �������÷���(garbage collector)�� ���ؼ� �޸𸮿��� ���ŵȴ�.

	        System.out.println("trimToSize()�޼ҵ� ���");
	        arrayList.trimToSize();
	        System.out.println("arrayList�� ũ�� : " + arrayList.size());
	        System.out.println();
	        
	        System.out.println("clear()�޼ҵ� ���");
	        arrayList.clear();
	        if (arrayList.isEmpty())
	            System.out.println("arrayList�� ��� �ֽ��ϴ�.");
	        else
	            System.out.println("arrayList�� ��� ���� �ʽ��ϴ�.");
	}

}
