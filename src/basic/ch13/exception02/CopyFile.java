package basic.ch13.exception02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(
					"C:\\Users\\Administrator\\Downloads\\input.txt");
			out = new FileOutputStream(
					"C:\\Users\\Administrator\\Downloads\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				
				out.close();
			}
		}

	}

}
