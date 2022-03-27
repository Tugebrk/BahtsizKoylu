package tydev.bsk.combat;

public class FactionManager {
	
	private static Faction Ally = new Ally();
	private static Faction Enemy = new Enemy();
	
	public static Faction getAlly() {
		return Ally;
	}
	public static void setAlly(Faction ally) {
		Ally = ally;
	}
	public static Faction getEnemy() {
		return Enemy;
	}
	public static void setEnemy(Faction enemy) {
		Enemy = enemy;
	}
	
	

}
