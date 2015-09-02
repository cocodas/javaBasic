package collection.stack.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackStorage {
	
	private Stack<String> stack = new Stack<String>();
	
	public StackStorage() {
		while (true) {
			String str = "";
			System.out.println("�޴��� ���� �ϼ���.");
			System.out.println("1. push(������ �Է�) 2. pop(������ ��������) 3.peek(������ �о� ����) 4.���ÿ� ����� ��� ������ �ҷ�����");
			
			Scanner scanner = new Scanner(System.in);
			int k = scanner.nextInt();
			switch (k) {

			case 1:
				System.out.println("������ �����͸� �Է� �ϼ���!!");
				str = scanner.next();
				stack.push(str);
				System.out.println("������ �����ʹ� [ " + stack.peek() + " ] �Դϴ�.\n");
				break;
			
			case 2:
				if (!stack.isEmpty()) {
					System.out.println("���� �ֱٿ� ������ �����͸� ���� ���ڽ��ϴ�.");
					System.out.println("������ ������ [ " + stack.peek() + " ]�� ���� �Խ��ϴ�.\n");
					stack.pop();
				}else {
					System.out.println("�� �̻� ����Ǿ� �ִ� �����Ͱ� �����ϴ�.\n");
				}
				break;
				
			case 3:
				if (!stack.isEmpty()) {
					System.out.println("���� �ֱٿ� ����� �����͸� �о� ���ڽ��ϴ�.");
					System.out.println("[ ������ : " + stack.peek() + " ]\n");
				}else {
					System.out.println("�� �̻� ����Ǿ� �ִ� �����Ͱ� �����ϴ�.\n");
				}
				break;
				
			case 4:
				if (!stack.isEmpty()) {
					System.out.println("���ÿ� ����� ��� �����͸� �ҷ� ���ڽ��ϴ�.");
					Iterator<String> iterator = stack.iterator();
					System.out.print("���ÿ� ����Ǿ� �ִ� ������ : [ ");
					while (iterator.hasNext()) {
						System.out.print(iterator.next() + "\t");
					}
					System.out.print(" ]");
					System.out.println();
//              ������ �̾� �ö� 
//				while (!stack.empty()) {
//					System.out.println(stack.pop());
//					System.out.println("���ÿ� ����Ǿ� �ִ� ������ : [ " + stack.pop() + " ]");
//				}
				}else {
					System.out.println("�� �̻� ����Ǿ� �ִ� �����Ͱ� �����ϴ�.\n");
				}
				break;

			default:
				System.out.println("�޴��� �߸� �Է� �ϼ̽��ϴ�.\n");
				break;
			}
		}
	}
}
