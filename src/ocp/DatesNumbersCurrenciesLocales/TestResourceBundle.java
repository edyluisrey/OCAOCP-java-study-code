package ocp.DatesNumbersCurrenciesLocales;

import java.util.Locale;
import java.util.ResourceBundle;


public class TestResourceBundle {
    public static void main(String[] args) {
    	Locale locale = new Locale("en");
    	ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
    	System.out.println(rb.getString("hello"));
    	
    	Locale locale2 = new Locale("fr");
    	ResourceBundle rb2 = ResourceBundle.getBundle("Labels", locale2);
    	System.out.println(rb2.getString("hello"));
    	
    	Locale locale3 = new Locale("es", "PE");
    	ResourceBundle rb3 = ResourceBundle.getBundle("BaseName", locale3);
    	System. out.println(rb3.getObject("hello"));
	}
}
