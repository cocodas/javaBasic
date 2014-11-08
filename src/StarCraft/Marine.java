package StarCraft;

public class Marine extends GroundUnit{
	public Marine() {
		super(50);
		hitHp = MAX_HP;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("마린의 현재 HP: " + super.hitHp);
		return sb.toString();
	}
}
