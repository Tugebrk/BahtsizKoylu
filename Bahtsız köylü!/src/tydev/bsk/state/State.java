package tydev.bsk.state;

import java.awt.Graphics;

import tydev.bsk.Handler;

public abstract class State {

	public static State currentState = null;

	public static void setState(State state) {

		currentState = state;

	}

	public static State getState() {

		return currentState;

	}

	protected Handler handler;
	
	public State(Handler handler) {
		
		this.setHandler(handler);
	}
	
	public abstract void tick();

	public abstract void render(Graphics g);

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
