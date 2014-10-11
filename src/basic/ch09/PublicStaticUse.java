package basic.ch09;

public class PublicStaticUse {
	public static int number;
	
	public static void add() {
		number++;
	}
	
	public static void minus() {
		number--;
	}
	
	public static String display() {
		return String.valueOf(number);
	}
}
