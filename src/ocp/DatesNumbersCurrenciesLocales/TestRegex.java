package ocp.DatesNumbersCurrenciesLocales;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
     public static void main(String[] args) {
    	 Pattern p = Pattern.compile("aaabaaaab");
    	 Matcher m = p.matcher("a"); 
    	 System.out.println("expression: " + m.pattern()); 
    	 System.out.print("match positions: "+m.find()); 
    	 while(m.find()) {
    		 System.out.print(m.start() + " ");
    	 }
	}
}
