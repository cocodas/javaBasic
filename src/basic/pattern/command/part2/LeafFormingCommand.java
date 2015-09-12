package basic.pattern.command.part2;

public class LeafFormingCommand implements CommandInterface {
	private FormingReciever formingReciever;
	
	public LeafFormingCommand() {
		// Empty
	}
	
	public LeafFormingCommand(FormingReciever formingReciever) {
		this.formingReciever = formingReciever;
	}
	
	@Override
	public void execute() {
		formingReciever.cutLeaf();
		formingReciever.rollCiga();
	}

}
