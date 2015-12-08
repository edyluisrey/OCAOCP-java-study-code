package ocp.assertionsExceptions;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
	public static void main(String[] args) {
		AllGoesWrong a = new AllGoesWrong();
		int num= -2;
		a.methodA(num);
		
		try {
			a.blowUp();
			System.out.println("a");
		} catch (IOException | SQLException e) {
			System.out.println("c");
		} finally {
			System.out.println("d");
		}
	}
	
	void blowUp() throws IOException, SQLException {	
		throw new SQLException();
	}
	
	private void methodA(int num) {
		assert (num>=0):"num es menor";
		// throws an AssertionError
		// if this test isn't true
		System.out.println("num:"+num);
    }
} 
