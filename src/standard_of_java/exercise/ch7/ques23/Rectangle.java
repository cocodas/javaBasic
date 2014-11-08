package standard_of_java.exercise.ch7.ques23;

public class Rectangle extends Shape {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this(new Point(0,0), width,height);
	}

	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		//width�� height�� 0�� �ƴϰ� width�� height�� ������  true�� ��ȯ�Ѵ�.
		
		return width*height !=0 && width == height;

	}
	
	@Override
	double calcAtrea() {
		return width*height;
	}
	
	

}
