package basic.ch06;

public enum CurrencyEnum {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	// CurrencyEnum()
	private int currency;
	
	private CurrencyEnum(int currency) {
		this.currency = currency;
		
		
		
	}
}
