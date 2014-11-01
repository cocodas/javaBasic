package standard_of_java.execise.ch6.ques21;

public class MyTv {
	
	boolean isPowerOn;
	int channel, volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	public void turnOnOff() {
		if (isPowerOn == true) {
			isPowerOn = false;
		}else{
			isPowerOn = true;
		}
	}
	
	public void volumeUp() {
		if (volume<MAX_VOLUME) {
			volume++;
		}
	}
	
	public void volumeDown() {
		if (volume>MIN_VOLUME) {
			volume--;
		}	
	}
	
	public void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
			
		}else{
			channel++;
		}
	}
	
	public void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
	
		}else{
			channel--;
		}
	}

}
