package tydev.bsk.combatutils.Skills.effects;

public class EffectManager {
	
	private static Bleed bleed = new Bleed();
	private static Poison poison = new Poison();
	private static Freeze freeze = new Freeze();
	private static Stun stun = new Stun();
	private static Slow slow = new Slow();
	private static Burn burn = new Burn();
	
//	GETTERS SETTERS
	
	public Bleed getBleed() {
		return bleed;
	}
	public void setBleed(Bleed bleed) {
		EffectManager.bleed = bleed;
	}
	public Poison getPoison() {
		return poison;
	}
	public void setPoison(Poison poison) {
		EffectManager.poison = poison;
	}
	public Freeze getFreeze() {
		return freeze;
	}
	public void setFreeze(Freeze freeze) {
		EffectManager.freeze = freeze;
	}
	public Stun getStun() {
		return stun;
	}
	public void setStun(Stun stun) {
		EffectManager.stun = stun;
	}
	public Slow getSlow() {
		return slow;
	}
	public void setSlow(Slow slow) {
		EffectManager.slow = slow;
	}
	public Burn getBurn() {
		return burn;
	}
	public void setBurn(Burn burn) {
		EffectManager.burn = burn;
	}

	
	
}
