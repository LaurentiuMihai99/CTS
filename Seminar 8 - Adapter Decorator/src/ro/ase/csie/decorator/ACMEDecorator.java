package ro.ase.csie.decorator;

import ro.ase.csie.adapter.ACMECharacter;

public abstract class ACMEDecorator extends ACMECharacter {
	ACMECharacter character = null;
	
	public ACMEDecorator(ACMECharacter character) {
		super(character.getName(), character.getLifePoints());
		this.character = character;
	}

	@Override
	public void move() {
		this.character.move();
	}

	@Override
	public void takeHit(int lifePoints) {
		this.character.takeHit(lifePoints);
	}

	@Override
	public void heal(int lifePoints) {
		this.character.heal(lifePoints);
	}	
	
}
