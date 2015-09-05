package collection;

import java.util.Stack;

public class Stack1PrintStatus implements Stack1Inter {

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은 '" + back.peek()+"' 입니다.");  
		System.out.println();
	}
}
