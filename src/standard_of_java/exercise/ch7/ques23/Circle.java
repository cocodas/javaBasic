package standard_of_java.exercise.ch7.ques23;

public class Circle extends Shape{
	double r;
	
	public Circle(double r) {
		this(new Point(0,0), r); // Circle(Point p , double r) 호출
		
	}

	public Circle(Point p, double r) {
		super(p); //조상의 멤버는 조상의 생성자가 초기화 하도록 한다.
		this.r = r;
	}
	
	@Override
	double calcAtrea() {
		return Math.PI *r*r;
	}

}
