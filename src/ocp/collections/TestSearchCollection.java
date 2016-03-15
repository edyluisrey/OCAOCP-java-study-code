package ocp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSearchCollection {
    public static void main(String[] args) {
      FruitComparable fc1= new FruitComparable(2,"Mango",20);  
  	  FruitComparable fc2= new FruitComparable(1,"Orange",24);
  	  FruitComparable fc3= new FruitComparable(3,"Apple",21);
  	  ArrayList<FruitComparable> list = new ArrayList<FruitComparable>();
  	  list.add(fc1);
  	  list.add(fc2);
  	  list.add(fc3);
  	  Collections.sort(list);
  	  System.out.println(list);
  	  System.out.println("Orange="+Collections.binarySearch(list, fc2)); //2
  	  
  	  System.out.println("now using comparator");
  	  Collections.sort(list, new OrderFruit());
	  System.out.println(list);
	  System.out.println("Price 21="+Collections.binarySearch(list, fc3, new OrderFruit())); //1
	}
}
