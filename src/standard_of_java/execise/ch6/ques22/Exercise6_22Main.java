package standard_of_java.execise.ch6.ques22;

public class Exercise6_22Main {

	public static void main(String[] args) {
		String str = "123";		
		System.out.println("123�� �����Դϱ�? " + ConfirmNumber.isNimber(str));
		
		str = "123o";
		System.out.println("123o�� ���� �Դϱ�? " +ConfirmNumber.isNimber(str));
		
	}

}
