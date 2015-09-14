package oca.exception;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {
	private static final Map<Integer, String> employees = new HashMap<>();
	
	EmployeeTest(){ 
		employees.put(1, "Juan"); 
		employees.put(2, "Raul");
    }
	
	public String getEmployee(int id) throws EmployeeException { 
		if(employees.get(id)==null){
			throw new EmployeeException("don't exist",id); 
		} 
		return employees.get(id); 
    }
		
	public static void main(String args[]){
		EmployeeTest employeeTest = new EmployeeTest();
		try {
			employeeTest.getEmployee(3);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
