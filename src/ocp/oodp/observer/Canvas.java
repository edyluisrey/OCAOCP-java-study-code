package ocp.oodp.observer;

import java.util.Observable;
import java.util.Observer;

public class Canvas implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Canvas::update");
		// actual update code elided ...
	}
}
