package collection.linked_hash_set;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl<E> {
	
	 private LinkedHashSet<E> linkedHashSet;
	 
	    public LinkedHashSetImpl()
	    {
	        linkedHashSet = new LinkedHashSet<E>();
	    }
	 
	    public LinkedHashSetImpl(Collection<? extends E> c)
	    {
	        linkedHashSet = new LinkedHashSet<E>(c);
	    }
	 
	    public LinkedHashSetImpl(int initialCapacity)
	    {
	        linkedHashSet = new LinkedHashSet<E>(initialCapacity);
	    }
	 
	    public LinkedHashSetImpl(int initialCapacity, float loadFactor)
	    {
	        linkedHashSet = new LinkedHashSet<E>(initialCapacity, loadFactor);
	    }
	 
	    public int size()
	    {
	        return linkedHashSet.size();
	    }
	 
	    public boolean isEmpty()
	    {
	        return linkedHashSet.isEmpty();
	    }
	 
	    public boolean contains(Object o)  
	      throws ClassCastException,NullPointerException
	    {
	        return linkedHashSet.contains(o);
	    }
	 
	    public Iterator<E> iterator()
	    {
	        return linkedHashSet.iterator();
	    }
	 
	    public Object[] toArray()
	    {
	        return linkedHashSet.toArray();
	    }
	 
	    public <T> T[] toArray(T[] a)
	      throws ArrayStoreException,NullPointerException
	    {
	        return linkedHashSet.toArray(a);
	    }
	 
	    public boolean add(E e)
	      throws UnsupportedOperationException,ClassCastException, NullPointerException, IllegalArgumentException     
	    {
	        return linkedHashSet.add(e);
	    }
	 
	    public boolean remove(Object o)
	      throws ClassCastException,NullPointerException, UnsupportedOperationException
	    {
	        return linkedHashSet.remove(o);
	    }
	 
	    public boolean containsAll(Collection<?> c)
	      throws ClassCastException,NullPointerException
	    {
	        return linkedHashSet.containsAll(c);
	    }
	 
	    public boolean addAll(Collection<? extends E> c)
	      throws UnsupportedOperationException, ClassCastException,NullPointerException, IllegalArgumentException    
	    {
	        return linkedHashSet.addAll(c);
	    }
	 
	    public boolean retainAll(Collection<?> c)
	      throws UnsupportedOperationException, ClassCastException,NullPointerException
	    {
	        return linkedHashSet.retainAll(c);
	    }
	 
	    public boolean removeAll(Collection<?> c)
	      throws UnsupportedOperationException, NullPointerException,ClassCastException
	    {
	        return linkedHashSet.retainAll(c);
	    }
	 
	    public void clear()
	      throws UnsupportedOperationException
	    {
	        linkedHashSet.clear();
	    }
	 
	    public boolean equals(Object o)
	    {
	        return linkedHashSet.equals(o);
	    }
	 
	    public int hashCode()
	    {
	        return linkedHashSet.hashCode();
	    }

}
