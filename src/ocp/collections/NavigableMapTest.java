package ocp.collections;

import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
    	TreeMap<Object,Object> navigableMap=new TreeMap<Object, Object>();
    	navigableMap.put("C", "Cabbage"); 
    	navigableMap.put("B", "Broccoli");
    	navigableMap.put("A", "Asparagus");
    	navigableMap.put("O", "Onion");
    	navigableMap.put("L", "Lagumes");
    	
    	System.out.println(navigableMap);
    	System.out.println("Descending Set:"+navigableMap.descendingKeySet());	
    	System.out.println("Reverse Map :"+navigableMap.descendingMap());
    	System.out.println("Floor Entry:"+navigableMap.floorEntry("L"));    		
    	System.out.println("First Entry  :"+navigableMap.firstEntry());    		
    	System.out.println("Last Key:"+navigableMap.lastKey());    		
    	System.out.println("First Key :"+navigableMap.firstKey());
    		
    		

	}
}
