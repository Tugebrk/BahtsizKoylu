package tydev.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	public static final int ccw = 32, cch = 32;
	public static final int widthT = 16, heightT = 16;
	public static final int right = 16, down = 16;
	public static final int widthP = 32, heightP = 32;
	public static final int widthBE = 64, heightBE = 64;
	public static final int width = 48, height = 48;

//	COMBAT SKILL ICONS

	public static BufferedImage basicAttack;
	public static BufferedImage neckStab;
	public static BufferedImage poisonBlades;
	public static BufferedImage fireball;
	public static BufferedImage freezeBolt;
	public static BufferedImage earthSpikes;
	public static BufferedImage bluntHit;
	public static BufferedImage littleMeteorites;

//	EFFECTS

	public static BufferedImage[] burnEffect = new BufferedImage[10];
	public static BufferedImage[] poisonEffect = new BufferedImage[10];
	public static BufferedImage[] bleedEffect = new BufferedImage[10];
	public static BufferedImage[] freezeEffect = new BufferedImage[10];

//	COMBAT CHARACTERS

	public static BufferedImage[] simpletonAttack = new BufferedImage[10];
	public static BufferedImage[] simpletonIdle = new BufferedImage[10];
	public static BufferedImage[] simpletonDeath = new BufferedImage[10];
	public static BufferedImage[] simpletonReady = new BufferedImage[10];
	public static BufferedImage[] simpletonHurt = new BufferedImage[6];

	public static BufferedImage[] forestRangerAttack = new BufferedImage[10];
	public static BufferedImage[] forestRangerIdle = new BufferedImage[10];
	public static BufferedImage[] forestRangerDeath = new BufferedImage[10];
	public static BufferedImage[] forestRangerReady = new BufferedImage[10];
	public static BufferedImage[] forestRangerHurt = new BufferedImage[10];

	public static BufferedImage[] assasinAttack = new BufferedImage[10];
	public static BufferedImage[] assasinIdle = new BufferedImage[10];
	public static BufferedImage[] assasinDeath = new BufferedImage[10];
	public static BufferedImage[] assasinReady = new BufferedImage[10];
	public static BufferedImage[] assasinHurt = new BufferedImage[10];

	public static BufferedImage[] blackKnightAttack = new BufferedImage[10];
	public static BufferedImage[] blackKnightIdle = new BufferedImage[10];
	public static BufferedImage[] blackKnightDeath = new BufferedImage[10];
	public static BufferedImage[] blackKnightReady = new BufferedImage[10];
	public static BufferedImage[] blackKnightHurt = new BufferedImage[10];

	public static BufferedImage[] peasantAttack = new BufferedImage[10];
	public static BufferedImage[] peasantonIdle = new BufferedImage[10];
	public static BufferedImage[] peasantDeath = new BufferedImage[10];
	public static BufferedImage[] peasantReady = new BufferedImage[10];
	public static BufferedImage[] peasantHurt = new BufferedImage[10];

//	BACKGROUNDS

	public static BufferedImage forestbg = ImageLoader.loadImage("/textures/RPG Assets/background/Battleground3.png");

//	GUI

	public static BufferedImage button_ready_off;
	public static BufferedImage button_ready_on;
	public static BufferedImage button2_ready_off_ready;
	public static BufferedImage button2_ready_on_ready;
	public static BufferedImage button2_ready_off;
	public static BufferedImage button2_ready_on;
	public static BufferedImage mid_bg;
	public static BufferedImage barmid_ready;
	public static BufferedImage hp_frame;
	public static BufferedImage hp_line;

//	UI

	public static BufferedImage[] start_button;
	public static BufferedImage[] settings_button;
	public static BufferedImage[] exit_button;

//	PLAYER ANIMATION ARRAYS

	public static BufferedImage[] player_down;
	public static BufferedImage[] player_left;
	public static BufferedImage[] player_right;
	public static BufferedImage[] player_up;

//	DAMLA ANIMATON ARRAYS

	public static BufferedImage[] damla_down;
	public static BufferedImage[] damla_left;
	public static BufferedImage[] damla_right;
	public static BufferedImage[] damla_up;

//	LIGHT MELEE ADVENTURER ANIMATION ARRAYS

	public static BufferedImage[] lmadventurerV1_down = new BufferedImage[4];
	public static BufferedImage[] lmadventurerV1_left = new BufferedImage[4];
	public static BufferedImage[] lmadventurerV1_right = new BufferedImage[4];
	public static BufferedImage[] lmadventurerV1_up = new BufferedImage[4];

//	ENEMY ANIMATION ARRAYS

	public static BufferedImage[] lb_ready = new BufferedImage[4];
	public static BufferedImage[] lb_standing = new BufferedImage[4];
	public static BufferedImage[] lb_afterHit = new BufferedImage[8];
	public static BufferedImage[] lb_revive = new BufferedImage[9];
	public static BufferedImage[] lb_hurt = new BufferedImage[5];
	public static BufferedImage[] lb_dead = new BufferedImage[4];

	public static BufferedImage[] hb_ready = new BufferedImage[4];
	public static BufferedImage[] hb_standing = new BufferedImage[4];
	public static BufferedImage[] hb_afterHit = new BufferedImage[8];
	public static BufferedImage[] hb_revive = new BufferedImage[9];
	public static BufferedImage[] hb_hurt = new BufferedImage[5];
	public static BufferedImage[] hb_dead = new BufferedImage[4];

//	ANIMAL ANIMATION ARRAYS

