package standard_of_java.exercise.ch7.ques20;

public class Exercise7_20 {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}
