package roy.firstmod;

//This Import list will grow longer with each additional tutorial.
//It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
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
	
	public static Item blackdiamond = (new Item(605)).setUnlocalizedName("blackdiamond")
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
			.setDropItem(606)
			.setHardness(3.0F).setResistance(5.0F)
			.setStepSound(Block.soundStoneFootstep)
			.setUnlocalizedName("blackdiamondore").setTextureName("firstmod:black_diamond_ore");
    static {

		GameRegistry.registerBlock(oreBlackDiamond, "blackdiamondore");
		LanguageRegistry.addName(oreBlackDiamond, "Black Diamond Ore");
    }
//    WOOD(0, 59, 2.0F, 0.0F, 15),
//    STONE(1, 131, 4.0F, 1.0F, 5),
//    IRON(2, 250, 6.0F, 2.0F, 14),
//    EMERALD(3, 1561, 8.0F, 3.0F, 10),
//    GOLD(0, 32, 12.0F, 0.0F, 22);
    public static final EnumToolMaterial BLACK_DIAMOND = EnumHelper.addToolMaterial("BLACK_DIAMOND", 4, 3568, 10.0F, 5.0F, 30);
    
    public static Item blackDiamondSword = (new ItemSword(650, BLACK_DIAMOND))
    		.setUnlocalizedName("blackSwordDiamond")
    		.setTextureName("firstmod:black_diamond_sword");
    static {

		GameRegistry.registerItem(blackDiamondSword, "black_diamond_sword");
		LanguageRegistry.addName(blackDiamondSword, "Black Diamond Sword");
    }  
    
    public static Item blackDiamondPickaxe = (new ItemPickaxe(651, BLACK_DIAMOND))
    		.setUnlocalizedName("blackDiamondPickaxe")
    		.setTextureName("firstmod:black_diamond_pickaxe");
    static {
    	
    	GameRegistry.registerItem(blackDiamondPickaxe, "black_diamond_pickaxe");
    	LanguageRegistry.addName(blackDiamondPickaxe, "Black Diamond Pickaxe");
    }
    
    
 @Instance("GeorgesMod")
 public static GeorgesMod instance;

 @SidedProxy(clientSide = "roy.firstmod.client.ClientProxy", serverSide = "roy.firstmod.CommonProxy")
 public static CommonProxy proxy;

 @EventHandler
 public void preInit (FMLPreInitializationEvent event) {
     // Stub Method
 }

 @EventHandler
 public void load (FMLInitializationEvent event) {
     proxy.registerRenderers();

     ItemStack dirtStack = new ItemStack(Block.dirt);
     ItemStack diamondsStack = new ItemStack(Item.diamond, 64);
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
    		 'x', diamondsStack, 'y', SaddleStack, 'z', leatherStack);
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
			'x', milkStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(cheese),
			"xyx",
			"   ",
			"   ",
	        'x', milkStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(cheese),
			"   ",
			"   ",
			"xyx",
			'x', milkStack, 'y', eggStack);
	GameRegistry.addRecipe(new ItemStack(Item.bootsChain),
			"   ",
			"   ",
			"x x",
			'x', IronStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"xyx",
			"   ",
			"   ",
			'x', cheeseStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"   ",
			"xyx",
			"   ",
	'x', cheeseStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(butter),
			"   ",
			"   ",
			"xyx",
			'x', cheeseStack, 'y', milkStack);
	GameRegistry.addRecipe(new ItemStack(blackDiamondSword),
			"xxy",
			"xzy",
			"xyy",
			'x', blackDiamondStack, 'y', redstoneStack, 'z', diamondsword);
//     GameRegistry.addSmelting(Block.stone.blockID, new ItemStack(
//             Block.stoneBrick), 0.1f);
//     FurnaceRecipes.smelting().addSmelting(Block.cloth.blockID, 15,
//             new ItemStack(Block.cloth, 1, 0), 0.1f);

 }

 @EventHandler
 public void postInit (FMLPostInitializationEvent event) {
 }
}