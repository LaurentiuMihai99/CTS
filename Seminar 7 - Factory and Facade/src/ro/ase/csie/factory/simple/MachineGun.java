package ro.ase.csie.factory.simple;

public class MachineGun extends AbstractWeapon{
	private static final int DISTANCE = 500;
	
	public MachineGun(String color) {
		super(color, DISTANCE);
	}
	
	@Override
	public void pewPew() {
		System.out.println("->->->->->->->->->->->->->->->->");
	}
}
