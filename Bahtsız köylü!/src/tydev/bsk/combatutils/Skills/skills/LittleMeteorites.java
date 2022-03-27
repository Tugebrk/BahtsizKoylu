package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.Nothing;
import tydev.gfx.Assets;

public class LittleMeteorites extends Skill {

	private static Effect nothing = new Nothing();
	
	
	public LittleMeteorites() {
		super(3, 4, 1, nothing, Assets.littleMeteorites);
		this.name = "Little Meteorites";
		
		
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {
		this.trueDamage = ((3 + c.getTurn().getCaster().getAttackDamage()) - c.getTurn().getTarget().getClasS().getArmor());
		
	}

	@Override
	public int returnTrueDamage() {
		return this.trueDamage;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
