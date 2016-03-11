package ocp.collections;

public class TestAutoboxing {
   public static void main(String[] args) {
	   Integer y = 200;
	   Integer x = y;
	   System.out.println(y==x); //refer same ob
	   y++; //unwrap, use, "rewrap"
	   System.out.println(x + " " + y);
	   System.out.println(y==x); //refer diff ob
   }
}
