package ocp.filesio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class TestPath {
      
	public static void main(String[] args) {
		 Path path = Paths.get("file1.txt");	
		 System.out.println(Files.exists(path));
		 Path  path1 = Paths.get("source");
		 Path   file = Paths.get("source/file2.txt");
		 try {
			if(!Files.exists(path)) 
				Files.createFile(path); //You call static methods on Files rather than instance methods on File.
			System.out.println(Files.exists(path));
			if(!Files.exists(path1))
				Files.createDirectory(path1);
			if(!Files.exists(file))
			    Files.createFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//info about path
		System.out.println("getFileName: "  + path.getFileName());
		System.out.println("getName(0): " +  file.getName(0));
		System.out.println("getNameCount: "  + file.getNameCount());
		System.out.println("getParent: " +  file.getParent());
		System.out.println("getRoot: " +  file.getRoot());
		
		//normalize
		System.out.println(Paths.get("/a/b/c/..").normalize());
		System.out.println(Paths.get(".classpath").normalize());
				
		//path1.resolve ((String) null);  //compile 
		
		//BasicFileAttributes		
		try {
			BasicFileAttributes basic = Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println("create: " + basic.creationTime());
	        System.out.println("access: " + basic.lastAccessTime());
	        System.out.println("modify: " + basic.lastModifiedTime());
	        System.out.println("directory: " + basic.isDirectory());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DirectoryStream
		Path dir = Paths.get("source");
		try (DirectoryStream<Path> stream =Files.newDirectoryStream(dir)){
		    for (Path pathS : stream)
		       System.out.println(pathS.getFileName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		 
	}  
}
