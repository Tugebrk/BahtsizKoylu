package tydev.bsk.types;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.skills.BasicAttack;
import tydev.bsk.combatutils.Skills.skills.SkillManager;
import tydev.gfx.Animation;
import tydev.gfx.Assets;
import tydev.gfx.ITanim;

public class Farmer extends ClasS {

	private static SkillManager skillManager = new SkillManager();
	private static Skill lightAttack = skillManager.getLightAttack();
	private static Skill basicAttack = new BasicAttack();

	public Farmer() {
		super(1, 1, 1, 0, 0, 0, basicAttack, skillManager.getFireball(), skillManager.getLittleMeteorites(), skillManager.getClosed(), skillManager.getClosed());

		this.animStand = new Animation(200, Assets.simpletonIdle);
		this.animReady = new Animation(200, Assets.simpletonReady);
		this.animAfterHit = new Animation(50, Assets.simpletonAttack);
		this.animDead = new ITanim(200, Assets.simpletonDeath);
		this.animRevive = new ITanim(200, Assets.simpletonIdle);
		this.animHurt = new ITanim(200, Assets.simpletonHurt);

	}

	public BufferedImage getCurrentAnimation(CombatCharacter c) {

		if (c.isHurt() && !c.isDead()) {

			return animHurt.getCurrentFrame();
		}

		else if (c.isDead()) {
			return animDead.getCurrentFrame();
		} else if (c.isRevived()) {
			return animRevive.getCurrentFrame();
		} else if (c.getTurn().isTurnOn()) {
			return animReady.getCurrentFrame();
		} else if (!c.getTurn().isTurnOn() && c.isHit()) {
			return animAfterHit.getCurrentFrame();
		} else if (!c.getTurn().isTurnOn()) {
			return animStand.getCurrentFrame();
		} else {
			return Assets.lb_standing[0];
		}

	}

	public Skill getLightAttack() {
		return lightAttack;
	}

	public static void setLightAttack(BasicAttack basicAttack) {
		Farmer.lightAttack = basicAttack;
	}

	public SkillManager getSkillManager() {
		return skillManager;
	}

	public void setSkillManager(SkillManager skillManager) {
		Farmer.skillManager = skillManager;
	}

	public Skill getBasicAttack() {
		return basicAttack;
	}

	public void setBasicAttack(Skill basicAttack) {
		Farmer.basicAttack = basicAttack;
	}

	public static void setLightAttack(Skill lightAttack) {
		Farmer.lightAttack = lightAttack;
	}

}
