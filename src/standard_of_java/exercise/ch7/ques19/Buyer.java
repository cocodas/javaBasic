package standard_of_java.exercise.ch7.ques19;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; //cart�� ���� �ε���
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p+ "��/�� ��� �����ϴ�.");
			return;
		}
		money -= p.price;
		//��ٱ��Ͽ� �߰� ���ַ��� add()�޼ҵ带 �ۼ�
		
		add(p); //��ǰ �߰�
		
		
	}
	
	public void add(Product p) {
		if (i >= cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			//src : ī���� �ҽ�  srcPos : ī���� �ҽ��� ���� ��ġ  dest : ī�� ���� ��ü  destPos : ī�� ���� ���� �ε��� int length : ī���� ����
			
			
			cart = temp;
			
			cart[i++] = p;	
			
		}
		
	}
	
	public void summary() {
		String productList = "";
		int sum = 0;
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			
			productList += cart[i] + ", ";
			sum += cart[i].price;
		}
				
		System.out.println("������ ���� : " + productList);
		System.out.println("����� �ݾ� : " + sum);
		System.out.println("���� �ݾ� : " + money);
		
		
	}
	
	

}
