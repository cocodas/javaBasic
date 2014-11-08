package basic.ch13.exception01;

import java.io.InputStreamReader;

public class ReadFileImpl implements MyFile {
	private final String myFilePath;
	private InputStreamReader reader;
	
	public ReadFileImpl() {
		myFilePath = "c:\\text.txt";
		//reader = new InputStreamReader(in);
	}
	@Override
	public void readFile(String path) {
		
	}

	@Override
	public void writeFile(String path) {
		
	}

}
