package standard_of_java.execise.ch6_5;

public class Student {
	private String name;
	private int hiSchoolYear;
	private int hiSchoolClass;
	private double[] score;
	
	public Student() {
		// empty;
	}
	
	public Student(String name, int hiSchoolYear, int hiSchoolClass, double kor, double math, double eng, double total, double avg) {
		this.name = name;
		this.hiSchoolYear = hiSchoolYear;
		this.hiSchoolClass = hiSchoolClass;
		score = new double[]{kor, math, eng, total, avg};
	}
	
	public String info() {
		return toString();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(name + ", ");
		sb.append(hiSchoolYear + ", ");
		sb.append(hiSchoolClass + ", ");
		int count = 1;
		for (double data : score) {
			if (count == score.length) {
				sb.append(data);
			} else {
				sb.append(data + ", ");
			}
			count++;
		}
		return sb.toString();
	}
}
