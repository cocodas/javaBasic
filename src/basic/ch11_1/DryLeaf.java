package basic.ch11_1;


public class DryLeaf {
	private int durationOfMonth;
	private int hourPerDayDry;
	
	public DryLeaf() {
		durationOfMonth = 4;
		hourPerDayDry = 4;
	}
	
	
	public DryLeaf(int durationOfMonth, int hourPerDayDry) {
		super();
		this.durationOfMonth = durationOfMonth;
		this.hourPerDayDry = hourPerDayDry;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� ���� ��: " + durationOfMonth + "\n");
		sb.append("�Ϸ翡 ���� �ð�: " + hourPerDayDry + "\n");
		return sb.toString();
	}
	
}
