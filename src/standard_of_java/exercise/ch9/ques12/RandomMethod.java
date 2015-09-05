package standard_of_java.exercise.ch9.ques12;

public class RandomMethod {
	public int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(to-from)+1)) + Math.min(from, to);
	}

}
