package ocp.DatesNumbersCurrenciesLocales;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
     public static void main(String[] args) {
    	 Pattern p = Pattern.compile("\\b");
    	 Matcher m = p.matcher("w2w w$s"); 
    	 System.out.println("expression: " + m.pattern()); 
    	 System.out.print("match positions: "); 
    	 while(m.find()) {
    		 System.out.print(m.start() + " ");
    	 }
    	 System.out.print("\n");
    	 
    	 Pattern p1 = Pattern.compile("0[xX][0-9a-fA-F]");
    	 Matcher m1 = p1.matcher("12 0x 0x12 0Xf 0xg"); 
    	 while(m1.find()) {
    		 System.out.print(m1.start() + " ");
    	 }
    	 System.out.print("\n");
    	     	 
    	 Pattern p3 = Pattern.compile("\\d+");
    	 Matcher m3 = p3.matcher("1 a12 234b");
    	 while(m3.find()) {
    		 System.out.println(m3.start() + " group:" + m3.group());
    	 }
    	 System.out.print("\n");
    	 
    	 //+ one or more occurrences
    	 //* Zero or more occurrences
    	 //? Zero or one occurrence
    	 Pattern p4 = Pattern.compile(".*xx");
    	 Matcher m4 = p4.matcher("yyxxxyxx");
    	 while(m4.find()) {
    		 System.out.println(m4.start() + " group:" + m4.group());
    	 }
	}
}
