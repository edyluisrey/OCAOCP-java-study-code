package ocp.oodp.observer;

public class TestCircle {
	public static void main(String []s) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.addObserver(new Canvas());
		circle.addObserver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);
	}
}
