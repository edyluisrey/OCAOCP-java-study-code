package oca.classMember.finals;

public class SuperClass{
	
	public final void showSample() {
	  System.out.println("One thing.");
	}
	
	//remove body obligatory  and necesary abstract class
	//public abstract void testAbstractMethod();
	
	public synchronized void retrieveUserInfo(int id) { } // can be accessed by only one thread at a time
	
	void doStuff(char y, int... x ) { } // expects from 0 to many ints as parameters
}
