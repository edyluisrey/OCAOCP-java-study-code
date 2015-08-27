package oca.accessControl.abstracts;


class Hobbit {
   int countGold(int x, int y) {
	   return x + y; 
   }
}

public class Frodo extends Hobbit{
  public static void main(String[] args) {
    int myGold = 7;
    System.out.println(countGold(myGold, 6));
  }
}
