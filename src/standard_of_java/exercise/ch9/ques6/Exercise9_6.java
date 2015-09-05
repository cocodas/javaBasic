package standard_of_java.exercise.ch9.ques6;

public class Exercise9_6 {

	public static void main(String[] args) {
		FileZero fz = new FileZero();
		String src = "12345";
		System.out.println(fz.fileZero(src, 10));
		System.out.println(fz.fileZero(src, -1));
		System.out.println(fz.fileZero(src, 3));
	}

}
