package basic.ch06;

public class CurrencyTestMain {

	public static void main(String[] args) {
		System.out.println(CurrencyEnum.NICKLE);
		
		System.out.print("type = ");
		for (CurrencyEnum type : CurrencyEnum.values()) {
			System.out.print(type + " ");
		}
	}

}
