package standard_of_java.execise.ch6.ques5;

public class Student {
	String name;
	int ban, no, kor, eng, math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;		
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
