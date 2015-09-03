package collection.tree_map.test;

public class Math {
	
	private int studentNumber;
	private int mathScore;
	private String name;
	private int grade;
	
	public Math(MathBuilder mathBuilder) {
		studentNumber = mathBuilder.studentNumber;
		mathScore = mathBuilder.mathScore;
		name = mathBuilder.name;
		grade = mathBuilder.grade;
	}

	public static class MathBuilder{
		private int studentNumber;
		private int mathScore;
		private String name;
		private int grade;
		
		public MathBuilder studentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
			return this;
		}
		
		public MathBuilder mathScore(int mathScore) {
			this.mathScore = mathScore;
			return this;
		}
		
		public MathBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public MathBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public Math builder() {
			return new Math(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("이름 : [ " + name + " ] \t");
		sb.append("학번 : [ " + studentNumber + " ] \t");
		sb.append("학년 : [ " + grade + " 학년] \t");
		sb.append("수학 점수 : [ " + mathScore + " 점] \r\n ");
		
		return sb.toString();
	}
}
