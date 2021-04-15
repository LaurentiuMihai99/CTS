package ro.ase.csie.decorator;

import ro.ase.csie.adapter.ACMECharacter;

public class WoundedDecorator extends ACMEDecorator {

	public final static int MIN_POINTS = 200;
	
	public WoundedDecorator(ACMECharacter character) {
		super(character);
	}

	@Override
	public void move() {
		if (this.character.getLifePoints() < MIN_POINTS) {
			System.out.println("You can't move. Is critically wounded");
		}
		else {
			this.character.move();	
		}
		
	}
	
}
