package basic.ch09;

public class PublicStaticUseTestMain {

	public static void main(String[] args) {
		PublicStaticUse.number = 1;
		System.out.println("���: " + PublicStaticUse.display());
		PublicStaticUse.add();
		System.out.println("���: " + PublicStaticUse.display());
	}

}
