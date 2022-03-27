package tydev.bsk.entity.Static.Building.walls;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.gfx.Assets;

public class WallT2 extends StaticEntity {

	boolean hovering = false;

	public WallT2(Handler handler, float x, float y) {
		super(handler, x, y, 96, 64, 0, 0, 92, 52);
		this.setBounds(new Rectangle((int) x, (int) y, bounds.width, bounds.height));

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.walltier2, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void onMouseRelease(MouseEvent m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMouseMove(MouseEvent e) {

	}
}