package StarCraft;

public class SCV extends GroundUnit implements Repairable{
	public SCV() {
		super(60);
		hitHp = MAX_HP;
	}
	
	public void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitHp != u.MAX_HP) {
				u.hitHp++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}

}
