package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.bsk.state.CombatState;
import tydev.bsk.ui.ClickListener;

public class TargetSetter extends CombatObject {

	private ClickListener clicker;
	private Position position;

	public TargetSetter(Position position, int width, int height, CombatState combatState, TurnTracker turnTracker) {
		super((int)position.getX(), (int)position.getY(), width, height);
		this.position = position;
		clicker = new ClickListener() {
			public void onClick() {

				turnTracker.getCurrentCaster().getTurn().setTarget(position.getCharAtSpot());
				System.out
						.println("Target setted as " + turnTracker.getCurrentCaster().getTurn().getTarget().getName());

			};
		};

	}

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {

//		g.drawRect((int)position.getX(), (int)position.getY(), width, height);
		
	}

	@Override
	public void onClick() {
		clicker.onClick();

	}

}
