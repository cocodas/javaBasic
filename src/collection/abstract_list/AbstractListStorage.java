package collection.abstract_list;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class AbstractListStorage<T> {
	
	List<T> abstractListTest;
	
	public AbstractListStorage() {
		abstractListTest = new AbstractList<T>() {

			@Override
			public T get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		
		};
	}

	public List<T> getAbstractListTest() {
		return abstractListTest;
	}

	public void setAbstractListTest(List<T> abstractListTest) {
		this.abstractListTest = abstractListTest;
	}
	
	public void display() {
		if (abstractListTest.size() > 0 ) {
			for (T t : abstractListTest) {
				System.out.println(t);
			}
		}else {
			System.out.println("저장된 데이터가 없습니다.");
		}
	}

}
