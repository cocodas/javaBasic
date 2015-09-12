package nio2.chapter02;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.BasicFileAttributeView;

public class BasicViewCheck {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		
		for (FileStore store : fs.getFileStores()) {
			boolean supported = store.supportsFileAttributeView(BasicFileAttributeView.class);
			System.out.println(store.name() + " --- " + supported);
		}
	}

}
