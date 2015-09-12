package basic.pattern.builder.part2;

public class HomeownerStatus {
	private String homeOwnerstatus;
	public HomeownerStatus() {}
	public String getHomeOwnerstatus() {
		return homeOwnerstatus;
	}
	public void setHomeOwnerstatus(String homeOwnerstatus) {
		this.homeOwnerstatus = homeOwnerstatus;
	}
	@Override
	public String toString() {
		return getHomeOwnerstatus();
	}
}
