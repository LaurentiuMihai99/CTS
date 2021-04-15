package ro.ase.csie.decorator;

import ro.ase.csie.adapter.ACMECharacter;

public class ArmorDecorator extends ACMEDecorator {

	int armorLevel;
	
	public ArmorDecorator(ACMECharacter character, int armorLevel) {
		super(character);
		this.armorLevel = armorLevel;
	}

	@Override
	public void takeHit(int lifePoints) {
		super.takeHit(lifePoints);
		int lostPoints = lifePoints - armorLevel;
		
		if (lostPoints > 0) {
			this.character.takeHit(lostPoints);
		}
		else {
			this.armorLevel -= lifePoints;
		}
	}
	
}
