package collection;

public class Stack1Main {

	public static void main(String[] args) {
		
		Stack1PrintStatus stack1PrintStatus = new Stack1PrintStatus();
		Stack1GoURL stack1GoURL = new Stack1GoURL();
		Stack1GoForward stack1GoForward = new Stack1GoForward();
		Stack1GoBack stack1GoBack = new Stack1GoBack();

		stack1GoURL.goURL("1.����Ʈ");
		stack1GoURL.goURL("2.����");
		stack1GoURL.goURL("3.���̹�");
		stack1GoURL.goURL("4.����");

		stack1PrintStatus.printStatus();

		stack1GoBack.goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");  
		stack1PrintStatus.printStatus();

		stack1GoBack.goBack();
		System.out.println("= '�ڷ�' ��ư�� ���� �� =");  
		stack1PrintStatus.printStatus();

		stack1GoForward.goForward();
		System.out.println("= '������' ��ư�� ���� �� =");  
		stack1PrintStatus.printStatus();

		stack1GoURL.goURL("javachobo.com");
		System.out.println("= ���ο� �ּҷ� �̵� �� =");  
		stack1PrintStatus.printStatus();
	}



}
