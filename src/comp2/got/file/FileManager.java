package comp2.got.file;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	private File file;
	private BufferedReader reader = null;
	
	public FileManager(String path) {
		file = new File(path);
		
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getAllFileContent() throws IOException {
		ArrayList<String> all = new ArrayList<String>();
		String line;
		while((line = reader.readLine()) != null) {
			all.add(line);
		}
		
		return all;
	}
}
