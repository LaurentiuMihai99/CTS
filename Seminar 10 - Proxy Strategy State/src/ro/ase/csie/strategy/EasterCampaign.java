package ro.ase.csie.strategy;

public class EasterCampaign implements BonusStrategyInterface {

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += (1.25 * points);
	}

}
