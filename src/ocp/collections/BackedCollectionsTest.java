package ocp.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollectionsTest {
     public static void main(String[] args) {
    	 TreeMap<String, String> map = new TreeMap<String, String>();
         map.put("a", "Artichoke"); 
         map.put("c", "Celery"); 
         map.put("b", "Broccoli");
         
         SortedMap<String, String> submap;
         submap = map.subMap("c", "y");
         System.out.println(map + " " + submap);//{a=Artichoke, b=Broccoli, c=Celery} {c=Celery}

         map.put("p", "Pumpkin");
         submap.put("o", "Onion");
         System.out.println(map + " " + submap); //{a=Artichoke, b=Broccoli, c=Celery, o=Onion, p=Pumpkin} {c=Celery, o=Onion, p=Pumpkin}
	}
}
