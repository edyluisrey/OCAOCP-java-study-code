package ocp.DatesNumbersCurrenciesLocales;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestBasicDates {
     public static void main(String[] args) {
    	 Date d1 = new Date(1_000_000_000_000L);
    	 System.out.println("1st date " + d1.toString());
    	 
    	 Calendar c = Calendar.getInstance();
    	 c.setTime(d1);
    	 c.add(Calendar.MONTH, 1); 
    	 Date d2 = c.getTime(); 
    	 System.out.println("new date " + d2.toString() );
    	 
    	 Calendar c2 = Calendar.getInstance();
    	 c2.set(2015, 11, 25); // December 25, 2015
    	 Date d3 = c2.getTime();
    	 
    	 Locale locIT = new Locale("it", "IT");
    	 DateFormat dfITaly = DateFormat.getDateInstance(DateFormat.FULL, locIT);
    	 System.out.println("Italy: " + dfITaly.format(d3));
    	 System.out.println("Italy:  " + locIT.getDisplayCountry());
    	 System.out.println("Italy lan: " + locIT.getDisplayLanguage());
   
	 }
}
