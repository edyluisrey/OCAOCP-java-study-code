package ocp.collections;

class MyOuter {
    private String str = "apple";   
    
    class MyInner {
      public void showOuter() {
        System.out.println("Outer str: " + str);
      }
    } 
}

public class InnerClassTest {
  public static void main(String[] args) {
	MyOuter outer= new MyOuter();
	MyOuter.MyInner inner= outer.new MyInner();
	inner.showOuter();
  }
}
