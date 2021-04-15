package ro.ase.csie.adapter;

public class DisneyACMEAdapter extends ACMECharacter {
	
	DisneyActions disneyCharacter = null;
	
	public DisneyACMEAdapter(DisneyActions disneyCharacter) {
		super(disneyCharacter.getName(), disneyCharacter.getPowerLevel());
		this.disneyCharacter = disneyCharacter;
	}

	@Override
	public void move() {
		this.disneyCharacter.changeLocation(0, 0);
	}

	@Override
	public void takeHit(int lifePoints) {
		this.disneyCharacter.losePower(lifePoints);
	}

	@Override
	public void heal(int lifePoints) {
		this.disneyCharacter.recoverPower(lifePoints);
	}

}
