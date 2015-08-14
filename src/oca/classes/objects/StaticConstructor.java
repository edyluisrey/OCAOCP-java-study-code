package oca.classes.objects;

public class StaticConstructor {
     private static int cont= 0;
	 
     static
	 {   
	   System.out.println("Static Constructor of the class"+ cont++);
	 }
     
}
