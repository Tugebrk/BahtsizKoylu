package tydev.bsk.state;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import tydev.bsk.Handler;
import tydev.bsk.combatutils.*;
import tydev.bsk.types.ClassManager;
import tydev.gfx.Assets;
import tydev.bsk.combat.FactionManager;
import tydev.bsk.combat.PositionManager;
import tydev.bsk.combat.ThePlayer;
import tydev.bsk.combat.enemies.MeleeAdventurer;

public class CombatState extends State {

	private ClassManager classManager;
	private CharacterManager characterManager;
	private CombatUIManager combatUIManager;
	private Turn turn;
	private TurnTracker turnTracker;
	private TurnManager turnManager;
	private CombatUIall guı;
	private BufferedImage battleground = Assets.forestbg;
	private PositionManager pManager;

	public CombatState(Handler handler, CharacterManager characterManager) {
		super(handler);

		classManager = new ClassManager();
		this.characterManager = characterManager;
		combatUIManager = new CombatUIManager(handler);
		this.pManager = new PositionManager();

		handler.getMouseManager().setCharacterManager(characterManager);
		handler.getMouseManager().setCombatUIManager(combatUIManager);

//		TURN SETUP

		for (int i = 0; i < characterManager.getObjects().size(); i++) {
			
			if(characterManager.getObjects().get(i) != null && characterManager.getObjects().get(i).isPlayer()) {
				
				pManager.getPosition2().setCharAtSpot(characterManager.getObjects().get(i));
				
			}

			else if (characterManager.getObjects().get(i) != null
					&& characterManager.getObjects().get(i).getFaction() == FactionManager.getAlly()
					&& pManager.getAllyPositions().get(i) != null && i < 4
					&& i < characterManager.getObjects().size()) {

				pManager.getAllyPositions().get(i).setCharAtSpot(characterManager.getObjects().get(i));
				System.out.println(pManager.getAllyPositions().get(i).getCharAtSpot().getName());

			}

			else if (characterManager.getObjects().get(i) != null  && i < pManager.getEnemyPositions().size()
					&& characterManager.getObjects().get(i).getFaction() == FactionManager.getEnemy()
					&& pManager.getEnemyPositions().get(i) != null) {

				pManager.getEnemyPositions().get(i).setCharAtSpot(characterManager.getObjects().get(i));
				System.out.println(pManager.getEnemyPositions().get(i).getCharAtSpot().getName());
			}

		}

		if (!characterManager.getObjects().isEmpty()) {

			System.out.println("begin");
			turnTracker = new TurnTracker(characterManager);
			turnTracker.CharacterSorter();
			turnTracker.ChooseCaster();
			turnManager = new TurnManager();
			turnManager.setCharacterManager(characterManager);
			turnManager.setTurnTracker(turnTracker);
			turnTracker.setTurnManager(turnManager);

//		default

			turnTracker.getCurrentCaster().getTurn().setTarget(turnTracker.getCharactersInTurn().get(0));
			turnTracker.getCurrentCaster().getTurn().setAction(turnTracker.getCurrentCaster().getSkills().get(0));

//		GUI

			guı = new CombatUIall(15, 45, 100, turnTracker, combatUIManager, characterManager, this);

		}
	}

	// GETTERS SETTERS

	public CharacterManager getCharacterManager() {
		return characterManager;
	}

	public ClassManager getClassManager() {
		return classManager;
	}

	public void setClassManager(ClassManager classManager) {
		this.classManager = classManager;
	}

	public TurnManager getTurnManager() {
		return turnManager;
	}

	public void setTurnManager(TurnManager turnManager) {
		this.turnManager = turnManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	public CombatUIManager getCombatUIManager() {
		return combatUIManager;
	}

	public void setCombatUIManager(CombatUIManager combatUIManager) {
		this.combatUIManager = combatUIManager;
	}

	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}

	public TurnTracker getTurnTracker() {
		return turnTracker;
	}

	public void setTurnTracker(TurnTracker turnTracker) {
		this.turnTracker = turnTracker;
	}

	public CombatUIall getGuı() {
		return guı;
	}

	public void setGuı(CombatUIall guı) {
		this.guı = guı;
	}

	public PositionManager getpManager() {
		return pManager;
	}

	public void setpManager(PositionManager pManager) {
		this.pManager = pManager;
	}

	public void tick() {

		characterManager.tick();
		combatUIManager.tick();
	}

	public void render(Graphics g) {

		g.drawImage(battleground, 0, 0, 800, 400, null);

		characterManager.render(g);

		guı.render(g);
	}

}
