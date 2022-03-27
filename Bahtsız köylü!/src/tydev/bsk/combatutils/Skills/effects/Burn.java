package tydev.bsk.combatutils.Skills.effects;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.gfx.Assets;
import tydev.gfx.ITanim;

public class Burn extends Effect {

	int initialDamage = 2;
	int dpt = 2;

	public Burn() {
		super(3);
		this.anim = new ITanim(50, Assets.burnEffect);

	}

	@Override
	public void onEffect(CombatCharacter target) {
		if (this.counter == this.baseDuration) {
			target.setHealth(target.getHealth() - initialDamage);
			System.out.println("initial damage!");
			target.setHurt(true);
		}
		if (this.counter > 0) {
			target.setHealth(target.getHealth() - dpt);
			System.out.println(target.getName() + "is burning!");
			System.out.println("Health after burn " + target.getHealth());
			this.effectCountDown();
			target.setHurt(true);
			
		}

	}
}