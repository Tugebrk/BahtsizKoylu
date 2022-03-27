package tydev.bsk.entity.crops;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.gfx.Assets;

public class Wheat extends StaticEntity {

	public Wheat(Handler handler, float x, float y) {
		super(handler, x, y, 32, 32, 0, 0, 15, 10);

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.wheat, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

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