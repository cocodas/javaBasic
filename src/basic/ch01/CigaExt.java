package basic.ch01;

public class CigaExt extends Ciga{
	private String newSkill;
	
	public CigaExt() {
		super();
		System.out.println("나의 최신 기술");
	}
	
	@Override
	public void makeCigaLeaf() {
		super.makeCigaLeaf();
		newMakeCigaLeaf();
	}
	
	private void newMakeCigaLeaf() {
		System.out.println("담배잎 자동 분류기기로 담배잎 구분");
		System.out.println("담배잎 기똥차게 말리는 신기술 도입");
	}
}
