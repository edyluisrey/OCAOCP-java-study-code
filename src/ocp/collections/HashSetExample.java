package ocp.collections;

import java.util.HashSet;

class  Vegetables{
	  int id;
	  String name;
	  
	  Vegetables(int id, String name){
		  this.id=id;
		  this.name=name;
	  }
	  
	  public String toString(){
		  return ("id: "+id+" Name: "+name);
	  } 
	  
	  public String getName(){
		return this.name;  
	  }
	  
	  public boolean equals( Object object ) {
		  if (object == null) return false; 

		  Vegetables vegetables = (Vegetables)object; 
		  if (this.getName().equals(vegetables.getName()) )
			  return true;
		  
		  return false;
	  } 

      public int hashCode() {
		  return this.getName().hashCode();
	  }
}

public class HashSetExample {
     public static void main(String[] args) {
    	 Vegetables artichoke = new Vegetables(1,"artichoke"); 
    	 Vegetables asparagus = new Vegetables(2, "asparagus"); 
    	 Vegetables beans = new Vegetables(3,"beans");
    	 Vegetables beans2 = new Vegetables(4,"beans");

    	 HashSet<Vegetables> list = new HashSet<>(); 
    	 list.add(artichoke); 
    	 list.add(asparagus); 
    	 list.add(beans); 
    	 list.add(beans2);
    	 
    	 System.out.println("size:"+list.size()); //3
	 }
}
