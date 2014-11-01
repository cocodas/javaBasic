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
		sb.append("말린 개월 수: " + durationOfMonth + "\n");
		sb.append("하루에 말린 시간: " + hourPerDayDry + "\n");
		return sb.toString();
	}
	
}
