package standard_of_java.exercise.ch9.ques5;

public class Count {

	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while (true) {
			pos = src.indexOf(target, pos);
			
			if (pos != -1) {
				count++;
				pos += target.length();
			}else{
				break;
			}
		}
		return count;
	}
	
	

		
	
	

}
