package tydev.bsk.entity.Static.Building.walls;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import tydev.bsk.Handler;
import tydev.bsk.entity.Static.StaticEntity;
import tydev.bsk.entity.creatures.Player;
import tydev.bsk.ui.ClickListener;
import tydev.gfx.Assets;

public class DoorT2 extends StaticEntity {

	private BufferedImage[] images;
	private ClickListener clicker;
	private BufferedImage activeSit;
	private boolean hovering = false;

	public DoorT2(Handler handler, float x, float y) {

		super(handler, x, y, 32, 64, 0, 0, 32, 64);

		this.images = new BufferedImage[2];
		images[1] = Assets.doortier2open;
		images[0] = Assets.doortier2;
		this.activeSit = images[0];
		this.clicker = new ClickListener() {
			public void onClick() {

				if (activeSit == images[1]) {
					activeSit = images[0];
					walkable = false;
				} else {
					activeSit = images[1];
					walkable = true;

				}
			}
		};

	}

	@Override
	public void tick() {
		
		Player player = handler.getWorldManager().getFarm().getEntityManager().getPlayer();
		
		if (player.getCollisionBounds(0f, 0f).intersects(bounds)
				&& activeSit == images[1]) {

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			

			
			handler.getGame().getGameState().getActiveWorld().getEntityManager().getEntities().clear();
			System.out.println("old " + handler.getGame().getGameState().getActiveWorld().getEntityManager().getEntities().size());
			handler.getGame().getGameState()
					.setActiveWorld(handler.getWorldManager().getInHouse());
			player.setX(180);
			player.setY(300);
			handler.getWorldManager().getInHouse().getEntityManager().setPlayer(player);
			player.getpManager().positionResetter();



		}

		else
			return;

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(activeSit, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

	public void onClick() {
		clicker.onClick();

	}

	public void onMouseMove(MouseEvent e) {
		if (bounds.contains(e.getX(), e.getY())) {

			hovering = true;

		}

		else {
			hovering = false;

		}

	}

	public void onMouseRelease(MouseEvent e) {
		if (hovering)
			onClick();

	}

	public BufferedImage getActiveSit() {
		return activeSit;
	}

	public void setActiveSit(BufferedImage activeSit) {
		this.activeSit = activeSit;
	}

	public BufferedImage[] getImages() {
		return images;
	}

	public void setImages(BufferedImage[] images) {
		this.images = images;
	}

	public boolean isAlly() {

		return false;

	}

}