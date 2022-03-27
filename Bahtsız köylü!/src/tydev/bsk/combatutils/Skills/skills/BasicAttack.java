package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.Nothing;
import tydev.gfx.Assets;

public class BasicAttack extends Skill {

	
	private static Effect effect = new Nothing();

	public BasicAttack() {
		super(0, 1, 1, effect, Assets.basicAttack);
		name = "basicAttack";

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
		BasicAttack.effect = effect;
	}

	@Override
	public int returnTrueDamage() {
		return this.trueDamage;
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {
		
		this.trueDamage = ((3 + c.getTurn().getCaster().getAttackDamage()) - c.getTurn().getTarget().getClasS().getArmor());
		
	}
}
