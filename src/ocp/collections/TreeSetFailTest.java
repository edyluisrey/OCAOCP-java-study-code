package ocp.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetFailTest {
    public static void main(String[] args) {
    	Set set = new TreeSet();
        set.add("1");
        set.add(3);
        set.add("2");
        Iterator it = set.iterator();
        while (it.hasNext())
           System.out.print(it.next() + " ");     
        //Exception:  java.lang.String cannot be cast to java.lang.Integer
	}
}
