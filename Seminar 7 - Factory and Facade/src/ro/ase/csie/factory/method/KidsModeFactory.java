package ro.ase.csie.factory.method;

import ro.ase.csie.factory.simple.AbstractWeapon;
import ro.ase.csie.factory.simple.Bazooka;
import ro.ase.csie.factory.simple.MachineGun;
import ro.ase.csie.factory.simple.Pistol;
import ro.ase.csie.factory.simple.WeaponType;

public class KidsModeFactory extends AbstractWeaponFactory {
	
	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL: {
			weapon = new WaterPistol(color, 200);
			break;
		}
		case MACHINE_GUN:
			weapon = new WaterBaloon(color, 500);
			break;
		case BAZOOKA:
			weapon = new WaterBucket(color, 1000);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return weapon;
	}
}
