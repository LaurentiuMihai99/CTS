package ro.ase.csie.dp.memento;

public class SuperHero {
	String name;
	int lifePoints;
	String magic;
	
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking");
	}
	
	public void heal(int lifePoints) {
		this.lifePoints += lifePoints;
	}
	
	public void takeAHit(int lifePoints) {
		this.lifePoints -= lifePoints;
	}
	
	public HeroMemento createRestorePoint() {
		return new HeroMemento(name,lifePoints,magic);
	}
	
	public SuperHero restore(HeroMemento memento) {
		this.name = memento.name;
		this.lifePoints = memento.lifePoints;
		this.magic = memento.magic;
		return this;
	}
}
