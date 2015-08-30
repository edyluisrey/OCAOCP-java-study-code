package oca.oo.operators;

class Fork {
	public static void main(String[] args) {
		if(args.length == 1 | args[1].equals("test")) {  //fail
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}
}
