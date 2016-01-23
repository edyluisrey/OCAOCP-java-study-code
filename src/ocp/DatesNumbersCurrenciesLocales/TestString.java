package ocp.DatesNumbersCurrenciesLocales;

public class TestString {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder(3);  //8  initial capacity
    	System.out.print(sb.length() + " " + sb + " ");  //0 
    	sb.insert(0, "abc");
    	sb.append("345");
    	System.out.println(sb.length() + " " + sb);
	}
}
