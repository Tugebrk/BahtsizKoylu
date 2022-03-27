package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.Nothing;

public class LightAttack extends Skill {

	
	private static Effect effect = new Nothing();

	public LightAttack() {
		super(0, 1, 1, effect, null);
		name = "Light Attack";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CombatCharacter getCaster() {
		return caster;
	}

	public void setCaster(CombatCharacter caster) {
		this.caster = caster;
	}

	public CombatCharacter getTarget() {
		return target;
	}

	public void setTarget(CombatCharacter target) {
		this.target = target;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		LightAttack.effect = effect;
	}

	@Override
	public int returnTrueDamage() {
		return this.trueDamage;
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {
		
		this.trueDamage = ((this.baseSpellDamage + c.getTurn().getCaster().getAttackDamage()) - c.getTurn().getTarget().getClasS().getArmor());
		
	}
}
