package ocp.collections;


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

}
