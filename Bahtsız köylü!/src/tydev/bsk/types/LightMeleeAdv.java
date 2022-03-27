package tydev.bsk.types;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.skills.BasicAttack;
import tydev.bsk.combatutils.Skills.skills.SkillManager;
import tydev.gfx.Animation;
import tydev.gfx.Assets;
import tydev.gfx.ITanim;

public class LightMeleeAdv extends ClasS {

	private static SkillManager skillManager = new SkillManager();
	private static Skill lightAttack = skillManager.getLightAttack();
	private static Skill basicAttack = new BasicAttack();

	public LightMeleeAdv() {
		super(1, 1, 1, 0, 0, 0, basicAttack, lightAttack, lightAttack, lightAttack, lightAttack);

		this.animStand = new Animation(200, Assets.lb_standing);
		this.animReady = new Animation(200, Assets.lb_ready);
		this.animAfterHit = new Animation(50, Assets.lb_afterHit);
		this.animDead = new ITanim(200, Assets.lb_dead);
		this.animRevive = new ITanim(200, Assets.lb_revive);
		this.animHurt = new ITanim(200, Assets.lb_hurt);

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
		LightMeleeAdv.lightAttack = basicAttack;
	}

	public SkillManager getSkillManager() {
		return skillManager;
	}

	public void setSkillManager(SkillManager skillManager) {
		LightMeleeAdv.skillManager = skillManager;
	}

	public Skill getBasicAttack() {
		return basicAttack;
	}

	public void setBasicAttack(Skill basicAttack) {
		LightMeleeAdv.basicAttack = basicAttack;
	}

	public static void setLightAttack(Skill lightAttack) {
		LightMeleeAdv.lightAttack = lightAttack;
	}

}
