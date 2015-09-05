package collection.tree_map.test;

import collection.tree_map.test.Science.ScienceBuilder;

public class Korean {

	private String name;
	private int studentNumber;
	private int grade;
	private int koreanScore;
	
	public Korean(KoreanBuilder koreanBuilder) {
		name = koreanBuilder.name;
		studentNumber = koreanBuilder.studentNumber;
		grade = koreanBuilder.grade;
		koreanScore = koreanBuilder.koreanScore;
	}
	
	public static class KoreanBuilder {
		private String name;
		private int studentNumber;
		private int grade;
		private int koreanScore;
		
		public KoreanBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public KoreanBuilder studentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
			return this;
		}
		
		public KoreanBuilder grade(int grade) {
			this.grade = grade;
			return this;
		}
		
		public KoreanBuilder koreanScore(int koreanScore) {
			this.koreanScore = koreanScore;
			return this;
		}
		
		public Korean builder() {
			return new Korean(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("�̸� : [ " + name + " ]\t");
		sb.append("�й� : [ " + studentNumber + " ]\t");
		sb.append("�г� : [ " + grade + " �г�]\t");
		sb.append("���� ���� : [ " + koreanScore + " ��]\r\n ");
		
		return sb.toString();
	}
}
