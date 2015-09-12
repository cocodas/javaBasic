package basic.pattern.command.part2;

public class LeafMixingProcessCommand implements CommandInterface {
	private MixingReciever mixingReciever;
	
	public LeafMixingProcessCommand() {
		// Empty
	}
	
	public LeafMixingProcessCommand(MixingReciever mixingReciever) {
		this.mixingReciever = mixingReciever;
	}
	
	@Override
	public void execute() {
		mixingReciever.humidificationNHeating();
	}

}
