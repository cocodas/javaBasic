package basic.pattern.builder.part2;

public class Suffix {
	private String suffix;
	
	public Suffix() {}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public String toString() {
		return getSuffix();
	}
}
