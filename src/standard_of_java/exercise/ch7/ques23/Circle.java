package standard_of_java.exercise.ch7.ques23;

public class Circle extends Shape{
	double r;
	
	public Circle(double r) {
		this(new Point(0,0), r); // Circle(Point p , double r) ȣ��
		
	}

	public Circle(Point p, double r) {
		super(p); //������ ����� ������ �����ڰ� �ʱ�ȭ �ϵ��� �Ѵ�.
		this.r = r;
	}
	
	@Override
	double calcAtrea() {
		return Math.PI *r*r;
	}

}
