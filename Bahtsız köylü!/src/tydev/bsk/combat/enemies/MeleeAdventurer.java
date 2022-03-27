package tydev.bsk.combat.enemies;

import java.awt.Graphics;
import java.util.ArrayList;

import tydev.bsk.combat.Enemy;
import tydev.bsk.combat.Faction;
import tydev.bsk.combat.FactionManager;
import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Position;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.types.ClassManager;
import tydev.gfx.Assets;

public class MeleeAdventurer extends CombatCharacter {

	private static Faction enemy = FactionManager.getEnemy();
	private static ClassManager classManager = new ClassManager();

	public MeleeAdventurer(Position position) {
		super(position, 96, 224, 10, 0, 2, 0, 1, 0, 1, "Enemy", enemy, classManager.getLightMeleeAdv(),
				Assets.lb_standing[0]);
		
		
		skills = new ArrayList<Skill>();

		skills.add(MeleeAdventurer.classManager.getLightMeleeAdv().getSkill1());
		skills.add(MeleeAdventurer.classManager.getLightMeleeAdv().getSkill2());
		skills.add(MeleeAdventurer.classManager.getLightMeleeAdv().getSkill3());
		skills.add(MeleeAdventurer.classManager.getLightMeleeAdv().getSkill4());

	}



	@Override
	public void tick() {

		if (this.isHurt && !this.isDead) {
			animHurt.tick();
			if (animHurt.getIndex() == 4) {
				animHurt.setIndex(0);
				this.setHurt(false);

			}
		} else if (this.isDead) {
			animDead.tick();

		} else if (this.isRevived) {
			animRevive.tick();
		} else if (this.getTurn().isTurnOn() && this.hit && !this.isDead() && !this.getEffectsOn().isEmpty())

		{
			this.getEffectsOn().get(0).getAnim().tick();
			animAfterHit.tick();

			if (animAfterHit.getIndex() == 7) {

				this.setHit(false);
			}
		} else if (this.getTurn().isTurnOn()) {
			animReady.tick();
		} else if (!this.getTurn().isTurnOn() && this.hit) {

			animAfterHit.tick();

			if (animAfterHit.getIndex() == 7) {

				this.setHit(false);
			}
		} else if (!this.getTurn().isTurnOn()) {
			animStand.tick();
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.getClasS().getCurrentAnimation(this), (int) x, (int) y, width, height, null);
	}

}
