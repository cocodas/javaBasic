package standard_of_java.exercise.ch8.ques6;

public class Method {
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		}
		
//		catch (Exception e) {
//			System.out.println(11);
//		}
		
		finally{
			System.out.println(3);
		}
		
		System.out.println(4);
	}

	static void method2() {
		throw new NullPointerException();	
	}
	

}
