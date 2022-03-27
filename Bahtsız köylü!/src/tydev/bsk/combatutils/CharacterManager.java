package tydev.bsk.combatutils;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import tydev.bsk.Handler;


public class CharacterManager {
	
	private Handler handler;
	private ArrayList<CombatCharacter> objects;

	
	public CharacterManager(Handler handler) {
		this.handler = handler;
		objects = new ArrayList<CombatCharacter>();	
	}

	public void tick() {
		for(CombatCharacter o : objects)
			o.tick();
	}
	
	public void render(Graphics g) {
		for(CombatCharacter o : objects)
			o.render(g);
	}
	
	public void onMouseMove(MouseEvent e) {
		for(CombatCharacter o : objects)
			o.onMouseMove(e);
	}
	
	public void onMouseRelease(MouseEvent e) {
		for(CombatCharacter o : objects)
			o.onMouseRelease(e);
	}
	
	public void addObject(CombatCharacter o) {
		objects.add(o);
	}
	
//	GETTERS SETTERS
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ArrayList<CombatCharacter> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<CombatCharacter> objects) {
		this.objects = objects;
	}

	public void removeObject(CombatCharacter o) {
		objects.remove(o);
	
	}	
	
}
