package collection;

import java.util.Stack;

public class Stack1GoURL implements Stack1Inter{
	
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) forward.clear();
	}

}
