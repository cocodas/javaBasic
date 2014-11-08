package standard_of_java.exercise.ch8.ques8;

import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100 +1);
		int count = 0;
		int input = 0;
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력 하세요 : ");
			try {
				input = new Scanner(System.in).nextInt();
				
				if (input > answer) {
					System.out.println("더 작은 수를 입력 하세요.");
				}else if (input < answer) {
					System.out.println("더 큰수를 입력 하세요.");
				}else {
					System.out.println("정답입니다.");
					System.out.println("시도 횟수는 " + count + " 번입니다.");
					break;
				}			
				
			} catch (Exception e) {
				System.out.println("유효하지 않는 값입니다. 다시 값을 입력 해주세요.");
				//continue;
			}
			
		} while (true);
	}

}
