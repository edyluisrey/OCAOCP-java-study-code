package oca.accessControl.interfaces;

interface Moveable {
	void moveIt();
}

interface Spherical {
	void doSphericalThing();
}

interface Bounceabl extends Moveable, Spherical {
	void bounce();
	void setBounceFactor(int bf);
}

class Ball implements Bounceabl {
	public void bounce() { }// Implement Bounceable's methods
	public void setBounceFactor(int bf) { }
	public void moveIt() { } // Implement Moveable's method
	public void doSphericalThing() { } // Implement Spherical
}