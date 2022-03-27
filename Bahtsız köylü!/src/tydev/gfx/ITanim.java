package tydev.gfx;

import java.awt.image.BufferedImage;

public class ITanim {

	private int speed, index;
	private long lastTime, timer;
	private BufferedImage[] frames;
	
	public ITanim(int speed, BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public void tick() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed) {
			if(index >= frames.length)
				index = 0;
			
			index++;
			timer = 0;
			if(index >= frames.length)
				index = frames.length - 1;
		}
	}
	
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public long getLastTime() {
		return lastTime;
	}

	public void setLastTime(long lastTime) {
		this.lastTime = lastTime;
	}

	public long getTimer() {
		return timer;
	}

	public void setTimer(long timer) {
		this.timer = timer;
	}

	public BufferedImage[] getFrames() {
		return frames;
	}

	public void setFrames(BufferedImage[] frames) {
		this.frames = frames;
	}
	
	
	
}
