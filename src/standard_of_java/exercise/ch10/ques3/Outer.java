package standard_of_java.exercise.ch10.ques3;

public class Outer {
	int value = 10;
	
	class Inner{
		int value = 20;
		public void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
			
		}
	}

}
