package basic.pattern.builder.part2;

public class Salutation {
	private String salutation;
	
	public Salutation() {
		salutation = "�ȳ��ϼ���?";
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	@Override
	public String toString() {
		return getSalutation();
	}
}
