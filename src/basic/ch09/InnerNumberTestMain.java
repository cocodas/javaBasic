package basic.ch09;

public class InnerNumberTestMain {
	public static void main(String[] args) {
		InnerNumber number = new InnerNumber(7);
		System.out.println("number: " + number);
		System.out.println("swap number: " + InnerNumber.SwapNumber.swap(3));
		System.out.println("number: " + number);
	}
}
