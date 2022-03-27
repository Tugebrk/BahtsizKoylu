package tydev.bsk.worlds;

import tydev.bsk.Handler;

import java.awt.Graphics;
import java.util.ArrayList;

import tydev.bsk.combatutils.CharacterManager;
import tydev.bsk.entity.*;
import tydev.bsk.entity.Static.*;
import tydev.bsk.entity.Static.Building.*;
import tydev.bsk.entity.Static.Building.furniture.PoorCarpet;
import tydev.bsk.entity.Static.Building.walls.CotWallWindow;
import tydev.bsk.entity.Static.Building.walls.InDoor;
import tydev.bsk.entity.Static.Building.walls.InWall;
import tydev.bsk.entity.Static.Building.walls.PoorWallEnd;
import tydev.bsk.entity.Static.Building.walls.PoorWallEndDown;
import tydev.bsk.entity.Static.Building.walls.PoorWallMid;
import tydev.bsk.entity.Static.Building.walls.WallT2;
import tydev.bsk.entity.Static.Tree.*;
import tydev.bsk.entity.creatures.Creature;
import tydev.bsk.entity.creatures.Damla;
import tydev.bsk.entity.creatures.Player;
import tydev.bsk.entity.creatures.animals.*;
import tydev.bsk.entity.creatures.enemies.HeavyMadventurerV1;
import tydev.bsk.entity.crops.Pumpkin;
import tydev.bsk.entity.crops.Wheat;
import tydev.bsk.input.MouseManager;
import tydev.bsk.tile.Tile;
import tydev.bsk.ui.ClickListener;
import tydev.bsk.utils.Utils;

public class InHouse extends World {

	private EntityManager entityManager;

	public InHouse(Handler handler) {
		super(handler, "res/worlds/world2.txt");
		this.defaultPlayer = new Player(handler, 500, 100);
		entityManager = new EntityManager(handler);
		entityManager.setPlayer(defaultPlayer);
		this.name = "house";
		this.inCombat = false;
		this.handler = handler;

	}

	public void tick() {
		this.entityManager.tick();

	}

	public void render(Graphics g) {

		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width,
				((handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH) + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height,
				((handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT) + 1);

		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));

			}
		}
		this.entityManager.render(g);
	}

	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grass;

		Tile t = Tile.tiles[ctile[x][y]];
		if (t == null)
			return Tile.woid;
		return t;
	}

	public CharacterManager getCharacterManager() {
		return characterManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	public int getHeight() {
		return height;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public int getWidth() {
		return width;
	}

	public ArrayList<Creature> getEnemyParty() {
		return enemyParty;
	}

	public void setEnemyParty(ArrayList<Creature> enemyParty) {
		World.enemyParty = enemyParty;
	}

	@Override
	public void init() {

		eraseWorld();
		loadWorld(path);
		characterManager = new CharacterManager(handler);

//	ROOM1

		entityManager.addEntity(new InWall(handler, 0, 160));
		entityManager.addEntity(new CotWallWindow(handler, 96, 160));
		entityManager.addEntity(new CotWallWindow(handler, 224, 160));
		entityManager.addEntity(new InDoor(handler, 192, 160));

		entityManager.addEntity(new PoorCarpet(handler, 140, 260));

		entityManager.addEntity(new PoorWallMid(handler, 0, 160));
		entityManager.addEntity(new PoorWallMid(handler, 0, 224));
		entityManager.addEntity(new PoorWallMid(handler, 0, 288));
		entityManager.addEntity(new PoorWallEnd(handler, 0, 352));

//	ROOM2

		entityManager.addEntity(new InWall(handler, 352, 160));
		entityManager.addEntity(new CotWallWindow(handler, 448, 160));
		entityManager.addEntity(new InWall(handler, 544, 160));
		entityManager.addEntity(new CotWallWindow(handler, 640, 160));
		entityManager.addEntity(new InWall(handler, 736, 160));

		entityManager.addEntity(new PoorWallMid(handler, 320, 160));
		entityManager.addEntity(new PoorWallEnd(handler, 320, 224));
		entityManager.addEntity(new PoorWallEnd(handler, 320, 352));

		
//	ROOM3
		
		entityManager.addEntity(new PoorWallMid(handler, 768, 160));
		entityManager.addEntity(new PoorWallMid(handler, 768, 224));
		entityManager.addEntity(new PoorWallMid(handler, 768, 288));
		entityManager.addEntity(new PoorWallEnd(handler, 768, 352));
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

		for (Entity e : entityManager.getEntities()) {

			if (!e.isWalkable() && !e.isAlly() && e.isAlive()) {

				enemyParty.add((Creature) e);
				characterManager.getObjects().add(e.getCombatCharacter());

			}

			else if (e.isWalkable() && e.isAlly() && e.isAlive()) {

				allyParty.add((Creature) e);
				characterManager.getObjects().add(e.getCombatCharacter());
			}
		}

		System.out.println("allies inhouse" + allyParty.size());
		System.out.println("enemies inhouse" + enemyParty.size());

	}

	@Override
	public Player getDefaultPlayer() {

		return defaultPlayer;
	}

}