//	Black Cat

	public static BufferedImage[] bcat_down = new BufferedImage[4];
	public static BufferedImage[] bcat_left = new BufferedImage[4];
	public static BufferedImage[] bcat_right = new BufferedImage[4];
	public static BufferedImage[] bcat_up = new BufferedImage[4];

//	White Cat

	public static BufferedImage[] wcat_down = new BufferedImage[4];
	public static BufferedImage[] wcat_left = new BufferedImage[4];
	public static BufferedImage[] wcat_right = new BufferedImage[4];
	public static BufferedImage[] wcat_up = new BufferedImage[4];

//	Yellow Cat

	public static BufferedImage[] ycat_down = new BufferedImage[4];
	public static BufferedImage[] ycat_left = new BufferedImage[4];
	public static BufferedImage[] ycat_right = new BufferedImage[4];
	public static BufferedImage[] ycat_up = new BufferedImage[4];

//	Black Dog

	public static BufferedImage[] bdog_down = new BufferedImage[4];
	public static BufferedImage[] bdog_left = new BufferedImage[4];
	public static BufferedImage[] bdog_right = new BufferedImage[4];
	public static BufferedImage[] bdog_up = new BufferedImage[4];

//	Gray Dog

	public static BufferedImage[] gdog_down = new BufferedImage[4];
	public static BufferedImage[] gdog_left = new BufferedImage[4];
	public static BufferedImage[] gdog_right = new BufferedImage[4];
	public static BufferedImage[] gdog_up = new BufferedImage[4];

//	Yellow Dog

	public static BufferedImage[] ydog_down = new BufferedImage[4];
	public static BufferedImage[] ydog_left = new BufferedImage[4];
	public static BufferedImage[] ydog_right = new BufferedImage[4];
	public static BufferedImage[] ydog_up = new BufferedImage[4];

//	BUFFEREDIMAGE DECLARATIONS

	public static BufferedImage wheat, pumpkin;

	public static BufferedImage shortGrass, longGrass, wall, openDoor, closedDoor, openWind, closedWind, leftWallEnd,
			rightWallEnd, dirtWall, dirtWallTop, dirtWallSingle, barrel, chest, well, wellTop, pine, tree, bush, splash;

	public static BufferedImage greenTree, fallTree, darkgTree, deadTree;

	public static BufferedImage grass, darkGrass, lightGrass, hallowGrass, sand, dirt, gravel, lightDirt;

	public static BufferedImage roof1, roof2, roof3, roof4;

	public static BufferedImage inWall, inWall2, openinDoor, closedinDoor, walltier2, wallt2single, wallt2end, doortier2,
			secretFloor, cottageFloor, secretWall, secretWall2, secretDoorO, secretDoorC, doortier2open, woid;

	public static BufferedImage midfarm, midfence, fencehead;
	
	public static BufferedImage poorWallMid, poorWallEnd, poorWallMidDown, poorWallEndDown, poorSqrTable, poorRndTable, 
			poorStool, poorDrawer, poorClock, poorBed, basicPicture, portrait, poorFireplace;

	public static BufferedImage poorCarpet, firePlace, map, littleDrawer, multiDrawer, gardrop, piano, poorTable,
			littleWindow, bigWindow, fancyWindow, sink, oven, quadron, normalBed, fancyBed, cotWallWindow;


	
