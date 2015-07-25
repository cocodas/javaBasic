package collection;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		VectorPrint vectorPrint = new VectorPrint();
		
		Vector v = new Vector(5);	// �뷮(capacity)�� 5�� Vector�� �����Ѵ�.
		v.add("1");
		v.add("2");
		v.add("3");
		vectorPrint.print(v);

		v.trimToSize();	// �� ������ ���ش�.(�뷮�� ũ�Ⱑ ��������.)
		System.out.println("=== After trimToSize() ===");
		vectorPrint.print(v);

		v.ensureCapacity(6); //�뷮 �� ����
		System.out.println("=== After ensureCapacity(6) ===");
		vectorPrint.print(v);

		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		vectorPrint.print(v);
		
		v.clear(); //�ʱ�ȭ
		System.out.println("=== After clear() ===");
		vectorPrint.print(v);
		
	}

}
