package ocp.collections;

import java.util.TreeSet;

class  Vegetable{
	int id;
	String name;
	  
	Vegetable(int id, String name){
		  this.id=id;
		  this.name=name;
    }
}

public class TestTreeSet {
     public static void main(String[] args) {
    	 TreeSet<Vegetable> treeSet = new TreeSet<Vegetable>();
    	 Vegetable asparagus = new Vegetable(2, "asparagus"); 
    	 Vegetable potato = new Vegetable(3,"potato");
    	 Vegetable lettuce = new Vegetable(4,"lettuce");
    	 Vegetable beans = new Vegetable(4,"beans");
    	 Vegetable onion = new Vegetable(4,"onion");
    	 Vegetable cucumber = new Vegetable(4,"cucumber");
    	 
    	 treeSet.add(asparagus);
    	 treeSet.add(potato);
    	 treeSet.add(lettuce);
    	 treeSet.add(beans);
    	 treeSet.add(onion);
    	 treeSet.add(cucumber);
    	 
    	 System.out.println(treeSet);
	}
}
