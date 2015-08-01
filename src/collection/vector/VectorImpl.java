package collection.vector;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorImpl<E> {
	
	private Vector<E> vector;
	 
    public VectorImpl()
    {
        vector = new Vector<E>();
    }
 
    public VectorImpl(Collection<? extends E> c)
    {
        vector = new Vector<E>(c);
    }
 
    public VectorImpl(int initialCapacity)
    {
        vector = new Vector<E>(initialCapacity);
    }
 
    public VectorImpl(int initialCapacity, int capacityIncrement)
    {
        vector = new Vector<E>(initialCapacity, capacityIncrement);
    }
 
    public boolean add(E e)
    {
        return vector.add(e);
    }
 
    public void add(int index, E element)
    {
        vector.add(index, element);
    }
 
    public boolean addAll(Collection<? extends E> c)
    {
        return vector.addAll(c);
    }
 
    public boolean addAll(int index, Collection<? extends E> c)
    {
        return vector.addAll(index, c);
    }
 
    public void addElement(E obj)
    {
        vector.addElement(obj);
    }
 
    public int capacity()
    {
        return vector.capacity();
    }
 
    public void clear()
    {
        vector.clear();
    }
 
    public Object clone()
    {
        return vector.clone();
    }
 
    public boolean contains(Object o)
    {
        return vector.contains(o);
    }
 
    public boolean containsAll(Collection<?> c)
    {
        return vector.containsAll(c);
    }
 
    public void copyInto(Object[] anArray)
    {
        vector.copyInto(anArray);
    }
 
    public E elementAt(int index)
    {
        return vector.elementAt(index);
    }
 
    public Enumeration<E> elements()
    {
        return vector.elements();
    }
 
    public void ensureCapacity(int minCapacity)
    {
        vector.ensureCapacity(minCapacity);
    }
 
    public boolean equals(Object o)
    {
        return vector.equals(o);
    }
 
    public E firstElement()
    {
        return vector.firstElement();
    }
 
    public E get(int index)
    {
        return vector.get(index);
    }
 
    public int hashCode()
    {
        return vector.hashCode();
    }
 
    public int indexOf(Object o)
    {
        return vector.indexOf(o);
    }
 
    public int indexOf(Object o, int index)
    {
        return vector.indexOf(o, index);
    }
 
    public void insertElementAt(E obj, int index)
    {
        vector.insertElementAt(obj, index);
    }
 
    public boolean isEmpty()
    {
        return vector.isEmpty();
    }
 
    public Iterator<E> iterator()
    {
        return vector.iterator();
    }
 
    public E lastElement()
    {
        return vector.lastElement();
    }
 
    public int lastIndexOf(Object o)
    {
        return vector.lastIndexOf(o);
    }
 
    public int lastIndexOf(Object o, int index)
    {
        return vector.lastIndexOf(o, index);
    }
 
    public ListIterator<E> listIterator()
    {
        return vector.listIterator();
    }
 
    public ListIterator<E> listIterator(int index)
    {
        return vector.listIterator(index);
    }
 
    public E remove(int index)
    {
        return vector.remove(index);
    }
 
    public boolean remove(Object o)
    {
        return vector.remove(o);
    }
 
    public boolean removeAll(Collection<?> c)
    {
        return vector.removeAll(c);
    }
 
    public void removeAllElements()
    {
        vector.removeAllElements();
    }
 
    public boolean removeElement(Object obj)
    {
        return vector.removeElement(obj);
    }
 
    public boolean retainAll(Collection<?> c)
    {
        return vector.removeAll(c);
    }
 
    public E set(int index, E element)
    {
        return vector.set(index, element);
    }
 
    public void setElementAt(E obj, int index)
    {
        vector.setElementAt(obj, index);
    }
 
    public void setSize(int newSize)
    {
        vector.setSize(newSize);
    }
 
    public int size()
    {
        return vector.size();
    }
 
    public List<E> subList(int fromIndex, int toIndex)
    {
        return vector.subList(fromIndex, toIndex);
    }
 
    public void trimToSize()
    {
        vector.trimToSize();
    }

}
