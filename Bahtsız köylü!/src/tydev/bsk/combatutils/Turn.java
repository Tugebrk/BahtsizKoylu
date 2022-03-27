package tydev.bsk.combatutils;

import java.util.ArrayList;

import tydev.bsk.combatutils.Skills.effects.Effect;

public class Turn {

	private CombatCharacter caster;
	private CombatCharacter target;
	private boolean turnOn = false;
	private Skill action;
	private int firstHealth;
	private int lastHealth;
	private int damageDone;

	
	public void readyPhase() {
		System.out.println("ready phase");
		if (caster.getEffectsOn().isEmpty()) {
			System.out.println("No Effects");
		}
		if (!caster.getEffectsOn().isEmpty()) {
			for (Effect e : caster.getEffectsOn()) {
				e.onEffect(caster);
			}

		}
	}

	public void beginAction() {

		System.out.println("actionPhase");
		action.calcTrueDamage(caster);
		firstHealth = target.getHealth();
		target.setHealth(target.getHealth() - action.returnTrueDamage());

		if (action.getEffect() != null && !target.getEffectsOn().contains(action.getEffect())) {
			target.getEffectsOn().add(action.getEffect());
		}

		lastHealth = target.getHealth();
		System.out.println("Last health of " + target.getName() + " is " + lastHealth);
		damageDone = firstHealth - lastHealth;

		if (lastHealth <= 0) {

			target.Dead();
			System.out.println(target.getName() + " is dead");

		}

		else if (lastHealth < firstHealth) {

			target.gotHurt();
			System.out.println(target.getName() + " got hurt!");
		}

		else if (lastHealth > firstHealth) {

			target.isHealed();

		}
	}

	public void endPhase() {

		System.out.println("endPhase");
		if (!caster.getEffectsOn().isEmpty()) {
			ArrayList<Effect> toRemove = new ArrayList<Effect>();
			for (Effect e : caster.getEffectsOn()) {
				if (e.getCounter() <= 0) {
					toRemove.add(e);
				}
			}
			caster.getEffectsOn().removeAll(toRemove);

		}
	}

//	GETTERS SETTERS

	public Skill getAction() {
		return action;
	}

	public int getFirstHealth() {
		return firstHealth;
	}

	public void setFirstHealth(int firstHealth) {
		this.firstHealth = firstHealth;
	}

	public int getLastHealth() {
		return lastHealth;
	}

	public void setLastHealth(int lastHealth) {
		this.lastHealth = lastHealth;
	}

	public int getDamageDone() {
		return damageDone;
	}

	public void setDamageDone(int damageDone) {
		this.damageDone = damageDone;
	}

	public void setAction(Skill action) {
		this.action = action;
	}

	public CombatCharacter getTarget() {
		return target;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	public void setTarget(CombatCharacter target) {
		this.target = target;
	}

	public CombatCharacter getCaster() {
		return caster;
	}

	public void setCaster(CombatCharacter caster) {
		this.caster = caster;
	}

}