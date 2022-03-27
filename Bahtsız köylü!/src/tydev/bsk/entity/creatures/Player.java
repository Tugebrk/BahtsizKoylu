package tydev.bsk.entity.creatures;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import tydev.bsk.Handler;
import tydev.bsk.combat.PositionManager;
import tydev.bsk.combat.ThePlayer;
import tydev.bsk.inventory.Inventory;
import tydev.gfx.Animation;
import tydev.gfx.Assets;

public class Player extends Creature {

//	PLAYER BOUNDS DATA FOR ANIMATION
//	PLAYER FRONT 6, 4, 18, 25
//	PLAYER LEFT  10, 6, 17, 24
//	PLAYER BACK  7, 6, 18, 24
//	PLAYER RIGHT
	
	private Inventory inventory;
	private Animation animDown;
	private Animation animLeft;
	private Animation animRight;
	private Animation animUp;
	private PositionManager pManager = new PositionManager();


	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGTH, 6, 4, 18, 25);

		this.walkable = false;
		this.isAlly = true;
		bounds.x = 6;
		bounds.y = 4;
		bounds.width = 18;
		bounds.height = 25;
		this.combatCharacter = new ThePlayer(pManager.getPosition2());
		
//		Animation
		animDown= new Animation(100, Assets.player_down);
		animLeft= new Animation(100, Assets.player_left);
		animRight= new Animation(100, Assets.player_right);
		animUp= new Animation(100, Assets.player_up);
		
		inventory = new Inventory(handler);
	}

	@Override
	public void tick() {
//		Animation
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
//		Move
		getInput();
		Move();
		handler.getGameCamera().centerOnEntity(this);
//		Inventory
		inventory.tick();
	}

	private void getInput() {
		xMove = 0;
		yMove = 0;

		if (handler.getKeyManager().up)
			yMove = -speed;
		if (handler.getKeyManager().down)
			yMove = speed;
		if (handler.getKeyManager().left)
			xMove = -speed;
		if (handler.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {

		g.drawImage(getCurrentAnimation(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		inventory.render(g);
	}
	
	private BufferedImage getCurrentAnimation() {
//		Moving
		if(xMove < 0) {
			return animLeft.getCurrentFrame();
		}
		else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}
		else if(yMove < 0) {
			return animUp.getCurrentFrame();
		} 
		else if(yMove > 0) {
			return animDown.getCurrentFrame();
		}
//		Standing
		else {
			return Assets.player_down[2];
		}
		
	}

	
	
	public PositionManager getpManager() {
		return pManager;
	}

	public void setpManager(PositionManager pManager) {
		this.pManager = pManager;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public void onMouseRelease(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onMouseMove(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isPlayer() {
		
		return true;
	}
	
	public boolean isAlwaysRenderBottom() {
		
		return false;
	}
}
