package StarCraft;

public class Tank extends GroundUnit implements Repairable {
	public Tank() {
		super(100);
		hitHp = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}

}
