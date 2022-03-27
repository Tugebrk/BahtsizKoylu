package tydev.bsk.combatutils;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.EffectManager;

public abstract class Skill {

	protected String name;
	protected int manaCost;
	protected int baseSpellDamage;
	protected int coolDown;
	protected Effect effect;
	protected static EffectManager effectManager = new EffectManager();
	protected CombatCharacter caster;
	protected CombatCharacter target;
	protected int trueDamage;
	protected BufferedImage portrait;

	public Skill(int manaCost, int baseSpellDamage, int coolDown, Effect effect, BufferedImage portrait) {

		this.manaCost = manaCost;
		this.baseSpellDamage = baseSpellDamage;
		this.coolDown = coolDown;
		this.effect = effect;
		this.portrait = portrait;

	}
	
	public abstract void calcTrueDamage(CombatCharacter c);
	public abstract int returnTrueDamage();
	
//	GETTER SETTER
	
	public int getManaCost() {
		return manaCost;
	}

	public int getBaseSpellDamage() {
		return baseSpellDamage;
	}

	public void setBaseSpellDamage(int baseSpellDamage) {
		this.baseSpellDamage = baseSpellDamage;
	}

	public int getTrueDamage() {
		return trueDamage;
	}

	public void setTrueDamage(int trueDamage) {
		this.trueDamage = trueDamage;
	}

	public BufferedImage getPortrait() {
		return portrait;
	}

	public void setPortrait(BufferedImage portrait) {
		this.portrait = portrait;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	public int getSpellDamage() {
		return baseSpellDamage;
	}

	public void setSpellDamage(int spellDamage) {
		this.baseSpellDamage = spellDamage;
	}

	public int getCoolDown() {
		return coolDown;
	}

	public void setCoolDown(int coolDown) {
		this.coolDown = coolDown;
	}

	public Effect getEffect() {
		return effect;
	}

	public void setEffect(Effect effect) {
		this.effect = effect;
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

	public abstract String getName();

}
