package tydev.bsk.entity.creatures.animals;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import tydev.bsk.Handler;
import tydev.bsk.combat.PositionManager;
import tydev.bsk.combat.enemies.MeleeAdventurer;
import tydev.bsk.combatutils.Position;
import tydev.bsk.entity.creatures.Creature;
import tydev.bsk.entity.creatures.Player;
import tydev.gfx.Animation;
import tydev.gfx.Assets;

public class GrayDog extends Creature {

//	PLAYER BOUNDS DATA FOR ANIMATION
//	PLAYER FRONT 6, 4, 18, 25
//	PLAYER LEFT  10, 6, 17, 24
//	PLAYER BACK  7, 6, 18, 24
//	PLAYER RIGHT
	
	private Animation animDown;
	private Animation animLeft;
	private Animation animRight;
	private Animation animUp;
	private static PositionManager pManager = new PositionManager();

	public GrayDog(Handler handler, float x, float y) {
		super(handler, x, y, 28, 28, 6, 4, 18, 25);

		this.combatCharacter = new MeleeAdventurer(pManager.AllyPositionAssigner());
		
		bounds.x = 6;
		bounds.y = 4;
		bounds.width = 18;
		bounds.height = 25;
		
//		Animation
		animDown= new Animation(100, Assets.gdog_down);
		animLeft= new Animation(100, Assets.gdog_left);
		animRight= new Animation(100, Assets.gdog_right);
		animUp= new Animation(100, Assets.gdog_up);
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
	}

	private void getInput() {
		xMove = Player.getxMove();
		yMove = Player.getyMove();

	}

	@Override
	public void render(Graphics g) {

		g.drawImage(getCurrentAnimation(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()), (int)(y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
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
			return Assets.gdog_down[0];
		}
		
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
