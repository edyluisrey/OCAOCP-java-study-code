package oca.classes.objects;


public class StaticConstructorTest {
	
	public static void main(String args[])
    {
        /*Below: I'm trying to create an object of the class
        which would intern call the constructor*/
		StaticConstructor obj = new StaticConstructor();
		StaticConstructor ob2 = new StaticConstructor();
    }
}
