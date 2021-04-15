package ro.ase.csie.decorator;

import ro.ase.csie.adapter.ACMECharacter;
import ro.ase.csie.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("Blue Dragon", 1000);
		dragon.move();
		dragon.takeHit(200);
		dragon.heal(100);
		
		ACMECharacter dragon2 = new FantasyCharacter("Yellow Dragon", 1000);
		dragon2.move();
		dragon2.takeHit(200);
		dragon2.heal(100);
		
		//NOT LIKE THIS!!!!!!!!!!!
		//ACMECharacter dragonWithArmor = new ArmorDecorator(dragon, 200);
		//dragonWithArmor.takeHit(300);
		
		//LIKE THIS
		dragon = new ArmorDecorator(dragon, 200);
		dragon.takeHit(300);
	}

}
