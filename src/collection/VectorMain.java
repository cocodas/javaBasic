package collection;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		VectorPrint vectorPrint = new VectorPrint();
		
		Vector v = new Vector(5);	// 용량(capacity)이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");
		vectorPrint.print(v);

		v.trimToSize();	// 빈 공간을 없앤다.(용량과 크기가 같아진다.)
		System.out.println("=== After trimToSize() ===");
		vectorPrint.print(v);

		v.ensureCapacity(6); //용량 재 설정
		System.out.println("=== After ensureCapacity(6) ===");
		vectorPrint.print(v);

		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		vectorPrint.print(v);
		
		v.clear(); //초기화
		System.out.println("=== After clear() ===");
		vectorPrint.print(v);
		
	}

}
