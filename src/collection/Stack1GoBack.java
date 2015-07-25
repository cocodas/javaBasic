package collection;

import java.util.Stack;

public class Stack1GoBack implements Stack1Inter{

	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}

}
