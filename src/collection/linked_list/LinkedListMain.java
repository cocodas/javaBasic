package collection.linked_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
        linkedList.add(100);
        linkedList.add(20);
        linkedList.addFirst(101);
        linkedList.addLast(200);
 
        Set<Integer> set = new HashSet<Integer>();
        set.add(101);
        set.add(30);
        set.add(32);
        linkedList.addAll(4, set);
 
        System.out.println("linked list�� 300�� ���ԵǾ� ������?? ");
        if (linkedList.contains(300))
            System.out.println("linked list�� 300�� ���ԵǾ� �ֽ��ϴ�. ");
        else
            System.out.println("linked list�� 300�� ���ԵǾ� ���� �ʽ��ϴ�.");
        
        System.out.println();
//        Iterator<Integer> oriItr = linkedList.iterator();
//        while (oriItr.hasNext()) {
//			System.out.print(oriItr.next()+ "\t");
//		}
//        System.out.println();
        
        System.out.println("��Ҹ� ���� ���� :  ");
        Iterator<Integer> descendingitr = linkedList.descendingIterator();
        while (descendingitr.hasNext())
        {
            System.out.print(descendingitr.next() + "\t");
        }
        System.out.println("\n");
 
        System.out.println("����Ʈ�� ���� ���� ���(element() �޼ҵ� ���) : " + linkedList.element());
        System.out.println("�ι�° ����� ���(get(int) �޼ҵ� ���) : " + linkedList.get(2));
        System.out.println("ù��° ��ġ�� ���(getFirst() �޼ҵ� ���) : " + linkedList.getFirst());
        System.out.println("������ ��ġ�� ���(getLast() �޼ҵ� ���) : " + linkedList.getLast());
        System.out.println("��� 200�� �ִ� ���(indexOf(int) �޼ҵ� ���) : "+ linkedList.indexOf(200));
        System.out.println("��� 101�� �ִ� ������ ���(lastIndexOf(int) �޼ҵ� ���) : "+ linkedList.lastIndexOf(101));
        System.out.println();
 
        System.out.println("list�� ��� : ");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("\n");
 
        linkedList.offer(45);
        linkedList.offerFirst(32);
        linkedList.offerLast(19);
        
        System.out.println("offer�޼ҵ� ������� linkedlist ��� : ");
        itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("\n");
        
//        Iterator<Integer> offerItr = linkedList.iterator();
//        while (offerItr.hasNext())
//        {
//            System.out.print(offerItr.next() + "\t");
//        }
//        System.out.println("\n");

        System.out.println("linkedlist�� ���� �տ��ִ� ���(peek() �޼ҵ� ���) : " + linkedList.peek());
        System.out.println("linkedlist�� ù��° ���(peekFirst() �޼ҵ� ���) : "+ linkedList.peekFirst());
        System.out.println("linkedlist�� ������ ���(peekLast() �޼ҵ� ���) : "+ linkedList.peekLast());
 
        System.out.println("����Ʈ�� ��� : ");
        itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("\n");
 
        System.out.println("linkedList�� ù��° ��� ������(poll() �޼ҵ� ���) : "+ linkedList.poll());
        System.out.println("linkedList�� ù��° ��� ������(pollFirst() �޼ҵ� ���) : "+ linkedList.pollFirst());
        System.out.println("linkedList�� ������ ��� ������(pollLast() �޼ҵ� ���) : "+ linkedList.pollLast());
        System.out.println();
        
        System.out.println("poll() �޼ҵ� ����� linkedList�� ��� : ");
        itr = linkedList.iterator();
        while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("linkedList�� 36 push");
        linkedList.push(36);
        System.out.println();
        
        System.out.println("linkedList���� ��� pop(pop() �޼ҵ� ���) : "+ linkedList.pop());
        System.out.println("linkedList���� 3��° ��� ����(remove(int) �޼ҵ� ���) : "+ linkedList.remove(3));
        System.out.println("linkedList���� �ֱٿ� �߻��� 101��� ����(removeLastOccurence(int) �޼ҵ� ���) : "+ linkedList.removeLastOccurence(101));
        System.out.println();
        
        System.out.println("���� linkedList�� ������ִ� ��� : ");
        itr = linkedList.iterator();
        while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("clear()�޼ҵ� ���");
        linkedList.clear();
        if (linkedList.isEmpty())
            System.out.println("linkedList�� ��� �ֽ��ϴ�.");
        else
            System.out.println("linkedList�� ��� ���� �ʽ��ϴ�.");
        
        /*ArrayListŬ������ LinkedListŬ������ ������
         * 1. ArrayList<E>�� Ư¡, �迭�� Ư¡�� ��ġ�Ѵ�
         * 	������� �뷮�� �ø��� �������� ���� �ð��� �ҿ�ȴ�. ArrayList<E>�� ���� --> ���� �������� �߰� / �����ÿ��� �迭�� ����� ����ϰ� �Ͼ�� ������ ���� ����
         * 	�������� ������ �ʿ��� ��������� �ſ� ��� ArrayList<E>�� ����
         * 	�������� ������ �����ؼ� ���� ������ �����ϴ�. ArrayList<E>�� ���� --> �������Ϳ� ���� �ε����� ������ �ֱ� ������ �˻��� ������.
         * 
         * 2. LinkedList<E>�� Ư¡, ����Ʈ �ڷᱸ���� Ư¡�� ��ġ�Ѵ�.
         * 	������� �뷮�� �ø��� ������ �����ϴ�. LinkedList<E>�� ���� --> �������� �߰� / ������ ��ġ������ ���������� �����ϱ� ������ ���� ������ �߰� / ���� ó���� �ʿ��ʿ��Ҷ� �����ϴ�.
         * 	�������� ������ �ſ� �����ϴ�. LinkedList<E>�� ����
         * 	�������� ������ �ټ� �����ϴ�. LinkedList<E>�� ���� --> �����Ͱ� ���� ����� �˻��� ó�� �ڷ���� ���������� ã�� ������ �ϱ⶧���� ��������.
         * 
         */
    }	

}
