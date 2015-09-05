package collection.abstract_sequential_List;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AbstractSequentialListImpl<E> extends AbstractSequentialList<E>{
	
	List<Integer> list;

	AbstractSequentialListImpl(){

	    list = new LinkedList<Integer>();

	  }

	public void add(int i){

	  list.add(i);

	  System.out.println(list);

	}

	public ListIterator<E> listIterator(int i) {

	    ListIterator<Integer> li = list.listIterator();

	    while(li.hasNext()){

	      System.out.println(li.next());
	    }

	    return null;
	  }

	  public int size() {

	    System.out.println(list.size());

	    return 0;

	  }
}
