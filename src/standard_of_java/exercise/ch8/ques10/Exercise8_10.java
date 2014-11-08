package standard_of_java.exercise.ch8.ques10;

public class Exercise8_10 {

	public static void main(String[] args) {
		Method m = new Method();
		try {
			m.method1();
			System.out.println(6);			
		} catch (Exception e) {
			System.out.println(7);
		}
	}

}
