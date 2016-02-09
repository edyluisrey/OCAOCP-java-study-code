package ocp.oodp.composition;

interface Swimmer{
	void swim();
}

interface Flying {
	void fly();
}

class Duck implements Swimmer{
	public void swim(){
         System.out.println("swim");		
	}
}

class Eagle implements Swimmer, Flying{
    private Swimmer  swimmer;
    
    Eagle(Swimmer swimmer){
    	this.swimmer=swimmer;
    }
	
    public void fly() {
		System.out.println("Fly");
	}

	public void swim() {
		swimmer.swim();
	}
    	
}

public class TestAnimal {
	public static void main(String[] args) {
		Duck duck=new Duck();  
	    Eagle eagle= new Eagle(duck);  
	    eagle.swim();
	    eagle.fly();
	}    
}
