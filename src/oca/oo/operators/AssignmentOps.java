package oca.oo.operators;

class AssignmentOps {
	public static void main(String [] args) {
	  int sizeOfYard = 10;
	  int numOfPets = 5;
	  String status = (numOfPets<4)?"Pet count OK":(sizeOfYard > 8)? "Pet limit on the edge":"too many pets";
	  System.out.println("Pet status is " + status);
	  
	  byte b1 = 6 & 8;
	  byte b2 = 7 | 9;
	  byte b3 = 5 ^ 4;
	  System.out.println(b1 + " " + b2 + " " + b3);
	  System.out.println("xor " + ((2 < 3) ^ (4 > 3)));
	}
}
