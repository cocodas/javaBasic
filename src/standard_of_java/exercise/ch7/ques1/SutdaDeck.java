package standard_of_java.exercise.ch7.ques1;

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
	
}
