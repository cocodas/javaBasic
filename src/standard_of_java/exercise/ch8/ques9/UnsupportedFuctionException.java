package standard_of_java.exercise.ch8.ques9;

public class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;
	
	public UnsupportedFuctionException(String msg, int errCode) {
		super(msg); // 조상 생성자의 RuntimeException(String msg)를 호출
		ERR_CODE = errCode;
	}
	
	public UnsupportedFuctionException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
	

}
