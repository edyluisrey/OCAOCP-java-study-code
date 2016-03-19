package ocp.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
   public static void main(String[] args) {
	   NavigableSet<String> navigableSet = new TreeSet<String>(Arrays.asList("Orange", "Apple", "Banana", "Avocado", "Coconuts"));
	   Iterator<String>  iterator = navigableSet.descendingIterator();
	   while(iterator.hasNext())
		   System.out.println(iterator.next());
	   System.out.println(navigableSet.headSet("Banana")); //[Apple, Avocado]
	   System.out.println(navigableSet.floor("Apple"));
	   System.out.println(navigableSet.pollLast());  //Orange
	   
   }
}
