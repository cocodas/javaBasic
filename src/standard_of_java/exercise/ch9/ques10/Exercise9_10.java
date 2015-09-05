package standard_of_java.exercise.ch9.ques10;

public class Exercise9_10 {

	public static void main(String[] args) {
		FormatMethod fm = new FormatMethod();
		
		String str = "°¡³ª´Ù";
		
		System.out.println(fm.format(str, 7, 0));
		System.out.println(fm.format(str, 7, 1));
		System.out.println(fm.format(str, 7, 2));
	}

}
