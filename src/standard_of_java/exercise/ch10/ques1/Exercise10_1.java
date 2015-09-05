package standard_of_java.exercise.ch10.ques1;

public class Exercise10_1 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		

		System.out.println(i.iv);
	}

}
