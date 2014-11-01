package StarCraft;

public class StarCraftMain {

	public static void main(String[] args) {
		Marine mr = new Marine();
		SCV s = new SCV();
		Tank t = new Tank();
		Dropship ds = new Dropship();
		
		s.repair(s);
		s.repair(t);
		s.repair(ds);
		
		System.out.println(mr.toString());
		System.out.println("마린의 HP : " + mr.hitHp);
		System.out.println("SCV의 HP : " + s.hitHp);
		System.out.println("Tank의 HP : " + t.hitHp);
		System.out.println("DropShip의 HP : " + ds.hitHp);
		
	}

}
