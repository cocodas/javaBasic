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
        //pop()�޼ҵ�� ��������  peek()�޼ҵ��  �о� ����
        System.out.println();
        
        System.out.println("���ÿ� �׿� �ִ� ���� : ");
        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()) {
        	System.out.print(itr.next() + "\t");
		}
        System.out.println("\n");
        
        System.out.println("���� 3�� ��ġ�� ������ ���� [ " + stack.search(3) + " ��°] �Դϴ�.");
        System.out.println();
        
        System.out.println("���ÿ� �׿� �ִ� ��� ���� �̾ƿ���");
        while (!stack.empty())
        {
            System.out.println("element poped : " + stack.pop());
        }
	}

}
