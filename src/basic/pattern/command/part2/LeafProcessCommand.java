package basic.pattern.command.part2;

public class LeafProcessCommand implements CommandInterface {
	ProcessReciever processReciever;
	
	public LeafProcessCommand() {
		// empty
	}
	
	public LeafProcessCommand(ProcessReciever processReciever) {
		this.processReciever = processReciever;
	}
	
	@Override
	public void execute() {
		processReciever.fermentation();
		processReciever.heating();
		processReciever.findFailureLeaf();
	}

}
