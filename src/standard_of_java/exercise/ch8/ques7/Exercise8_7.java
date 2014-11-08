package standard_of_java.exercise.ch8.ques7;

public class Exercise8_7 {

	public static void main(String[] args) {
		Method m = new Method();
		
		m.method(true); // System.exit(0);이 수행되 프로그램이 즉시 종료  이럴때는 finally블럭도 수행되지 않는다.
		m.method(false);
	}

}
