package collection.abstract_list;

public class AbstractListMain {

	public static <E> void main(String[] args) {

		AbstractListImpl<E> ald= new AbstractListImpl<E>();

	    System.out.println("List�� Elements = ");

	    for(int i=0; i<=5; i++){

	      ald.add(i);
	      System.out.println(ald.list);

	    }
	    System.out.println();

	    System.out.print("list�� Size = " + ald.list.size());
	    System.out.println("\n");

	    //ald.size();

	    System.out.print("2��° �迭�� Element = " + ald.list.get(2));

	    //ald.get(2);

	}
	
	/*
	 * Abstract�� ��ӹ޴� Ŭ������ �������̽�
	 * java.lang.Object
  			extended by java.util.AbstractCollection<E>
      			extended by java.util.AbstractList<E>
	 */

}
