package ocp.assertionsExceptions;

import java.io.IOException;
import java.sql.SQLException;

class BadIOTest {
	
	public static void main(String[] args) {
		BadIOTest a = new BadIOTest();
		try {
			a.fileBlowUp();
			a.databaseBlowUp();
			System.out.println("a");
		} catch(IOException e) { //posible catch(IOException | SQLException e) { 
			System.out.println("b");  
		} catch (Exception e) {
			System.out.println("c");
		} 
	}
	
	void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}
	
	void fileBlowUp() throws IOException {
		throw new IOException();
	}
}
