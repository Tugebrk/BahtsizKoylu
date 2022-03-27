package tydev.bsk.combatutils;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public abstract class CombatObject {

	protected int width, height;
	protected float x, y;
	protected boolean hovering = false;
	protected Rectangle bounds;

	public CombatObject(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		bounds = new Rectangle((int) x, (int) y, width, height);
	}

	public abstract void tick();

	public abstract void render(Graphics g);
	
//	MOUSEVENTS

	public void onMouseMove(MouseEvent e) {
		if (bounds.contains(e.getX(), e.getY()))
			hovering = true;
		else
			hovering = false;

	}

	public void onMouseRelease(MouseEvent e) {
		if (hovering)
			onClick();

	}

//	GETTERS SETTERS

	protected abstract void onClick();

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public boolean isHover() {
		return hovering;
	}

	public void setHover(boolean hover) {
		this.hovering = hover;
	}

}
