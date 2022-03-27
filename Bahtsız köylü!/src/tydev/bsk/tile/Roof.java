package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Roof extends Tile {

	public Roof(int id) {
		super(Assets.roof1, id);
	
	}

	public boolean isSolid() {
		return true;
	}

	
}
