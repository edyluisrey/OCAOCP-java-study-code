package oca.keyword.superr;

class Subclass extends Parentclass{  
   int number=300;
   
   Subclass(){
	  /* Compile adds super() here at the first line
	  * of this constructor implicitly
	  */
	  System.out.println("Constructor of Subclass");
   }
   
   Subclass(int num){
	  /* Compile adds super() here at the first line
	  * of this constructor implicitly
	  */  super(num);
	  System.out.println("Constructor with arg" +num); 
   }
   
   void display(){
	  System.out.println("Child class method display");
   }
   
   void printMsg(){
		//This would call Overriding method
		display();
		//This would call Overridden method
		super.display();
   }
   
   void printNumber(){
      //Super.variable_name
      System.out.println(super.number);
   }
   
   public static void main(String args[]){ 
      Subclass obj= new Subclass(); //Constructor of Superclass and Constructor of Subclass
      obj.printNumber(); // print 200
      
      Subclass obj2= new Subclass(400);
      
      obj.printMsg();      
      
   }
}