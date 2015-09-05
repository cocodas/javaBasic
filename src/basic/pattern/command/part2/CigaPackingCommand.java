package basic.pattern.command.part2;

public class CigaPackingCommand implements CommandInterface {
	private PackingReciever packingReciever;
	
	public CigaPackingCommand() {
		// Empty
	}
	
	public CigaPackingCommand(PackingReciever packingReciever) {
		this.packingReciever = packingReciever;
	}
	
	@Override
	public void execute() {
		packingReciever.packingCiga();
	}

}
