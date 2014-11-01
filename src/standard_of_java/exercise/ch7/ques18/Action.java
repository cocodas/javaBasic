package standard_of_java.exercise.ch7.ques18;

public class Action {
	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
			
		}else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
					
		}else if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}

}
