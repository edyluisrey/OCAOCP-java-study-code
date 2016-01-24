package ocp.filesio;

import java.io.Console;

public class TestConsole {

	public static void main(String[] args) {
		   String name = "";
	       Console c = System.console();
	       char[] pw;
	       pw = c.readPassword("%s", "pw: ");
	       for(char ch: pw)
	    	   	c.format("%c ", ch);
	       c.format("\n");
	        	       
	       while(true) {
	         name = c.readLine("%s", "input?: ");
	         c.format("output: %s \n", name);
	      }
	}

}
