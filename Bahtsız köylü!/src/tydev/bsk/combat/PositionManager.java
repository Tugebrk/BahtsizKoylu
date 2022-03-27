package tydev.bsk.combat;

import java.util.ArrayList;

import tydev.bsk.combatutils.CombatCharacter;
import tydev.bsk.combatutils.Position;
import tydev.bsk.entity.creatures.Creature;

public class PositionManager {

	private static Position position1 = new Position(130, 20);
	private static Position position2 = new Position(160, 100);
	private static Position position3 = new Position(180, 180);
	private static Position position4 = new Position(210, 260);
	private static Position position5 = new Position(550, 20);
	private static Position position6 = new Position(580, 100);
	private static Position position7 = new Position(610, 180);
	private static Position position8 = new Position(490, 100);

	private ArrayList<Position> allyPositions = new ArrayList<Position>();
	private ArrayList<Position> enemyPositions = new ArrayList<Position>();


	public PositionManager() {

		allyPositions.add(position1);
		allyPositions.add(position3);
		allyPositions.add(position4);
		
		enemyPositions.add(position5);
		enemyPositions.add(position6);
		enemyPositions.add(position7);
		enemyPositions.add(position8);
	
	}

	public Position EnemyPositionAssigner() {

		for (int i = 0; i < enemyPositions.size(); i++) {

			if (!enemyPositions.get(i).isOccupied()) {

				enemyPositions.get(i).occupied();
				return enemyPositions.get(i);

			}
		}
		return position8;

	}
	
	public Position AllyPositionAssigner() {

		for (int i = 0; i < allyPositions.size(); i++) {

			if (!allyPositions.get(i).isOccupied()) {

				allyPositions.get(i).occupied();
				return allyPositions.get(i);

			}
		}
		return position8;

	}

//	GETTERS SETTERS

	
	
	public Position getPosition1() {
		return position1;
	}

	public ArrayList<Position> getAllyPositions() {
		return allyPositions;
	}

	public void setAllyPositions(ArrayList<Position> allyPositions) {
		this.allyPositions = allyPositions;
	}

	public ArrayList<Position> getEnemyPositions() {
		return enemyPositions;
	}

	public void setEnemyPositions(ArrayList<Position> enemyPositions) {
		this.enemyPositions = enemyPositions;
	}

	public void setPosition1(Position position1) {
		PositionManager.position1 = position1;
	}

	public Position getPosition2() {
		return position2;
	}

	public void setPosition2(Position position2) {
		PositionManager.position2 = position2;
	}

	public Position getPosition3() {
		return position3;
	}

	public void setPosition3(Position position3) {
		PositionManager.position3 = position3;
	}

	public Position getPosition4() {
		return position4;
	}

	public void setPosition4(Position position4) {
		PositionManager.position4 = position4;
	}

	public Position getPosition5() {
		return position5;
	}

	public void setPosition5(Position position5) {
		PositionManager.position5 = position5;
	}

	public Position getPosition6() {
		return position6;
	}

	public void setPosition6(Position position6) {
		PositionManager.position6 = position6;
	}

	public Position getPosition7() {
		return position7;
	}

	public void setPosition7(Position position7) {
		PositionManager.position7 = position7;
	}

	public Position getPosition8() {
		return position8;
	}

	public void setPosition8(Position position8) {
		PositionManager.position8 = position8;
	}

	public void positionResetter() {
		
		for(Position p : enemyPositions) {
			
			p.available();
			
		}
		
	}
}
