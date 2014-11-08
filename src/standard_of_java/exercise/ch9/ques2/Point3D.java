package standard_of_java.exercise.ch9.ques2;

public class Point3D {
	int x,y,z;
	
	public Point3D() {
		this(0,0,0);
	}

	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point3D) {
			Point3D p = (Point3D)obj;
			return x==p.x && y==p.y && z==p.z;
		}
		return false;		
	}
	
	@Override
	public String toString() {
		return "["+ x + ", " + y + ", " + z + "]";
	}

}
