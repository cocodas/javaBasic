package standard_of_java.execise.ch6.ques23;

public class Exercise6_23Main {

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + MaxValueReturn.max(data));
		System.out.println("최대값 : " + MaxValueReturn.max(null));
		System.out.println("최대값 : " + MaxValueReturn.max(new int[]{}));
	}

}
