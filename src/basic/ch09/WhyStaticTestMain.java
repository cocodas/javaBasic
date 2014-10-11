package basic.ch09;

public class WhyStaticTestMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		WhyStatic whyStatic1  = new WhyStatic();
		WhyStatic whyStatic2  = new WhyStatic();
		
		whyStatic1.setIdNumber(7);
		whyStatic1.add();
		System.out.println("결과1: " + whyStatic1.getIdNumber());
		
		whyStatic2.add();
		System.out.println("결과2: " + whyStatic2.getIdNumber());
	}

}
