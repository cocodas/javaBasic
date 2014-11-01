package standard_of_java.exercise.ch7.ques2;

public class SutdaDeck {
	final int CARD_NUM = 20;
	
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i%10 +1;		
			boolean isKwang = (i<10)&& (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);					
		}
	}
	
	public void shuffle() {
		for (int x = 0; x < cards.length * 2; x++) {
			int a = (int)(Math.random()*cards.length);
			int b = (int)(Math.random()*cards.length);
			
			SutdaCard temp = cards[a];
			cards[a] = cards[b];
			cards[b] = temp;			
		}
	}
	
	public SutdaCard pick(int index) {
		if (index <0 || index>CARD_NUM) {
			return null;
		}
		return cards[index];		
	}
	
	public SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
	
	}
	
}
