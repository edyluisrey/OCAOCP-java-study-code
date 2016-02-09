package ocp.filesio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TestFileVisitor  extends SimpleFileVisitor<Path>{
	
	 public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		    System.out.println("pre directory: " + dir);
		    return FileVisitResult.CONTINUE; 
     }
     
	 public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		    System.out.println("file visit: " + file);
            if ( file.getFileName().endsWith("file4.txt")) {
            	return FileVisitResult.TERMINATE;
            }
            return FileVisitResult.CONTINUE; 
	 }
     
	 public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		    System.out.println("post  directory: " + dir);
		    return FileVisitResult.CONTINUE; 
     }
	 
	 public static void main(String[] args) {
		    TestFileVisitor dir = new TestFileVisitor();
		    try {
				Files.walkFileTree(Paths.get("source"), dir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
     }
}
