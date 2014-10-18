package basic.ch09;

public class GeneralNumbers {
	public int number;
	
	public GeneralNumbers() {
		number = 0;
	}
	
	public void add() {
		number++;
	}
	
	public void minus() {
		number--;
	}
	
	@Override
	public String toString() {
		// number 변수 출력
		return String.valueOf(number);
	}
}
