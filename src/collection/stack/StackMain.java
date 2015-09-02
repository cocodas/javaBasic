package collection.stack;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackMain {

	public static void main(String[] args) {
		
		StackImpl<Integer> stack = new StackImpl<Integer>();
        System.out.println("element pushed : " + stack.push(3)); 
        System.out.println("element pushed : " + stack.push(4));
        System.out.println("element pushed : " + stack.push(-19));
        System.out.println("element pushed : " + stack.push(349));
        System.out.println("element pushed : " + stack.push(35));
        System.out.println();
        
        System.out.println("element poped : " + stack.pop());
        System.out.println("element peek : " + stack.peek());
        System.out.println("element poped : " + stack.pop());
        //pop()메소드는 꺼내오기  peek()메소드는  읽어 오기
        System.out.println();
        
        System.out.println("스택에 쌓여 있는 원소 : ");
        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()) {
        	System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("원소 3의 위치는 위에서 부터 [ " + stack.search(3) + " 번째] 입니다.");
        System.out.println();
        
        System.out.println("스택에 쌓여 있는 모든 원소 뽑아오기");
        while (!stack.empty())
        {
            System.out.println("element poped : " + stack.pop());
        }
	}

}
