package basic.ch03;

public class TodayCigar implements CigaMaker {

	@Override
	public void tarPercent() {
		System.out.println("타르: 6추가");
	}

	@Override
	public void nicochinPercent() {
		System.out.println("니코틴: 0.5추가");
	}

	@Override
	public void leafDry() {
		System.out.println("전통적인 담배잎 말림");
	}

	@Override
	public void leafSelected() {
		System.out.println("전통적이고 엄중한 담배잎 선정");
	}

}
