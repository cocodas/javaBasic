package standard_of_java.execise.ch6_6;

public class Point {
	public static double getDistance(int x, int y, int x1, int y1) {
		double xPoint = Math.pow(x1 - x, 2);
		double yPoint = Math.pow(y1 - y, 2);
		return Math.sqrt(xPoint + yPoint);
	}
	
}
