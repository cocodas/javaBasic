package standard_of_java.exercise.ch10.ques3;

public class Exeercise10_3 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		
		inner.method1();
	}

}
