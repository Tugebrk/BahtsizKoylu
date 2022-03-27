package tydev.bsk.combat;

import java.awt.Graphics;

import tydev.bsk.Handler;

public abstract class Faction {

	protected Handler handler;

	public Faction() {

	}

	public abstract void tick();

	public abstract void render(Graphics g);

	public boolean isAlly() {

		return false;
	}

}
