package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.bsk.ui.ClickListener;
import tydev.gfx.Assets;

public class ReadyButton extends CombatObject {

	private ClickListener clicker;

	public ReadyButton(float x, float y, int width, int height, ClickListener clicker) {
		super(x, y, width, height);
		this.clicker = clicker;

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {

		if (hovering)
			g.drawImage(Assets.button2_ready_on_ready, (int) x, (int) y , width, height, null);
		else
			g.drawImage(Assets.button2_ready_off_ready, (int) x, (int) y , width, height, null);
	}

	@Override
	public void onClick() {
		clicker.onClick();

	}

}
