package tydev.bsk.types.mages;

import java.awt.image.BufferedImage;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Skill;
import tydev.bsk.types.ClasS;

public class Novice extends ClasS {

	public Novice(int attackDamage, int armor, int spellResist, int healthUP, int manaUP, int spellPower,
			Skill basicAttack, Skill skill1, Skill skill2, Skill skill3, Skill skill4) {
		super(attackDamage, armor, spellResist, healthUP, manaUP, spellPower, basicAttack, skill1, skill2, skill3, skill4);

	}

	@Override
	public BufferedImage getCurrentAnimation(CombatCharacter c) {
		// TODO Auto-generated method stub
		return null;
	}

}
