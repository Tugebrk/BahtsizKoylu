package tydev.bsk;

import tydev.bsk.input.KeyManager;
import tydev.bsk.input.MouseManager;
import tydev.bsk.worlds.World;
import tydev.bsk.worlds.WorldManager;
import tydev.gfx.GameCamera;

public class Handler {
	
	private Game game;
	private WorldManager worldManager = new WorldManager(this);
	private World world = worldManager.getInHouse();
	
	public Handler(Game game){
		this.game = game;
		game.getMouseManager().setWorld(world);
		
	}
	

	public void setWorldManager(WorldManager worldManager) {
		this.worldManager = worldManager;
	}



	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
		this.getMouseManager().setWorld(world);
	}

	public WorldManager getWorldManager() {
		
		return worldManager;
	}

}
