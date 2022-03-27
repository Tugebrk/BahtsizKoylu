
package tydev.bsk.entity.creatures.enemies;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import tydev.bsk.Handler;
import tydev.bsk.combat.PositionManager;
import tydev.bsk.combat.enemies.MeleeAdventurer;
import tydev.bsk.combatutils.Position;
import tydev.bsk.entity.Entity;
import tydev.bsk.entity.creatures.Creature;
import tydev.bsk.inventory.Inventory;
import tydev.bsk.state.CombatState;
import tydev.bsk.state.State;
import tydev.bsk.worlds.World;
import tydev.gfx.Animation;
import tydev.gfx.Assets;

public class HeavyMadventurerV1 extends Creature {

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
	

	public HeavyMadventurerV1(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGTH, 6, 4, 18, 25);

		this.isAlly = false;
		this.walkable = true;
		this.isAlive = true;
		bounds.x = (int) x;
		bounds.y = (int) y;
		bounds.width = Creature.DEFAULT_CREATURE_WIDTH;
		bounds.height = Creature.DEFAULT_CREATURE_HEIGTH;
		this.combatCharacter = new MeleeAdventurer(pManager.EnemyPositionAssigner());

//		Animation
		animDown = new Animation(100, Assets.lmadventurerV1_down);
		animLeft = new Animation(100, Assets.lmadventurerV1_left);
		animRight = new Animation(100, Assets.lmadventurerV1_right);
		animUp = new Animation(100, Assets.lmadventurerV1_up);

	}

	@Override
	public void tick() {
//		Animation
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();



		if (handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f).intersects(bounds)) {

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			CombatState combatState = new CombatState(handler, handler.getWorld().getCharacterManager());

			State.setState(combatState);
		}

	}

	public boolean isAlly() {

		return false;

	}

	@Override
	public void render(Graphics g) {

		g.drawImage(getCurrentAnimation(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	private BufferedImage getCurrentAnimation() {
//		Standin
		return Assets.lmadventurerV1_down[2];
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
