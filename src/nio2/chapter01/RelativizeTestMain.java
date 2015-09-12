package nio2.chapter01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTestMain {

	public static void main(String[] args) {
		Path path01 = Paths.get("dojo.pdf");
		Path path02 = Paths.get("paging.jsp");
		
		Path path01ToPath02 = path01.relativize(path02);
		System.out.println("결과: " + path01ToPath02);
		
		Path path02ToPath01 = path02.relativize(path01);
		System.out.println("결과: " + path02ToPath01);
	}

}
