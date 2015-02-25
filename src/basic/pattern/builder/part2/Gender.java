package basic.pattern.builder.part2;

public class Gender {
	public final static String MALE = "male";
	public final static String FEMALE = "female";
	private String gender;
	
	public static String getMale() {
		return MALE;
	}
	public static String getFemale() {
		return FEMALE;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return getGender();
	}
}
