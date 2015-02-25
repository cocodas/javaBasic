package basic.getclass.part1;

import java.lang.reflect.Method;

public class ClassTest {
	//private Log logger = LogFactory.getLog(ClassTest.class);

	public static void main(String[] args) throws ClassNotFoundException {
		@SuppressWarnings("unchecked")
		Class<String> clazz = (Class<String>) Class.forName("java.lang.String");
		System.out.println("class name : " + clazz.getName());
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method : " + method.getName() + " modifier : "
					+ method.getModifiers() + " return type : "
					+ method.getReturnType());
		}
	}
}
