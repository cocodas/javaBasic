package collection.hashSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl<E> {

	private Set<E> hashSet;

	public HashSetImpl() {
		hashSet = new HashSet<E>();
	}

	public HashSetImpl(Collection<? extends E> c) {
		hashSet = new HashSet<E>(c);
	}

	public HashSetImpl(int initialCapacity, float loadFactor) {
		hashSet = new HashSet<E>(initialCapacity, loadFactor);
	}

	public HashSetImpl(int initialCapacity) {
		hashSet = new HashSet<E>(initialCapacity);
	}

	public boolean add(E eobj) {
		return hashSet.add(eobj);
	}

	public boolean contains(Object obj) {
		return hashSet.contains(obj);
	}

	public boolean isEmpty() {
		return hashSet.isEmpty();
	}

	public Iterator<E> iterator() {
		return hashSet.iterator();
	}

	public boolean remove(Object obj) {
		return hashSet.remove(obj);
	}

	public int size() {
		return hashSet.size();
	}

	public void clear() {
		hashSet.clear();
	}

	public Object[] toArray() {
		return hashSet.toArray();
	}

	public boolean addAll(Collection<? extends E> c) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException {
		return hashSet.addAll(c);
	}

	public boolean retainAll(Collection<?> c) throws UnsupportedOperationException, ClassCastException, NullPointerException {
		return hashSet.retainAll(c);
	}

	public boolean removeAll(Collection<?> c) throws UnsupportedOperationException, NullPointerException, ClassCastException {
		return hashSet.retainAll(c);
	}

	public <T> T[] toArray(T[] a) throws ArrayStoreException, NullPointerException {
		return hashSet.toArray(a);
	}
}
