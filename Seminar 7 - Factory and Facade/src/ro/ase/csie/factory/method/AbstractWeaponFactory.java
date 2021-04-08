package ro.ase.csie.factory.method;

import ro.ase.csie.factory.simple.AbstractWeapon;
import ro.ase.csie.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {
	public abstract AbstractWeapon getWeapon(WeaponType type, String color);
}
