package nio7.chapter01;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPathTestMain {

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "Downloads", "dojo.pdf");
		Path path2 = Paths.get(System.getProperty("user.home"), "다운로드", "dojo.pdf");
		Path absolutePath = path2.toAbsolutePath();
		System.out.println("path2 절대 경로: " + absolutePath.toString());
		try {
			Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println("실제 경로: " + realPath);
		} catch (NoSuchFileException e) {
			System.err.println(e);
		} catch (IOException e1) {
			System.err.println(e1);
		}
		
		try {
			Path realPath2 = absolutePath.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println("실제 경로: " + realPath2);
		} catch (NoSuchFileException e) {
			System.err.println(e);
		} catch (IOException e1) {
			System.err.println(e1);
		}
	}

}
