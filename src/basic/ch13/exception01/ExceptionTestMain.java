package basic.ch13.exception01;

public class ExceptionTestMain {

	public static void main(String[] args) throws Exception{
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
			e.printStackTrace();
		}
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("�����");
			e.printStackTrace();
		}
		
		System.out.println(1/0);
		System.out.println("Main ��");
	}

}
