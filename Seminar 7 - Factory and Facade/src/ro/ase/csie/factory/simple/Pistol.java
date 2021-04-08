package ro.ase.csie.factory.simple;

public class Pistol extends AbstractWeapon {

	public Pistol(String color, int power) {
		super(color, power);
	}
	
	@Override
	public void pewPew() {
		System.out.println("->   ->   ->   ->   ->");
	}

}
