package ro.ase.csie.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		ACMECharacter dragon = new FantasyCharacter("Blue Dragon", 1000);
		dragon.move();
		dragon.takeHit(200);
		dragon.heal(100);
		
		DisneyActions donald = new DonaldDuck("Donald Duck", 500);
		donald.changeLocation(100, 50);
		donald.losePower(250);
		donald.recoverPower(250);
		
		//Use the adapter
		ArrayList<ACMECharacter> characters = new ArrayList<>();
		characters.add(dragon);
		DisneyACMEAdapter donaldAdapter = new DisneyACMEAdapter(donald);
		characters.add(donaldAdapter);
		
		for(ACMECharacter hero : characters) {
			hero.move();
			hero.takeHit(100);
		}
	}
}
