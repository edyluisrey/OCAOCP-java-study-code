package ocp.collections;

import java.util.HashSet;
import java.util.LinkedList;

class  Vegetables{
  int id;
  String name;
  
  Vegetables(int id, String name){
	  this.id=id;
	  this.name=name;
  }
}

public class TestVegetables {
    
	public static void main(String[] args) {
		LinkedList<Vegetables> list = new LinkedList<Vegetables>();

		list.add(new Vegetables(1,"cabbage"));
		list.add(new Vegetables(2,"carrot"));
		list.add(new Vegetables(3,"cauliflower"));
		
		System.out.println(list.getFirst());
		list.removeFirst();
		list.removeLast();
		list.clear();  // empty all
		
		//HashSet:set has unique elements
		HashSet<String> hash = new HashSet<>();
		hash.add("cabbage");
		hash.add("carrot");
		hash.add("cabbage"); // Duplicate
		hash.add("carrot"); // Duplicate
		System.out.println(hash.size()); // 2
	}
}
