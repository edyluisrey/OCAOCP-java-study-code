package ocp.DatesNumbersCurrenciesLocales;

import java.util.Calendar;
import java.util.Date;

public class TestBasicDates {
     public static void main(String[] args) {
    	 Date d1 = new Date(1_000_000_000_000L); // a trillion, Java 7 style
    	 System.out.println("1st date " + d1.toString());
    	 
    	 Calendar c = Calendar.getInstance();
    	 c.setTime(d1);
    	 c.add(Calendar.MONTH, 1); 
    	 Date d2 = c.getTime(); 
    	 System.out.println("new date " + d2.toString() );
	 }
}