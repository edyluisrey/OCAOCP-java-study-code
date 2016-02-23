package ocp.collections;

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
	}
}
