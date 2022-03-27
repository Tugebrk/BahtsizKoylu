package tydev.bsk.entity.Static.Tree;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.bsk.tile.Tile;
import tydev.bsk.ui.ClickListener;
import tydev.gfx.Assets;

public class FallTree extends StaticEntity {

	public ClickListener clicker;
	public boolean hovering = false;

	public FallTree(Handler handler, float x, float y) {
		super(handler, x, y, 64, 64, 15, 10, 30, 35);

		this.clicker = new ClickListener() {
			public void onClick() {
				System.out.println("sss");

			}

		};

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {

		g.drawImage(Assets.fallTree, (int) (x), (int) (y), width, height, null);
	}

	@Override
	public void onMouseRelease(MouseEvent m) {
		if (hovering)
			onClick();

	}

	public void onClick() {
		clicker.onClick();

	}

	@Override
	public void onMouseMove(MouseEvent e) {
		if (bounds.contains(e.getX(), e.getY())) {

			hovering = true;

		}

		else {
			hovering = false;

		}

	}

}
