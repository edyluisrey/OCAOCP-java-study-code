package oca.methods.parameters;

public class WideningBoxingTest {
	 
	public static void main(String[] args){
		 
        byte byteVar = 10;
        short shortVar = 10;
        int intVar = 10;
        
        method(byteVar);  //method int v       
        method(shortVar); //method int v
	 	
        method1(intVar);  //method1 long v
	   
        
        int[] niveles = {1, 2, 3, 0};
        /*System.out.println("\nEjecucion Switch sin Breaks (entra en todos los case cada vez): ");
        for (int i=0; i < niveles.length; i++)
        {*/
            int i=1; System.out.println("Nivel: " + niveles[i]);
            switch (niveles[i])
            {
              case 1: System.out.println("\tNivel Basico."+niveles[i]);
 
              case 2: System.out.println("\tNivel Intermedio."+ niveles[i]);
 
              case 3: System.out.println("\tNivel Avanzado.");
 
              default: System.out.println("\tNivel no informado.");
            }
        //}
        
    }
	
	public static void method(int v){
		System.out.println("method int v");
	}

	public static void method(long v){
		System.out.println("method int v");
	}
	
	public static void method1(long v){
		System.out.println("method1 long v");
	}

	public static void method1(Integer v){
		System.out.println("method1 Integer v");
	}
	 
}
