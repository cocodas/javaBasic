package standard_of_java.exercise.ch9.ques12;

public class Exercise9_12 {

	public static void main(String[] args) {
		RandomMethod rm = new RandomMethod();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(rm.getRand(1, -3) + ", ");
		}
	}

}
