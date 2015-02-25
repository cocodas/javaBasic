package basic.getclass.part2;

import java.lang.reflect.Method;

public class GetMethodTestMain {

	public void exampleMethodNoParam() {
		System.out.println("No params");
	}

	public void exampleMethodWithParam(String arg) {
		System.out.println(arg);
	}

	public static void main(String[] args) throws Throwable {
		GetMethodTestMain example = new GetMethodTestMain();
		Method noParam = GetMethodTestMain.class.getMethod("exampleMethodNoParam");
		Method stringParam = GetMethodTestMain.class.getMethod("exampleMethodWithParam", String.class);
		noParam.invoke(example);
		stringParam.invoke(example, "test");
		// output
		// No params
		// test
	}
}
