package ocp.filesio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestIOFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            File dir = new File("dir3");
            dir.mkdir();
            File file = new File(dir, "file3");
            file.createNewFile();
		} catch (Exception x) { 
			
		} 
		
		//test BufferedReader
		String s;
		try {
		  FileReader fr = new FileReader("fileWrite.txt");
		  BufferedReader br = new BufferedReader(fr);
		  while((s = br.readLine()) != null)
			  System.out.println(s);
		} catch (IOException e) { }
	}

}
