package tydev.bsk.worlds;

import tydev.bsk.Handler;

import java.awt.Graphics;
import java.util.ArrayList;

import tydev.bsk.combatutils.CharacterManager;
import tydev.bsk.entity.*;
import tydev.bsk.entity.Static.*;
import tydev.bsk.entity.Static.Building.*;
import tydev.bsk.entity.Static.Building.walls.DoorT2;
import tydev.bsk.entity.Static.Building.walls.PoorWallEndDown;
import tydev.bsk.entity.Static.Building.walls.WallT2;
import tydev.bsk.entity.Static.Building.walls.WallT2Single;
import tydev.bsk.entity.Static.Tree.*;
import tydev.bsk.entity.creatures.Creature;
import tydev.bsk.entity.creatures.Damla;
import tydev.bsk.entity.creatures.Player;
import tydev.bsk.entity.creatures.animals.*;
import tydev.bsk.entity.creatures.enemies.HeavyMadventurerV1;
import tydev.bsk.entity.crops.Pumpkin;
import tydev.bsk.entity.crops.Wheat;
import tydev.bsk.state.State;
import tydev.bsk.tile.Tile;
import tydev.bsk.utils.Utils;

public class Farm extends World {

	private EntityManager entityManager;
	int ýd = 0;

	public Farm(Handler handler) {
		super(handler, "res/worlds/world1.txt");
		this.defaultPlayer = new Player(handler, 400, 200);
		this.name = "farm";
		entityManager = new EntityManager(handler);
//		this.entityManager.setPlayer(defaultPlayer);
		this.inCombat = false;
		this.handler = handler;



	}

	public void tick() {

		this.entityManager.tick();

	}

	
	@Override
	public void init() {

		eraseWorld();
		loadWorld(path);
		characterManager = new CharacterManager(handler);

//		ANIMALS

//		entityManager.addEntity(new GrayDog(handler, 480, 178));
//		entityManager.addEntity(new Damla(handler, 423, 200));
		entityManager.addEntity(new HeavyMadventurerV1(handler, 500, 300));
		entityManager.addEntity(new HeavyMadventurerV1(handler, 600, 400));

//		TREES

		entityManager.addEntity(new GreenTree(handler, 64, 160));
		entityManager.addEntity(new DarkgTree(handler, 160, 160));
		entityManager.addEntity(new GreenTree(handler, 64, 192));
		entityManager.addEntity(new DarkgTree(handler, 160, 192));
		entityManager.addEntity(new GreenTree(handler, 64, 224));
		entityManager.addEntity(new DarkgTree(handler, 160, 224));
		entityManager.addEntity(new GreenTree(handler, 450, 60));
		entityManager.addEntity(new GreenTree(handler, 500, 70));
		entityManager.addEntity(new GreenTree(handler, 400, 80));
		entityManager.addEntity(new GreenTree(handler, 450, 90));
		entityManager.addEntity(new DarkgTree(handler, 480, 65));
		entityManager.addEntity(new DarkgTree(handler, 430, 75));
		entityManager.addEntity(new DarkgTree(handler, 490, 85));
		entityManager.addEntity(new DarkgTree(handler, 400, 95));
		entityManager.addEntity(new GreenTree(handler, 550, 160));
		entityManager.addEntity(new GreenTree(handler, 600, 170));
		entityManager.addEntity(new GreenTree(handler, 500, 180));
		entityManager.addEntity(new GreenTree(handler, 550, 190));
		entityManager.addEntity(new DarkgTree(handler, 600, 155));
		entityManager.addEntity(new DarkgTree(handler, 530, 175));
		entityManager.addEntity(new DarkgTree(handler, 590, 185));
		entityManager.addEntity(new DarkgTree(handler, 500, 195));
		entityManager.addEntity(new GreenTree(handler, 650, 110));
		entityManager.addEntity(new GreenTree(handler, 700, 120));
		entityManager.addEntity(new GreenTree(handler, 600, 130));
		entityManager.addEntity(new GreenTree(handler, 650, 140));
		entityManager.addEntity(new DarkgTree(handler, 700, 105));
		entityManager.addEntity(new DarkgTree(handler, 630, 125));
		entityManager.addEntity(new DarkgTree(handler, 690, 135));
		entityManager.addEntity(new DarkgTree(handler, 600, 145));

//		CROPS

		entityManager.addEntity(new Pumpkin(handler, 0, 320));
		entityManager.addEntity(new Wheat(handler, 0, 344));

//		HOUSE

//		entityManager.addEntity(new FancyBed(handler, 400, 400));
		entityManager.addEntity(new FenceEnd(handler, 343, 300));
		entityManager.addEntity(new Midfence(handler, 310, 300));
		entityManager.addEntity(new Midfence(handler, 278, 300));
		entityManager.addEntity(new Midfence(handler, 246, 300));
		entityManager.addEntity(new Midfence(handler, 214, 300));
		entityManager.addEntity(new Midfence(handler, 182, 300));
		entityManager.addEntity(new Midfence(handler, 150, 300));
		entityManager.addEntity(new Midfence(handler, 118, 300));
		entityManager.addEntity(new Midfence(handler, 86, 300));
		entityManager.addEntity(new Midfence(handler, 54, 300));
		entityManager.addEntity(new Midfence(handler, 22, 300));
		entityManager.addEntity(new Midfence(handler, -10, 300));

		entityManager.addEntity(new WallT2(handler, 0, 126));
		entityManager.addEntity(new WallT2Single(handler, 96, 126));
//		entityManager.addEntity(new WallT2Single(handler, 128, 126));
		entityManager.addEntity(new DoorT2(handler, 128, 127));
		entityManager.addEntity(new WallT2Single(handler, 160, 126));
		entityManager.addEntity(new WallT2(handler, 192, 126));

//		entityManager.getPlayer().setX(spawnX);
//		entityManager.getPlayer().setY(spawnY);

		for (Entity e : entityManager.getEntities()) {

			if (e.isWalkable() && !e.isAlly() && e.isAlive()) {

				enemyParty.add((Creature) e);
				characterManager.getObjects().add(e.getCombatCharacter());

			}

			else if ((!e.isWalkable() && e.isAlly() && e.isAlive()) || e.isPlayer()) {

				allyParty.add((Creature) e);
				characterManager.getObjects().add(e.getCombatCharacter());
			}
		}

		System.out.println("ally count" + allyParty.size());
		System.out.println("enemy count" + enemyParty.size());
		

		
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
			return Tile.grass;
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
	public Player getDefaultPlayer() {
		// TODO Auto-generated method stub
		return defaultPlayer;
	}
	
	

}
