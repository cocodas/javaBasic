package nio7.chapter01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AnotherPathJoinTestMain {

	public static void main(String[] args) {
		Path base = Paths.get("C:/Users/Administrator/Downloads");
		
		// dojo.pdf 파일을 풀이하기
		Path path1 = base.resolve("dojo.pdf");
		System.out.println("결과: " + path1.toString());
		Path path2 = base.resolve("paging.jsp");
		System.out.println("결과: " + path2.toString());
	}

}
