package basic.use_enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>(2);

		v1.addElement("�Ｚ");
		v1.addElement("LG");
		v1.addElement("SK");
		v1.addElement("����");

		System.out.println("Vector ��ҵ��� ������ ����.");
		/*for (int i = 0; i < v1.size(); i++) {
			System.out.println("v1�� " + i + "��° ��� : " + v1.elementAt(i));
		}*/

		int i = 0;
		for (String string : v1) {
			i++;
			System.out.println("v1�� " + i + "��° ���: " + string);
		}
		Enumeration<String> e = v1.elements();

		System.out.println();
		System.out.println("Vector v1���κ��� ������ Enumeration�� ��ҵ��� ������ ����.");

		while (e.hasMoreElements()) {
			System.out.println("e�� ��� : " + e.nextElement());
		}
	}
}
