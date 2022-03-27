package tydev.bsk.combatutils;

import java.awt.Graphics;

import tydev.bsk.entity.Entity;
import tydev.bsk.state.CombatState;
import tydev.bsk.state.GameState;
import tydev.bsk.state.MenuState;
import tydev.bsk.state.State;
import tydev.bsk.ui.ClickListener;
import tydev.bsk.worlds.World;

public class CombatUIall {

	private TurnTracker turnTracker;
	private CombatUIManager combatUIManager;
	private CharacterManager characterManager;
	private CombatState combatState;
	private static MenuState menuState;

	public CombatUIall(int s, float x, float y, TurnTracker turnTracker, CombatUIManager combatUIManager,
			CharacterManager characterManager, CombatState combatState) {

		this.turnTracker = turnTracker;
		this.combatUIManager = combatUIManager;
		this.characterManager = characterManager;
		this.combatState = combatState;
		menuState = new MenuState(combatState.getHandler());

//		TS1

		if (combatState.getpManager().getAllyPositions().get(0).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition1(),
					combatState.getpManager().getPosition1().getCharAtSpot().getWidth(),
					combatState.getpManager().getPosition1().getCharAtSpot().getHeight(), combatState, turnTracker));

		}

//		TS2

		if (combatState.getpManager().getPosition2() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition2(),
					combatState.getpManager().getPosition2().getCharAtSpot().getWidth() / 2,
					combatState.getpManager().getPosition2().getCharAtSpot().getHeight(), combatState, turnTracker));

		}
		;

//		TS3 

		if (combatState.getpManager().getAllyPositions().get(1).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition3(),
					combatState.getpManager().getPosition3().getCharAtSpot().getWidth(),
					combatState.getpManager().getPosition3().getCharAtSpot().getHeight(), combatState, turnTracker));

		}
		;

//		TS4

		if (combatState.getpManager().getAllyPositions().get(2).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition4(),
					combatState.getpManager().getPosition4().getCharAtSpot().getWidth(),
					combatState.getpManager().getPosition4().getCharAtSpot().getHeight() - 50, combatState,
					turnTracker));

		}
		;

		if (combatState.getpManager().getEnemyPositions().get(0).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition5(),
					combatState.getpManager().getPosition5().getCharAtSpot().getWidth() - 72,
					combatState.getpManager().getPosition5().getCharAtSpot().getHeight() - 50, combatState,
					turnTracker));

		}
		;

		if (combatState.getpManager().getEnemyPositions().get(1).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition6(),
					combatState.getpManager().getPosition6().getCharAtSpot().getWidth() - 72,
					combatState.getpManager().getPosition6().getCharAtSpot().getHeight() - 50, combatState,
					turnTracker));

		}
		;

		if (combatState.getpManager().getEnemyPositions().get(2).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition7(),
					combatState.getpManager().getPosition7().getCharAtSpot().getWidth() - 72,
					combatState.getpManager().getPosition7().getCharAtSpot().getHeight() - 50, combatState,
					turnTracker));

		}
		;

		if (combatState.getpManager().getEnemyPositions().get(3).getCharAtSpot() != null) {

			combatUIManager.addObject(new TargetSetter(combatState.getpManager().getPosition8(),
					combatState.getpManager().getPosition8().getCharAtSpot().getWidth() - 72,
					combatState.getpManager().getPosition8().getCharAtSpot().getHeight() - 50, combatState,
					turnTracker));

		}
		;

//		HEALTH BARS

		if (combatState.getpManager().getPosition1().getCharAtSpot() != null) {
			HealthBar healthBar1 = new HealthBar(turnTracker, combatState.getpManager().getPosition1().getCharAtSpot());
			combatUIManager.addObject(healthBar1);
		}

		if (combatState.getpManager().getPosition2().getCharAtSpot() != null) {
			HealthBar healthBar2 = new HealthBar(turnTracker, combatState.getpManager().getPosition2().getCharAtSpot());
			combatUIManager.addObject(healthBar2);
		}

		if (combatState.getpManager().getPosition3().getCharAtSpot() != null) {
			HealthBar healthBar3 = new HealthBar(turnTracker, combatState.getpManager().getPosition3().getCharAtSpot());
			combatUIManager.addObject(healthBar3);
		}

		if (combatState.getpManager().getPosition4().getCharAtSpot() != null) {
			HealthBar healthBar4 = new HealthBar(turnTracker, combatState.getpManager().getPosition4().getCharAtSpot());
			combatUIManager.addObject(healthBar4);
		}

		if (combatState.getpManager().getPosition5().getCharAtSpot() != null) {
			HealthBar healthBar5 = new HealthBar(turnTracker, combatState.getpManager().getPosition5().getCharAtSpot());
			combatUIManager.addObject(healthBar5);
		}

		if (combatState.getpManager().getPosition6().getCharAtSpot() != null) {
			HealthBar healthBar6 = new HealthBar(turnTracker, combatState.getpManager().getPosition6().getCharAtSpot());
			combatUIManager.addObject(healthBar6);
		}

		if (combatState.getpManager().getPosition7().getCharAtSpot() != null) {
			HealthBar healthBar7 = new HealthBar(turnTracker, combatState.getpManager().getPosition7().getCharAtSpot());
			combatUIManager.addObject(healthBar7);
		}

		if (combatState.getpManager().getPosition8().getCharAtSpot() != null) {
			HealthBar healthBar8 = new HealthBar(turnTracker, combatState.getpManager().getPosition8().getCharAtSpot());
			combatUIManager.addObject(healthBar8);
		}

