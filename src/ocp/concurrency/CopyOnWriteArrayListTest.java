package ocp.concurrency;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
   public static void main(String[] args) {
	   CopyOnWriteArrayList<String> cplits = new CopyOnWriteArrayList<>();
	   cplits.add("Orange");
	   cplits.add("Apple");
       Iterator<String> it = cplits.iterator();
       while(it.hasNext()) {
         System.out.println(it.next() + " ");
       }
   }
}
