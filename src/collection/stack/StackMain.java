package collection.stack;

public class StackMain {

	public static void main(String[] args) {

		StackImpl<Integer> stack = new StackImpl<Integer>();
		System.out.println("element pushed : " + stack.push(3));
		System.out.println("element pushed : " + stack.push(4));
		System.out.println("element pushed : " + stack.push(-19));
		System.out.println("element pushed : " + stack.push(349));
		System.out.println("element pushed : " + stack.push(35));
		System.out.println("element poped : " + stack.pop());
		System.out.println("element poped : " + stack.pop());
		System.out.println("Element peek : " + stack.peek());
		System.out.println("position of element 349 " + stack.search(3));
		while (!stack.empty()) {
			System.out.println("element poped : " + stack.pop());
		}
	}

}
