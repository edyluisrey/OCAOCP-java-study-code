package ocp.collections;

import java.util.EnumSet;

public class EnumSetJuice {
	
	private enum Fruit {
		APPLE, PAWPAW,PEAR
	};
    
	public static void main(String[] args) {
		 EnumSet<Fruit> Juice = EnumSet.of(Fruit.APPLE, Fruit.PAWPAW);
	}
}
