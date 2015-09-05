package collection.tree_map.test;

public class Science {
	private String name;
	private int studentNumber;
	private int grade;
	private int scienceScore;
	
	public Science(ScienceBuilder scienceBuilder) {
		name = scienceBuilder.name;
		studentNumber = scienceBuilder.studentNumber;
		grade = scienceBuilder.grade;
		scienceScore = scienceBuilder.scienceScore;
	}
	
	public static class ScienceBuilder {
		private String name;
		private int studentNumber;
		private int grade;
		private int scienceScore;
		
		public ScienceBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public ScienceBuilder studentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
			return this;
		}
		
		public ScienceBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public ScienceBuilder scienceScore(int scienceScore) {
			this.scienceScore = scienceScore;
			return this;
		}
		
		public Science builder() {
			return new Science(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("�̸� : [ " + name + " ]\t");
		sb.append("�й� : [ " + studentNumber + " ]\t");
		sb.append("�г� : [ " + grade + " �г�]\t");
		sb.append("���� ���� : [ " + scienceScore + " ��]\r\n ");
		
		return sb.toString();
	}
}
