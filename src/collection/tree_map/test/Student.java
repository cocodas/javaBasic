package collection.tree_map.test;

public class Student {
	
	//Manager manager = new Manager();
	
	public int studentNumber;
	public String name;
	public int grade;
	public int mathScore;
	public int englishScore;
	public int scienceScore;
	public int koreanScore;
	//public int sum = manager.mathScan+manager.englishScan+manager.scienceScan+manager.koreanScan;
	//public float everage = sum/4;
	
	public Student(StudentBuilder studentBuilder) {
		studentNumber = studentBuilder.studentNumber;
		name = studentBuilder.name;
		grade = studentBuilder.grade;
		mathScore = studentBuilder.mathScore;
		englishScore = studentBuilder.englishScore;
		scienceScore = studentBuilder.scienceScore;
		koreanScore = studentBuilder.koreanScore;
	}
	
	public static class StudentBuilder{
		public int studentNumber;
		public String name;
		public int grade;
		public int mathScore;
		public int englishScore;
		public int scienceScore;
		public int koreanScore;
		
		public StudentBuilder studentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
			return this;
		}
		
		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public StudentBuilder mathScore(int mathScore) {
			this.mathScore = mathScore;
			return this;
		}
		
		public StudentBuilder englishScore(int englishScore) {
			this.englishScore = englishScore;
			return this;
		}
		
		public StudentBuilder scienceScore(int scienceScore) {
			this.scienceScore = scienceScore;
			return this;
		}
		
		public StudentBuilder koreanScore(int koreanScore) {
			this.koreanScore = koreanScore;
			return this;
		}
		
		public Student builder() {
			return new Student(this);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getScienceScore() {
		return scienceScore;
	}

	public void setScienceScore(int scienceScore) {
		this.scienceScore = scienceScore;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	
	
//	public int getSum() {
//		return sum;
//	}
//
//	public void setSum(int sum) {
//		this.sum = sum;
//	}
//
//	public float getEverage() {
//		return everage;
//	}

//	public void setEverage(float everage) {
//		this.everage = everage;
//	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("�й� : [ " + studentNumber + " ]\t");
		sb.append("�̸� : [ " + name + " ]\t");
		sb.append("�г� : [ " + grade + " �г�]\t");
		sb.append("���� ���� : [ " + mathScore + "�� ]\t");
		sb.append("���� ���� : [ " + englishScore + "�� ]\t");
		sb.append("���� ���� : [ " + scienceScore + "�� ]\t");
		sb.append("���� ���� : [ " + koreanScore + "�� ]\t");
		//sb.append("���� ���� : [ " + sum + "�� ]\t");
		//sb.append("���� ��� : [ " + everage + "�� ]\r\n");
		
		return sb.toString();
	}


}
