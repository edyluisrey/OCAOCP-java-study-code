package oca.classes.objects;


public class StaticConstructorTest {
	
	public static void main(String args[])
    {
        /*Below: I'm trying to create an object of the class
        which would intern call the constructor*/
		//StaticConstructor obj = new StaticConstructor();
		//StaticConstructor ob2 = new StaticConstructor();
		
		//Test strings
		int c=0;
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		StringBuilder sb3 = new StringBuilder(sb1);
		
		String s1="world";
		String s2=s1;
		String s3="world";
		
		if(sb1.equals(sb3))
			c++;
		if(sb1.equals(sb2))
			c++;
		if(sb1==sb2)
			c++;
		if(sb1==sb3)
			c++;
		if(s1.equals(s3))
			c++;
		if(s1.equals(s2))
			c++;
		System.out.println(c);	
    }
}
