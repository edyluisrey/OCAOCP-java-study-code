package ocp.collections;

class FruitCitric{
	int id;
	String name;
	String group;
	FruitCitric(int id, String name, String group){
		this.id=id;
		this.name=name;
		this.group=group;
	}
	
	public boolean equals(Object o){
	    if(o == null)                
	    	return false;
	    if(!(o instanceof FruitCitric)) 
	    	return false;
	    FruitCitric other = (FruitCitric) o;
	    return this.id == other.id;
	}
	

	@Override
	public int hashCode() {
		return this.id*10;
	}
 
}

public class FruitHashEqual {
      public static void main(String[] args) {
    	  FruitCitric orange= new FruitCitric(3,"Orange","Citric");
    	  FruitCitric tangerine= new FruitCitric(3,"Tangerine","Citric");
    	  System.out.println(orange.equals(tangerine));
    	  System.out.println(orange.hashCode());
    	  System.out.println(tangerine.hashCode());
	  }
}
