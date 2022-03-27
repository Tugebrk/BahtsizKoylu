package tydev.bsk.combatutils.Skills.effects;

import tydev.bsk.combatutils.CombatCharacter;

public class Slow extends Effect {

	public Slow() {
		super(2);

	}

	public void onStun(CombatCharacter target) {

		target.setCombatSpeed(target.getCombatSpeed() - 2);
	
}

	@Override
	public void onEffect(CombatCharacter target) {
		// TODO Auto-generated method stub
		
	}
}