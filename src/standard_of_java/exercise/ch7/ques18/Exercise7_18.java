package standard_of_java.exercise.ch7.ques18;

public class Exercise7_18 {

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		
		for (int i = 0; i < arr.length; i++) {
			Action at = new Action();
			at.action(arr[i]);
		}
	}

}
