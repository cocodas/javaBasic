package collection.array_list.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStorage<E> extends ArrayList<E>{
	List<E> arrayListStorage;
	
	public ArrayListStorage() {
		arrayListStorage = new ArrayList<E>();
	}

	public List<E> getArrayListStorage() {
		return arrayListStorage;
	}

	public void setArrayListStorage(List<E> arrayListStorage) {
		this.arrayListStorage = arrayListStorage;
	}
	
	public void display() {
		if (arrayListStorage.size() > 0) {
			for (E e : arrayListStorage) {
				System.out.println(e);
			}
		}else {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}
	
	
	
	

}
