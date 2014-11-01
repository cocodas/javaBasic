package RepairableTest;

public class SCV extends GroundUnit implements Repairable {
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	public void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
}