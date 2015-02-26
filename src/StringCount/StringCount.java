package StringCount;

public class StringCount {
	private int count;
	private String source;
	
	public StringCount(String source) {
		this.source = source;
	}
	
	public int stringCount(String sourceString) {
		return stringCount(sourceString, 0);
		
	}

	private int stringCount(String sourceString, int stringPosition) {
		int index = 0;
		if (sourceString == null || sourceString.length() == 0) {
			return 0;
		}
		if ((index = source.indexOf(sourceString, stringPosition)) != -1) {
			count++;
			stringCount(sourceString, index + sourceString.length());
		}
		return count;
	}

}
