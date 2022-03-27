package tydev.bsk.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
//	Static
	
	public static Tile[] tiles = new Tile[256];
	
	public static Tile grass = new Grass(0);
	public static Tile darkGrass = new DarkGrass(1);
	public static Tile lightGrass = new LightGrass(2);
	public static Tile hallowGrass = new HallowGrass(3);
	public static Tile sand = new Sand(4);
	public static Tile gravel = new Gravel(14);
	public static Tile dirt = new Dirt(6);
	public static Tile lightDirt = new LightDirt(13);
	public static Tile woid = new Void(7);
	
	public static Tile roof1 = new Roof(8);
	public static Tile roof2 = new Roof2(9);
	public static Tile roof3 = new Roof3(10);
	public static Tile roof4 = new Roof4(11);
	
	public static Tile cottageFloor = new CottageFloor(4);
	public static Tile secretFloor = new SecretFloor(5);
	
	public static Tile wall = new Wall(66);
	
	public static Tile farm = new Farm(12);
	
	
//  Class

	protected BufferedImage texture;
	protected final int id;
	public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

	public Tile(BufferedImage texture, int id) {

		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}

	public int getId() {
		return id;
	}

	public void tick() {

	}

	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);

	}
	
	public boolean isSolid() {
		return false;
	}
}
