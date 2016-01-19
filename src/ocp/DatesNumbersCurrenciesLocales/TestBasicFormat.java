package ocp.DatesNumbersCurrenciesLocales;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestBasicFormat {
   
	public static void main(String[] args) { 
		float f1 = 100.3489f;
		Locale lIt = new Locale("it"); 
		NumberFormat[] nf = new NumberFormat[4];
		nf[0] = NumberFormat.getInstance();
		nf[0].setMaximumFractionDigits(2);
		nf[1] = NumberFormat.getInstance(lIt);
		nf[2] = NumberFormat.getCurrencyInstance(); // local
		nf[3] = NumberFormat.getCurrencyInstance(lIt);
		for(NumberFormat numberfor : nf)  
			System.out.println(numberfor.format(f1));
    	
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);		
		numberFormat.setParseIntegerOnly(true);

		String usersNumber = "1976.0826" ;
		try{
		    Number num = numberFormat.parse(usersNumber) ;
		    System.out.println(num);  // it doesn't work fine , because print 19760826
		    //It depend Set locale. If you're in a locale where . can be used as a thousands separator it does'n work
		}
		catch(ParseException pe){
		    System.out.println(pe);
		}
		
		System.out.printf("%2$d + %1$d \n", 123, 456);
		//%[arg_index$][flags][width][.precision]conversion char
		int a = -100;
		int b = 102394;
		System.out.printf("%1$(7d \n", a);
		System.out.printf("%0,7d  \n", b);
		System.out.format("%+-7d \n", b);
		System.out.printf("%2$b + %1$5d \n", a, false);
    }
}
