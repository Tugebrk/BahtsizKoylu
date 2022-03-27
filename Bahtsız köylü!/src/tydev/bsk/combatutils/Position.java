package tydev.bsk.combatutils;

public class Position {

	private float x;
	private float y;
	CombatCharacter charAtSpot;
	private boolean occupication = false;
	
	public Position(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public CombatCharacter getCharAtSpot() {
		return charAtSpot;
	}
	public void setCharAtSpot(CombatCharacter charAtSpot) {
		this.charAtSpot = charAtSpot;
	}

	public boolean isOccupied() {
		return occupication;
	}

	public void occupied() {
		this.occupication = true;
	}
	
	public void available() {
		this.occupication = false;
	}
}
