package standard_of_java.execise.ch6.ques20;

public class Exercise6_20Main {

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = Shuffle.shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
