package ro.ase.csie.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
		//AbstractWeapon pistol = new Pistol("black", 100);
		//AbstractWeapon machineGun = new MachineGun("red");
		//AbstractWeapon bazooka = new Bazooka("green", 1000, 500);
		
		AbstractWeapon weapon = WeaponFactory.getWeapon(WeaponType.PISTOL, "black");
		AbstractWeapon machineGun = WeaponFactory.getWeapon(WeaponType.MACHINE_GUN, "red");
		AbstractWeapon bazooka = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "green");

	}

}
