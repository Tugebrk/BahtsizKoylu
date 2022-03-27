package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.Skill;


public class SkillManager {
	
	private Skill basicAttack = new BasicAttack();
	private Skill fireball = new Fireball();
	private Skill lightAttack = new LightAttack();
	private Skill neckStab = new NeckStab();
//	private Skill PoisonBlades = new PoisonBlades();
	private Skill littleMeteorites = new LittleMeteorites();
	private Skill closed = new Closed();
	
	
	
	public Skill getLittleMeteorites() {
		return littleMeteorites;
	}
	public void setLittleMeteorites(Skill littleMeteorites) {
		this.littleMeteorites = littleMeteorites;
	}
	public Skill getBasicAttack() {
		return basicAttack;
	}
	public void setBasicAttack(Skill basicAttack) {
		this.basicAttack = basicAttack;
	}
	public Skill getFireball() {
		return fireball;
	}
	public void setFireball(Skill fireball) {
		this.fireball = fireball;
	}
	public Skill getLightAttack() {
		return lightAttack;
	}
	public void setLightAttack(Skill lightAttack) {
		this.lightAttack = lightAttack;
	}
	public Skill getNeckStab() {
		return neckStab;
	}
	public void setNeckStab(Skill neckStab) {
		this.neckStab = neckStab;
	}
	public Skill getClosed() {
		return closed;
	}
	public void setClosed(Skill closed) {
		this.closed = closed;
	}
	
//	public Skill getPoisonBlades() {
//		return PoisonBlades;
//	}
//	public void setPoisonBlades(Skill poisonBlades) {
//		PoisonBlades = poisonBlades;
//	}

	

}
