package tydev.bsk.entity.creatures;

import tydev.bsk.Handler;
import tydev.bsk.entity.Entity;
import tydev.bsk.tile.Tile;

public abstract class Creature extends Entity {

	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 32, DEFAULT_CREATURE_HEIGTH = 32;

	protected int health;
	protected float speed;
	protected static float xMove;
	protected static float yMove;

	public Creature(Handler handler, float x, float y, int width, int height, int xstart,int ystart, int xbound, int ybound) {
		super(handler, x, y, width, height, 32, 32, xbound, ybound);
		this.isAlive = true;
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}

	public void Move() {
		if (!checkEntityCollisions(xMove, 0f))
			moveX();
		if (!checkEntityCollisions(0f, yMove))
			moveY();
	}

	public void moveX() {

		if (xMove > 0) {

			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				x += xMove;
			}
		}

		else if (xMove < 0) {

			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)) {
				x += xMove;
			}
		}
	}

	public void moveY() {
		if (yMove < 0) {

			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			}
		}

		else if (yMove > 0) {

			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			}
		}
	}

	protected boolean collisionWithTile(int x, int y) {
		return handler.getWorld().getTile(x, y).isSolid();
	}

	public static float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		Creature.xMove = xMove;
	}

	public static float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		Creature.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public boolean isCreature() {
		
		return true;
		
	}
	
}
