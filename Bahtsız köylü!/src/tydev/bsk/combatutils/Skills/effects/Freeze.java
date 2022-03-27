package tydev.bsk.combatutils.Skills.effects;

import tydev.bsk.combatutils.CombatCharacter;

public class Freeze extends Effect{

	public Freeze() {
		super(2);
		this.initialDamage = 2;
		this.dpt = 1;
}

	public void DamagePerTurn(CombatCharacter target) {
		
		target.setHealth(target.getHealth() - this.dpt);
	}

	@Override
	public void onEffect(CombatCharacter target) {
		
		
		this.effectRenewal();
		target.setCombatSpeed(0);
		target.setHealth(target.getHealth() - this.initialDamage);
		this.effectCountDown();
		
		
	}
}