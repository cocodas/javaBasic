package basic.pattern.builder.part4;
/**
 * product
 * @author wiki dic
 * 피자에 대한 기본적인 요소가 있으며 그 기본적인 요소를 
 * 도우, 소스, 토핑으로 정의했다.
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
