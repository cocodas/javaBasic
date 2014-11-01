package standard_of_java.execise.ch6.ques5;

public class Student {
	private String name;
	private int hiSchoolYear;
	private int hiSchoolClass;
	private double[] score;
	int ban, no, kor, eng, math;
	
	public Student() {
		// empty;
	}
	
	public Student(String name, int hiSchoolYear, int hiSchoolClass, double kor, double math, double eng, double total, double avg) {
		this.name = name;
		this.hiSchoolYear = hiSchoolYear;
		this.hiSchoolClass = hiSchoolClass;
		score = new double[]{kor, math, eng, total, avg};
	}
	

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
	}
	
	public String infos() {
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

	
	
	
	public int getTotal() {
		int total = kor+eng+math;
		return total;
	}
	
	public float getAverage() {
		float everage = (int)(getTotal()/3f * 10 + 0.5f) / 10f;
		return everage;		
	}
	
	public String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
	}
}