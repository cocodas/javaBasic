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
		sb.append("이름 : [ " + name + " ]\t");
		sb.append("학번 : [ " + studentNumber + " ]\t");
		sb.append("학년 : [ " + grade + " 학년]\t");
		sb.append("국어 점수 : [ " + koreanScore + " 점]\r\n ");
		
		return sb.toString();
	}
}
