package standard_of_java.execise.ch6.ques22;

public class Exercise6_22Main {

	public static void main(String[] args) {
		String str = "123";		
		System.out.println("123은 숫자입니까? " + ConfirmNumber.isNimber(str));
		
		str = "123o";
		System.out.println("123o는 숫자 입니까? " +ConfirmNumber.isNimber(str));
		
	}

}
