package oca.oo.assignments;

public class Telescope {
	static int magnify = 2;
	
	public static void main(String[] args) {
		go();
		System.out.println("main:" + magnify);
	}
	
	static void go() {
		int magnify = 3;
		System.out.println("magnify go:" +magnify);
		zoomIn();
	}
	
	static void zoomIn() {
		magnify *= 5;
		zoomMore(magnify);
		System.out.println("zoomIn: "+ magnify);
	}
	
	static void zoomMore(int magnify) {
		magnify *= 7;
		System.out.println("zoomMore: "+ magnify);
	}
}
