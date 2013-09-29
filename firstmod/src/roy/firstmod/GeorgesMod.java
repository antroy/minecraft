package roy.firstmod;

//This Import list will grow longer with each additional tutorial.
//It's not pruned between full class postings, unlike other tutorial code.
import org.objectweb.asm.commons.StaticInitMerger;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "GeorgesMod", name = "GeorgesMod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true, channels = { "GeorgesModRandom" })
public class GeorgesMod {

	public static Item blackdiamond = (new Item(605))
			.setUnlocalizedName("blackdiamond")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:blackdiamond");
	static {

		GameRegistry.registerItem(blackdiamond, "blackdiamond");
		LanguageRegistry.addName(blackdiamond, "Black Diamond");
	}
	public static Item cheese = (new ItemFood(700, 5, 0.6F, false))
			.setUnlocalizedName("cheese")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:cheese");
	static {

		GameRegistry.registerItem(cheese, "cheese");
		LanguageRegistry.addName(cheese, "Cheese");
	}
	public static Item butter = (new ItemFood(701, 6, 0.6F, false))
			.setUnlocalizedName("butter")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:butter");
	static {

		GameRegistry.registerItem(butter, "butter");
		LanguageRegistry.addName(butter, "Butter");
	}

	public static final Block oreBlackDiamond = (new BlockOreDropper(606))
			.setDropItem(606).setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundStoneFootstep)
			.setUnlocalizedName("blackdiamondore")
			.setTextureName("firstmod:black_diamond_ore");
	static {

		GameRegistry.registerBlock(oreBlackDiamond, "blackdiamondore");
		LanguageRegistry.addName(oreBlackDiamond, "Black Diamond Ore");
	}
	// WOOD(0, 59, 2.0F, 0.0F, 15),
	// STONE(1, 131, 4.0F, 1.0F, 5),
	// IRON(2, 250, 6.0F, 2.0F, 14),
	// EMERALD(3, 1561, 8.0F, 3.0F, 10),
	// GOLD(0, 32, 12.0F, 0.0F, 22);
	public static final EnumToolMaterial BLACK_DIAMOND = EnumHelper
			.addToolMaterial("BLACK_DIAMOND", 5, 5000, 10.0F, 5.0F, 50);

	public static Item blackDiamondSword = (new ItemSword(650, BLACK_DIAMOND))
			.setUnlocalizedName("blackDiamondSword").setTextureName(
					"firstmod:black_diamond_sword");
	static {

		GameRegistry.registerItem(blackDiamondSword, "black_diamond_sword");
		LanguageRegistry.addName(blackDiamondSword, "Black Diamond Sword");
	}

	public static Item blackDiamondPickaxe = (new ItemPickaxe(652,
			BLACK_DIAMOND)).setUnlocalizedName("blackDiamondPickaxe")
			.setTextureName("firstmod:black_diamond_pickaxe");
	static {

		GameRegistry.registerItem(blackDiamondPickaxe, "black_diamond_pickaxe");
		LanguageRegistry.addName(blackDiamondPickaxe, "Black Diamond Pick");
	}

	public static Item blackDiamondAxe = (new ItemAxe(651, BLACK_DIAMOND))
			.setUnlocalizedName("blackDiamondAxe").setTextureName(
					"firstmod:black_diamond_axe");
	static {

		GameRegistry.registerItem(blackDiamondAxe, "black_diamond_axe");
		LanguageRegistry.addName(blackDiamondAxe, "Black Diamond Axe");
	}

	public static Item blackDiamondShovel = (new ItemSpade(653, BLACK_DIAMOND))
			.setUnlocalizedName("blackDiamondShovel").setTextureName(
					"firstmod:black_diamond_shovel");
	static {

		GameRegistry.registerItem(blackDiamondShovel, "black_diamond_shovel");
		LanguageRegistry.addName(blackDiamondShovel, "Black Diamond Shovel");
	}

	public static Item blackDiamondHoe = (new ItemHoe(654, BLACK_DIAMOND))
			.setUnlocalizedName("blackDiamondHoe").setTextureName(
					"firstmod:black_diamond_hoe");
	static {

		GameRegistry.registerItem(blackDiamondHoe, "black_diamond_hoe");
		LanguageRegistry.addName(blackDiamondHoe, "Black Diamond Hoe");
	}

	public static Item sapphire = (new Item(607))
			.setUnlocalizedName("sapphire")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:sapphire");
	static {

		GameRegistry.registerItem(sapphire, "sapphire");
		LanguageRegistry.addName(sapphire, "Sapphire");
	}

	public static final EnumToolMaterial HEAVEN_ROD = EnumHelper
			.addToolMaterial("HEAVEN_ROD", 10, 10000, 20.0F, 10.0F, 100);

	public static Item notchSword = (new ItemSword(640, HEAVEN_ROD))
			.setUnlocalizedName("notchSword").setTextureName(
					"firstmod:notch_sword");
	static {

		GameRegistry.registerItem(notchSword, "notch_sword");
		LanguageRegistry.addName(notchSword, "Notch Sword");
	}
    
	public static final EnumToolMaterial HELL_ROD = EnumHelper.addToolMaterial(
			"HELL_ROD", 20, 20000, 40.0F, 20.0F, 200);

	public static Item herobrineSword = (new ItemSword(641, HELL_ROD))
			.setUnlocalizedName("herobrineSword")
			.setTextureName("firstmod:herobrine_sword");
	static {

		GameRegistry.registerItem(herobrineSword, "herobrine_sword");
		LanguageRegistry.addName(herobrineSword, "Herobrine Sword");
	}

	public static final EnumToolMaterial RUBY = EnumHelper.addToolMaterial(
			"RUBY", 5, 500, 10.0F, 5.0F, 50);

	public static Item rubySword = (new ItemSword(642, RUBY))
			.setUnlocalizedName("rubySword").setTextureName(
					"firstmod:ruby_sword");
	static {

		GameRegistry.registerItem(rubySword, "ruby_sword");
		LanguageRegistry.addName(rubySword, "Ruby Sword");
	}

	public static Item rubyPickaxe = (new ItemPickaxe(643, RUBY))
			.setUnlocalizedName("rubyPickaxe").setTextureName(
					"firstmod:ruby_pickaxe");
	static {

		GameRegistry.registerItem(rubyPickaxe, "ruby_pickaxe");
		LanguageRegistry.addName(rubyPickaxe, "Ruby Pick");
	}

	public static Item rubyAxe = (new ItemAxe(644, RUBY)).setUnlocalizedName(
			"rubyAxe").setTextureName("firstmod:ruby_axe");
	static {

		GameRegistry.registerItem(rubyAxe, "ruby_axe");
		LanguageRegistry.addName(rubyAxe, "Ruby Axe");
	}

	public static Item rubyShovel = (new ItemSpade(645, RUBY))
			.setUnlocalizedName("rubyShovel")
			.setTextureName("firstmod:ruby_shovel");
	static {

		GameRegistry.registerItem(rubyShovel, "ruby_shovel");
		LanguageRegistry.addName(rubyShovel, "Ruby Shovel");
	}
	
	public static Item rubyHoe = (new ItemHoe(646, RUBY))
			.setUnlocalizedName("rubyHoe")
			.setTextureName("firstmod:ruby_hoe");
	static {
		
		GameRegistry.registerItem(rubyHoe, "ruby_hoe");
		LanguageRegistry.addName(rubyHoe, "Ruby Hoe");
	}
	
	public static final EnumToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 5, 500, 10.0F, 5.0F, 50);
	
	public static Item sapphireSword = (new ItemSword(647, SAPPHIRE))
		    .setUnlocalizedName("sapphireSword")
		    .setTextureName("firstmod:sapphire_sword");
	static {
		
		GameRegistry.registerItem(sapphireSword, "sapphire_sword");
		LanguageRegistry.addName(sapphireSword, "Sapphire Sword");
	}
	
	public static Item sapphirePickaxe = (new ItemPickaxe(648, SAPPHIRE))
			.setUnlocalizedName("sapphirePickaxe")
			.setTextureName("firstmod:sapphire_pickaxe");
	static {
		
		GameRegistry.registerItem(sapphirePickaxe, "sapphire_pickaxe");
		LanguageRegistry.addName(sapphirePickaxe, "Sapphire Pick");
	}
	
	public static Item amulet = (new Item(1000)).setUnlocalizedName("amulet")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:amulet");
	static {
		
		GameRegistry.registerItem(amulet, "amulet");
		LanguageRegistry.addName(amulet, "Notch's Amulet");
	}
	
	public static Item amuletBase = (new Item(1001)).setUnlocalizedName("amuletBase")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:amulet_base");
	static {
		
		GameRegistry.registerItem(amuletBase, "amulet_Base");
		LanguageRegistry.addName(amuletBase, "Notch's Amulet Base");
	}
	
	public static Item herobrineAmulet = (new Item(1002)).setUnlocalizedName("herobrineAmulet")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:herobrine_amulet");
	static {
		
		GameRegistry.registerItem(herobrineAmulet, "herobrine_Amulet");
		LanguageRegistry.addName(herobrineAmulet, "Herobrine's Amulet");
	}
	
	public static Item herobrineAmuletBase = (new Item(1003)).setUnlocalizedName("herobrineAmuletBase")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:herobrine_amulet_base");
	static {
		
		GameRegistry.registerItem(herobrineAmuletBase, "amulet_Base");
		LanguageRegistry.addName(herobrineAmuletBase, "Herobrine's Amulet Base");
	}

	public static Item devilDust = (new Item(602)).setUnlocalizedName("devildust")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:devil_dust");
	static {

		GameRegistry.registerItem(devilDust, "devil_Dust");
		LanguageRegistry.addName(devilDust, "Devil Dust");
	}

	public static Item heavenrod = (new Item(600))
			.setUnlocalizedName("heavenrod")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:heaven_rod");
	static {

		GameRegistry.registerItem(heavenrod, "heaven_rod");
		LanguageRegistry.addName(heavenrod, "Heaven Rod");
	}
	
	public static Item devilrod = (new Item(603)).setUnlocalizedName("devilrod")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:devil_rod");
	static {
		GameRegistry.registerItem(devilrod, "devil_rod");
		LanguageRegistry.addName(devilrod, "Devil Rod");
	}

	public static Item hellrod = (new Item(601)).setUnlocalizedName("hellrod")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:hell_rod");
	static {

		GameRegistry.registerItem(hellrod, "hell_rod");
		LanguageRegistry.addName(hellrod, "Hell Rod");
	}
	
	public static Item powerrod = (new Item(609)).setUnlocalizedName("powerRod")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:power_rod");
	static {
		
		GameRegistry.registerItem(powerrod, "power_rod");
		LanguageRegistry.addName(powerrod, "Power Rod");
	}	

	public static Item ruby = (new Item(608)).setUnlocalizedName("ruby")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:ruby");
	static {

		GameRegistry.registerItem(ruby, "ruby");
		LanguageRegistry.addName(ruby, "Ruby");
	}
	
	public static final EnumToolMaterial EMERALD = EnumHelper
			.addToolMaterial("EMERALD", 5000000, 2111111111, 80.0F, 40.0F, 10000);

	public static Item powerSword = (new ItemSword(650, EMERALD))
			.setUnlocalizedName("powerSword").setTextureName(
					"firstmod:power_sword");
	static {

		GameRegistry.registerItem(powerSword, "power_sword");
		LanguageRegistry.addName(powerSword, "Power Sword");
	}
	
	public static Item powerstone = (new Item(610)).setUnlocalizedName("powerStone")
			.setCreativeTab(CreativeTabs.tabMaterials)
			.setTextureName("firstmod:power_stone");
	static {

		GameRegistry.registerItem(powerstone, "power_stone");
		LanguageRegistry.addName(powerstone, "Power Stone");
	}

	@Instance("GeorgesMod")
	public static GeorgesMod instance;

	@SidedProxy(clientSide = "roy.firstmod.client.ClientProxy", serverSide = "roy.firstmod.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();

     ItemStack dirtStack = new ItemStack(Block.dirt);
     ItemStack diamondStack = new ItemStack(Item.diamond);
     ItemStack leatherStack = new ItemStack(Item.leather);
     ItemStack stringStack = new ItemStack(Item.silk);
     ItemStack IronStack = new ItemStack(Item.ingotIron);
     ItemStack SaddleStack = new ItemStack(Item.saddle);
     ItemStack GoldStack = new ItemStack(Item.ingotGold);
     ItemStack HopperStack = new ItemStack(Block.hopperBlock);
     ItemStack IronBlockStack = new ItemStack(Block.blockIron);
     ItemStack dragonEggStack = new ItemStack(Block.dragonEgg);
     ItemStack endPortalFrameStack = new ItemStack(Block.endPortalFrame);
     ItemStack gunpowderStack = new ItemStack(Item.gunpowder);
     ItemStack tntStack = new ItemStack(Block.tnt);
     ItemStack endstone = new ItemStack(Block.whiteStone);
     ItemStack torchRedstoneActiveStack = new ItemStack(Block.torchRedstoneActive);
     ItemStack enderPearlStack = new ItemStack(Item.enderPearl);
     ItemStack eggStack = new ItemStack(Item.egg);
     ItemStack milkStack = new ItemStack(Item.bucketMilk);
     ItemStack cheeseStack = new ItemStack(cheese);
     ItemStack blackDiamondStack = new ItemStack(blackdiamond);
     ItemStack redstoneStack = new ItemStack(Item.redstone);
     ItemStack diamondsword = new ItemStack(Item.swordDiamond);
     ItemStack stickStack = new ItemStack(Item.stick);
     ItemStack butterStack = new ItemStack(butter);
     ItemStack blackDiamondOreStack = new ItemStack(oreBlackDiamond);
     ItemStack netherStarStack = new ItemStack(Item.netherStar);
     ItemStack emeraldStack = new ItemStack(Item.emerald);
     ItemStack heavenRodStack = new ItemStack(heavenrod);
     ItemStack blazePowderStack = new ItemStack(Item.blazePowder);
     ItemStack bucketoflava = new ItemStack(Item.bucketLava);
     ItemStack hellrodStack = new ItemStack(hellrod);
     ItemStack rubyStack = new ItemStack(ruby);
     ItemStack magmaCreamStack = new ItemStack(Item.magmaCream);
     ItemStack devilDustStack = new ItemStack(devilDust);
     ItemStack devilRodStack = new ItemStack(devilrod);
     ItemStack sapphireStack = new ItemStack(sapphire);
     ItemStack glowstoneStack = new ItemStack(Item.glowstone);
     ItemStack amuletbase = new ItemStack(amuletBase);
     


     GameRegistry.addRecipe(new ItemStack(Item.saddle), 
    		 "x x", 
    		 "xxx", 
    		 " y ",
             'x', leatherStack, 'y', stringStack);
     
     GameRegistry.addRecipe(new ItemStack(Item.helmetChain),
    		 " x ",
    		 "x x",
    		 "   ",
    		 'x', IronStack);
     GameRegistry.addRecipe(new ItemStack(Item.plateChain),
    		 "x x",
    		 " x ",
    		 "x x",
    		 'x', IronStack);
     GameRegistry.addRecipe(new ItemStack(Item.legsChain),
    		 " x ",
    		 "x x",
    		 "x x",
    		 'x', IronStack);
     GameRegistry.addRecipe(new ItemStack(Item.horseArmorDiamond),
    		 "xyx",
    		 "xxx",
    		 "zzz",
    		 'x', diamondStack, 'y', SaddleStack, 'z', leatherStack);
     GameRegistry.addRecipe(new ItemStack(Item.horseArmorIron),
    		 "xyx",
    		 "xxx",
    		 "zzz",
    		 'x', IronStack, 'y', SaddleStack, 'z', leatherStack);
     GameRegistry.addRecipe(new ItemStack(Item.horseArmorGold),
    		 "xyx",
    		 "xxx",
    		 "zzz",
    		 'x', GoldStack, 'y', SaddleStack, 'z', leatherStack);
	GameRegistry.addRecipe(new ItemStack(Item.minecartHopper),
    		 "xyx",
    		 "xxx",
    		 "zyz",
    		 'x', IronStack, 'y', HopperStack, 'z', IronBlockStack);
	GameRegistry.addRecipe(new ItemStack(Item.netherStar),
			"xxx",
			"xyx",
			"xxx",
			'x', endstone, 'y', endPortalFrameStack);
	GameRegistry.addRecipe(new ItemStack(Item.minecartTnt),
			"xyx",
			"xxx",
			"zyz",
			'x', gunpowderStack, 'y', tntStack, 'z', torchRedstoneActiveStack);
	GameRegistry.addRecipe(new ItemStack(Block.endPortalFrame),
			"xxx",
			"xyx",
			"xxx",
			'x', endstone, 'y', enderPearlStack);
	GameRegistry.addRecipe(new ItemStack(cheese),
			"   ",
			"xyx",
			"   ",
			'x', butterStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(cheese),
			"xyx",
			"   ",
			"   ",
	        'x', butterStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(cheese),
			"   ",
			"   ",
			"xyx",
			'x', butterStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(Item.bootsChain),
			"   ",
			"   ",
			"x x",
			'x', IronStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"xyx",
			"   ",
			"   ",
			'x', eggStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"   ",
			"xyx",
			"   ",
	'x', eggStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"   ",
			"   ",
			"xyx",
			'x', eggStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondSword),
			"xxy",
			"xzy",
			"xyy",
			'x', blackDiamondStack, 'y', redstoneStack, 'z', diamondsword);
	GameRegistry.addRecipe(new ItemStack(blackDiamondPickaxe),
			"xxx",
			" y ",
			" y ",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondAxe),
			"xx ",
			"xy ",
			" y ",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondAxe),
			" xx",
			" xy",
			"  y",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondShovel),
			"x  ",
			"y  ",
			"y  ",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondShovel),
			" x ",
			" y ",
			" y ",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondShovel),
			"  x",
			"  y",
			"  y",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondHoe),
			" xx",
			"  y",
			"  y",
			'x', blackDiamondStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"x  ",
			"   ",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			" x ",
			"   ",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"  x",
			"   ",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			"x  ",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			" x ",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			"  x",
			"   ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			"   ",
			"x  ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			"   ",
			" x ",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(blackdiamond),
			"   ",
			"   ",
			"  x",
			'x', blackDiamondOreStack);
	GameRegistry.addRecipe(new ItemStack(heavenrod),
			"xxx",
			"yyy",
			"xxx",
			'x', netherStarStack, 'y', emeraldStack);
	GameRegistry.addRecipe(new ItemStack(notchSword),
			"xxx",
			"yy ",
			"z  ",
			'x', netherStarStack, 'y', emeraldStack, 'z', heavenRodStack);
	GameRegistry.addRecipe(new ItemStack(hellrod),
			"xxx",
			"yyy",
			"xxx",
			'x', blazePowderStack, 'y', bucketoflava);
	GameRegistry.addRecipe(new ItemStack(herobrineSword),
			"xxx",
			"yy ",
			"z  ",
			'x', blazePowderStack, 'y', bucketoflava, 'z', hellrodStack);
	GameRegistry.addRecipe(new ItemStack(rubySword),
			"x  ",
			"x  ",
			"y  ",
			'x', rubyStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(rubySword),
			" x ",
			" x ",
			" y ",
			'x', rubyStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(rubySword),
			"  x",
			"  x",
			"  y",
			'x', rubyStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(rubyPickaxe),
			"xxx",
			" y ",
			" y ",
			'x', rubyStack, 'y', stickStack);
	GameRegistry.addRecipe(new ItemStack(devilDust),
			"xxx",
			"xyx",
			"xxx",
			'x', blazePowderStack, 'y', magmaCreamStack);
	GameRegistry.addRecipe(new ItemStack(devilrod),
			"x  ",
			"x  ",
			"   ",
			'x', devilDustStack);
	GameRegistry.addRecipe(new ItemStack(devilrod),
			"   ",
			"x  ",
			"x  ",
			'x', devilDustStack);
	GameRegistry.addRecipe(new ItemStack(devilrod),
			"  x",
			"  x",
			"   ",
			'x', devilDustStack);
	GameRegistry.addRecipe(new ItemStack(devilrod),
			"   ",
			"  x",
			"  x",
			'x', devilDustStack);
	GameRegistry.addRecipe(new ItemStack(powerrod),
			" z ",
			" y ",
			" x ",
			'x', heavenRodStack, 'y', hellrodStack, 'z',  devilRodStack);
	GameRegistry.addRecipe(new ItemStack(powerstone),
			"xzx",
			"xyx",
			"xax",
			'x', glowstoneStack, 'y', diamondStack, 'z',  rubyStack, 'a', sapphireStack);
    GameRegistry.addRecipe(new ItemStack(powerSword),
			" x ",
			" y ",
			" z ",
			'x', powerstone, 'y', devilDust, 'z', powerrod);
    GameRegistry.addRecipe(new ItemStack(amulet),
    		"x  ",
    		"x  ",
    		"y  ",
    		'x', stringStack, 'y', amuletbase);
    GameRegistry.addRecipe(new ItemStack(amulet),
    		" x ",
    		" x ",
    		" y ",
    		'x', stringStack, 'y', amuletbase);
    GameRegistry.addRecipe(new ItemStack(amulet),
    		"  x",
    		"  x",
    		"  y",
    		'x', stringStack, 'y', amuletbase);
			
		
		// GameRegistry.addSmelting(Block.stone.blockID, new ItemStack(
		// Block.stoneBrick), 0.1f);
		// FurnaceRecipes.smelting().addSmelting(Block.cloth.blockID, 15,
		// new ItemStack(Block.cloth, 1, 0), 0.1f);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
