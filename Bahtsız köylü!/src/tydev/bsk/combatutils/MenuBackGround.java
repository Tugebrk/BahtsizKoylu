package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.bsk.ui.ClickListener;
import tydev.gfx.Assets;


public class MenuBackGround extends CombatObject {

	private ClickListener clicker;
	
	
	
	public MenuBackGround(float x, float y, int width, int height, ClickListener clicker) {
		super(x, y, width, height);
		this.clicker = clicker;

	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {

			g.drawImage(Assets.barmid_ready, (int)x, (int)y, width, height, null);

	}

	@Override
	public void onClick() {
		clicker.onClick();
		
	}

}
