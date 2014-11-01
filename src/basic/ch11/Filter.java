package basic.ch11;

public class Filter {
	private String paper;
	private double filterSize;
	
	public Filter() {
		paper = "보통";
		filterSize = 1.0;
	}

	public Filter(String paper, double filterSize) {
		this.paper = paper;
		this.filterSize = filterSize;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public double getFilterSize() {
		return filterSize;
	}

	public void setFilterSize(double filterSize) {
		this.filterSize = filterSize;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("필터 재질: " + paper + "\n");
		sb.append("필터 사이즈: " + filterSize+ "\n");
		return sb.toString();
	}
}
