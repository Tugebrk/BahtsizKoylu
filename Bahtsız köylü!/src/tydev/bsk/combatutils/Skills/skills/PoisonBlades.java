package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.*;
import tydev.gfx.Assets;

public class PoisonBlades extends Skill {

	private static Effect poison = new Poison();
	private static Effect nothing = new Nothing();

	public PoisonBlades() {
		super(1, 0, 3, nothing, Assets.littleMeteorites);
		name = "poisonBlades";
		caster.getClasS().getBasicAttack().setEffect(poison);

	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {

		this.trueDamage = ((3 + c.getTurn().getCaster().getSpellDamage()) - c.getTurn().getTarget().getClasS().getSpellResist());
	}

	@Override
	public int returnTrueDamage() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
