package ocp.filesio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderFile {
    public static void main(String[] args) {
    	char[] in = new char[20]; // to store input
    	int size = 0;
    	try {
    		File file = new File("fileWrite.txt");  // just an object
    		FileWriter fw =new FileWriter(file); // create an actual file
    		fw.write("hi\njava world"); // write characters
    		fw.flush(); 
    		fw.close(); 
    		FileReader fr =new FileReader(file); 
    		size = fr.read(in); // read the whole file!
    		System.out.print(size + " "); // how many bytes read
    		for(char c : in) 
    			System.out.print(c);
    			fr.close();
    		} catch(IOException e) {
    			
    		}
	}
}
