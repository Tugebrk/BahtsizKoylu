package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.gfx.Assets;

public class NeckStab extends Skill {

	public NeckStab() {
		super(2, 1, 2, effectManager.getBleed(), Assets.neckStab);
		name = "neckStab";
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {

		this.trueDamage = ((3 + c.getTurn().getCaster().getAttackDamage()) - c.getTurn().getTarget().getClasS().getArmor());
	}

	@Override
	public int returnTrueDamage() {
		return this.trueDamage;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
