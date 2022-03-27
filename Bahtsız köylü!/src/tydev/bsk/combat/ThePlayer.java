package tydev.bsk.combat;

import java.awt.Graphics;
import java.util.ArrayList;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Position;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.types.ClasS;
import tydev.bsk.types.Farmer;

import tydev.gfx.Assets;

public class ThePlayer extends CombatCharacter {

	private static Faction ally = FactionManager.getAlly();
	private static ClasS farmer = new Farmer();

	public ThePlayer(Position position) {
		super(position, 96, 224, 30, 10, 4, 0, 1, 0, 2, "Jesus", ally, farmer, Assets.player_right[1]);

		
		
		skills = new ArrayList<Skill>();

		skills.add(ThePlayer.farmer.getSkill1());
		skills.add(ThePlayer.farmer.getSkill2());
		skills.add(ThePlayer.farmer.getSkill3());
		skills.add(ThePlayer.farmer.getSkill4());

	}
	
	public ThePlayer() {
		
		super(null, 96, 224, 30, 10, 4, 0, 1, 0, 2, "Jesus", ally, farmer, Assets.player_right[1]);
		
	}
	
	public boolean isPlayer() {
		
		return true;
		
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
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
		} else if (this.getTurn().isTurnOn() && this.hit)

		{
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