package basic.ch03;

public class TodayCigar implements CigaMaker {

	@Override
	public void tarPercent() {
		System.out.println("Ÿ��: 6�߰�");
	}

	@Override
	public void nicochinPercent() {
		System.out.println("����ƾ: 0.5�߰�");
	}

	@Override
	public void leafDry() {
		System.out.println("�������� ����� ����");
	}

	@Override
	public void leafSelected() {
		System.out.println("�������̰� ������ ����� ����");
	}

}
