package standard_of_java.exercise.ch9.ques1;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard) obj;
			return num == c.num && isKwang == c.isKwang;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}

}
