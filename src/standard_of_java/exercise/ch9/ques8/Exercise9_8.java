package standard_of_java.exercise.ch9.ques8;

public class Exercise9_8 {
	public static void main(String[] args) {
		RoundMethod rm = new RoundMethod();
		
		System.out.println(rm.round(3.1415, 1));
		System.out.println(rm.round(3.1415, 2));
		System.out.println(rm.round(3.1415, 3));
		System.out.println(rm.round(3.1415, 4));
		System.out.println(rm.round(3.1415, 5));
	}

}
