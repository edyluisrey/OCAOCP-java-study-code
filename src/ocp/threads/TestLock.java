package ocp.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {  
    Lock objetoLock = new ReentrantLock();  
    public void lock() {  
         objetoLock.lock();//Adquiere el lock  
         System.out.println("Start thread " + Thread.currentThread().getName() + " have lock");  
         try {                           
              Thread.sleep(50000);  
         } catch (InterruptedException e) {  
              e.printStackTrace();  
         }  
         System.out.println("Finish thread " + Thread.currentThread().getName() + " have lock");  
         objetoLock.unlock();//Libera el lock  
    }  
}  

class Concurrent extends Thread {  
    Resource resource;  
    public Concurrent( Resource resource, String name) {  
         super(name);  
         this. resource = resource;  
    }  
    public void run(){  
         resource.lock();  
    }  
}  

public class TestLock {

	public static void main(String[] args) {
	  Resource resource = new Resource();  
      Concurrent c1 = new Concurrent(resource, "one");  
       c1.start();  
      Concurrent c2 = new Concurrent(resource, "two");  
      c2.start();  
   }
}


