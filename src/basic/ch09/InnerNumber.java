package basic.ch09;

public class InnerNumber {
	
	private static int number;
	
	public InnerNumber() {
		number = 0;
	}
	
	public InnerNumber(int insertNumber) {
		number =  insertNumber;
	}

	public static class SwapNumber {
		public static int swap(int userNumber) {
			int temp = number;
			number = userNumber;
			userNumber = temp;
			return userNumber;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(number);
	}
}
