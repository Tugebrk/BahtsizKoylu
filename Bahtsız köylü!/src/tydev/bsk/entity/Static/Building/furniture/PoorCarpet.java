package tydev.bsk.entity.Static.Building.furniture;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.gfx.Assets;


public class PoorCarpet extends StaticEntity {

	public PoorCarpet(Handler handler, float x, float y) {
		super(handler, x, y, 128, 128, 0, 0, 15, 10);
		this.walkable = true;
	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.poorCarpet, (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

	@Override
	public void onMouseRelease(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseMove(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isAlwaysRenderBottom() {
		
		return true;
	}
}