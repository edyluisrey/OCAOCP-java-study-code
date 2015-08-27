package oca.accessControl.interfaces;

//only lets public or abstract
public abstract interface Bounceable {  
	public static final int CONST =1;
	
	public abstract void bounce();
    
	void setBounceFactor(int bf);  //implicitly public and abstract is same the first
	
	/*final void bounce(); //final and abstract can never be used
	static void bounce();  //together, and abstract is implied
	private void bounce();  //interfaces define instance methods
	protected void bounce(); //interface methods are always public*/

}