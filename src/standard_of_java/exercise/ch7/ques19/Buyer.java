package standard_of_java.exercise.ch7.ques19;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� ��� �����ϴ�.");
			return;
		}
			money -= p.price;	
			add(p);
	}
	
	public void add(Product p) {
		if (i>=cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart,0,temp,0,cart.length);
			//System.arraycopy(Objec src, int srcPos, Object dest, int destPos, int length);
			//Objec src : �����ϰ��� �ϴ� �ҽ�(����)
			//int srcPos : ���� �ҽ����� ��� �κк��� �о���� ��ġ
			//Object dest : �����Ϸ��� ���
			//int destPos : �ڷḦ ������ ��� �κк��� ���� ���� ����
			//int length : �������� ���纻���� �� ��ŭ �о� ���� �Է�
			
			cart = temp;
			cart[i++] = p;			
		}
	}
	
	public void Summary() {
		String itemList = "";
		int sum = 0;
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;				
			}
			itemList += cart[i] + ", ";
			sum += cart[i].price;
		}
		
		System.out.println("������ ��ǰ : " + itemList);
		System.out.println("����� �ݾ� : " + sum);
		System.out.println("���� �ݾ� : " + money);	
	}	
	
}
