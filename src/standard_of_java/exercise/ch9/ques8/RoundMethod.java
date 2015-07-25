package standard_of_java.exercise.ch9.ques8;

public class RoundMethod {
	public double round(double d, int n) {
		return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
	}

}
