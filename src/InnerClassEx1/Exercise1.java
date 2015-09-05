package InnerClassEx1;

class Exercise1 {
	class InstanceInner{
		int iv = 100;
		final static int CONST = 100; //statoc final은 상수이므로 허용 된다.
		
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	public void myMethod() {
		class LocalInner{
			int iv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}
}
