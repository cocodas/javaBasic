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
		//width나 height가 0이 아니고 width와 height가 같으면  true를 반환한다.
		
		return width*height !=0 && width == height;

	}
	
	@Override
	double calcAtrea() {
		return width*height;
	}
	
	

}
