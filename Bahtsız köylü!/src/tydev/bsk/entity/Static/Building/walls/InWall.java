package tydev.bsk.entity.Static.Building.walls;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.gfx.Assets;

public class InWall extends StaticEntity {

	public InWall(Handler handler, float x, float y) {
		super(handler, x, y, 96, 64, 0, 0, 92, 52);
		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.inWall, (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
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
