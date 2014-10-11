package basic.ch09;

public class WhyStatic {
	private static int idNumber;
	private int generalNumber;
	
	public WhyStatic() {
		idNumber = 0;
		generalNumber = 0;
	}

	public WhyStatic(int generalNumber) {
		this.generalNumber = generalNumber;
	}

	public static void add() {
		idNumber++;	// 후치 연산
		//++idNumber;	// 전치 연산
	}
	
	public static void minus() {
		idNumber--;
	}
	
	public static int getIdNumber() {
		return idNumber;
	}

	public static void setIdNumber(int idNumber) {
		WhyStatic.idNumber = idNumber;
	}

	public int getGeneralNumber() {
		return generalNumber;
	}

	public void setGeneralNumber(int generalNumber) {
		this.generalNumber = generalNumber;
	}
	
	
}
