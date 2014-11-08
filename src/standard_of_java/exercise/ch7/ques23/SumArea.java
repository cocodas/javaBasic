package standard_of_java.exercise.ch7.ques23;

public class SumArea {
	
	
	public double sumAarea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcAtrea();			
		}
		
		return sum;
	}

}
