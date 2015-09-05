package collection;

import java.util.Stack;

public class Stack1GoForward implements Stack1Inter {
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}

}
