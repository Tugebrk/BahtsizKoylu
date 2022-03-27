package tydev.bsk;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import tydev.bsk.input.KeyManager;
import tydev.bsk.input.MouseManager;
import tydev.bsk.state.CombatState;
import tydev.bsk.state.GameState;
import tydev.bsk.state.MenuState;
import tydev.bsk.state.SettingState;
import tydev.gfx.Assets;
import tydev.gfx.GameCamera;
import tydev.bsk.state.State;;

public class Game implements Runnable {

	private Display display;

	private int width, height;


	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String title;

	private BufferStrategy bs;
	private Graphics g;

	public State gameState;
	public State menuState;
	public State settingState;
	public CombatState combatState;
	
	private MouseManager mouseManager;

	private KeyManager keyManager;

	private Thread thread;

	private boolean running = false;

	public Game(String title, int width, int height) {

		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();

	}

	private Handler handler;

	private GameCamera gameCamera;

	private void init() {

		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);


		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		settingState = new SettingState(handler);
		State.setState(menuState);

	}

	int x = 0;

	private void tick() {
		keyManager.tick();

		if (State.getState() != null)
			State.getState().tick();

	}

	private void render() {

		bs = display.getCanvas().getBufferStrategy();

		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);

		if (State.getState() != null)
			State.getState().render(g);

		bs.show();
		g.dispose();
	}

	public void run() {

		init();

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();

		while (running) {

			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				delta--;
			}
		}
		stop();
	}
	
	

	public GameState getGameState() {
		return (GameState) gameState;
	}

	public void setGameState(State gameState) {
		this.gameState = gameState;
	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	public MouseManager getMouseManager() {
		return mouseManager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();

	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	


}