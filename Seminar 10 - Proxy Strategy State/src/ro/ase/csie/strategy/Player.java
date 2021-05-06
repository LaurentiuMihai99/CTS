package ro.ase.csie.strategy;

public class Player {
	String userName;
	int playTime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCompaign = null;
	
	public void setBonusCampaign (BonusStrategyInterface bonusCampaign) {
		this.bonusCompaign = bonusCampaign;
	}
	
	public Player(String userName, int playTime, int experiencePoints) {
		super();
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExperiencePoints(int pointsRecieved, Player player) {
		if (this.bonusCompaign != null) {
			this.bonusCompaign.getBonusPoints(pointsRecieved, player);
		}
	}
	
}
