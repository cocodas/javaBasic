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
			System.out.println("경로 일치!");
		} else {
			System.out.println("경로 불일치");
		}
		
		try {
			boolean check  = Files.isSameFile(path1, path2);
			if (check) {
				System.out.println("서로 경로 명이 같습니다.");
			} else {
				System.out.println("서로 경로 명이 틀립니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		boolean startsWithResult = path1.startsWith("C:/Users");
		boolean endsWithResult = path2.endsWith("jquery.cookies.2.2.0.min.js");
		System.out.println("path1는 C:/Users 경로를 포함합니까? " + startsWithResult);
		System.out.println("path2는 jquery.cookies.2.2.0.min.js로 끝납니까? " + endsWithResult);
		
		for (Path name : path1) {
			System.out.println(name);
		}
	}

}
