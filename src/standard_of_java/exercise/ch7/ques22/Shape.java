package standard_of_java.exercise.ch7.ques22;

abstract class Shape {
	Point p;
	
	public Shape() {
		this(new Point(0,0));
	}

	public Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcAtrea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	
	

}
