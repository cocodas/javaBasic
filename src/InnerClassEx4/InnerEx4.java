package InnerClassEx4;

public class InnerEx4 {

	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii : iv = " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner(); //스택틱내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		System.out.println("si.iv : " + si.iv);
	}

}
