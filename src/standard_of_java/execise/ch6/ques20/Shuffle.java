package standard_of_java.execise.ch6.ques20;

public class Shuffle {
	
	public static int[] shuffle(int[] arr) {
		if (arr == null || arr.length == 0) 
			return arr;
		
		for (int i = 0; i < arr.length*2; i++) {
			int a = (int) (Math.random()*arr.length);
			int b = (int) (Math.random()*arr.length);
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		return arr;
	}

}
