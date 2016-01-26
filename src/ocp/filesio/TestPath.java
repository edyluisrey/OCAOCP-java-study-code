package ocp.filesio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
      
	public static void main(String[] args) {
		 Path path = Paths.get("file1.txt");	
		 System.out.println(Files.exists(path));
		 Path  path1 = Paths.get("source");
		 Path   file = Paths.get("source/file2.txt");
		 try {
			Files.createFile(path); //You call static methods on Files rather than instance methods on File.
			System.out.println(Files.exists(path));
			Files.createDirectory(path1);
			Files.createFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}  
}
