package tydev.bsk.worlds;

import java.awt.Graphics;
import java.util.ArrayList;

import tydev.bsk.Handler;
import tydev.bsk.combat.PositionManager;
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
import tydev.bsk.input.MouseManager;
import tydev.bsk.tile.Tile;
import tydev.bsk.utils.Utils;

public abstract class World {

	protected PositionManager pManager;
	protected Player defaultPlayer;
	protected String name;
	protected Handler handler;
	protected int width, height;
	protected int spawnX, spawnY;
	protected int[][] ctile;
	protected CharacterManager characterManager;
	protected EntityManager entityManager;
	protected boolean inCombat = false;
	protected String path;

	protected static ArrayList<Creature> enemyParty = new ArrayList<Creature>();
	protected static ArrayList<Creature> allyParty = new ArrayList<Creature>();

	public World(Handler handler, String path) {
		this.handler = handler;
		this.characterManager = new CharacterManager(handler);
		this.path = path;
		loadWorld(path);

	}

	public abstract void init();

	public abstract void tick();

	public abstract void render(Graphics g);

	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grass;

		Tile t = Tile.tiles[ctile[x][y]];
		if (t == null)
			return Tile.grass;
		return t;
	}

	protected void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);

		ctile = new int[width][height];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				ctile[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}

	}

	protected void eraseWorld() {

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				ctile[x][y] = (Integer) 1;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInCombat() {
		return inCombat;
	}

	public void setInCombat(boolean inCombat) {
		this.inCombat = inCombat;
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
		return getEntityManager();
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

	public abstract Player getDefaultPlayer();
}
