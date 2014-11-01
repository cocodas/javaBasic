package basic.sort.part01;
import java.util.Arrays;

public class TestSort {

	public static void mySort(int[] source) {
		int tmp = 0;

		int[] result = new int[source.length];

		println(source);
		// #1
		for (int i = 0; i < source.length - 1; i++) {
			// source.length ���̿��� -1 ����� �Ѵ�.
			// �׷��� ������ ���� if ���������� OutOfBound ���ܰ� �߻��Ѵ�.
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
				// for �������� k = k + 1 ó��
			}
		}
		println(result);

		/**
		 *  ����
		 *  
		 *  #1 �ܰ��� �Ǽ�
		 *  ó�� ��� �� �����濡 ���� �����ͼ� ���Ͽ� ��ȯ�ϴ� ����
		 *  for���� ������ ����� �迭�� �ִ� �� �߿��� ���� ū ���� ���� ����
		 *  ��ġ�ϰ� �Ǵ� �������� �����Ʈ �˰����̴�.
		 *  
		 *  �Ǽ�: for���� �� ����Ŭ�� ������ ���Ҵ�.
		 *  �ذ�: 2�� for���� �����Ͽ� ������ �ϳ��� �ٿ����� �ٽ� �� ������ �����ϰ� �ϸ� �ȴ�.
		 *  
		 *  #2 �ܰ��� �Ǽ�
		 *  a�迭�� ���� �׳� b�迭�� �ű�� ����. ���� �ǹ̰� ����.
		 *  ���ŷӰ� �ϳ��� �ű�� �۾��� �� �ʿ��ϴ�.
		 *  �׳� �迭 result = source �� ���̸� �ȴ�.
		 */
	}

	public static void main(String[] args) {
		int[] source = { 5, 9, 3, 1, 7 };

		/**
		 *  #��
		 *  Arrays Ŭ�������� �����ϴ� sort �޼��带 ����� �� �ִ�.
		 */
		//useArraysMethod(source);

		/**
		 *  #��
		 *  ������ ����
		 */
		//TestSort.mySort(source);

		/**
		 *  #��
		 *  �������� ����(����)
		 */
		bubbleSort(source);
	}

	private static void bubbleSort(int[] source) {
		int i, j, temp;

		System.out.println("�����ҽ�");
		println(source);
		System.out.println("----------------------");
		/**
		 * ����
		 * source
		 *   5 9 3 1 7
		 * i = 0 �� �� �� �� for�� ���� ���
		 *   5 3 1 7 9
		 * i = 1 �� �� �� �� for�� ���� ���
		 *   3 1 5 7 9
		 * i = 2 �� �� �� �� for�� ���� ���
		 *   1 3 5 7 9
		 * i = 3 �� �� �� �� for�� ���� ���
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
		System.out.println("�������");
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
