package basic.ch09;

public class GeneralNumbersTestMain {

	public static void main(String[] args) {
		GeneralNumbers numberOne = new GeneralNumbers();
		GeneralNumbers numberTwo = new GeneralNumbers();
		
		numberOne.add();
		numberTwo.add();
		numberTwo.minus();
		
		System.out.println("결과1: " + numberOne);
		System.out.println("결과2: " + numberTwo);
	}

}
