package ocp.assertionsExceptions;

public class MultiCatchExample {
	static class Exception1 extends Exception {}
	static class Exception2 extends Exception {}
	
	public static void main(String[] args) {
		try {
			new MultiCatchExample().run();
		} catch(Exception1 | Exception2 e) {
			e = new Exception1();  // The exception variable in a catch block may not be reassigned when using multi-catch.
		} finally { 
			System.out.println("f"); 
		}
	}
	
	public void run() throws Exception1, Exception2{
		
	}
}
