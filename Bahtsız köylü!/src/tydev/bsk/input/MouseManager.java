package tydev.bsk.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import tydev.bsk.combatutils.CharacterManager;
import tydev.bsk.combatutils.CombatUIManager;
import tydev.bsk.entity.EntityManager;
import tydev.bsk.state.State;
import tydev.bsk.ui.UIManager;
import tydev.bsk.worlds.World;

public class MouseManager implements MouseListener, MouseMotionListener {

	private UIManager uiManager;
	private CharacterManager characterManager;
	private CombatUIManager combatUIManager;
	private World world;
	private boolean leftPressed, rightPressed;
	private int mouseX, mouseY;
	private EntityManager entityManager;

	public MouseManager() {

	}

	public void setUIManager(UIManager uiManager) {
		this.uiManager = uiManager;
	}

	public void setCharacterManager(CharacterManager characterManager) {
		this.characterManager = characterManager;

	}

	public void setCombatUIManager(CombatUIManager combatUIManager) {
		this.combatUIManager = combatUIManager;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
		this.entityManager = world.getEntityManager();
		System.out.println(entityManager.getEntities().size());
	}

	public boolean isLeftPressed() {
		return leftPressed;
	}

	public boolean isRightPressed() {
		return rightPressed;
	}

//	GETTERS SETTERS

	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1)
			leftPressed = true;
		else if (e.getButton() == MouseEvent.BUTTON3)
			rightPressed = true;

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1)
			leftPressed = false;
		else if (e.getButton() == MouseEvent.BUTTON3)
			rightPressed = false;

		if (uiManager != null)
			uiManager.onMouseRelease(e);

		if (characterManager != null)
			characterManager.onMouseRelease(e);
		
		if(combatUIManager != null)
			combatUIManager.onMouseRelease(e);
		
		if(world != null)
			entityManager.onMouseRelease(e);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();

		if (uiManager != null)
			uiManager.onMouseMove(e);

		if (characterManager != null)
			characterManager.onMouseMove(e);
		
		if(combatUIManager != null)
			combatUIManager.onMouseMove(e);

		if(world != null && !world.getEntityManager().getEntities().isEmpty())
			entityManager.onMouseMove(e);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

}
