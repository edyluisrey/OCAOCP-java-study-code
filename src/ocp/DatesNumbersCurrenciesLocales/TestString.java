package ocp.DatesNumbersCurrenciesLocales;

public class TestString {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder(3);  //8  initial capacity
    	System.out.print(sb.length() + " " + sb + " ");  //0 
    	sb.insert(0, "abc");
    	sb.append("345");
    	System.out.println(sb.length() + " " + sb);
    	
    	String s1 = "abc";
    	String s2 = s1;
    	s1 += "d";
    	System.out.println(s1 + " " + s2 + " " + (s1==s2)); //abcd abc false
   
    	StringBuffer sb1 = new StringBuffer("abc");
    	StringBuffer sb2 = sb1;
    	sb1.append("d");
    	System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); //abcd abcd true
	}
}

