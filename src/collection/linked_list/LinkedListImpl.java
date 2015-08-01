package collection.linked_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl<E> {
	
	private LinkedList<E> linkedList;
	 
    public LinkedListImpl()
    {
        linkedList = new LinkedList<E>();
    }
 
    public LinkedListImpl(Collection<? extends E> c)
    {
        linkedList = new LinkedList<E>(c);
    }
 
    public boolean add(E e)
    {
        return linkedList.add(e);
    }
 
    public void add(int index, E element)
    {
        linkedList.add(index, element);
    }
 
    public boolean addAll(Collection<? extends E> c)
    {
        return linkedList.addAll(c);
    }
 
    public boolean addAll(int index, Collection<? extends E> c)
    {
        return linkedList.addAll(index, c);
    }
 
    public void addFirst(E e)
    {
        linkedList.addFirst(e);
    }
 
    public void addLast(E e)
    {
        linkedList.addLast(e);
    }
 
    public void clear()
    {
        linkedList.clear();
    }
 
    public Object clone()
    {
        return linkedList.clone();
    }
 
    public boolean contains(Object o)
    {
        return linkedList.contains(o);
    }
 
    public Iterator<E> descendingIterator()
    {
        return linkedList.descendingIterator();
    }
 
    public E element()
    {
        return linkedList.element();
    }
 
    public E get(int index)
    {
        return linkedList.get(index);
    }
 
    public E getFirst()
    {
        return linkedList.getFirst();
    }
 
    public E getLast()
    {
        return linkedList.getLast();
    }
 
    public int indexOf(Object o)
    {
        return linkedList.indexOf(o);
    }
 
    public boolean isEmpty()
    {
        return linkedList.isEmpty();
    }
 
    public Iterator<E> iterator()
    {
        return linkedList.iterator();
    }
 
    public int lastIndexOf(Object o)
    {
        return linkedList.lastIndexOf(o);
    }
 
    public ListIterator<E> listIterator()
    {
        return linkedList.listIterator();
    }
 
    public ListIterator<E> listIterator(int index)
    {
        return linkedList.listIterator(index);
    }
 
    public boolean offer(E e)
    {
        return linkedList.offer(e);
    }
 
    public boolean offerFirst(E e)
    {
        return linkedList.offerFirst(e);
    }
 
    public boolean offerLast(E e)
    {
        return linkedList.offerLast(e);
    }
 
    public E peek()
    {
        return linkedList.peek();
    }
 
    public E peekFirst()
    {
        return linkedList.peekFirst();
    }
 
    public E peekLast()
    {
        return linkedList.peekLast();
    }
 
    public E poll()
    {
        return linkedList.poll();
    }
 
    public E pollFirst()
    {
        return linkedList.pollFirst();
    }
 
    public E pollLast()
    {
        return linkedList.peekLast();
    }
 
    public E pop()
    {
        return linkedList.pop();
    }
 
    public void push(E e)
    {
        linkedList.push(e);
    }
 
    public E remove(int index)
    {
        return linkedList.remove(index);
    }
 
    public boolean remove(Object o)
    {
        return linkedList.remove(o);
    }
 
    public boolean removeAll(Collection<?> c)
    {
        return linkedList.removeAll(c);
    }
 
    public E removeFirst()
    {
        return linkedList.removeFirst();
    }
 
    public boolean removeFirstOccurence(Object o)
    {
        return linkedList.removeFirstOccurrence(o);
    }
 
    public E removeLast()
    {
        return linkedList.removeLast();
    }
 
    public boolean removeLastOccurence(Object o)
    {
        return linkedList.removeLastOccurrence(o);
    }
 
    public boolean retainAll(Collection<?> c)
    {
        return linkedList.removeAll(c);
    }
 
    public E set(int index, E element)
    {
        return linkedList.set(index, element);
    }
 
    public int size()
    {
        return linkedList.size();
    }
 
    public List<E> subList(int fromIndex, int toIndex)
    {
        return linkedList.subList(fromIndex, toIndex);
    }
 
    public Object[] toArray()
    {
        return linkedList.toArray();
    }
 
    public <T> T[] toArray(T[] a)
    {
        return linkedList.toArray(a);
    }

}
