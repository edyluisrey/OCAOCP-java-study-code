package ocp.oodp.observer;

import java.util.Observable;

public class Circle extends Observable {
	private Point center;
	private int radius;
	
	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}
	
	public void setCenter(Point center) {
		this.center = center;
		setChanged();
		notifyObservers();
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
		setChanged();
		notifyObservers();
	}
	
	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}
}

//Point.java
class Point {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public String toString() {
		return "(" + xPos + "," + yPos + ")";
	}
}
