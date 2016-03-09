package ocp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("previous:");		
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		System.out.println("next():"); 		
		System.out.println("Next element is : " + it.next());
		
		System.out.println("Index:");
		System.out.println("Previous Index is : " + it.previousIndex());  
		System.out.println("Next Index is : " + it.nextIndex());

	}
}
