package nio2.chapter02;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicViewSupportCheckTestMain {

	public static void main(String[] args) {
		Path path = Paths.get(System.getProperty("user.home"), "Downloads", "Security.java");
		try {
			FileStore store = Files.getFileStore(path);
			boolean supported = store.supportsFileAttributeView("basic");
			System.out.println(store.toString() + " --- " + supported);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
