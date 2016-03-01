package ocp.collections;

class FruitCitric{
	String name;
	String group;
	FruitCitric(String name, String group){
		this.name=name;
		this.group=group;
	}
	
	public boolean equals(Object o){
	    if(o == null)                
	    	return false;
	    if(!(o instanceof FruitCitric)) 
	    	return false;
	    FruitCitric other = (FruitCitric) o;
	    return this.group == other.group;
	}
}

public class FruitHashEqual {
      public static void main(String[] args) {
    	  FruitCitric orange= new FruitCitric("Orange","Citric");
    	  FruitCitric tangerine= new FruitCitric("Tangerine","Citric");
    	  System.out.println(orange.equals(tangerine));
	  }
}
