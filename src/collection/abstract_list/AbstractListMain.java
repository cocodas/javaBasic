package collection.abstract_list;


public class AbstractListMain {

	public static void main(String[] args) {
		
		AddStorage<Product> add = new AddStorage<Product>();
		
		add.execute(0,new Product.ProductBuilder().productNumber(1).name("박카스").amount(50).price(1200).manufacture("동아제약").builder());
		add.execute(1,new Product.ProductBuilder().productNumber(2).name("비타500").amount(120).price(1500).manufacture("광동제약").builder());
		add.execute(2,new Product.ProductBuilder().productNumber(3).name("천녹삼").amount(200).price(5000).manufacture("정관장").builder());
		
		add.display();
		

	}	
	/*
	 * Abstract가 상속받는 클래스와 인터페이스
	 * java.lang.Object
  			extended by java.util.AbstractCollection<E>
      			extended by java.util.AbstractList<E>
	 */

}
