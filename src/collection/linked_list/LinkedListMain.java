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
 
        System.out.println("linked list에 300이 포함되어 있을까?? ");
        if (linkedList.contains(300))
            System.out.println("linked list에 300이 포함되어 있습니다. ");
        else
            System.out.println("linked list에 300이 포함되어 있지 않습니다.");
        
        System.out.println();
//        Iterator<Integer> oriItr = linkedList.iterator();
//        while (oriItr.hasNext()) {
//			System.out.print(oriItr.next()+ "\t");
//		}
//        System.out.println();
        
        System.out.println("요소를 내림 차순 :  ");
        Iterator<Integer> descendingitr = linkedList.descendingIterator();
        while (descendingitr.hasNext())
        {
            System.out.print(descendingitr.next() + "\t");
        }
        System.out.println("\n");
 
        System.out.println("리스트의 제일 앞의 요소(element() 메소드 사용) : " + linkedList.element());
        System.out.println("두번째 목록의 요소(get(int) 메소드 사용) : " + linkedList.get(2));
        System.out.println("첫번째 위치의 요소(getFirst() 메소드 사용) : " + linkedList.getFirst());
        System.out.println("마지막 위치의 요소(getLast() 메소드 사용) : " + linkedList.getLast());
        System.out.println("요소 200이 있는 목록(indexOf(int) 메소드 사용) : "+ linkedList.indexOf(200));
        System.out.println("요소 101이 있는 마지막 목록(lastIndexOf(int) 메소드 사용) : "+ linkedList.lastIndexOf(101));
        System.out.println();
 
        System.out.println("list의 요소 : ");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("\n");
 
        linkedList.offer(45);
        linkedList.offerFirst(32);
        linkedList.offerLast(19);
        
        System.out.println("offer메소드 사용이후 linkedlist 요소 : ");
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

        System.out.println("linkedlist의 가장 앞에있는 요소(peek() 메소드 사용) : " + linkedList.peek());
        System.out.println("linkedlist의 첫번째 요소(peekFirst() 메소드 사용) : "+ linkedList.peekFirst());
        System.out.println("linkedlist의 마지막 요소(peekLast() 메소드 사용) : "+ linkedList.peekLast());
 
        System.out.println("리스트의 요소 : ");
        itr = linkedList.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("\n");
 
        System.out.println("linkedList의 첫번째 요소 빼오기(poll() 메소드 사용) : "+ linkedList.poll());
        System.out.println("linkedList의 첫번째 요소 빼오기(pollFirst() 메소드 사용) : "+ linkedList.pollFirst());
        System.out.println("linkedList의 마지막 요소 빼오기(pollLast() 메소드 사용) : "+ linkedList.pollLast());
        System.out.println();
        
        System.out.println("poll() 메소드 사용후 linkedList의 요소 : ");
        itr = linkedList.iterator();
        while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("linkedList에 36 push");
        linkedList.push(36);
        System.out.println();
        
        System.out.println("linkedList에서 요소 pop(pop() 메소드 사용) : "+ linkedList.pop());
        System.out.println("linkedList에서 3번째 목록 삭제(remove(int) 메소드 사용) : "+ linkedList.remove(3));
        System.out.println("linkedList에서 최근에 발생한 101요소 삭제(removeLastOccurence(int) 메소드 사용) : "+ linkedList.removeLastOccurence(101));
        System.out.println();
        
        System.out.println("현제 linkedList에 담겨져있는 요소 : ");
        itr = linkedList.iterator();
        while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("clear()메소드 사용");
        linkedList.clear();
        if (linkedList.isEmpty())
            System.out.println("linkedList는 비어 있습니다.");
        else
            System.out.println("linkedList는 비어 있지 않습니다.");
        
        /*ArrayList클래스와 LinkedList클래스의 차이점
         * 1. ArrayList<E>의 특징, 배열의 특징과 일치한다
         * 	저장소의 용량을 늘리는 과정에서 많은 시간이 소요된다. ArrayList<E>의 단점 --> 많은 데이터의 추가 / 삭제시에는 배열의 복사기 빈번하게 일어나기 때문에 성능 저하
         * 	데이터의 삭제에 필요한 연산과정이 매우 길다 ArrayList<E>의 단점
         * 	데이터의 참조가 용이해서 빠른 참조가 가능하다. ArrayList<E>의 장점 --> 각데이터에 대한 인덱스를 가지고 있기 때문에 검색이 빠르다.
         * 
         * 2. LinkedList<E>의 특징, 리스트 자료구조의 특징과 일치한다.
         * 	저장소의 용량을 늘리는 과정이 간단하다. LinkedList<E>의 장점 --> 데이터의 추가 / 삭제는 위치정보의 수정만으로 가능하기 때문에 많은 정보의 추가 / 삭제 처리가 필요필요할때 유용하다.
         * 	데이터의 삭제가 매우 간단하다. LinkedList<E>의 장점
         * 	데이터의 참조가 다소 불편하다. LinkedList<E>의 단점 --> 데이터가 많은 경우의 검색시 처음 자료부터 순차적으로 찾아 나가야 하기때문에 느려진다.
         * 
         */
    }	

}
