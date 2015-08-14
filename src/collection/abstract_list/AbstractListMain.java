package collection.abstract_list;

public class AbstractListMain {

	public static <E> void main(String[] args) {

		AbstractListImpl<E> ald= new AbstractListImpl<E>();

	    System.out.println("List의 Elements = ");

	    for(int i=0; i<=5; i++){

	      ald.add(i);
	      System.out.println(ald.list);

	    }
	    System.out.println();

	    System.out.print("list의 Size = " + ald.list.size());
	    System.out.println("\n");

	    //ald.size();

	    System.out.print("2번째 배열의 Element = " + ald.list.get(2));

	    //ald.get(2);

	}
	
	/*
	 * Abstract가 상속받는 클래스와 인터페이스
	 * java.lang.Object
  			extended by java.util.AbstractCollection<E>
      			extended by java.util.AbstractList<E>
	 */

}
