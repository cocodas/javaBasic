
package nio7.chapter01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveSiblingTestMain {

	public static void main(String[] args) {
		Path base = Paths.get("C:/Users/Administrator/Downloads/dojo.pdf");
		System.out.println("결과: " + base.toString());
		Path path = base.resolveSibling("paging.jsp");
		System.out.println("결과: " + path.toString());
	}

}
