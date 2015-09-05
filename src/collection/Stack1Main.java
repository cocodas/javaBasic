package collection;

public class Stack1Main {

	public static void main(String[] args) {
		
		Stack1PrintStatus stack1PrintStatus = new Stack1PrintStatus();
		Stack1GoURL stack1GoURL = new Stack1GoURL();
		Stack1GoForward stack1GoForward = new Stack1GoForward();
		Stack1GoBack stack1GoBack = new Stack1GoBack();

		stack1GoURL.goURL("1.네이트");
		stack1GoURL.goURL("2.야후");
		stack1GoURL.goURL("3.네이버");
		stack1GoURL.goURL("4.다음");

		stack1PrintStatus.printStatus();

		stack1GoBack.goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");  
		stack1PrintStatus.printStatus();

		stack1GoBack.goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");  
		stack1PrintStatus.printStatus();

		stack1GoForward.goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");  
		stack1PrintStatus.printStatus();

		stack1GoURL.goURL("javachobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");  
		stack1PrintStatus.printStatus();
	}



}
