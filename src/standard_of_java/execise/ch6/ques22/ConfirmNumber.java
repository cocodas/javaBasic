package standard_of_java.execise.ch6.ques22;

public class ConfirmNumber {
	
	public static boolean isNimber(String str) {
		if (str == null || str.equals("")) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;				
	}

}
