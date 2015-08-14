package collection.abstract_list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class AbstractListImpl<E> extends AbstractList<E> {
	
	List<E> list;

	AbstractListImpl(){

	    list = new ArrayList<E>();

	  }

	  public E get(int i) {

	  System.out.println(list.get(i));

	    return null;

	  }

	  public int size() {

	    System.out.println(list.size());

	    return 0;

	  }

	@SuppressWarnings("unchecked")
	public boolean add(Object e)

	  {

	    list.add((E) e);

	    //System.out.println(list);

	    return false;

	  }


}
