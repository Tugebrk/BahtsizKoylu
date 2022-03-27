package tydev.bsk.state;

import java.awt.Graphics;

import tydev.bsk.Handler;
import tydev.bsk.entity.creatures.Player;
import tydev.bsk.worlds.World;
import tydev.bsk.worlds.WorldManager;

public class GameState extends State {

	private WorldManager worldManager;
	private static World activeWorld;

	public GameState(Handler handler) {
		super(handler);

		activeWorld = handler.getWorld();
		activeWorld.getEntityManager().setPlayer(activeWorld.getDefaultPlayer());
		activeWorld.init();

	}

	public void tick() {
		activeWorld.tick();
		System.out.println(activeWorld.getEntityManager().getPlayer().getX());
		System.out.println(activeWorld.getEntityManager().getPlayer().getxMove());

	}

	public void render(Graphics g) {
		activeWorld.render(g);

	}

	public World getActiveWorld() {
		return activeWorld;
	}

	public void setActiveWorld(World activeWorld) {
		GameState.activeWorld = activeWorld;
		activeWorld.init();
		this.handler.setWorld(activeWorld);
		this.handler.getMouseManager().setWorld(activeWorld);
	}

	public WorldManager getWorldManager() {
		return worldManager;
	}

	public void setWorldManager(WorldManager worldManager) {
		this.worldManager = worldManager;
	}

}
