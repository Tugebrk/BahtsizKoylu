package tydev.bsk.combatutils.Skills.effects;

import tydev.bsk.combatutils.CombatCharacter;

public class Stun extends Effect {

	public Stun() {
		super(2);

	}

	public void onStun(CombatCharacter target) {

		this.effectRenewal();
		target.setCombatSpeed(0);
		this.effectCountDown();

	}

	@Override
	public void onEffect(CombatCharacter target) {
		// TODO Auto-generated method stub
		
	}
}
