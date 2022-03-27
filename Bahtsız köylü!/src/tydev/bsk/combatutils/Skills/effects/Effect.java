package tydev.bsk.combatutils.Skills.effects;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.gfx.ITanim;

public abstract class Effect {

	protected int baseDuration;
	protected int counter;
	protected int initialDamage;
	protected int dpt;
	protected ITanim anim;

	public Effect(int duration) {

		this.counter = duration;
		this.baseDuration = duration;

	}
	
	public abstract void onEffect(CombatCharacter target);

	public void effectCountDown() {

		if (this.counter > 0)
			this.counter = counter - 1;

	}
	
	public void effectRenewal() {
		if (this.counter == 0)
			this.counter = baseDuration;
		
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int duration) {
		this.counter = duration;
	}

	public int getBaseDuration() {
		return baseDuration;
	}

	public void setBaseDuration(int baseDuration) {
		this.baseDuration = baseDuration;
	}

	public int getInitialDamage() {
		return initialDamage;
	}

	public void setInitialDamage(int initialDamage) {
		this.initialDamage = initialDamage;
	}

	public int getDpt() {
		return dpt;
	}

	public void setDpt(int dpt) {
		this.dpt = dpt;
	}

	public ITanim getAnim() {
		return anim;
	}

	public void setAnim(ITanim anim) {
		this.anim = anim;
	}

	
}
