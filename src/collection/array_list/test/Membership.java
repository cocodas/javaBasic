package collection.array_list.test;

public class Membership<E> {

	private String name;
	private String id;
	private String passWD;
	private long regitationNumber;
	private int birthMonth;
	private int birthDay;
	private String mailAddress;

	public Membership(MembershipBuilder membershipBuilder) {
		
		name = membershipBuilder.name;
		id = membershipBuilder.id;
		passWD = membershipBuilder.passWD;
		regitationNumber = membershipBuilder.regitationNumber;
		birthMonth = membershipBuilder.birthMonth;
		birthDay = membershipBuilder.birthDay;
		mailAddress = membershipBuilder.mailAddress;
		
	}
	
	public static class MembershipBuilder {
		private String name;
		private String id;
		private String passWD;
		private long regitationNumber;
		private int birthMonth;
		private int birthDay;
		private String mailAddress;
		
		public MembershipBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public MembershipBuilder id(String id) {
			this.id = id;
			return this;
		}
		
		public MembershipBuilder passWD(String passWD) {
			this.passWD = passWD;
			return this;
		}
		
		public MembershipBuilder regitationNumber(long regitationNumber) {
			this.regitationNumber = regitationNumber;
			return this;
		}
		
		public MembershipBuilder birMonth(int birthMonth) {
			this.birthMonth = birthMonth;
			return this;
		}
		
		public MembershipBuilder birthDay(int birthDay) {
			this.birthDay = birthDay;
			return this;
		}

		public MembershipBuilder mailAddress(String mailAddress) {
			this.mailAddress = mailAddress;
			return this;
		}
		
		public Membership builder() {
			return new Membership(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWD() {
		return passWD;
	}

	public void setPassWD(String passWD) {
		this.passWD = passWD;
	}

	public long getRegitationNumber() {
		return regitationNumber;
	}

	public void setRegitationNumber(long regitationNumber) {
		this.regitationNumber = regitationNumber;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
//	ArrayListStorage<E> arrayListStorage = new ArrayListStorage<>();
//	AddStorage<E> addStorage = new AddStorage<>();
	
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("�̸� : [" + name + "]\t\t");
		sb.append("ID : [" + id + "]\t\t");
		sb.append("��й�ȣ : [" + passWD + "]\t\t");
		sb.append("�ֹε�� ��ȣ : [" + regitationNumber + "]\t\t");
		sb.append("�¾ �� : [" + birthMonth + "��]\t\t");
		sb.append("�¾ �� : [" + birthDay + "��]\t\t");
		sb.append("�̸��� �ּ� : [" + mailAddress + "]\r\n");
		
		
		return sb.toString();
	}
	
}


