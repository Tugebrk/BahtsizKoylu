package tydev.bsk.state;

import java.awt.Graphics;

import tydev.bsk.Handler;
import tydev.bsk.ui.ClickListener;
import tydev.bsk.ui.UIImageButton;
import tydev.bsk.ui.UIManager;
import tydev.gfx.Assets;

public class MenuState extends State {

	private UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		uiManager.addObject(new UIImageButton(120, 120, 200, 75, Assets.start_button, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
		
		uiManager.addObject(new UIImageButton(120, 215, 200, 75, Assets.settings_button, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(null);
			}
		}));
		
		uiManager.addObject(new UIImageButton(120, 300, 200, 75, Assets.exit_button, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				System.exit(1);
			}
		}));
	}

	
	
	public UIManager getUiManager() {
		return uiManager;
	}



	public void setUiManager(UIManager uiManager) {
		this.uiManager = uiManager;
	}



	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

	@Override
	public void tick() {
		uiManager.tick();

	}

}
