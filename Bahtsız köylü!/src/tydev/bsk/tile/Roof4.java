package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Roof4 extends Tile {

	public Roof4(int id) {
		super(Assets.roof4, id);

	}

	public boolean isSolid() {
		return true;
	}

}
