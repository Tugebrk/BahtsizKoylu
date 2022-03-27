package tydev.bsk.combatutils.Skills.skills;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.Nothing;

public class Closed extends Skill {

	private static Effect nothing = new Nothing();
	
	public Closed() {
		super(10000, 0, 10000, nothing, null);
		name = "closed";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void calcTrueDamage(CombatCharacter c) {
		
	}

	@Override
	public int returnTrueDamage() {
		return 0;
	}

}
