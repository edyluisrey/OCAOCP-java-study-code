package ocp.collections;

import java.util.Iterator;
import java.util.TreeSet;

class  Vegetable implements Comparable<Vegetable>{
	private int id;
	private String name;
	  
	Vegetable(int id, String name){
		  this.id=id;
		  this.name=name;
    }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String toString(){
		  return ("id: "+id+" Name: "+name);
	} 
	
	public int compareTo(Vegetable vegetable) {		
		return this.name.toLowerCase().compareTo(vegetable.name.toLowerCase());		
	}	
}

public class TestTreeSet {
     public static void main(String[] args) {
    	 TreeSet<Vegetable> treeSet = new TreeSet<Vegetable>();
    	 Vegetable asparagus = new Vegetable(2, "asparagus"); 
    	 Vegetable potato = new Vegetable(3,"potato");
    	 Vegetable lettuce = new Vegetable(1,"lettuce");
    	 Vegetable beans = new Vegetable(4,"beans");
    	 Vegetable onion = new Vegetable(5,"onion");
    	 Vegetable cucumber = new Vegetable(4,"cucumber");
    	 
    	 treeSet.add(asparagus);
    	 treeSet.add(potato);
    	 treeSet.add(lettuce);
    	 treeSet.add(beans);
    	 treeSet.add(onion);
    	 treeSet.add(cucumber);
    	 
    	 Iterator <Vegetable> vegetable = treeSet.iterator();
    	 while (vegetable.hasNext()){
    	     System.out.println(vegetable.next());
    	 }
	}
}
