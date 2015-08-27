package oca.classes.objects;

public class AccessConstructorChild extends AccessConstructor {
	private static int counter=0;
	
	public AccessConstructorChild(){
		System.out.println("AccessConstructorChild");
		counter+=1;
	}
	
	public void DisplayMessage(){
		System.out.println("message");
	}
	
	public int getCounter(){
		return counter;
	}
	
	//Redifinition
	public static void StaticMethod(){
        System.out.println("static method AccessConstructorChild");
    }
	
	void testDefault(){
		System.out.println("defaul modifier");
	}
	
	protected void testProtected(){
		System.out.println("protected method");
	}
}
