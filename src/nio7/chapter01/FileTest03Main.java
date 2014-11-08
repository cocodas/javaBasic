package nio7.chapter01;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileTest03Main{

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "다운로드", "dojo.pdf");
		String pathToString = path.toString();
		URI pathToUri = path.toUri();
		System.out.println("파일: " + path);
		System.out.println("파일 이름: " + path.getFileName());
		System.out.println("루트 이름: " + path.getRoot());
		System.out.println("부모 이름:" + path.getParent());
		System.out.println("요소 갯수: " + path.getNameCount());
		
		for (byte b = 0; b < path.getNameCount(); b++) {
			System.out.println("요소 이름: " + b + " 번째: " + path.getName(b));
		}
		
		System.out.println("서브 패스: (0, 2) " + path.subpath(0, 2));
		System.out.println("path를 문자열로 변환: " + pathToString);
		System.out.println("path를 URI로 변환: " + pathToUri);
		
	}
}
