package basic.getclass.part2;

import java.lang.reflect.Method;

public class Example {
	public void exampleMethod() {
	}

	public static void main(String[] args) throws Throwable {
		@SuppressWarnings("unused")
		Method defaultNull = Example.class.getMethod("exampleMethod", (Class<?>) null);
		@SuppressWarnings("unused")
		Method castedNull = Example.class.getMethod("exampleMethod", (Class<?>) null);
	}
}
