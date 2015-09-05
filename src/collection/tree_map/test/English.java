package collection.tree_map.test;

public class English {
	private String name;
	private int studentNumber;
	private int grade;
	private int englishScore;
	
	public English(EnglishBuilder englishBuilder) {
		name = englishBuilder.name;
		studentNumber = englishBuilder.studentNumber;
		grade = englishBuilder.grade;
		englishScore = englishBuilder.englishScore;
	}
	
	public static class EnglishBuilder {
		private String name;
		private int studentNumber;
		private int grade;
		private int englishScore;
		
		public EnglishBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public EnglishBuilder studentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
			return this;
		}
		
		public EnglishBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public EnglishBuilder englishScore(int englishScore) {
			this.englishScore = englishScore;
			return this;
		}
		
		public English builder() {
			return new English(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("이름 : [ " + name + " ] \t");
		sb.append("학번 : [ " + studentNumber + " ] \t");
		sb.append("학년 : [ " + grade + " 학년] \t");
		sb.append("영어 점수 : [ " + englishScore + " 점] \r\n ");
		
		return sb.toString();
	}
}
