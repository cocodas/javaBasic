package standard_of_java.execise.ch6.ques23;

public class MaxValueReturn {
	
	public static int max(int[] arr) {
		if (arr==null || arr.length ==0) 
			return -999999;
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}

}
