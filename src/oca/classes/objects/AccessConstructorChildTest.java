package oca.classes.objects;

public class AccessConstructorChildTest {
	
  public static void main(String args[]){
	  AccessConstructorChild obj = new AccessConstructorChild();
	  obj.DisplayMessage();
	  System.out.println("Counter:"+ obj.getCounter()); //1
	  AccessConstructorChild obj1 = new AccessConstructorChild();
	  System.out.println("Counter:"+ obj1.getCounter());//2
	  
	  //static method
	  AccessConstructor accessConstructor = new AccessConstructor();
	  AccessConstructorChild accessConstructorChild = new AccessConstructorChild();
	  AccessConstructor accessConstructorChild2 = new AccessConstructorChild();
	  accessConstructor.StaticMethod();//AccessConstructor method -- same AccessConstructor.StaticMethod();
	  accessConstructorChild.StaticMethod();// AccessConstructorChild method
	  accessConstructorChild2.StaticMethod();// AccessConstructor  method, becuase is on compile time  
  }
  
}
