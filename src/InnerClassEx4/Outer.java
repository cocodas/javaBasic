package InnerClassEx4;

public class Outer {
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	public void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}
