package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Queue1Main implements Queue1Inter{
	public static void main(String[] args) {
		
		Queue1Save queue1Save = new Queue1Save();
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) {
			System.out.println(">>");
			try {
				//화면으로부터 라인단위로 입력 받는다
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if ("".equals(input)) continue;
				
				if (input.equalsIgnoreCase("q")) {
					System.out.println();
					System.out.println("프로그램이 정상적으로 종류 되었습니다.");
					System.exit(0);
				}else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종류합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력받은 명령어 저장
					queue1Save.save(input);
					
					//LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
					
				}else {
					queue1Save.save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		}
		
	}

}
