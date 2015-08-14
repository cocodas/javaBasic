package collection.abstract_sequential_List;

public class AbstractSequentialListMain {

	public static <E> void main(String[] args) {

		AbstractSequentialListImpl<E> asl = new AbstractSequentialListImpl<>();
		
		 System.out.println("List = ");

		    for(int i=5; i>=0; i--)

		      asl.add(i);
		    System.out.println();
		    
		    System.out.print("Size of list = ");
		    asl.size();
		    System.out.println();

		    System.out.println("listIterator를 이용하여 리스트 표시 = ");
		    asl.listIterator();
		
	}
	
	/*
	 * java.lang.Object
			java.util.AbstractCollection<E>
				java.util.AbstractList<E>
					java.util.AbstractSequentialList<E>
	 */

}
