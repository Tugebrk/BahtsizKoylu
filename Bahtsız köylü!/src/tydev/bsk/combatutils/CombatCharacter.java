package tydev.bsk.combatutils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import tydev.bsk.combat.Faction;
import tydev.bsk.combat.FactionManager;
import tydev.bsk.combatutils.Skills.effects.Effect;
import tydev.bsk.combatutils.Skills.effects.EffectManager;
import tydev.bsk.types.ClasS;
import tydev.gfx.Animation;
import tydev.gfx.ITanim;

public class CombatCharacter extends CombatObject {

	protected int defSpeed;
	protected int defHealth;
	protected int defMana;
	protected String name;
	
	protected ArrayList<Effect> effectsOn = new ArrayList<Effect>();
	protected ArrayList<Skill> skills = new ArrayList<Skill>();
	protected static FactionManager factionManager = new FactionManager();
	protected Faction faction;
	protected CombatCharacter target;
	
	protected int health;
	protected int mana;
	protected int attackDamage;
	protected int spellDamage;
	protected int level;
	protected int experience;
	protected int combatSpeed;
	
	protected boolean isDead = false;
	protected boolean isHurt = false;
	protected boolean isHealed = false;
	protected boolean isRevived = false;
	protected boolean standAnim = true;
	protected boolean hit = false;
	
	protected ClasS clasS;
	protected BufferedImage portrait;
	protected Turn turn = new Turn();
	protected EffectManager effectManager = new EffectManager();


	protected Animation animStand;
	protected Animation animReady;
	protected Animation animHitReady;
	protected ITanim animDead;
	protected ITanim animRevive;
	protected Animation animAfterHit;
	protected ITanim animHurt;
	protected Position position;

	public CombatCharacter(Position position, int width, int height, int health, int mana, int attackDamage,
			int spellDamage, int level, int experience, int combatSpeed, String name, Faction faction, ClasS clasS,
			BufferedImage portrait) {
		super(position.getX(), position.getY(), width, height);
		this.position = position;
		this.position.occupied();
		this.name = name;
		this.faction = faction;
		this.health = health;
		this.mana = mana;
		this.attackDamage = attackDamage;
		this.spellDamage = spellDamage;
		this.experience = experience;
		this.level = level;
		this.clasS = clasS;
		this.portrait = portrait;
		this.combatSpeed = combatSpeed;
		this.defSpeed = combatSpeed;
		this.defHealth = health;
		this.defMana = mana;
		this.animStand = clasS.getAnimStand();
		this.animReady = clasS.getAnimReady();
		this.animAfterHit = clasS.getAnimAfterHit();
		this.animDead = clasS.getAnimDead();
		this.animRevive = clasS.getAnimRevive();
		this.animHurt = clasS.getAnimHurt();

	}

	public void Healed() {

		this.isHealed = true;

	}

	public void gotHurt() {

		this.isHurt = true;
	}

	public void Dead() {

		this.isDead = true;
		this.combatSpeed = 0;

	}

	public void Revive() {

		this.isRevived = true;
		this.isDead = false;

	}
	
	public boolean isPlayer() {
		
		return false;
		
	}

//	GETTERS SETTERS
	
	

	public int getCombatSpeed() {
		return combatSpeed;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public int getDefSpeed() {
		return defSpeed;
	}

	public void setDefSpeed(int defSpeed) {
		this.defSpeed = defSpeed;
	}

	public int getDefHealth() {
		return defHealth;
	}

	public void setDefHealth(int defHealth) {
		this.defHealth = defHealth;
	}

	public int getDefMana() {
		return defMana;
	}

	public void setDefMana(int defMana) {
		this.defMana = defMana;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public boolean isHurt() {
		return isHurt;
	}

	public void setHurt(boolean isHurt) {
		this.isHurt = isHurt;
	}

	public boolean isHealed() {
		return isHealed;
	}

	public void setHealed(boolean isHealed) {
		this.isHealed = isHealed;
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public EffectManager getEffectManager() {
		return effectManager;
	}

	public void setEffectManager(EffectManager effectManager) {
		this.effectManager = effectManager;
	}

	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}

	public void setCombatSpeed(int combatSpeed) {
		this.combatSpeed = combatSpeed;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getSpellDamage() {
		return spellDamage;
	}

	public void setSpellDamage(int spellDamage) {
		this.spellDamage = spellDamage;
	}

	public ClasS getClasS() {
		return clasS;
	}

	public void setClasS(ClasS clasS) {
		this.clasS = clasS;
	}

	public BufferedImage getPortrait() {
		return portrait;
	}

	public void setPortrait(BufferedImage portrait) {
		this.portrait = portrait;
	}

	public Faction getFaction() {
		return faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}
	

	@Override
	public void tick() {

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(portrait, (int) x, (int) y, width, height, null);

	}

	@Override
	protected void onClick() {

	}

	public CombatCharacter getTarget() {
		return target;
	}

	public void setTarget(CombatCharacter target) {
		this.target = target;
	}

	public void Turn() {

	}

	public ArrayList<Effect> getEffectsOn() {
		return effectsOn;
	}

	public void setEffectsOn(ArrayList<Effect> effectsOn) {
		this.effectsOn = effectsOn;
	}

	public boolean isRevived() {
		return isRevived;
	}

	public void setRevived(boolean isRevived) {
		this.isRevived = isRevived;
	}

	public boolean isStandAnim() {
		return standAnim;
	}

	public void setStandAnim(boolean standAnim) {
		this.standAnim = standAnim;
	}

	public Animation getAnimStand() {
		return animStand;
	}

	public void setAnimStand(Animation animStand) {
		this.animStand = animStand;
	}

	public Animation getAnimReady() {
		return animReady;
	}

	public void setAnimReady(Animation animReady) {
		this.animReady = animReady;
	}

	public Animation getAnimHitReady() {
		return animHitReady;
	}

	public void setAnimHitReady(Animation animHitReady) {
		this.animHitReady = animHitReady;
	}

	public ITanim getAnimDead() {
		return animDead;
	}

	public void setAnimDead(ITanim animDead) {
		this.animDead = animDead;
	}

	public ITanim getAnimRevive() {
		return animRevive;
	}

	public void setAnimRevive(ITanim animRevive) {
		this.animRevive = animRevive;
	}

	public Animation getAnimAfterHit() {
		return animAfterHit;
	}

	public void setAnimAfterHit(Animation animAfterHit) {
		this.animAfterHit = animAfterHit;
	}

	public ITanim getAnimHurt() {
		return animHurt;
	}

	public void setAnimHurt(ITanim animHurt) {
		this.animHurt = animHurt;
	}


}
