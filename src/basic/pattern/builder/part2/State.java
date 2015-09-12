package basic.pattern.builder.part2;

public class State {
	public final static String AK = "AK";
	public final static String AL = "AL";
	public final static String AR = "AR";
	public final static String AZ = "AZ";
	public final static String CA = "CA";
	public final static String CO = "CO";
	public final static String CT = "CT";
	public final static String DE = "DE";
	public final static String FL = "FL";
	public final static String GA = "GA";
	public final static String HI = "HI";
	public final static String IA = "IA";
	public final static String ID = "ID";
	public final static String IL = "IL";
	public final static String IN = "IN";
	public final static String KS = "KS";
	public final static String KY = "KY";
	public final static String LA = "LA";
	public final static String MA = "MA";
	public final static String MD = "MD";
	public final static String ME = "ME";
	public final static String MI = "MI";
	public final static String MN = "MN";
	public final static String MO = "MO";
	public final static String MS = "MS";
	public final static String MT = "MT";
	public final static String NC = "NC";
	public final static String ND = "ND";
	public final static String NE = "NE";
	public final static String NH = "NH";
	public final static String NJ = "NJ";
	public final static String NM = "NM";
	public final static String NV = "NV";
	public final static String NY = "NY";
	public final static String OH = "OH";
	public final static String OK = "OK";
	public final static String OR = "OR";
	public final static String PA = "PA";
	public final static String RI = "RI";
	public final static String SC = "SC";
	public final static String SD = "SD";
	public final static String TN = "TN";
	public final static String TX = "TX";
	public final static String UT = "UT";
	public final static String VA = "VA";
	public final static String VT = "VT";
	public final static String WA = "WA";
	public final static String WI = "WI";
	public final static String WV = "WV";
	public final static String WY = "WY";
	private String state;
	
	public State() {}
	
	public State(final String state) {
		this.state  = state;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
