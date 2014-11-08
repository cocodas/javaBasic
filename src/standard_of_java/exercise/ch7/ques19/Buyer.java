package standard_of_java.exercise.ch7.ques19;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; //cart에 사용될 인덱스
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p+ "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		//장바구니에 추가 해주려면 add()메소드를 작성
		
		add(p); //제품 추가
		
		
	}
	
	public void add(Product p) {
		if (i >= cart.length) {
			Product[] temp = new Product[cart.length*2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			//src : 카피할 소스  srcPos : 카피할 소스의 시작 위치  dest : 카피 받을 객체  destPos : 카피 받을 시작 인덱스 int length : 카피할 길이
			
			
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
				
		System.out.println("구입한 물건 : " + productList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
		
		
	}
	
	

}
