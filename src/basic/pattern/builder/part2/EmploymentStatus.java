package basic.pattern.builder.part2;

public class EmploymentStatus {
	public final static String EMPLOYED = "EMPLOYED";
	public final static String UNEMPLOYED = "UNEMPLOYED";
	private String employmentstatus;
	public EmploymentStatus() {}
	public EmploymentStatus(final String employStatus){
		this.employmentstatus = employStatus;
	}
	public String getEmploymentstatus() {
		return employmentstatus;
	}
	public void setEmploymentstatus(String employmentstatus) {
		this.employmentstatus = employmentstatus;
	}
	
	@Override
	public String toString() {
		return getEmploymentstatus();
	}
}
