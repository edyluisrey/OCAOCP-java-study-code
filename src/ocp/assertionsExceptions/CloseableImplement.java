package ocp.assertionsExceptions;

import java.io.Closeable;
import java.io.IOException;

public class CloseableImplement {
	 
	class Lamb implements Closeable {
		public void close() { 
			System.out.println("close");
			throw new RuntimeException("a");
		} 
	}
	
	public static void main(String[] args) {
		new CloseableImplement().run();
	}
		
	public void run() {
		try (Lamb l = new Lamb();) {
			throw new IOException();
		} catch(Exception e) {
			System.out.println("catch");
			throw new RuntimeException("c");
		} 
	}
}
