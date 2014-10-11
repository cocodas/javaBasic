package basic.ch06;

class Currency {
    public static final int PENNY;
    public static final int NICKLE = 5;
    public static final int DIME = 10;
    public static final int QUARTER = 25;
    public int currPenny;
    
    static {
    	PENNY = 1;
    }
    
    public Currency(int penny) {
    	currPenny = PENNY + penny;    	
    }
    
}
