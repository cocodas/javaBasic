package basic.pattern.builder.part4;
/**
 * product
 * @author wiki dic
 * ���ڿ� ���� �⺻���� ��Ұ� ������ �� �⺻���� ��Ҹ� 
 * ����, �ҽ�, �������� �����ߴ�.
 *
 */
public class Pizza {
	private String dough;
	private String sauce;
	private String topping;
	
	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public String getTopping() {
		return topping;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("dough: " + getDough() + "\r\n");
		sb.append("sauce: " + getSauce() + "\r\n");
		sb.append("topping: " + getTopping() + "\r\n");
		return sb.toString();
	}
}
