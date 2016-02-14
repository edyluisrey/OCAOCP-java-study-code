package ocp.oodp.factory;

interface Dish{
    void prepare();	
}

class Cebiche implements Dish{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare cebiche");
	}
	
}

class LomoSaltado implements Dish{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare Lomo Saltado");
	}
	
}

class DishFactory {
	
	public Dish getDish(String nameDish){	     	
	      if(nameDish.equalsIgnoreCase("Cebiche")){
	         return new Cebiche();
	         
	      } else if(nameDish.equalsIgnoreCase("LomoSaltado")){
	    	  return new LomoSaltado();
	      }	      
	      return null;
	   }
}

public class TestDishFactory {
      
	 public static void main(String[] args) {
    	  DishFactory dishFactory= new DishFactory();
    	  Dish dish1= dishFactory.getDish("Cebiche");
    	  dish1.prepare();
    	  Dish dish2=dishFactory.getDish("LomoSaltado");
    	  dish2.prepare();
	  }
}
