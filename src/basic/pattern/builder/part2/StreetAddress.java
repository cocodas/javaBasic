package basic.pattern.builder.part2;

public class StreetAddress {
	private String streetAddress;
	
	public StreetAddress() {}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	@Override
	public String toString() {
		return getStreetAddress();
	}
}
