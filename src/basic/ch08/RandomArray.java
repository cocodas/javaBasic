package basic.ch08;

import java.util.Stack;

public class RandomArray {
	int[] number;
	Stack<Integer> stack;
	
	public RandomArray() {
		number = new int[10];
		stack = new Stack<Integer>();
	}
	
	private void setRandomValueArray() {
		for (int i = 0; i < number.length; i++) {
			if (i == 0) {
				stack.add((int)(Math.random() * 10));
			} else {
				
			}
		}
	}
	
	private int getRandomValue() {
		int sameCount = 0;
		int randomValue = (int)(Math.random() * 10);
		
		/*while (isSame) {
			
		}*/
		return 0;
	}
}
