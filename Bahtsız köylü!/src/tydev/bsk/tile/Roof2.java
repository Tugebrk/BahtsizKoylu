package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Roof2 extends Tile {

	public Roof2(int id) {
		super(Assets.roof2, id);

	}

	public boolean isSolid() {
		return true;
	}

}
