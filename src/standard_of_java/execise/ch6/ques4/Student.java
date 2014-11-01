package standard_of_java.execise.ch6.ques4;

	public class Student {
		int kor, eng, math, ban, no;
		String name;
		
		public int getTotal() {
			int total = kor+eng+math;
			return total;
		}
		
		public float getAverage() {
			float average = (int)(getTotal()/3f *10 + 0.5f) / 10f;
			return average;
			
		}

		
		
		
}
