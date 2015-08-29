package oca.accessControl.interfaces;

interface Gadget {
   void doStuff();
}

abstract class Electronic {
   void getPower() { System.out.print("plug in "); }
}

public class Tablet extends Electronic implements Gadget {
   
	public void doStuff() { // change to public
		System.out.print("show book "); 
	}

   public static void main(String[] args) {
       new Tablet().getPower();
       new Tablet().doStuff();
   }
}
