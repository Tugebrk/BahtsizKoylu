package tydev.bsk.combatutils;

import java.util.ArrayList;
import java.util.Random;

import tydev.bsk.combat.Ally;
import tydev.bsk.combatutils.Skills.effects.EffectManager;

public class TurnManager {

	private EffectManager effectManager = new EffectManager();
	private CharacterManager characterManager;
	private TurnTracker turnTracker;
	private ArrayList<CombatCharacter> charactersInTurn = new ArrayList<CombatCharacter>();
	private ArrayList<CombatCharacter> validTargets = new ArrayList<CombatCharacter>();
	private Random rand = new Random(4);

	public void AllyTurn(CombatCharacter character) {

		character.getTurn().readyPhase();

		character.getTurn().beginAction();

		character.getTurn().endPhase();

	}

	public void EnemyTurn(CombatCharacter character) {

		if (character.turn.isTurnOn() && !character.effectsOn.contains(effectManager.getStun())) {

			character.getTurn().readyPhase();
			
			character.getTurn().beginAction();
			
			character.getTurn().endPhase();

		}
	}

	public void EnemyAICalculation(CombatCharacter character) {

		charactersInTurn = turnTracker.getCharacterManager().getObjects();

		for (CombatCharacter c : charactersInTurn) {

			if (c.getFaction().isAlly()) {

				validTargets.add(c);

			}

		}

		System.out.println(validTargets.size());

		int targetIndex = rand.nextInt(validTargets.size());

		int skillIndex = rand.nextInt(character.getSkills().size());

		character.getTurn().setCaster(character);

		character.getTurn().setTarget((validTargets.get(targetIndex)));

		character.getTurn().setAction(character.skills.get(skillIndex));

	}

//	GETTERS SETTERS

	public CharacterManager getCharacterManager() {
		return characterManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	public ArrayList<CombatCharacter> getCharactersInTurn() {
		return charactersInTurn;
	}

	public void setCharactersInTurn(ArrayList<CombatCharacter> charactersInTurn) {
		this.charactersInTurn = charactersInTurn;
	}

	public ArrayList<CombatCharacter> getValidTargets() {
		return validTargets;
	}

	public void setValidTargets(ArrayList<CombatCharacter> validTargets) {
		this.validTargets = validTargets;
	}

	public TurnTracker getTurnTracker() {
		return turnTracker;
	}

	public void setTurnTracker(TurnTracker turnTracker) {
		this.turnTracker = turnTracker;
	}

}
