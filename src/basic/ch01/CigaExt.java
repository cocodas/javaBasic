package basic.ch01;

public class CigaExt extends Ciga{
	private String newSkill;
	
	public CigaExt() {
		super();
		System.out.println("���� �ֽ� ���");
	}
	
	@Override
	public void makeCigaLeaf() {
		super.makeCigaLeaf();
		newMakeCigaLeaf();
	}
	
	private void newMakeCigaLeaf() {
		System.out.println("����� �ڵ� �з����� ����� ����");
		System.out.println("����� ������� ������ �ű�� ����");
	}
}
