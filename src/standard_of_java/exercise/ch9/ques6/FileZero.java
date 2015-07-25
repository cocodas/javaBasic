package standard_of_java.exercise.ch9.ques6;

public class FileZero {
	public String fileZero(String src, int length) {
		if (src == null || src.length() == length) {
			return src;
		}else if (length <= 0) {
			return "";
		}else if (src.length() > length) {
			return src.substring(0, length);
		}
		
		char[] chArr = new char[length];
		
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = '0';
		}
		
		System.arraycopy(src.toCharArray(), 0, chArr, length-src.length(), src.length());
		
		return new String(chArr);
	}

}
