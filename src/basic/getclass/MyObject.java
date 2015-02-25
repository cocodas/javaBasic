package basic.getclass;

public class MyObject {
	public static void main(String[] args) {
		// Create a new instance of MyObject.
		MyObject obj = new MyObject();

		// Get the Class associated with MyObject.
		@SuppressWarnings("unchecked")
		Class<MyObject> myClass = (Class<MyObject>)obj.getClass();

		// Print out the type of obj.
		System.out.println("obj is of type " + myClass.getName());
	}
}
