package collection.enum_set;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println(" ** Enum 테스트 시작 ** ");
		//allof()메서드를 이용해 열거형 Day에 있는 요소들을 가져온다.
		EnumSet<Day> es = EnumSet.allOf(Day.class);
		
		//복사  clone();도 가능
		EnumSet<Day> es2 = EnumSet.copyOf(es);
		System.out.println("EnumSet (es)Day : " + es);
		System.out.println("EnumSet (es2)Day : " + es2);
		
		//noneof() : 세트 비우기
		es2 = EnumSet.noneOf(Day.class);
		System.out.println("EnumSet Day : " + es2);
		
		//of() : 해당 요소 찾기 대소문자 다르게 인식 입력시 주의
		es = EnumSet.of(Day.FRIDAY, Day.WEDNESDAY);
		System.out.println("es : " + es);
		
		//complementOf() : 괄호 않의 요소를 제외 세트 구성
		es2 = EnumSet.complementOf(es);
		System.out.println("es2 : " + es2);
		
		//range() : 세트 구간 설정
		es2 = EnumSet.range(Day.TUESDAY, Day.FRIDAY);
		System.out.println("es2 : " + es2);
		
		Day myDay = Day.FRIDAY;
		Day yourDay = Day.SATURDAY;
		
		System.out.printf("My special day : <%s> %n", myDay);
		System.out.printf("Your special day : (%s) %n", yourDay);
		
		
	}

}
