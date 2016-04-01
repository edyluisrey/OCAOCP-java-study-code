package ocp.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
    	 ConcurrentHashMap<String,String> fruits = new ConcurrentHashMap<String,String>();
		 fruits.put("Apple", "$2");
		 fruits.put("Mango", "$3");
			
		 Iterator iterator = fruits.keySet().iterator();			
		 while (iterator.hasNext())
		{   fruits.put("Pawpaw", "$5");
			System.out.println(fruits.get(iterator.next()));
			fruits.put("Orange", "$4");
		}
    }
}
