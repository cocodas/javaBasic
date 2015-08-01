package collection.abstract_sequential_List;

public class AbstractSequentialListMain {

	public static <E> void main(String[] args) {

		AbstractSequentialListTest<E> asl = new AbstractSequentialListTest<>();
		
		 System.out.println("List = ");

		    for(int i=5; i>=0; i--)

		      asl.add(i);

		    System.out.print("Size of list = ");

		    asl.size();

		    System.out.println("Displaying list using listIterator");

		    asl.listIterator();
		
	}

}
