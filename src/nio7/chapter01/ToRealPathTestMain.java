package nio7.chapter01;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPathTestMain {

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "Downloads", "dojo.pdf");
		Path path2 = Paths.get(System.getProperty("user.home"), "�ٿ�ε�", "dojo.pdf");
		Path absolutePath = path2.toAbsolutePath();
		System.out.println("path2 ���� ���: " + absolutePath.toString());
		try {
			Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println("���� ���: " + realPath);
		} catch (NoSuchFileException e) {
			System.err.println(e);
		} catch (IOException e1) {
			System.err.println(e1);
		}
		
		try {
			Path realPath2 = absolutePath.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println("���� ���: " + realPath2);
		} catch (NoSuchFileException e) {
			System.err.println(e);
		} catch (IOException e1) {
			System.err.println(e1);
		}
	}

}
