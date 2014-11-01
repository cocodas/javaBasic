package StarCraft;

public class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		super(120);
		hitHp = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "DropShip";
	}

}
