package nio7.chapter01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AnotherPathJoinTestMain {

	public static void main(String[] args) {
		Path base = Paths.get("C:/Users/Administrator/Downloads");
		
		// dojo.pdf ������ Ǯ���ϱ�
		Path path1 = base.resolve("dojo.pdf");
		System.out.println("���: " + path1.toString());
		Path path2 = base.resolve("paging.jsp");
		System.out.println("���: " + path2.toString());
	}

}
