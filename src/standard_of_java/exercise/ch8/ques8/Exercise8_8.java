package standard_of_java.exercise.ch8.ques8;

import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100 +1);
		int count = 0;
		int input = 0;
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է� �ϼ��� : ");
			try {
				input = new Scanner(System.in).nextInt();
				
				if (input > answer) {
					System.out.println("�� ���� ���� �Է� �ϼ���.");
				}else if (input < answer) {
					System.out.println("�� ū���� �Է� �ϼ���.");
				}else {
					System.out.println("�����Դϴ�.");
					System.out.println("�õ� Ƚ���� " + count + " ���Դϴ�.");
					break;
				}			
				
			} catch (Exception e) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�. �ٽ� ���� �Է� ���ּ���.");
				//continue;
			}
			
		} while (true);
	}

}
