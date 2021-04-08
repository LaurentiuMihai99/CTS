package ro.ase.csie.cts.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100).build();
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200).isVillain().isWounded().build();

	}

}
