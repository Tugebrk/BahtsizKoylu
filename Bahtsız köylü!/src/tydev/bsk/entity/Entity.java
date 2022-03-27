package tydev.bsk.entity;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.entity.creatures.Creature;
import tydev.bsk.worlds.World;

public abstract class Entity {

	protected Handler handler;
	protected float x, y;
	protected int width, height;
	protected Rectangle bounds;
	protected CombatCharacter combatCharacter;
	protected boolean walkable = false;
	protected boolean isAlly = true;
	protected boolean isAlive = false;


	public Entity(Handler handler, float x, float y, int width, int height, int xStart, int yStart, int xbound,
			int ybound) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		bounds = new Rectangle((int)x, (int)y, xbound, ybound);
	}

	public abstract void tick();

	public abstract void render(Graphics g);
	
	public abstract void onMouseRelease(MouseEvent m);
	
	public abstract void onMouseMove(MouseEvent e);

	public boolean checkEntityCollisions(float xOffset, float yOffset) {

		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e.equals(this))
				continue;
			if (e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)) && !e.walkable) {
				return true;
			}
		}
		return false;
	}

	public Rectangle getCollisionBounds(float xOffset, float yOffset) {
		return new Rectangle((int) (x + xOffset), (int) (y + yOffset), bounds.width,
				bounds.height);
	}

	public Rectangle setCollisionBounds(float x, float y, float width, float height) {
		return new Rectangle((int) x, (int) y, (int) width, (int) height);
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

	public int getWidth() {
		return width;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public CombatCharacter getCombatCharacter() {
		return combatCharacter;
	}

	public void setCombatCharacter(CombatCharacter combatCharacter) {
		this.combatCharacter = combatCharacter;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public boolean isWalkable() {
		return walkable;
	}

	public void setWalkable(boolean isWalkable) {
		this.walkable = isWalkable;
	}

	public boolean isAlly() {
		return isAlly;
	}

	public void setAlly(boolean isAlly) {
		this.isAlly = isAlly;
	}

	public boolean isCreature() {
		
		return false;
		
	}
	
	public boolean isPlayer() {
		
		return false;
		
	}
	
	public boolean isAlwaysRenderBottom() {
		
		return false;
	}
}