package collection.array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListImpl<E> {

	private ArrayList<E> arrayList;

	// 초기 용량이 10인 빈 리스트 생성
	public ArrayListImpl() {
		arrayList = new ArrayList<E>();
	}

	public ArrayListImpl(Collection<? extends E> c) {
		arrayList = new ArrayList<E>(c);
	}

	public ArrayListImpl(int initialCapacity) {
		arrayList = new ArrayList<E>(initialCapacity);
	}

	public boolean add(E e) {
		return arrayList.add(e);
	}

	public void add(int index, E element) {
		arrayList.add(index, element);
	}

	public boolean addAll(Collection<? extends E> c) {
		return arrayList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return arrayList.addAll(index, c);
	}

	public void clear() {
		arrayList.clear();
	}

	public Object clone() {
		return arrayList.clone();
	}

	public boolean contains(Object o) {
		return arrayList.contains(o);
	}

	public void ensureCapacity(int minCapacity) {
		arrayList.ensureCapacity(minCapacity);
	}

	public E get(int index) {
		return arrayList.get(index);
	}

	public int indexOf(Object o) {
		return arrayList.indexOf(o);
	}

	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	public Iterator<E> iterator() {
		return arrayList.iterator();
	}

	public int lastIndexOf(Object o) {
		return arrayList.lastIndexOf(o);
	}

	public ListIterator<E> listIterator() {
		return arrayList.listIterator();
	}

	public ListIterator<E> listIterator(int index) {
		return arrayList.listIterator(index);
	}

	public E remove(int index) {
		return arrayList.remove(index);
	}

	public boolean remove(Object o) {
		return arrayList.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return arrayList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return arrayList.removeAll(c);
	}

	public E set(int index, E element) {
		return arrayList.set(index, element);
	}

	public int size() {
		return arrayList.size();
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return arrayList.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return arrayList.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return arrayList.toArray(a);
	}

	public void trimToSize() {
		arrayList.trimToSize();
	}
}
