package oca.exception;

public class TestMyIndexOutOfBoundsException {
    
	public static void main(String[] args){
	  try{
    	 throw new MyIndexOutOfBoundsException();
      }catch(IndexOutOfBoundsException e){
    	  System.out.println("class: " + e.getClass());
      }
	}	  
}
