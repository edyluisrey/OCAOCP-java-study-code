package ocp.collections;

import java.util.ArrayList;
import java.util.Collections;

class FruitComparable implements Comparable<FruitComparable>{
	int id;
	String name;
	int price;
	public FruitComparable(int id, String name, int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString(){
	   return "Id:"+id+ " name:"+name+ " price:"+price;	
	}
	
	@Override
	public int compareTo(FruitComparable o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
public class TestComparatorComparable {
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
	  }
}