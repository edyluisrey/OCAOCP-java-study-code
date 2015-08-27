package oca.keyword.superr;

public class Parentclass {
	int number = 200;
	
	public Parentclass(){
	      System.out.println("Constructor of Superclass");
    }
	
	Parentclass(int num){
	      System.out.println("Constructor of Superclass wirh args");
    }
	
	void display(){
		  System.out.println("Parent class method Display");
	}
	
	protected void testProtectedMethod(){
		
	}
	
	public void testPublicMethod(){
		
	}
}
