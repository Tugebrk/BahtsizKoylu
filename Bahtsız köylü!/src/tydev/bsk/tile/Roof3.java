package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Roof3 extends Tile {

	public Roof3(int id) {
		super(Assets.roof3, id);

	}

	public boolean isSolid() {
		return true;
	}

}
