package ocp.assertionsExceptions;

import java.io.IOException;

public class SuppressedException {
	
	class Close1 implements AutoCloseable {		
		public void close() {
			throw new RuntimeException("a");
		} 
	}
	
	public static void main(String[] args) throws IOException {
		new SuppressedException().run();
	}
	
	public void run() throws IOException {
		try (Close1 cl1 = new Close1();) {
			throw new IOException();
		} catch(Exception e) {
			throw e;
		} 
	}
}
