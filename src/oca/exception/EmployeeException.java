package oca.exception;

public class EmployeeException extends Exception {
   private static final long serialVersionUID = 1L;
   private int employeeId;
   
   public EmployeeException(){
	   super();
   }
   
   public EmployeeException(String message, int employeeId){
       super(message);
       this.employeeId= employeeId;
   }
   
   public EmployeeException(String message, int employeeId, Throwable cause){
	   super(message, cause);
	   this.employeeId= employeeId;
   }
   
   @Override 
   public String toString() {
	   return super.toString(); 
   }
   
   @Override 
   public String getMessage() {
	   return super.getMessage() + " for employee :" + employeeId; 
   }
   
   public int getEmployeeId() { 
	   return employeeId; 
   }
}