//		BUTTONS

		float bbspace = 4;
		float blockLength = 69 - s;
		float sbTotalLen = 3 * bbspace + 4 * blockLength;
		float startx = 370 - sbTotalLen / 2;
		float starty = 330;

		combatUIManager.addObject(new MenuBackGround(0, 400, 800, 300, new ClickListener() {
			public void onClick() {

			};
		}));
		;

		combatUIManager.addObject(new BasicAttackChooser(startx + x - 10, starty + 10 + blockLength + bbspace + y,
				59 - s, 59 - s, turnTracker, new ClickListener() {
					public void onClick() {

						turnTracker.getCurrentCaster().getTurn()
								.setAction(turnTracker.getCurrentCaster().getClasS().getBasicAttack());
						System.out.println(
								"Action chosen as " + turnTracker.getCurrentCaster().getTurn().getAction().getName());

					};
				}));
		;

		combatUIManager
				.addObject(new ActionChooser(startx + x, starty + y, 49 - s, 49 - s, turnTracker, new ClickListener() {
					public void onClick() {

						turnTracker.getCurrentCaster().getTurn()
								.setAction(turnTracker.getCurrentCaster().getSkills().get(0));
						System.out.println(
								"Action chosen as " + turnTracker.getCurrentCaster().getTurn().getAction().getName());

					};
				}));
		;

		combatUIManager.addObject(new ActionChooser2(startx + blockLength + bbspace + x, starty + y, 49 - s, 49 - s,
				turnTracker, new ClickListener() {
					public void onClick() {

						turnTracker.getCurrentCaster().getTurn()
								.setAction(turnTracker.getCurrentCaster().getSkills().get(1));
						System.out.println(
								"Action chosen as " + turnTracker.getCurrentCaster().getTurn().getAction().getName());

					};
				}));
		;

		combatUIManager.addObject(new ActionChooser3(startx + blockLength * 2 + bbspace * 2 + x, starty + y, 49 - s,
				49 - s, turnTracker, new ClickListener() {
					public void onClick() {

						turnTracker.getCurrentCaster().getTurn()
								.setAction(turnTracker.getCurrentCaster().getSkills().get(2));
						System.out.println(
								"Action chosen as " + turnTracker.getCurrentCaster().getTurn().getAction().getName());

					};
				}));
		;

		combatUIManager.addObject(new ActionChooser4(startx + blockLength * 3 + bbspace * 3 + x, starty + y, 49 - s,
				49 - s, turnTracker, new ClickListener() {
					public void onClick() {

						turnTracker.getCurrentCaster().getTurn()
								.setAction(turnTracker.getCurrentCaster().getSkills().get(3));
						System.out.println(
								"Action chosen as " + turnTracker.getCurrentCaster().getTurn().getAction().getName());

					};
				}));
		;

		combatUIManager.addObject(new ReadyButton(startx + sbTotalLen / 4 + x, starty + blockLength + y,
				((int) sbTotalLen / 2) - 20, 50 - (s * 5 / 12) + 20, new ClickListener() {
					public void onClick() {

						System.out.println("Hazýr tuþuna basýldý!");

						turnTracker.isCombatEnd();
						turnTracker.Ready();

						turnTracker.RunTurn();

						turnTracker.getCurrentCaster().setHit(true);
						turnTracker.getCurrentCaster().getTurn().setTurnOn(false);

						turnTracker.CharacterSorter();
						turnTracker.ChooseCaster();
						turnTracker.NotReady();
						turnTracker.isCombatEnd();
						if (turnTracker.isAllyWin()) {

							combatState.getHandler().getWorld().getEnemyParty().clear();
							combatState.getHandler().getWorld();
							combatState.getHandler().getMouseManager().setCombatUIManager(null);
							combatState.getHandler().getMouseManager().setUIManager(menuState.getUiManager());
							
							GameState gameState = (GameState) combatState.getHandler().getGame().gameState;
							
							State.setState(gameState);
							
//							for (Entity e : combatState.getHandler().getWorld().getEntityManager().getEntities()) {
//
//								if (!e.isWalkable()) {
//									combatState.getHandler().getWorld();
//									combatState.getHandler().getWorld().getEntityManager().getEntities().remove(e);
//								}
//
//							}


						}

					};
				}));
		;

	}

	public TurnTracker getTurnTracker() {
		return turnTracker;
	}

	public void setTurnTracker(TurnTracker turnTracker) {
		this.turnTracker = turnTracker;
	}

	public CombatUIManager getCombatUIManager() {
		return combatUIManager;
	}

	public void setCombatUIManager(CombatUIManager combatUIManager) {
		this.combatUIManager = combatUIManager;
	}

	public CharacterManager getCharacterManager() {
		return characterManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	public CombatState getCombatState() {
		return this.combatState;
	}

	public void setCombatState(CombatState combatState) {
		this.combatState = combatState;
	}

	public static State getMenuState() {
		return menuState;
	}

	public static void setMenuState(MenuState menuState) {
		CombatUIall.menuState = menuState;
	}

	public void render(Graphics g) {
		for (CombatObject c : combatUIManager.getObjects())
			c.render(g);

	}
}
