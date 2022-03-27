package tydev.bsk.combatutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import tydev.bsk.Game;
import tydev.bsk.Handler;
import tydev.bsk.state.GameState;
import tydev.bsk.state.State;

public class TurnTracker {

	private static ArrayList<CombatCharacter> allies = new ArrayList<>();
	private static ArrayList<CombatCharacter> enemies = new ArrayList<>();
	private ArrayList<CombatCharacter> charactersInTurn;
	private CharacterManager characterManager;
	private CombatCharacter currentCaster;
	private TurnManager turnManager;
	private boolean ready = false;
	private boolean allyWin = false;
	private boolean enemyWin = false;


	public TurnTracker(CharacterManager characterManager) {

		this.characterManager = characterManager;
		this.charactersInTurn = new ArrayList<CombatCharacter>(characterManager.getObjects());



		for (CombatCharacter c : charactersInTurn) {
			if (c.getFaction().isAlly()) {
				allies.add(c);
			} else if (!c.getFaction().isAlly()) {
				enemies.add(c);

			}
		}

	}

	public void CharacterSorter() {

		Collections.sort(charactersInTurn, TurnTracker.speedComparator);

	}

	public void ChooseCaster() {

		System.out.println("Size of combatants in this turn is " + charactersInTurn.size());

		Collections.sort(charactersInTurn, TurnTracker.speedComparator);

		if (charactersInTurn.isEmpty()) {
			charactersInTurn = new ArrayList<CombatCharacter>(characterManager.getObjects());
			ChooseCaster();

		}

		else if (!charactersInTurn.isEmpty()) {

			CombatCharacter c = charactersInTurn.get(0);

			if (!c.isDead && c.getCombatSpeed() > 0) {

				currentCaster = c;

				c.getTurn().setTurnOn(true);

				System.out.println(c.getName() + "'s turn");

				c.getTurn().setCaster(c);

			}

			else if (c.getCombatSpeed() <= 0) {

				charactersInTurn.remove(c);
				System.out.println("check1");
				ChooseCaster();
			}

			if (c.isDead) {

				if(c.getFaction().isAlly()) {
					allies.remove(c);
				}
				else if(!c.getFaction().isAlly()) {
					enemies.remove(c);
				}
				charactersInTurn.remove(c);
				System.out.println("check2");
				ChooseCaster();

			}
		}

	}

	public void Ready() {

		ready = true;
	}

	public void NotReady() {

		ready = false;

	}

	public void RunTurn() {

		if (ready) {

			if (currentCaster.getFaction().isAlly())

			{

				System.out.println(currentCaster.getName() + " is acting!");

				turnManager.AllyTurn(currentCaster);

				charactersInTurn.remove(currentCaster);

				System.out.println(currentCaster.getName() + " finished its action");
			}

			else if (!currentCaster.getFaction().isAlly()) {

				System.out.println(currentCaster.getName() + " is acting!");

				turnManager.EnemyAICalculation(currentCaster);

				turnManager.EnemyTurn(currentCaster);

				charactersInTurn.remove(currentCaster);

				System.out.println(currentCaster.getName() + " finished its action");
			}
		}
	}
	
	public void isCombatEnd() {
		if(allies.isEmpty()) {
			System.out.println("YOU LOSE!");
			this.enemyWin = true;
		}
		else if(enemies.isEmpty()) {
			System.out.println("YOU WIN!");
			this.allyWin = true;

			
		}
		
	}

// GETTERS SETTERS
	

	public ArrayList<CombatCharacter> getCharactersInTurn() {
		return charactersInTurn;
	}

	public boolean isAllyWin() {
		return allyWin;
	}

	public void setAllyWin(boolean allyWin) {
		this.allyWin = allyWin;
	}

	public boolean isEnemyWin() {
		return enemyWin;
	}

	public void setEnemyWin(boolean enemyWin) {
		this.enemyWin = enemyWin;
	}

	public CharacterManager getCharacterManager() {
		return characterManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	public TurnManager getTurnManager() {
		return turnManager;
	}

	public void setTurnManager(TurnManager turnManager) {
		this.turnManager = turnManager;
	}

	public CombatCharacter getCurrentCaster() {
		return currentCaster;
	}

	public void setCurrentCaster(CombatCharacter currentCaster) {
		this.currentCaster = currentCaster;
	}

	public void setCharacters(ArrayList<CombatCharacter> characters) {
		this.charactersInTurn = characters;
	}

	public static Comparator<CombatCharacter> getSpeedComparator() {
		return speedComparator;
	}

	public static void setSpeedComparator(Comparator<CombatCharacter> speedComparator) {
		TurnTracker.speedComparator = speedComparator;
	}

//	COMPARATOR

	public static Comparator<CombatCharacter> speedComparator = new Comparator<CombatCharacter>() {

		public int compare(CombatCharacter c1, CombatCharacter c2) {

			int characterSpeed1 = c1.getCombatSpeed();
			int characterSpeed2 = c2.getCombatSpeed();

			return characterSpeed2 - characterSpeed1;

		}
	};
}
