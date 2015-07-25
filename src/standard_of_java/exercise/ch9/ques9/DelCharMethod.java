package standard_of_java.exercise.ch9.ques9;

public class DelCharMethod {
	public String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if (delCh.indexOf(ch) == -1) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
		
	}

}
