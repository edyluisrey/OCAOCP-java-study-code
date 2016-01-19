package ocp.DatesNumbersCurrenciesLocales;

import java.util.Scanner;

public class TestScanner {
   public static void main(String[] args) {
	   int i;
	   String result = " ";
	   Scanner s1 = new Scanner("1 2 true hello 45 5");
   
	   while(s1.hasNext()) {
		   if (s1.hasNextInt()) {
			   i = s1.nextInt(); 
			   result += "Int";
		   } else if (s1.hasNextBoolean()) {
			   s1.nextBoolean(); 
			   result += "Bool";
		   } else {
			   s1.next(); 
			   result += "Strg";
		   }
	   }
	   System.out.println("result " + result);
   }
}
