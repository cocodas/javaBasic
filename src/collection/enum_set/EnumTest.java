package collection.enum_set;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(" ** Enum �׽�Ʈ ���� ** ");
		//allof()�޼��带 �̿��� ������ Day�� �ִ� ��ҵ��� �����´�.
		EnumSet<Day> es = EnumSet.allOf(Day.class);
		
		//����  clone();�� ����
		EnumSet<Day> es2 = EnumSet.copyOf(es);
		System.out.println("EnumSet (es)Day : " + es);
		System.out.println("EnumSet (es2)Day : " + es2);
		
		//noneof() : ��Ʈ ����
		es2 = EnumSet.noneOf(Day.class);
		System.out.println("EnumSet Day : " + es2);
		
		//of() : �ش� ��� ã�� ��ҹ��� �ٸ��� �ν� �Է½� ����
		es = EnumSet.of(Day.FRIDAY, Day.WEDNESDAY);
		System.out.println("es : " + es);
		
		//complementOf() : ��ȣ ���� ��Ҹ� ���� ��Ʈ ����
		es2 = EnumSet.complementOf(es);
		System.out.println("es2 : " + es2);
		
		//range() : ��Ʈ ���� ����
		es2 = EnumSet.range(Day.TUESDAY, Day.FRIDAY);
		System.out.println("es2 : " + es2);
		
		Day myDay = Day.FRIDAY;
		Day yourDay = Day.SATURDAY;
		
		System.out.printf("My special day : <%s> %n", myDay);
		System.out.printf("Your special day : (%s) %n", yourDay);
		
		
	}

}
