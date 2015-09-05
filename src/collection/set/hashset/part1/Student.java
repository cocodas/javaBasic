package collection.set.hashset.part1;

public class Student {
	private int entryNumber;
	private String name;
	private String subject;
	private int grade;
	private int age;
	private String gender;

	public Student(StudentBuilder studentBuilder) {
		entryNumber = studentBuilder.entryNumber;
		name = studentBuilder.name;
		subject = studentBuilder.subject;
		grade = studentBuilder.grade;
		age = studentBuilder.age;
		gender = studentBuilder.gender;
	}

	public static class StudentBuilder {
		private int entryNumber;
		private String name;
		private String subject;
		private int grade;
		private int age;
		private String gender;

		public StudentBuilder entryNumber(int entryNumber) {
			this.entryNumber = entryNumber;
			return this;
		}

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder subject(String subject) {
			this.subject = subject;
			return this;
		}

		public StudentBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Student builder() {
			return new Student(this);
		}
	}

	@Override
	public int hashCode() {
		return entryNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Student st = (Student) obj;
		return new Integer(st.entryNumber).equals(new Integer(this.entryNumber));
	}

	public int getEntryNumber() {
		return entryNumber;
	}

	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("entryNumber: " + entryNumber + "\t");
		sb.append("name: " + name + "\t");
		sb.append("subject: " + subject + "\t");
		sb.append("grade: " + grade + "\t");
		sb.append("age: " + age + "\t\t");
		sb.append("gender: " + gender + "\r\n");
		return sb.toString();
	}
}
