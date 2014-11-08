package standard_of_java.exercise.ch9.ques3;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int pos = fullPath.lastIndexOf("\\");
		
		if (pos != -1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos+1);
		}
	
		System.out.println("fullPath : " + fullPath);
		System.out.println("path : " + path);
		System.out.println("fileName : " + fileName);
	
	}
	

}