//////////////////////////////////////////////////////////////////////////

	public static void init() {

//	SHEETS

//		Characters

		SpriteSheet simpleton = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/CombatCharacter/Simpleton.png"));
		SpriteSheet forestRanger = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/CombatCharacter/ForestRanger.png"));
		SpriteSheet peasant = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/CombatCharacter/Peasant.png"));
		SpriteSheet assasin = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/CombatCharacter/Assassin.png"));
		SpriteSheet blackKnight = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/CombatCharacter/BlackKnight.png"));

//		Effects

		SpriteSheet burn = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/effects/Fires/fire.png"));
		SpriteSheet poison = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/effects/Fires/poison.png"));
		SpriteSheet bleed = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/effects/Fires/fire.png"));
		SpriteSheet freeze = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/effects/Fires/freeze.png"));

//		Animals

		SpriteSheet whiteCat = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/whitecat.png"));

		SpriteSheet blackCat = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/blackcat.png"));

		SpriteSheet yellowCat = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/yellowcat.png"));

		SpriteSheet yDog = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/yellowdog.png"));

		SpriteSheet bDog = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/blackdog.png"));

		SpriteSheet gDog = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/Character/Animal/graydog.png"));

//		World
		
		SpriteSheet windows = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/house/windows.png"));
		SpriteSheet drawers = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/house/drawers.png"));
		SpriteSheet kitchenPoor = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/house/kitchenPoor.png"));

		SpriteSheet floorSheet = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/house/floorSheet.png"));

		SpriteSheet secretWalls = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/house/secretWall.png"));

		SpriteSheet roof = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/house/rof.png"));

		SpriteSheet tiles = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/tiles/tile.png"));

		SpriteSheet town = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/town/town_tiles.png"));

//		NPC

		SpriteSheet damla = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/NPC/Damla.png"));

		SpriteSheet peasantsheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Male/Male 14-2.png"));

		SpriteSheet trees = new SpriteSheet(ImageLoader.loadImage("/textures/RPG Assets/trees/trees.png"));

		SpriteSheet lightmadventurerV1 = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Character/Male/Male 02-1.png"));

//		ENEMIES

		SpriteSheet lightBandit = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Enemies/LightBandit.png"));
		SpriteSheet heavyBandit = new SpriteSheet(
				ImageLoader.loadImage("/textures/RPG Assets/Enemies/HeavyBandit.png"));

/////////////////////////////////////////////////////////////////////////////////

//		COMBAT CHARACTERS

		for (int i = 0; i < 10; i++) {

			simpletonAttack[i] = simpleton.crop(ccw * i, cch * 3, ccw, cch);

		}

		for (int i = 0; i < 10; i++) {

			simpletonIdle[i] = simpleton.crop(ccw * i, 0, ccw, cch);

		}

		for (int i = 0; i < 10; i++) {

			simpletonDeath[i] = simpleton.crop(ccw * i, cch * 4, ccw, cch);

		}

		for (int i = 0; i < 10; i++) {

			simpletonReady[i] = simpleton.crop(ccw * i, cch * 2, ccw, cch);

		}

		for (int i = 0; i < 6; i++) {

			simpletonHurt[i] = simpleton.crop(ccw * i, cch * 4, ccw, cch);

		}

//		GUI IMAGES

		button_ready_off = ImageLoader.loadImage("/textures/RPG Assets/gui/button_ready_off.png");
		button_ready_on = ImageLoader.loadImage("/textures/RPG Assets/gui/button_ready_on.png");
		button2_ready_off_ready = ImageLoader.loadImage("/textures/RPG Assets/gui/button_ready_off_ready.png");
		button2_ready_on_ready = ImageLoader.loadImage("/textures/RPG Assets/gui/button_ready_on_ready.png");
		button2_ready_off = ImageLoader.loadImage("/textures/RPG Assets/gui/button2_ready_off.png");
		button2_ready_on = ImageLoader.loadImage("/textures/RPG Assets/gui/button2_ready_on.png");
		mid_bg = ImageLoader.loadImage("/textures/RPG Assets/gui/mid_background.png");
		barmid_ready = ImageLoader.loadImage("/textures/RPG Assets/gui/barmid_ready.png");
		hp_frame = ImageLoader.loadImage("/textures/RPG Assets/gui/Hp_frame.png");
		hp_line = ImageLoader.loadImage("/textures/RPG Assets/gui/Hp_line.png");

//		UI IMAGES

		start_button = new BufferedImage[2];
		start_button[0] = ImageLoader.loadImage("/textures/RPG Assets/UI/startoff.png");
		start_button[1] = ImageLoader.loadImage("/textures/RPG Assets/UI/starton.png");

		settings_button = new BufferedImage[2];
		settings_button[0] = ImageLoader.loadImage("/textures/RPG Assets/UI/settingsoff.png");
		settings_button[1] = ImageLoader.loadImage("/textures/RPG Assets/UI/settingson.png");

		exit_button = new BufferedImage[2];
		exit_button[0] = ImageLoader.loadImage("/textures/RPG Assets/UI/exitoff.png");
		exit_button[1] = ImageLoader.loadImage("/textures/RPG Assets/UI/exiton.png");

//		COMBAT SKILL ICONS

		basicAttack = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_sword_hit.png");
		neckStab = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_Blood_splash.png");
		poisonBlades = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_comb_bit.png");
		fireball = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_Forward_forge.png");
		freezeBolt = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_Forward_freeze.png");
		earthSpikes = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_stone_emerge.png");
		littleMeteorites = ImageLoader.loadImage("/textures/RPG Assets/Tazo_2D/Icon/S_simple_bomn.png");

//		PLAYER ARRAYS

		player_down = new BufferedImage[4];
		player_left = new BufferedImage[4];
		player_right = new BufferedImage[4];
		player_up = new BufferedImage[4];

		damla_down = new BufferedImage[4];
		damla_left = new BufferedImage[4];
		damla_right = new BufferedImage[4];
		damla_up = new BufferedImage[4];

//		TREES

		greenTree = trees.crop(0, 0, widthBE, heightBE);
		fallTree = trees.crop(right * 4, 0, widthBE, heightBE);
		darkgTree = trees.crop(right * 8, 0, widthBE, heightBE);
		deadTree = trees.crop(right * 12, 0, widthBE, heightBE);

//		TILES

		woid = poorWallMid = ImageLoader.loadImage("/textures/RPG Assets/house/void.png");
		grass = tiles.crop(0, 0, widthP, heightP);
		darkGrass = tiles.crop(right * 2, 0, widthP, heightP);
		lightGrass = tiles.crop(right * 4, 0, widthP, heightP);
		hallowGrass = tiles.crop(right * 6, 0, widthP, heightP);
		dirt = tiles.crop(right * 10, 0, widthP, heightP);
		sand = tiles.crop(right * 12, 0, widthP, heightP);
		lightDirt = tiles.crop(right * 8, 0, widthP, heightP);
		gravel = tiles.crop(right * 14, 0, widthP, heightP);

//		ROOF

		roof1 = roof.crop(0, 0, widthP, heightP);
		roof2 = roof.crop(0, widthP, widthP, heightP);
		roof3 = roof.crop(0, widthP * 2, widthP, heightP);
		roof4 = roof.crop(0, widthP * 3, widthP, heightP);

//		HOUSE

		poorWallMid = ImageLoader.loadImage("/textures/RPG Assets/house/poorWallMid.png");
		poorWallEnd = ImageLoader.loadImage("/textures/RPG Assets/house/poorWallEnd.png");
		poorWallMidDown = ImageLoader.loadImage("/textures/RPG Assets/house/poorWallMidDown.png");
		poorWallEndDown = ImageLoader.loadImage("/textures/RPG Assets/house/poorWallEndDown.png");
		poorSqrTable = ImageLoader.loadImage("/textures/RPG Assets/house/poorSqrTable.png");
		poorRndTable = ImageLoader.loadImage("/textures/RPG Assets/house/poorRndTable.png");
		poorStool = ImageLoader.loadImage("/textures/RPG Assets/house/poorStool.png");
		poorDrawer = ImageLoader.loadImage("/textures/RPG Assets/house/poorDrawer.png");
		poorClock = ImageLoader.loadImage("/textures/RPG Assets/house/poorClock.png");
		poorBed = ImageLoader.loadImage("/textures/RPG Assets/house/poorBed.png");
		basicPicture = ImageLoader.loadImage("/textures/RPG Assets/house/basicPicture.png");
		portrait = ImageLoader.loadImage("/textures/RPG Assets/house/portrait.png");
		poorFireplace = ImageLoader.loadImage("/textures/RPG Assets/house/poorFireplace.png");
		
		poorCarpet = ImageLoader.loadImage("/textures/RPG Assets/house/carpet.png");
		fancyBed = ImageLoader.loadImage("/textures/RPG Assets/house/fancyBed.png");
		firePlace = ImageLoader.loadImage("/textures/RPG Assets/house/firePlace.png");
		normalBed = ImageLoader.loadImage("/textures/RPG Assets/house/normalBed.png");
		map = ImageLoader.loadImage("/textures/RPG Assets/house/map.png");
		
		littleWindow = windows.crop(0, 7, 28, 30);
		bigWindow = windows.crop(31, 3, 28, 34);
		fancyWindow = windows.crop(63, 0, 28, 37);
		
		sink = kitchenPoor.crop(64, 0, 32, 32);
		oven = kitchenPoor.crop(0, 0, 32, 32);
		quadron = kitchenPoor.crop(96, 0, 31, 32);
		
		piano = ImageLoader.loadImage("/textures/RPG Assets/house/piano.png");
		
		multiDrawer = drawers.crop(0, 0, widthP, heightP);
		gardrop = drawers.crop(0, 0, widthP, heightP);
		littleDrawer = drawers.crop(0, 0, widthP, heightP);
		
		poorTable = ImageLoader.loadImage("/textures/RPG Assets/house/poorTable.png");
		
		secretWall = secretWalls.crop(0, 0, 96, 64);
		secretWall2 = secretWalls.crop(96, 0, 96, 64);
		secretDoorO = secretWalls.crop(192, 0, 32, 64);
		secretDoorC = secretWalls.crop(224, 0, 32, 64);
		inWall = ImageLoader.loadImage("/textures/RPG Assets/house/inWall.png");
		inWall2 = ImageLoader.loadImage("/textures/RPG Assets/house/inWall2.png");
		openinDoor = ImageLoader.loadImage("/textures/RPG Assets/house/openinDoor.png");
		closedinDoor = ImageLoader.loadImage("/textures/RPG Assets/house/closedinDoor.png");
		cotWallWindow = ImageLoader.loadImage("/textures/RPG Assets/house/cotWallWindow.png");

		cottageFloor = floorSheet.crop(0, 0, 32, 32);
		secretFloor = floorSheet.crop(0, 96, 32, 32);

		walltier2 = ImageLoader.loadImage("/textures/RPG Assets/house/wallt2.png");
		wallt2single = ImageLoader.loadImage("/textures/RPG Assets/house/wallt2single.png");
		wallt2end = ImageLoader.loadImage("/textures/RPG Assets/house/house.png");
		doortier2 = ImageLoader.loadImage("/textures/RPG Assets/house/doort2.png");
		doortier2open = ImageLoader.loadImage("/textures/RPG Assets/house/doort2open.png");

//		FARM

		wheat = ImageLoader.loadImage("/textures/RPG Assets/farm/wheat.png");
		pumpkin = ImageLoader.loadImage("/textures/RPG Assets/farm/pumpkin.png");
		midfarm = ImageLoader.loadImage("/textures/RPG Assets/farm/farm mid.png");
		fencehead = ImageLoader.loadImage("/textures/RPG Assets/farm/fencehead.png");
		midfence = ImageLoader.loadImage("/textures/RPG Assets/farm/mid fence.png");

//		EFFECTS

		burnEffect[0] = burn.crop(0, 0, 10, 26);
		burnEffect[1] = burn.crop(10, 0, 10, 26);
		burnEffect[2] = burn.crop(20, 0, 10, 26);
		burnEffect[3] = burn.crop(30, 0, 10, 26);
		burnEffect[4] = burn.crop(40, 0, 10, 26);
		burnEffect[5] = burn.crop(50, 0, 10, 26);
		burnEffect[6] = burn.crop(60, 0, 10, 26);
		burnEffect[7] = burn.crop(70, 0, 10, 26);
		burnEffect[8] = burn.crop(80, 0, 10, 26);
		burnEffect[9] = burn.crop(90, 0, 10, 26);

		poisonEffect[0] = poison.crop(0, 0, 9, 25);
		poisonEffect[1] = poison.crop(9, 0, 9, 25);
		poisonEffect[2] = poison.crop(18, 0, 9, 25);
		poisonEffect[3] = poison.crop(27, 0, 9, 25);
		poisonEffect[4] = poison.crop(36, 0, 9, 25);
		poisonEffect[5] = poison.crop(45, 0, 9, 25);
		poisonEffect[6] = poison.crop(54, 0, 9, 25);
		poisonEffect[7] = poison.crop(63, 0, 9, 25);
		poisonEffect[8] = poison.crop(72, 0, 9, 25);
		poisonEffect[9] = poison.crop(81, 0, 9, 25);

		freezeEffect[0] = freeze.crop(0, 0, 9, 24);
		freezeEffect[1] = freeze.crop(9, 0, 9, 24);
		freezeEffect[2] = freeze.crop(18, 0, 9, 24);
		freezeEffect[3] = freeze.crop(27, 0, 9, 24);
		freezeEffect[4] = freeze.crop(36, 0, 9, 24);
		freezeEffect[5] = freeze.crop(45, 0, 9, 24);
		freezeEffect[6] = freeze.crop(54, 0, 9, 24);
		freezeEffect[7] = freeze.crop(63, 0, 9, 24);
		freezeEffect[8] = freeze.crop(72, 0, 9, 24);
		freezeEffect[9] = freeze.crop(81, 0, 9, 24);

//		PLAYER ANIMATIONS

		player_down[0] = peasantsheet.crop(widthP, 0, heightP, widthP);
		player_down[1] = peasantsheet.crop(0, 0, heightP, widthP);
		player_down[2] = peasantsheet.crop(widthP, 0, heightP, widthP);
		player_down[3] = peasantsheet.crop(widthP * 2, 0, heightP, widthP);

		player_left[0] = peasantsheet.crop(widthP, heightP, heightP, widthP);
		player_left[1] = peasantsheet.crop(0, heightP, heightP, widthP);
		player_left[2] = peasantsheet.crop(widthP, heightP, heightP, widthP);
		player_left[3] = peasantsheet.crop(widthP * 2, heightP, heightP, widthP);

		player_right[0] = peasantsheet.crop(widthP, heightP * 2, heightP, widthP);
		player_right[1] = peasantsheet.crop(0, heightP * 2, heightP, widthP);
		player_right[2] = peasantsheet.crop(widthP, heightP * 2, heightP, widthP);
		player_right[3] = peasantsheet.crop(widthP * 2, heightP * 2, heightP, widthP);

		player_up[0] = peasantsheet.crop(widthP, heightP * 3, heightP, widthP);
		player_up[1] = peasantsheet.crop(0, heightP * 3, heightP, widthP);
		player_up[2] = peasantsheet.crop(widthP, heightP * 3, heightP, widthP);
		player_up[3] = peasantsheet.crop(widthP * 2, heightP * 3, heightP, widthP);

//		DAMLA ANIMATIONS

		damla_down[0] = damla.crop(widthP, 0, heightP, widthP);
		damla_down[1] = damla.crop(0, 0, heightP, widthP);
		damla_down[2] = damla.crop(widthP, 0, heightP, widthP);
		damla_down[3] = damla.crop(widthP * 2, 0, heightP, widthP);

		damla_left[0] = damla.crop(widthP, heightP, heightP, widthP);
		damla_left[1] = damla.crop(0, heightP, heightP, widthP);
		damla_left[2] = damla.crop(widthP, heightP, heightP, widthP);
		damla_left[3] = damla.crop(widthP * 2, heightP, heightP, widthP);

		damla_right[0] = damla.crop(widthP, heightP * 2, heightP, widthP);
		damla_right[1] = damla.crop(0, heightP * 2, heightP, widthP);
		damla_right[2] = damla.crop(widthP, heightP * 2, heightP, widthP);
		damla_right[3] = damla.crop(widthP * 2, heightP * 2, heightP, widthP);

		damla_up[0] = damla.crop(widthP, heightP * 3, heightP, widthP);
		damla_up[1] = damla.crop(0, heightP * 3, heightP, widthP);
		damla_up[2] = damla.crop(widthP, heightP * 3, heightP, widthP);
		damla_up[3] = damla.crop(widthP * 2, heightP * 3, heightP, widthP);

//		LIGHTMADVENTURER ANIMATIONS

		lmadventurerV1_down[0] = lightmadventurerV1.crop(widthP, 0, heightP, widthP);
		lmadventurerV1_down[1] = lightmadventurerV1.crop(0, 0, heightP, widthP);
		lmadventurerV1_down[2] = lightmadventurerV1.crop(widthP, 0, heightP, widthP);
		lmadventurerV1_down[3] = lightmadventurerV1.crop(widthP * 2, 0, heightP, widthP);

		lmadventurerV1_left[0] = lightmadventurerV1.crop(widthP, heightP, heightP, widthP);
		lmadventurerV1_left[1] = lightmadventurerV1.crop(0, heightP, heightP, widthP);
		lmadventurerV1_left[2] = lightmadventurerV1.crop(widthP, heightP, heightP, widthP);
		lmadventurerV1_left[3] = lightmadventurerV1.crop(widthP * 2, heightP, heightP, widthP);

		lmadventurerV1_right[0] = lightmadventurerV1.crop(widthP, heightP * 2, heightP, widthP);
		lmadventurerV1_right[1] = lightmadventurerV1.crop(0, heightP * 2, heightP, widthP);
		lmadventurerV1_right[2] = lightmadventurerV1.crop(widthP, heightP * 2, heightP, widthP);
		lmadventurerV1_right[3] = lightmadventurerV1.crop(widthP * 2, heightP * 2, heightP, widthP);

		lmadventurerV1_up[0] = lightmadventurerV1.crop(widthP, heightP * 3, heightP, widthP);
		lmadventurerV1_up[1] = lightmadventurerV1.crop(0, heightP * 3, heightP, widthP);
		lmadventurerV1_up[2] = lightmadventurerV1.crop(widthP, heightP * 3, heightP, widthP);
		lmadventurerV1_up[3] = lightmadventurerV1.crop(widthP * 2, heightP * 3, heightP, widthP);

//	ENEMY COMBAT ANIMATIONS

//		LightBandit

		lb_ready[0] = lightBandit.crop(4 * width - 2, 0, width, height);
		lb_ready[1] = lightBandit.crop(5 * width - 2, 0, width, height);
		lb_ready[2] = lightBandit.crop(6 * width - 2, 0, width, height);
		lb_ready[3] = lightBandit.crop(6 * width - 6, 0, width, height);

		lb_standing[0] = lightBandit.crop(0, 0, width, height);
		lb_standing[1] = lightBandit.crop(width, 0, width, height);
		lb_standing[2] = lightBandit.crop(2 * width, 0, width, height);
		lb_standing[3] = lightBandit.crop(3 * width, 0, width, height);

		lb_afterHit[0] = lightBandit.crop(0, 2 * height, width - 4, height);
		lb_afterHit[1] = lightBandit.crop(width, 2 * height, width - 4, height);
		lb_afterHit[2] = lightBandit.crop(2 * width, 2 * height, width - 4, height);
		lb_afterHit[3] = lightBandit.crop(3 * width, 2 * height, width - 4, height);
		lb_afterHit[4] = lightBandit.crop(4 * width, 2 * height, width - 4, height);
		lb_afterHit[5] = lightBandit.crop(5 * width, 2 * height, width - 4, height);
		lb_afterHit[6] = lightBandit.crop(6 * width, 2 * height, width - 4, height);
		lb_afterHit[7] = lightBandit.crop(7 * width, 2 * height, width - 8, height);

		lb_revive[0] = lightBandit.crop(0, 3 * height, width, height);
		lb_revive[1] = lightBandit.crop(width, 3 * height, width, height);
		lb_revive[2] = lightBandit.crop(2 * width, 3 * height, width, height);
		lb_revive[3] = lightBandit.crop(3 * width, 3 * height, width, height);
		lb_revive[4] = lightBandit.crop(4 * width, 3 * height, width, height);
		lb_revive[5] = lightBandit.crop(5 * width, 3 * height, width, height);
		lb_revive[6] = lightBandit.crop(6 * width, 3 * height, width, height);
		lb_revive[7] = lightBandit.crop(7 * width, 3 * height, width, height);
		lb_revive[8] = lightBandit.crop(0, 0, width, height);

		lb_hurt[0] = lightBandit.crop(0, 0, width, height);
		lb_hurt[1] = lightBandit.crop(0, 4 * height, width, height);
		lb_hurt[2] = lightBandit.crop(width, 4 * height, width, height);
		lb_hurt[3] = lightBandit.crop(0, 4 * height, width, height);
		lb_hurt[4] = lightBandit.crop(0, 0, width, height);

		lb_dead[0] = lightBandit.crop(0, 0, width, height);
		lb_dead[1] = lightBandit.crop(width, 4 * height, width, height);
		lb_dead[2] = lightBandit.crop(2 * width, 4 * height, width, height);
		lb_dead[3] = lightBandit.crop(3 * width, 4 * height, width, height);

//		heavyBandit

		hb_ready[0] = heavyBandit.crop(4 * width - 2, 0, width, height);
		hb_ready[1] = heavyBandit.crop(5 * width - 2, 0, width, height);
		hb_ready[2] = heavyBandit.crop(6 * width - 2, 0, width, height);
		hb_ready[3] = heavyBandit.crop(6 * width - 6, 0, width, height);

		hb_standing[0] = heavyBandit.crop(0, 0, width, height);
		hb_standing[1] = heavyBandit.crop(width, 0, width, height);
		hb_standing[2] = heavyBandit.crop(2 * width, 0, width, height);
		hb_standing[3] = heavyBandit.crop(3 * width, 0, width, height);

		hb_afterHit[0] = heavyBandit.crop(0, 2 * height, width - 4, height);
		hb_afterHit[1] = heavyBandit.crop(width, 2 * height, width - 4, height);
		hb_afterHit[2] = heavyBandit.crop(2 * width, 2 * height, width - 4, height);
		hb_afterHit[3] = heavyBandit.crop(3 * width, 2 * height, width - 4, height);
		hb_afterHit[4] = heavyBandit.crop(4 * width, 2 * height, width - 4, height);
		hb_afterHit[5] = heavyBandit.crop(5 * width, 2 * height, width - 4, height);
		hb_afterHit[6] = heavyBandit.crop(6 * width, 2 * height, width - 4, height);
		hb_afterHit[7] = heavyBandit.crop(7 * width, 2 * height, width - 8, height);

		hb_revive[0] = heavyBandit.crop(0, 3 * height, width, height);
		hb_revive[1] = heavyBandit.crop(width, 3 * height, width, height);
		hb_revive[2] = heavyBandit.crop(2 * width, 3 * height, width, height);
		hb_revive[3] = heavyBandit.crop(3 * width, 3 * height, width, height);
		hb_revive[4] = heavyBandit.crop(4 * width, 3 * height, width, height);
		hb_revive[5] = heavyBandit.crop(5 * width, 3 * height, width, height);
		hb_revive[6] = heavyBandit.crop(6 * width, 3 * height, width, height);
		hb_revive[7] = heavyBandit.crop(7 * width, 3 * height, width, height);
		hb_revive[8] = heavyBandit.crop(0, 0, width, height);

		hb_hurt[0] = heavyBandit.crop(0, 0, width, height);
		hb_hurt[1] = heavyBandit.crop(0, 4 * height, width, height);
		hb_hurt[2] = heavyBandit.crop(width, 4 * height, width, height);
		hb_hurt[3] = heavyBandit.crop(0, 4 * height, width, height);
		hb_hurt[4] = heavyBandit.crop(0, 0, width, height);

		hb_dead[0] = heavyBandit.crop(0, 0, width, height);
		hb_dead[1] = heavyBandit.crop(width, 4 * height, width, height);
		hb_dead[2] = heavyBandit.crop(2 * width, 4 * height, width, height);
		hb_dead[3] = heavyBandit.crop(3 * width, 4 * height, width, height);

//	ANIMAL ANIMATIONS

//		Black Cat

		bcat_down[0] = blackCat.crop(widthP, 0, heightP, widthP);
		bcat_down[1] = blackCat.crop(0, 0, heightP, widthP);
		bcat_down[2] = blackCat.crop(widthP, 0, heightP, widthP);
		bcat_down[3] = blackCat.crop(widthP * 2, 0, heightP, widthP);

		bcat_left[0] = blackCat.crop(widthP, heightP, heightP, widthP);
		bcat_left[1] = blackCat.crop(0, heightP, heightP, widthP);
		bcat_left[2] = blackCat.crop(widthP, heightP, heightP, widthP);
		bcat_left[3] = blackCat.crop(widthP * 2, heightP, heightP, widthP);

		bcat_right[0] = blackCat.crop(widthP, heightP * 2, heightP, widthP);
		bcat_right[1] = blackCat.crop(0, heightP * 2, heightP, widthP);
		bcat_right[2] = blackCat.crop(widthP, heightP * 2, heightP, widthP);
		bcat_right[3] = blackCat.crop(widthP * 2, heightP * 2, heightP, widthP);

		bcat_up[0] = blackCat.crop(widthP, heightP * 3, heightP, widthP);
		bcat_up[1] = blackCat.crop(0, heightP * 3, heightP, widthP);
		bcat_up[2] = blackCat.crop(widthP, heightP * 3, heightP, widthP);
		bcat_up[3] = blackCat.crop(widthP * 2, heightP * 3, heightP, widthP);

//		yellow Cat

		ycat_down[0] = yellowCat.crop(widthP, 0, heightP, widthP);
		ycat_down[1] = yellowCat.crop(0, 0, heightP, widthP);
		ycat_down[2] = yellowCat.crop(widthP, 0, heightP, widthP);
		ycat_down[3] = yellowCat.crop(widthP * 2, 0, heightP, widthP);

		ycat_left[0] = yellowCat.crop(widthP, heightP, heightP, widthP);
		ycat_left[1] = yellowCat.crop(0, heightP, heightP, widthP);
		ycat_left[2] = yellowCat.crop(widthP, heightP, heightP, widthP);
		ycat_left[3] = yellowCat.crop(widthP * 2, heightP, heightP, widthP);

		ycat_right[0] = yellowCat.crop(widthP, heightP * 2, heightP, widthP);
		ycat_right[1] = yellowCat.crop(0, heightP * 2, heightP, widthP);
		ycat_right[2] = yellowCat.crop(widthP, heightP * 2, heightP, widthP);
		ycat_right[3] = yellowCat.crop(widthP * 2, heightP * 2, heightP, widthP);

		ycat_up[0] = yellowCat.crop(widthP, heightP * 3, heightP, widthP);
		ycat_up[1] = yellowCat.crop(0, heightP * 3, heightP, widthP);
		ycat_up[2] = yellowCat.crop(widthP, heightP * 3, heightP, widthP);
		ycat_up[3] = yellowCat.crop(widthP * 2, heightP * 3, heightP, widthP);

//		White Cat

		wcat_down[0] = whiteCat.crop(widthP, 0, heightP, widthP);
		wcat_down[1] = whiteCat.crop(0, 0, heightP, widthP);
		wcat_down[2] = whiteCat.crop(widthP, 0, heightP, widthP);
		wcat_down[3] = whiteCat.crop(widthP * 2, 0, heightP, widthP);

		wcat_left[0] = whiteCat.crop(widthP, heightP, heightP, widthP);
		wcat_left[1] = whiteCat.crop(0, heightP, heightP, widthP);
		wcat_left[2] = whiteCat.crop(widthP, heightP, heightP, widthP);
		wcat_left[3] = whiteCat.crop(widthP * 2, heightP, heightP, widthP);

		wcat_right[0] = whiteCat.crop(widthP, heightP * 2, heightP, widthP);
		wcat_right[1] = whiteCat.crop(0, heightP * 2, heightP, widthP);
		wcat_right[2] = whiteCat.crop(widthP, heightP * 2, heightP, widthP);
		wcat_right[3] = whiteCat.crop(widthP * 2, heightP * 2, heightP, widthP);

		wcat_up[0] = whiteCat.crop(widthP, heightP * 3, heightP, widthP);
		wcat_up[1] = whiteCat.crop(0, heightP * 3, heightP, widthP);
		wcat_up[2] = whiteCat.crop(widthP, heightP * 3, heightP, widthP);
		wcat_up[3] = whiteCat.crop(widthP * 2, heightP * 3, heightP, widthP);

//		Black Dog

		bdog_down[0] = bDog.crop(widthP, 0, heightP, widthP);
		bdog_down[1] = bDog.crop(0, 0, heightP, widthP);
		bdog_down[2] = bDog.crop(widthP, 0, heightP, widthP);
		bdog_down[3] = bDog.crop(widthP * 2, 0, heightP, widthP);

		bdog_left[0] = bDog.crop(widthP, heightP, heightP, widthP);
		bdog_left[1] = bDog.crop(0, heightP, heightP, widthP);
		bdog_left[2] = bDog.crop(widthP, heightP, heightP, widthP);
		bdog_left[3] = bDog.crop(widthP * 2, heightP, heightP, widthP);

		bdog_right[0] = bDog.crop(widthP, heightP * 2, heightP, widthP);
		bdog_right[1] = bDog.crop(0, heightP * 2, heightP, widthP);
		bdog_right[2] = bDog.crop(widthP, heightP * 2, heightP, widthP);
		bdog_right[3] = bDog.crop(widthP * 2, heightP * 2, heightP, widthP);

		bdog_up[0] = bDog.crop(widthP, heightP * 3, heightP, widthP);
		bdog_up[1] = bDog.crop(0, heightP * 3, heightP, widthP);
		bdog_up[2] = bDog.crop(widthP, heightP * 3, heightP, widthP);
		bdog_up[3] = bDog.crop(widthP * 2, heightP * 3, heightP, widthP);

//		Gray Dog

		gdog_down[0] = gDog.crop(widthP, 0, heightP, widthP);
		gdog_down[1] = gDog.crop(0, 0, heightP, widthP);
		gdog_down[2] = gDog.crop(widthP, 0, heightP, widthP);
		gdog_down[3] = gDog.crop(widthP * 2, 0, heightP, widthP);

		gdog_left[0] = gDog.crop(widthP, heightP, heightP, widthP);
		gdog_left[1] = gDog.crop(0, heightP, heightP, widthP);
		gdog_left[2] = gDog.crop(widthP, heightP, heightP, widthP);
		gdog_left[3] = gDog.crop(widthP * 2, heightP, heightP, widthP);

		gdog_right[0] = gDog.crop(widthP, heightP * 2, heightP, widthP);
		gdog_right[1] = gDog.crop(0, heightP * 2, heightP, widthP);
		gdog_right[2] = gDog.crop(widthP, heightP * 2, heightP, widthP);
		gdog_right[3] = gDog.crop(widthP * 2, heightP * 2, heightP, widthP);

		gdog_up[0] = gDog.crop(widthP, heightP * 3, heightP, widthP);
		gdog_up[1] = gDog.crop(0, heightP * 3, heightP, widthP);
		gdog_up[2] = gDog.crop(widthP, heightP * 3, heightP, widthP);
		gdog_up[3] = gDog.crop(widthP * 2, heightP * 3, heightP, widthP);

//		Yellow Dog

		ydog_down[0] = yDog.crop(widthP, 0, heightP, widthP);
		ydog_down[1] = yDog.crop(0, 0, heightP, widthP);
		ydog_down[2] = yDog.crop(widthP, 0, heightP, widthP);
		ydog_down[3] = yDog.crop(widthP * 2, 0, heightP, widthP);

		ydog_left[0] = yDog.crop(widthP, heightP, heightP, widthP);
		ydog_left[1] = yDog.crop(0, heightP, heightP, widthP);
		ydog_left[2] = yDog.crop(widthP, heightP, heightP, widthP);
		ydog_left[3] = yDog.crop(widthP * 2, heightP, heightP, widthP);

		ydog_right[0] = yDog.crop(widthP, heightP * 2, heightP, widthP);
		ydog_right[1] = yDog.crop(0, heightP * 2, heightP, widthP);
		ydog_right[2] = yDog.crop(widthP, heightP * 2, heightP, widthP);
		ydog_right[3] = yDog.crop(widthP * 2, heightP * 2, heightP, widthP);

		ydog_up[0] = yDog.crop(widthP, heightP * 3, heightP, widthP);
		ydog_up[1] = yDog.crop(0, heightP * 3, heightP, widthP);
		ydog_up[2] = yDog.crop(widthP, heightP * 3, heightP, widthP);
		ydog_up[3] = yDog.crop(widthP * 2, heightP * 3, heightP, widthP);

//		OLD Walls

		wall = town.crop(0, 0, heightT, widthT);
		openDoor = town.crop(right, 0, heightT, widthT);
		closedDoor = town.crop(right * 2, 0, heightT, widthT);
		openWind = town.crop(right * 3, 0, heightT, widthT);
		closedWind = town.crop(right * 4, 0, heightT, widthT);
		leftWallEnd = town.crop(right * 5, 0, heightT, widthT);
		rightWallEnd = town.crop(right * 6, 0, heightT, widthT);
		dirtWall = town.crop(right * 7, 0, heightT, widthT);
		dirtWallTop = town.crop(right * 8, 0, heightT, widthT);
		dirtWallSingle = town.crop(right * 9, 0, heightT, widthT);

//		OLD SecondRow

		shortGrass = town.crop(0, down, heightT, widthT);
		longGrass = town.crop(right, down, heightT, widthT);
		barrel = town.crop(right * 2, 0, heightT, widthT);
		chest = town.crop(right * 3, down, heightT, widthT);
		wellTop = town.crop(right * 4, down, heightT, widthT);
		well = town.crop(right * 5, down, heightT, widthT);
		pine = town.crop(right * 6, down, heightT, widthT);
		tree = town.crop(right * 7, down, heightT, widthT);
		bush = town.crop(right * 8, down, heightT, widthT);
		splash = town.crop(right * 9, down, heightT, widthT);

	}

}
