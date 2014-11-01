package standard_of_java.exercise.ch7.ques19;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
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
			//Objec src : 복사하고자 하는 소스(원본)
			//int srcPos : 위의 소스에서 어느 부분부터 읽어올지 위치
			//Object dest : 복사하려는 대상
			//int destPos : 자료를 받을때 어느 부분부터 쓸지 위지 지정
			//int length : 원본에서 복사본까지 얼마 만큼 읽어 올지 입력
			
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
		
		System.out.println("구입한 물품 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);	
	}	
	
}
