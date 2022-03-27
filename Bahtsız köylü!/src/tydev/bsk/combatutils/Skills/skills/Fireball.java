package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.*;
import tydev.gfx.Assets;

public class Fireball extends Skill {

	public Fireball() {
		super(3, 3, 3, effectManager.getBurn(), Assets.fireball);
		name = "fireBall";
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {

		this.trueDamage = ((3 + c.getTurn().getCaster().getSpellDamage()) - c.getTurn().getTarget().getClasS().getSpellResist());
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
