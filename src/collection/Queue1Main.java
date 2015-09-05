package collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Queue1Main implements Queue1Inter{
	public static void main(String[] args) {
		
		Queue1Save queue1Save = new Queue1Save();
		
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while (true) {
			System.out.println(">>");
			try {
				//ȭ�����κ��� ���δ����� �Է� �޴´�
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if ("".equals(input)) continue;
				
				if (input.equalsIgnoreCase("q")) {
					System.out.println();
					System.out.println("���α׷��� ���������� ���� �Ǿ����ϴ�.");
					System.exit(0);
				}else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				}else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					//�Է¹��� ��ɾ� ����
					queue1Save.save(input);
					
					//LinkedList�� ������ �����ش�.
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
				System.out.println("�Է� �����Դϴ�.");
			}
		}
		
	}

}
