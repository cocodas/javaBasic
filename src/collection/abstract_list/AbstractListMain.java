package collection.abstract_list;


public class AbstractListMain {

	public static void main(String[] args) {
		
		AddStorage<Product> add = new AddStorage<Product>();
		
		add.execute(0,new Product.ProductBuilder().productNumber(1).name("��ī��").amount(50).price(1200).manufacture("��������").builder());
		add.execute(1,new Product.ProductBuilder().productNumber(2).name("��Ÿ500").amount(120).price(1500).manufacture("��������").builder());
		add.execute(2,new Product.ProductBuilder().productNumber(3).name("õ���").amount(200).price(5000).manufacture("������").builder());
		
		add.display();
		

	}	
	/*
	 * Abstract�� ��ӹ޴� Ŭ������ �������̽�
	 * java.lang.Object
  			extended by java.util.AbstractCollection<E>
      			extended by java.util.AbstractList<E>
	 */

}
