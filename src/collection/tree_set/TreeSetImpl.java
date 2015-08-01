package collection.tree_set;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetImpl<E> {
	
	private TreeSet<E> treeSet;
	 
    public TreeSetImpl()
    {
        treeSet = new TreeSet<E>();
    }

    public TreeSetImpl(Collection<? extends E> c)
    {
        treeSet = new TreeSet<E>(c);
    }

    public TreeSetImpl(Comparator<? super E> comparator)
    {
        treeSet = new TreeSet<E>(comparator);
    }

    public TreeSetImpl(SortedSet<E> s)
    {
        treeSet = new TreeSet<E>(s);
    }

    public boolean add(E e)
    {
        return treeSet.add(e);
    }

    public boolean addAll(Collection<? extends E> c)
    {
        return treeSet.addAll(c);
    }

    public E ceiling(E e)
    {
        return treeSet.ceiling(e);
    }

    public void clear()
    {
        treeSet.clear();
    }

    public Object clone()
    {
        return treeSet.clone();
    }

    public Comparator<? super E> comparator()
    {
        return treeSet.comparator();
    }

    public boolean contains(Object o)
    {
        return treeSet.contains(o);
    }

    public Iterator<E> descendingIterator()
    {
        return treeSet.descendingIterator();
    }

    public NavigableSet<E> descendingSet()
    {
        return treeSet.descendingSet();
    }

    public E first()
    {
        return treeSet.first();
    }

    public E floor(E e)
    {
        return treeSet.floor(e);
    }

   public SortedSet<E> headSet(E toElement)
   {
       return treeSet.headSet(toElement);
   }

   public NavigableSet<E> headSet(E toElement, boolean inclusive)
   {
       return treeSet.headSet(toElement, inclusive);
   }

   public E higher(E e)
   {
       return treeSet.higher(e);
   }

   public boolean isEmpty()
   {
       return treeSet.isEmpty();
   }

   public Iterator<E> iterator()
   {
       return treeSet.iterator();
   }

   public E last()
   {
       return treeSet.last();
   }

   public E lower(E e)
   {
       return treeSet.lower(e);
   }

   public E pollFirst()
   {
       return treeSet.pollFirst();
   }

   public E pollLast()
   {
       return treeSet.pollLast();
   }

   public boolean remove(Object o)
   {
       return treeSet.remove(o);
   }

   public int size()
   {
       return treeSet.size();
   }

   public NavigableSet<E> subSet(E fromElement, boolean fromInclusive,	E toElement, boolean toInclusive)
   {
       return treeSet.subSet(fromElement, fromInclusive, toElement,toInclusive);
   }

   public SortedSet<E> subSet(E fromElement, E toElement)
   {
       return treeSet.subSet(fromElement, toElement);
   }

   public SortedSet<E> tailSet(E fromElement)
   {
       return treeSet.tailSet(fromElement);
   }

   public NavigableSet<E> tailSet(E fromElement, boolean inclusive)
   {
       return treeSet.tailSet(fromElement, inclusive);
   }

}
