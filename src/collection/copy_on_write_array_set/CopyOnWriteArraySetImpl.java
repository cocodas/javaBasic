package collection.copy_on_write_array_set;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetImpl<E> {
	
	private CopyOnWriteArraySet<E> copyOnWriteArraySet;
	 
    public CopyOnWriteArraySetImpl()
    {
        copyOnWriteArraySet = new CopyOnWriteArraySet<E>();
    }
 
    public CopyOnWriteArraySetImpl(Collection<? extends E> c)
    {
        copyOnWriteArraySet = new CopyOnWriteArraySet<E>(c);
    }
 
    public boolean add(E eobj)
    {
        return copyOnWriteArraySet.add(eobj);
    }
 
    public boolean contains(Object obj)
    {
        return copyOnWriteArraySet.contains(obj);
    }
 
    public boolean isEmpty()
    {
        return copyOnWriteArraySet.isEmpty();
    }
 
    public Iterator<E> iterator()
    {
        return copyOnWriteArraySet.iterator();
    }
 
    public boolean remove(Object obj)
    {
        return copyOnWriteArraySet.remove(obj);
    }
 
    public int size()
    {
        return copyOnWriteArraySet.size();
    }
 
    public void clear()
    {
        copyOnWriteArraySet.clear();
    }
 
    public Object[] toArray()
    {
        return copyOnWriteArraySet.toArray();
    }
 
    public boolean addAll(Collection<? extends E> c)
    throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException 
    {
        return copyOnWriteArraySet.addAll(c);
    }
 
    public boolean retainAll(Collection<?> c)
      throws UnsupportedOperationException, ClassCastException, NullPointerException
    {
        return copyOnWriteArraySet.retainAll(c);
    }
 
    public boolean removeAll(Collection<?> c)
      throws UnsupportedOperationException, NullPointerException, ClassCastException
    {
        return copyOnWriteArraySet.retainAll(c);
    }
 
    public <T> T[] toArray(T[] a) throws ArrayStoreException, NullPointerException
    {
        return copyOnWriteArraySet.toArray(a);
    }

}
