package ro.ase.csie.adapter;

public class FantasyCharacter extends ACMECharacter {
	public FantasyCharacter(String name, int lifePoints) {
		super(name, lifePoints);
	}

	@Override
	public void move() {
		System.out.println(String.format("%s is moving", name));
	}

	@Override
	public void takeHit(int lifePoints) {
		this.lifePoints -= lifePoints;
		System.out.println(String.format("%s takes a hit of %d life points", name, lifePoints));
		
	}

	@Override
	public void heal(int lifePoints) {
		this.lifePoints += lifePoints;
		System.out.println(String.format("%s heals %d points", name, lifePoints));
	}
	
	
}
