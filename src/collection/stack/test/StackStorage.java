package collection.stack.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackStorage {
	
	private Stack<String> stack = new Stack<String>();
	
	public StackStorage() {
		while (true) {
			String str = "";
			System.out.println("메뉴를 선택 하세요.");
			System.out.println("1. push(데이터 입력) 2. pop(데이터 꺼내오기) 3.peek(데이터 읽어 오기) 4.스택에 저장된 모든 데이터 불러오기");
			
			Scanner scanner = new Scanner(System.in);
			int k = scanner.nextInt();
			switch (k) {

			case 1:
				System.out.println("저장할 데이터를 입력 하세요!!");
				str = scanner.next();
				stack.push(str);
				System.out.println("저장한 데이터는 [ " + stack.peek() + " ] 입니다.\n");
				break;
			
			case 2:
				if (!stack.isEmpty()) {
					System.out.println("가장 최근에 저장한 데이터를 꺼내 오겠습니다.");
					System.out.println("저장한 데이터 [ " + stack.peek() + " ]를 꺼내 왔습니다.\n");
					stack.pop();
				}else {
					System.out.println("더 이상 저장되어 있는 데이터가 없습니다.\n");
				}
				break;
				
			case 3:
				if (!stack.isEmpty()) {
					System.out.println("가장 최근에 저장된 데이터를 읽어 오겠습니다.");
					System.out.println("[ 데이터 : " + stack.peek() + " ]\n");
				}else {
					System.out.println("더 이상 저장되어 있는 데이터가 없습니다.\n");
				}
				break;
				
			case 4:
				if (!stack.isEmpty()) {
					System.out.println("스택에 저장된 모든 데이터를 불러 오겠습니다.");
					Iterator<String> iterator = stack.iterator();
					System.out.print("스택에 저장되어 있는 데이터 : [ ");
					while (iterator.hasNext()) {
						System.out.print(iterator.next() + "\t");
					}
					System.out.print(" ]");
					System.out.println();
//              데이터 뽑아 올때 
//				while (!stack.empty()) {
//					System.out.println(stack.pop());
//					System.out.println("스택에 저장되어 있는 데이터 : [ " + stack.pop() + " ]");
//				}
				}else {
					System.out.println("더 이상 저장되어 있는 데이터가 없습니다.\n");
				}
				break;

			default:
				System.out.println("메뉴를 잘못 입력 하셨습니다.\n");
				break;
			}
		}
	}
}
