package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.gfx.Assets;

public class HealthBar extends CombatObject {

	@SuppressWarnings("unused")
	private static TurnTracker turnTracker;
	private int hp;
	private CombatCharacter character;

	public HealthBar( TurnTracker turnTracker, CombatCharacter character) {
		super(character.getPosition().getX(), character.getPosition().getY(), (int) character.getPosition().getX(), 10);
		HealthBar.turnTracker = turnTracker;
		this.character = character;

		
	}

	@Override
	public void tick() {
		this.hp = character.getHealth();
	}

	@Override
	public void render(Graphics g) {
		if(this.hp >= 0) {
		g.drawImage(Assets.hp_line, (int) character.getPosition().getX(),
				(int) character.getPosition().getY(), hp * 4, height, null);
		g.drawImage(Assets.hp_frame, (int) character.getPosition().getX(), (int) character.getPosition().getY(), hp * 4, height, null);
		}
	}

	@Override
	protected void onClick() {

	}

}
