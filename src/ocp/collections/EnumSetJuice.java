package ocp.collections;

import java.util.EnumSet;

public class EnumSetJuice {
	
	private enum Fruit {
		APPLE, PAWPAW,PEAR
	};
    
	public static void main(String[] args) {
		 EnumSet<Fruit> juice = EnumSet.of(Fruit.APPLE, Fruit.PAWPAW);
		 drinkJuice(juice);
	}
	
	public static void drinkJuice(EnumSet<Fruit> juice){
       System.out.println("Juice of:"+juice);
	}
}
