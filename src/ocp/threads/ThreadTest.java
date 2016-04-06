package ocp.threads;

public class ThreadTest implements Runnable {
	public void run() {
         move(Thread.currentThread().getId());
     }
	
	synchronized void move(long id) {
		System.out.print(id + " ");
	}
    
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId());
		ThreadTest t = new ThreadTest();
        new Thread(t).start();
        new Thread(new ThreadTest()).start();
	}
}
