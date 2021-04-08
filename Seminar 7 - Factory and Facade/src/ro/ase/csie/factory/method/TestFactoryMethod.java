package ro.ase.csie.factory.method;

import ro.ase.csie.factory.simple.AbstractWeapon;
import ro.ase.csie.factory.simple.Pistol;

public class TestFactoryMethod {

	public static void main(String[] args) {
		boolean isWaterModeSet = true;
		
		if(isWaterModeSet) {
			AbstractWeapon pistol = new WaterPistol("Grey", 200);
		}
		else {
			AbstractWeapon pistol = new Pistol("Grey", 200);
		}

		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();
	}

}
