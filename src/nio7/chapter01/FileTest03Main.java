package nio7.chapter01;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileTest03Main{

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "�ٿ�ε�", "dojo.pdf");
		String pathToString = path.toString();
		URI pathToUri = path.toUri();
		System.out.println("����: " + path);
		System.out.println("���� �̸�: " + path.getFileName());
		System.out.println("��Ʈ �̸�: " + path.getRoot());
		System.out.println("�θ� �̸�:" + path.getParent());
		System.out.println("��� ����: " + path.getNameCount());
		
		for (byte b = 0; b < path.getNameCount(); b++) {
			System.out.println("��� �̸�: " + b + " ��°: " + path.getName(b));
		}
		
		System.out.println("���� �н�: (0, 2) " + path.subpath(0, 2));
		System.out.println("path�� ���ڿ��� ��ȯ: " + pathToString);
		System.out.println("path�� URI�� ��ȯ: " + pathToUri);
		
	}
}
