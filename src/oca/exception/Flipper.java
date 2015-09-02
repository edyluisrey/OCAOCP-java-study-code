package oca.exception;

public class Flipper {
  public static void main(String[] args) {
	String o = "-";
	System.out.println("FRED".toLowerCase().substring(0,3));
	switch("FRED".toLowerCase().substring(1,4)) {
		case "yellow":
			o += "y";
		case "red":
			o += "r";
		case "green":
			o += "g";
	}
	
	System.out.println(o);
  }
}