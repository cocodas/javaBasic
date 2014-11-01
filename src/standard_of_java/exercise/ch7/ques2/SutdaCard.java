package standard_of_java.exercise.ch7.ques2;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return num+(isKwang? "K" : "");
	}
}
