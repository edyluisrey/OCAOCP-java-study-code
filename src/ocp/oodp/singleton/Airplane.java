package ocp.oodp.singleton;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private static  Airplane Instance;
    private List<Integer> seats= new ArrayList<Integer>();
    
    private Airplane(){
    	for(int i=1;i<=50;i++)
    		seats.add(i);
    }
    
    public static Airplane gerInstance(){
    	if (Instance == null) { 
    		Instance= new Airplane();
    	}
       return Instance;	
    }
     
    public boolean bookSeats(Integer i){
    	return seats.remove(i);
    }
    
	public static void main(String[] args) {
        Airplane airplane = Airplane.gerInstance();
        System.out.println("Book seats:"+ airplane.bookSeats(1)); //true
        System.out.println("Book seats:"+ airplane.bookSeats(1)); //false
	}

}
