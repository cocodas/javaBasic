package standard_of_java.exercise.ch9.ques10;

public class FormatMethod {
	
	public String format(String str, int length, int alignment) {
		int lengthEmpty = length - str.length();
		
		if (lengthEmpty < 0 ) {
			return str.substring(0, length);
		}
		
		char[] original = str.toCharArray();
		char[] result = new char[length];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = ' ';
		}
		
		switch (alignment) {
		case 0:
		default:
			System.arraycopy(original, 0, result, 0, str.length());
			break;

		case 1:
			System.arraycopy(original, 0, result, lengthEmpty/2, str.length());
			break;
			
		case 2:
			System.arraycopy(original, 0, result, lengthEmpty, str.length());
			break;
			
		}
		
		return new String(result);
	}

	

}
