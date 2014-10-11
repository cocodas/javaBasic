package basic.ch07;

public class Score {
	
	int[] score;
	int max;
	int min;
	
	public Score() {
	
		score = new int[] {79, 88, 91, 33, 100, 55, 95};
		max = score[0];
		min = score[0];		
	}
	
	public int scoreMaxValue() {
		
		for (int data : score) {
			if (data > max) {
				max = data;
			}
		}		
		return max;		
	}
	
	public int scoreMinValue() {
		for (int data : score) {
			if (data < min) {
				min = data;
			}		
		}
		return min;
	}
	

}
