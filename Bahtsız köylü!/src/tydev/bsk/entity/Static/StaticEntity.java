package tydev.bsk.entity.Static;

import tydev.bsk.Handler;
import tydev.bsk.entity.Entity;

public abstract class StaticEntity extends Entity {

	public StaticEntity(Handler handler, float x, float y, int width, int height, int xStart, int yStart, int xbound,
			int ybound) {
		super(handler, x, y, width, height, xStart, yStart, xbound, ybound);
	}

	public boolean isAlive() {

		return false;

	}
}
