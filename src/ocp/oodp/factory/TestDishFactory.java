package ocp.oodp.factory;

interface Dish{
  void prepare();	
}

class Cebiche implements Dish{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare cebiche");
	}
	
}

class LomoSaldado implements Dish{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare Lomo Saltado");
	}
	
}

public class TestDishFactory {

}
