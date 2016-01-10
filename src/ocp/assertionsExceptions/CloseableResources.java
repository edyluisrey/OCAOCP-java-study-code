package ocp.assertionsExceptions;

public class CloseableResources {
	
	class Closeable1 implements AutoCloseable {
		public void close() throws Exception {
			System.out.print("c1");
		} 
	}
	
	class Closeable2 implements AutoCloseable {
		public void close() throws Exception {
			System.out.print("c2");
		} 
	}

	public static void main(String[] args) throws Exception {
		new CloseableResources().run();
	}
	
	public void run() throws Exception {
		try (Closeable1 c1 = new Closeable1(); Closeable2 c2 = new Closeable2();) {
			System.out.print("run:");
		} finally {
			System.out.print("f");
		} 
	} 
}
