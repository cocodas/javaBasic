package standard_of_java.execise.ch6.ques2;

public class StudaCard {
	
	int num;
	boolean gold;
	
	public StudaCard() {
		
		this.num = 1;
		this.gold = true;
				
	}
	
	StudaCard(int num, boolean gold){
		
		this.num = num;
		this.gold = gold;
		
	}
	
	String Info(){
		
		return num + (gold ? "K" : "");
		
	}

}
