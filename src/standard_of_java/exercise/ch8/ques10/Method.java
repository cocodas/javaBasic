package standard_of_java.exercise.ch8.ques10;

public class Method {
	public static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		}catch (Exception e) {
			System.out.println(3);
		}finally{
			System.out.println(4);
		}
		
		System.out.println(5);
	}

	private static void method2() {
		throw new NullPointerException();
	}
}
