package tydev.bsk.inventory;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import tydev.bsk.Handler;
import tydev.bsk.combat.items.Item;

public class Inventory {

	private boolean active = false;
	private Handler handler;
	private ArrayList<Item> inventoryItems;

	public Inventory(Handler handler) {

		this.handler = handler;
		inventoryItems = new ArrayList<Item>();

	}

	public void tick() {
		if (handler.getKeyManager().keyJustPressed(KeyEvent.VK_E))
			active = !active;
		if (!active)
			return;

		System.out.println("ION");
		
	}

	public void render(Graphics g) {
		if (!active)
			return;

	}
	
//	Inventory Methods
	
	public void add(Item item) {
		for(Item i : inventoryItems) {
			if(i.getId() == item.getId()) {
				i.setCount(i.getCount() + item.getCount());
			}
		}
		inventoryItems.add(item);
		
	}

//	GS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
