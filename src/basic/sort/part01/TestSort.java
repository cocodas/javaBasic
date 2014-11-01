package basic.sort.part01;
import java.util.Arrays;

public class TestSort {

	public static void mySort(int[] source) {
		int tmp = 0;

		int[] result = new int[source.length];

		println(source);
		// #1
		for (int i = 0; i < source.length - 1; i++) {
			// source.length 길이에서 -1 빼줘야 한다.
			// 그렇지 않으면 다음 if 조건절에서 OutOfBound 예외가 발생한다.
			if (source[i] > source[i + 1]) {
				tmp = source[i];
				source[i] = source[i + 1];
				source[i + 1] = tmp;
			}
		}
		println(source);

		// #2
		for (int k = 0; k < result.length; k++) {
			result[k] = source[k];
			if (k >= source.length) {
				System.out.println("End");
				break;
			} else {
				// for 구문에서 k = k + 1 처리
			}
		}
		println(result);

		/**
		 *  총평
		 *  
		 *  #1 단계의 실수
		 *  처음 방과 그 다음방에 값을 가져와서 비교하여 교환하는 로직
		 *  for문을 실행한 결과는 배열에 있는 값 중에서 제일 큰 값이 가장 끝에
		 *  위치하게 되는 전형적인 버블소트 알고리즘이다.
		 *  
		 *  실수: for문을 한 사이클만 돌리고 말았다.
		 *  해결: 2중 for문을 구성하여 범위를 하나씩 줄여가면 다시 위 로직을 수행하게 하면 된다.
		 *  
		 *  #2 단계의 실수
		 *  a배열의 값을 그냥 b배열로 옮기는 로직. 존재 의미가 없다.
		 *  번거롭게 하나씩 옮기는 작업이 불 필요하다.
		 *  그냥 배열 result = source 한 줄이면 된다.
		 */
	}

	public static void main(String[] args) {
		int[] source = { 5, 9, 3, 1, 7 };

		/**
		 *  #가
		 *  Arrays 클래스에서 지원하는 sort 메서드를 사용할 수 있다.
		 */
		//useArraysMethod(source);

		/**
		 *  #나
		 *  성규의 로직
		 */
		//TestSort.mySort(source);

		/**
		 *  #다
		 *  정상적이 로직(정답)
		 */
		bubbleSort(source);
	}

	private static void bubbleSort(int[] source) {
		int i, j, temp;

		System.out.println("원본소스");
		println(source);
		System.out.println("----------------------");
		/**
		 * 참조
		 * source
		 *   5 9 3 1 7
		 * i = 0 일 때 안 쪽 for문 수행 결과
		 *   5 3 1 7 9
		 * i = 1 일 때 안 쪽 for문 수행 결과
		 *   3 1 5 7 9
		 * i = 2 일 때 안 쪽 for문 수행 결과
		 *   1 3 5 7 9
		 * i = 3 일 때 안 쪽 for문 수행 결과
		 *   1 3 5 7 9
		 */
		for (i = 0; i < source.length - 1; i++) {
			for (j = 0; j < source.length - 1 - i; j++) {
				if (source[j] > source[j + 1]) {
					temp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = temp;
				}
			}
			println(source);
		}
		System.out.println("최종결과");
		println(source);
	}

	private static void useArraysMethod(int[] source) {
		println(source);
		Arrays.sort(source);
		println(source);
	}

	public static void println(int[] source) {
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + " ");
		}
		System.out.println();
	}

}
