package standard_of_java.execise.ch6.ques7;

public class MyPoint {
	
	int x, y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1) {
		
		double xPoint1 = Math.pow(x1-x, 2);
		double yPoint2 = Math.pow(y1-y, 2);
		
		return Math.sqrt(xPoint1+yPoint2);
		
		
	}

}
