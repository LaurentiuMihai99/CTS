package ro.ase.csie.adapter;

public class DonaldDuck implements DisneyActions {

	String name;
	int powerLevel;
	
	public DonaldDuck(String name, int powerLevel) {
		super();
		this.name = name;
		this.powerLevel = powerLevel;
	}

	
	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public int getPowerLevel() {
		return this.powerLevel;
	}

	@Override
	public void losePower(int power) {
		this.powerLevel -= power;
		System.out.println(String.format("%s is losing %d power", this.name, power));
	}

	@Override
	public void recoverPower(int power) {
		this.powerLevel =+ power;
		System.out.println(String.format("%s is recovering %d power", this.name, power));
	}

	@Override
	public void changeLocation(int x, int y) {
		System.out.println(String.format("%s is moving to x:%d y:%d", this.name, x, y));
	}

}
