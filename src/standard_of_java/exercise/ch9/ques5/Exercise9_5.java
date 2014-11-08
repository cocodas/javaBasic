package standard_of_java.exercise.ch9.ques5;

public class Exercise9_5 {

	public static void main(String[] args) {
		Count c = new Count();
		System.out.println(c.count("12345AB12AB345AB", "AB"));
		System.out.println(c.count("12345", "AB"));
	}

}
