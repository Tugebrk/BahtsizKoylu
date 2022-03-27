package tydev.bsk.worlds;

import tydev.bsk.Handler;

public class WorldManager {

	private Farm farm;
	private InHouse inHouse;
	
	public WorldManager(Handler handler) {
		

		farm = new Farm(handler);
		inHouse = new InHouse(handler);

		
		
	}

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
	}

	public InHouse getInHouse() {
		return inHouse;
	}

	public void setInHouse(InHouse inHouse) {
		this.inHouse = inHouse;
	}

	
}
