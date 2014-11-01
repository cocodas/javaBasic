package basic.ch12;

public class InitTest {
	private int number;
	
	public InitTest() {
		System.out.println("생성자 호출");
	}
	
	{
		System.out.println("초기화 블럭 호출");
	}
}
