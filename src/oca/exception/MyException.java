package oca.exception;

import java.io.IOException;

class MyException extends Exception {
	void someMethod () throws MyException {
	   doStuff();
	}
	
	void doStuff() throws MyException {
		try {
			
			throw new MyException();
		}
		catch(MyException me) {
			throw me;
		}
	}
		
}