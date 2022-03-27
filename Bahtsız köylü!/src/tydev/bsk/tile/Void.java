package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Void extends Tile {

	public Void(int id) {
		super(Assets.woid, id);
	
	}

	public boolean isSolid() {
		return true;
	}

	
}
