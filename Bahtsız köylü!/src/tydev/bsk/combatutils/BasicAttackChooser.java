package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.bsk.ui.ClickListener;
import tydev.gfx.Assets;


public class BasicAttackChooser extends CombatObject {

	private ClickListener clicker;
	private TurnTracker turnTracker;
	
	
	
	public BasicAttackChooser(float x, float y, int width, int height, TurnTracker turnTracker, ClickListener clicker) {
		super(x, y, width, height);
		this.clicker = clicker;
		this.turnTracker = turnTracker;

	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {
		if (hovering)
			g.drawImage(Assets.button2_ready_on, (int) x - 10, (int) y - 10, width + 20, height + 20, null);
		else
			g.drawImage(Assets.button_ready_off, (int) x - 10, (int) y - 10, width + 20, height + 20, null);
			g.drawImage(turnTracker.getCurrentCaster().getTurn().getCaster().getClasS().getBasicAttack().getPortrait(), (int)x, (int)y, width, height, null);
	}

	@Override
	public void onClick() {
		clicker.onClick();
		
	}

}
