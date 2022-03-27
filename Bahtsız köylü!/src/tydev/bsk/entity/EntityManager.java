package tydev.bsk.entity;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;

import tydev.bsk.Handler;
import tydev.bsk.entity.creatures.Player;
import tydev.bsk.ui.UIObject;

public class EntityManager {

	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {

		@Override
		public int compare(Entity a, Entity b) {
			if (a.isAlwaysRenderBottom() || (!b.isAlwaysRenderBottom() & (a.getHeight() + a.getY() < b.getHeight() + b.getY())))
				return -1;
			return 1;
		}

	};

	public EntityManager(Handler handler) {
		this.handler = handler;
		entities = new ArrayList<Entity>();
//		addEntity(player);

	}

	public void tick() {
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();

		}
		entities.sort(renderSorter);
	}

	public void render(Graphics g) {
		for (Entity e : entities) {
			e.render(g);
			g.drawRect((int)e.getCollisionBounds(0,0).getX(), (int)e.getCollisionBounds(0,0).getY(), (int)e.getCollisionBounds(0,0).getWidth(), (int)e.getCollisionBounds(0,0).getHeight());
		}
	}

	public void addEntity(Entity e) {
		entities.add(e);
	}

	public void onMouseRelease(MouseEvent m) {
		for (Entity e : entities)
			e.onMouseRelease(m);
	}

	public void onMouseMove(MouseEvent m) {

		if (!entities.isEmpty()) {

			int size = entities.size();
			for (int i = size - 1; i >= 0; i--)
				entities.get(i).onMouseMove(m);
		}
		
		else
			return;
	}

//	GETTERS SETTERS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
		addEntity(player);
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

}
