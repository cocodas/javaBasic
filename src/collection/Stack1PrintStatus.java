package collection;

import java.util.Stack;

public class Stack1PrintStatus implements Stack1Inter {

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("����ȭ���� '" + back.peek()+"' �Դϴ�.");  
		System.out.println();
	}
}
