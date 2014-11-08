package standard_of_java.exercise.ch7.ques23;

public class Exercise7_23 {

	public static void main(String[] args) {
		
		SumArea sum = new SumArea();
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		
		System.out.println("면적의 합 : " + sum.sumAarea(arr));

	}

}
