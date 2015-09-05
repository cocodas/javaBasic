package standard_of_java.exercise.ch9.ques9;

public class Exercise9_9 {

	public static void main(String[] args) {
		DelCharMethod dcm = new DelCharMethod();
		
		System.out.println("(1!2@3^4~5)" + " -> " + dcm.delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2    3   4\t5)" + " -> " + dcm.delChar("(1 2    3   4\t5)", " \t"));
	}

}
