package standard_of_java.exercise.ch7.ques22;

abstract class Shape {
	Point p;
	
	public Shape() {
		this(new Point(0,0));
	}

	public Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcAtrea(); // 도형의 면적을 계산해서 반환하는 메서드

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	
	

}
