package collection.abstract_set;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ArraySet<E> extends AbstractSet<E> implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<E> list;

	public ArraySet() {
		list = new ArrayList<E>();
	}

	public ArraySet(Collection<E> collection) {
		list = new ArrayList<E>();
		Iterator<E> itor = collection.iterator();
		if (collection instanceof Set) {
			while (itor.hasNext()) {
				list.add(itor.next());
			}
		} else {
			while (itor.hasNext()) {
				add(itor.next());
			}
		}
	}

	public Iterator<E> iterator() {
		return list.iterator();
	}

	public int size() {
		return list.size();
	}

	@SuppressWarnings("unchecked")
	public boolean add(Object element) {
		boolean modified;
		if (modified = !list.contains(element)) {
			list.add((E) element);
		}
		return modified;
	}

	public boolean remove(Object element) {
		return list.remove(element);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean contains(Object element) {
		return list.contains(element);
	}

	public void clear() {
		list.clear();
	}

	@SuppressWarnings("unchecked")
	public Object clone() {
		try {
			ArraySet<E> newSet = (ArraySet<E>) super.clone();
			newSet.list = (ArrayList<E>) list.clone();
			return newSet;
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}
