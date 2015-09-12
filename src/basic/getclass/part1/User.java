package basic.getclass.part1;

public class User {
	private String name;
	private int regstNum;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRegstNum(int regstNum) {
		this.regstNum = regstNum;
	}

	public int getRegstNum() {
		return regstNum;
	}

	@Override
	public boolean equals(Object o) {
		User u2 = (User) o;
		if (regstNum == u2.getRegstNum())
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("==========User Class==========\r\n");
		sb.append("name: " + getName() + "\r\n");
		sb.append("regstNum: " + getRegstNum() + "\r\n");
		return sb.toString();
	}
}
