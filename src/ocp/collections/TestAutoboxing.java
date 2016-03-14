package ocp.collections;

public class TestAutoboxing {
   public static void main(String[] args) {
	   Integer y = 200;
	   Integer x = y;
	   System.out.println(y==x); //refer same ob
	   y++; //unwrap, use, "rewrap"
	   System.out.println(x + " " + y);
	   System.out.println(y==x); //refer diff ob
	   
	   System.out.println("");
	   Integer i = 20;
	   Integer i1 = 20;
	   if(i != i1) System.out.println("true1");
	   if(i == i1) System.out.println("true2");
	   if(i.equals(i1)) System.out.println("true3");
	   
	   Short s= 100;
	   System.out.println(++s); //unboxes
	   System.out.println("s:"+s);
   }
}
