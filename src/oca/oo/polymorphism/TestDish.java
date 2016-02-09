package oca.oo.polymorphism;

enum Ingredients{
   Potatoes, Fish, Oil, Onion;	
}

class Dish{
  public void Prepare(Ingredients in){
	  System.out.println("Dish prepare");
  }	
}

class Cebiche extends Dish{
	public void Prepare(Ingredients in){
		  System.out.println("cebiche prepare"+in);
	}	
}

public class TestDish {

}
