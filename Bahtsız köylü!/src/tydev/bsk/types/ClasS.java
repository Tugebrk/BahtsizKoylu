package tydev.bsk.types;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.EffectManager;
import tydev.bsk.combatutils.Skills.skills.SkillManager;
import tydev.gfx.Animation;
import tydev.gfx.Assets;
import tydev.gfx.ITanim;

public abstract class ClasS {

	protected Animation animStand;
	protected Animation animReady;
	protected Animation animAfterHit;
	protected ITanim animDead;
	protected ITanim animRevive;
	protected ITanim animHurt;
	protected static EffectManager effectManager = new EffectManager();
	protected static SkillManager skillManager = new SkillManager();
	protected BufferedImage skillPic1;
	protected BufferedImage skillPic2;
	protected BufferedImage skillPic3;
	protected BufferedImage skillPic4;
	protected int attackDamage;
	protected int manaUP;
	protected int healthUP;
	protected int armor;
	protected int spellResist;
	protected int spellPower;
	protected Skill basicAttack;
	protected Skill skill1;
	protected Skill skill2;
	protected Skill skill3;
	protected Skill skill4;

	public ClasS(int attackDamage, int armor, int spellResist, int healthUP, int manaUP, int spellPower,
			Skill basicAttack, Skill skill1, Skill skill2, Skill skill3, Skill skill4) {

		this.attackDamage = attackDamage;
		this.armor = armor;
		this.spellPower = spellPower;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.skill4 = skill4;
		this.basicAttack = basicAttack;
		this.healthUP = healthUP;
		this.manaUP = manaUP;
		this.spellResist = spellResist;

	}
	
	public abstract BufferedImage getCurrentAnimation(CombatCharacter c);

	
	
	public EffectManager getEffectManager() {
		return effectManager;
	}



	public void setEffectManager(EffectManager effectManager) {
		ClasS.effectManager = effectManager;
	}



	public SkillManager getSkillManager() {
		return skillManager;
	}



	public void setSkillManager(SkillManager skillManager) {
		ClasS.skillManager = skillManager;
	}



	public Animation getAnimStand() {
		return animStand;
	}

	public void setAnimStand(Animation animStand) {
		this.animStand = animStand;
	}

	public Animation getAnimReady() {
		return animReady;
	}

	public void setAnimReady(Animation animReady) {
		this.animReady = animReady;
	}

	public Animation getAnimAfterHit() {
		return animAfterHit;
	}

	public void setAnimAfterHit(Animation animAfterHit) {
		this.animAfterHit = animAfterHit;
	}

	public ITanim getAnimDead() {
		return animDead;
	}

	public void setAnimDead(ITanim animDead) {
		this.animDead = animDead;
	}

	public ITanim getAnimRevive() {
		return animRevive;
	}

	public void setAnimRevive(ITanim animRevive) {
		this.animRevive = animRevive;
	}

	public ITanim getAnimHurt() {
		return animHurt;
	}

	public void setAnimHurt(ITanim animHurt) {
		this.animHurt = animHurt;
	}

	public void setSkillPic1(BufferedImage skillPic1) {
		this.skillPic1 = skillPic1;
	}

	public void setSkillPic4(BufferedImage skillPic4) {
		this.skillPic4 = skillPic4;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getManaUP() {
		return manaUP;
	}

	public void setManaUP(int manaUP) {
		this.manaUP = manaUP;
	}

	public int getHealthUP() {
		return healthUP;
	}

	public void setHealthUP(int healthUP) {
		this.healthUP = healthUP;
	}

	public int getSpellResist() {
		return spellResist;
	}

	public void setSpellResist(int spellResist) {
		this.spellResist = spellResist;
	}

	public int getSpellPower() {
		return spellPower;
	}

	public void setSpellPower(int spellPower) {
		this.spellPower = spellPower;
	}

	public Skill getBasicAttack() {
		return basicAttack;
	}

	public void setBasicAttack(Skill basicAttack) {
		this.basicAttack = basicAttack;
	}

	public Skill getSkill1() {
		return skill1;
	}

	public void setSkill1(Skill skill1) {
		this.skill1 = skill1;
	}

	public Skill getSkill2() {
		return skill2;
	}

	public void setSkill2(Skill skill2) {
		this.skill2 = skill2;
	}

	public Skill getSkill3() {
		return skill3;
	}

	public void setSkill3(Skill skill3) {
		this.skill3 = skill3;
	}

	public Skill getSkill4() {
		return skill4;
	}

	public void setSkill4(Skill skill4) {
		this.skill4 = skill4;
	}

	public BufferedImage getSkillPic1() {
		return skillPic1;
	}

	public void setSkillPick1(BufferedImage skillPic1) {
		this.skillPic1 = skillPic1;
	}

	public BufferedImage getSkillPic2() {
		return skillPic2;
	}

	public void setSkillPic2(BufferedImage skillPic2) {
		this.skillPic2 = skillPic2;
	}

	public BufferedImage getSkillPic3() {
		return skillPic3;
	}

	public void setSkillPic3(BufferedImage skillPic3) {
		this.skillPic3 = skillPic3;
	}

	public BufferedImage getSkillPic4() {
		return skillPic4;
	}

	public void setSkillPick4(BufferedImage skillPic4) {
		this.skillPic4 = skillPic4;
	}

	
}
