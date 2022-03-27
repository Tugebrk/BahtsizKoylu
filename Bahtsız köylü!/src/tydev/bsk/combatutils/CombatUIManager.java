package tydev.bsk.combatutils;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import tydev.bsk.Handler;
import tydev.bsk.combatutils.CombatObject;

public class CombatUIManager {

	private Handler handler;
	private ArrayList<CombatObject> objects;

	public CombatUIManager(Handler handler) {
		this.handler = handler;
		objects = new ArrayList<CombatObject>();
	}

	public void tick() {
		for (CombatObject o : objects) {
			if (o != null)
				o.tick();
		}
	}

	public void render(Graphics g) {
		for (CombatObject o : objects) {
			if (o != null)
				o.render(g);
		}
	}

	public void onMouseMove(MouseEvent e) {
		for (CombatObject o : objects)
			o.onMouseMove(e);
	}

	public void onMouseRelease(MouseEvent e) {
		for (CombatObject o : objects)
			o.onMouseRelease(e);
	}

	public void addObject(CombatObject o) {
		objects.add(o);
	}

//	GETTERS SETTERS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ArrayList<CombatObject> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<CombatObject> objects) {
		this.objects = objects;
	}

	public void removeObject(CombatObject o) {
		objects.remove(o);

	}

}
