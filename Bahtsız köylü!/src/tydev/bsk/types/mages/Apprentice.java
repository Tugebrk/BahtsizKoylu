package tydev.bsk.types.mages;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.combatutils.Skills.skills.SkillManager;
import tydev.bsk.types.ClasS;

public class Apprentice extends ClasS{

private static SkillManager skillManager = new SkillManager();

	
	
	public Apprentice(Skill skill1, Skill skill2, Skill skill3, Skill skill4) {
		super(2, 1, 2, 10, 10, 2, skillManager.getBasicAttack(), skillManager.getLittleMeteorites(), skill3, skill4, skill4);
	}



	@Override
	public BufferedImage getCurrentAnimation(CombatCharacter c) {
		return null;
	}

}
