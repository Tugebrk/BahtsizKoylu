package tydev.bsk.entity.Static.Tree;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.bsk.tile.Tile;
import tydev.gfx.Assets;

public class DarkgTree extends StaticEntity {

	public DarkgTree(Handler handler, float x, float y) {
		super(handler, x, y, 64, 64, 15, 10, 30, 35);

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.darkgTree, (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void onMouseRelease(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseMove(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
