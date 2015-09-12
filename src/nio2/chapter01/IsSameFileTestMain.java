package nio2.chapter01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFileTestMain {

	public static void main(String[] args) {
		//C:/Users/Administrator/Downloads/Security.java
		Path path1 = Paths.get(System.getProperty("user.home"), "Downloads", "Security.java");
		Path path2 = Paths.get(System.getProperty("user.home"), "Downloads", "jquery.cookies.2.2.0.min.js");
		
		if (path1.equals(path2)) {
			System.out.println("��� ��ġ!");
		} else {
			System.out.println("��� ����ġ");
		}
		
		try {
			boolean check  = Files.isSameFile(path1, path2);
			if (check) {
				System.out.println("���� ��� ���� �����ϴ�.");
			} else {
				System.out.println("���� ��� ���� Ʋ���ϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		boolean startsWithResult = path1.startsWith("C:/Users");
		boolean endsWithResult = path2.endsWith("jquery.cookies.2.2.0.min.js");
		System.out.println("path1�� C:/Users ��θ� �����մϱ�? " + startsWithResult);
		System.out.println("path2�� jquery.cookies.2.2.0.min.js�� �����ϱ�? " + endsWithResult);
		
		for (Path name : path1) {
			System.out.println(name);
		}
	}

}
