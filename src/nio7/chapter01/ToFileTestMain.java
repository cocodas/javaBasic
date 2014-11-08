package nio7.chapter01;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToFileTestMain {

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "Downloads", "dojo.pdf");
		File pathToFile = path.toFile();
		Path fileToPath = pathToFile.toPath();
		System.out.println("경로를 파일로: " + pathToFile.getName());
		System.out.println("파일을 경로로: " + fileToPath.toString());
	}

}
