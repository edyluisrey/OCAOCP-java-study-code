package oca.oo.polymorphism;

import java.util.ArrayList;

class GeneralClass {
	 
	public void method1() {
	     System.out.println("Method1 - General class");
	}

	public void method2() {
	     System.out.println("method2 - General class");
	}

	
}

class SpecificClass1 extends GeneralClass {
	
	 @Override
	 public void method1() {
		     System.out.println("Method1 - Specific class");
	 }
}
 
public class TestPolymorphism {
	public static ArrayList<GeneralClass> generalClass = new ArrayList<GeneralClass>();
    public static void main(String[] args) {
    	GeneralClass  testClass1= new SpecificClass1();
    	testClass1.method1();
    	testClass1.method2();
	}
}
