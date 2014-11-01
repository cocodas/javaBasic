package standard_of_java.exercise.ch7.ques11;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		preChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public void gotPreChannel() {		
		setChannel(preChannel);
	}

}
