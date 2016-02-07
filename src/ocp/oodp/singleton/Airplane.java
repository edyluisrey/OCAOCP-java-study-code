package ocp.oodp.singleton;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    public static final Airplane Instance= new Airplane();
    private List<Integer> seats= new ArrayList<Integer>();
    private Airplane(){
    	for(int i=1;i<=50;i++)
    		seats.add(i);
    }
    
    public static Airplane gerInstance(){
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
