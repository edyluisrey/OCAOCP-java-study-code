package oca.oo.polymorphism;

//Overrides
class Animal {
	public void eat() {
	  System.out.println("Generic Animal Eat");
	}
}

class Horse extends Animal {
	public void eat() {
	   System.out.println("Horse eat");
	}
	public void buck() { }
}

class cow extends Animal{
	
}
public class TestAnimals {
	public static void main (String [] args) {
		Animal a = new Animal();
		Animal b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
		//b.buck();  undefined for Animal
		Animal c = new cow();
		c.eat();
				
	}
}
