package tydev.bsk.tile;

import tydev.gfx.Assets;

public class Wall extends Tile {
	
	public Wall(int id) {
		super(Assets.wall, id);

	}
	
	public boolean isSolid() {
		return true;
	}

}
